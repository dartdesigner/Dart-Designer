/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.dart.design.internal.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.obeonetwork.dsl.dart.DartFactory;
import org.obeonetwork.dsl.dart.IDartSpecificationConstants;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Project;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * This workspace modify operation will ensure the creation of the new Dart Designer project.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartDesignerProjectCreationOperation extends WorkspaceModifyOperation {

	/**
	 * The name of the folder containing the specifications.
	 */
	private static final String SPECIFICATIONS_FOLDER_NAME = "specifications"; //$NON-NLS-1$

	/**
	 * The project to create.
	 */
	private IProject project;

	/**
	 * The constructor.
	 *
	 * @param project
	 *            The project to create
	 */
	public DartDesignerProjectCreationOperation(IProject project) {
		this.project = project;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
	InterruptedException {
		project.create(new NullProgressMonitor());
		project.open(monitor);

		IFolder folder = project.getFolder(SPECIFICATIONS_FOLDER_NAME);
		if (!folder.exists()) {
			folder.create(true, true, monitor);
		}

		String specificationName = "project";
		IFile specificationFile = folder.getFile(specificationName + '.'
				+ IDartSpecificationConstants.EXTENSION);

		String pathName = specificationFile.getFullPath().toString();
		URI dartSpecficationURi = URI.createPlatformResourceURI(pathName, true);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(dartSpecficationURi);

		Project dartProject = DartFactory.eINSTANCE.createProject();
		dartProject.setName(project.getName());
		Package dartPackage = DartFactory.eINSTANCE.createPackage();
		dartPackage.setName("New Dart Package");
		dartProject.getPackages().add(dartPackage);

		Resource dartlangResource = resourceSet.getResource(URI
				.createURI(IDartSpecificationConstants.DARTLANG_URI), true);
		List<EObject> contents = dartlangResource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof Project) {
				Project dartlangProject = (Project)eObject;
				List<Package> packages = dartlangProject.getPackages();
				for (Package aPackage : packages) {
					if (IDartSpecificationConstants.DARTLANG_PACKAGE_NAME.equals(aPackage.getName())) {
						// A newly created package depends on the dart standard library
						dartPackage.getDependencies().add(aPackage);
					}
				}
			}
		}

		resource.getContents().add(dartProject);
		try {
			resource.save(new HashMap<Object, Object>());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			IFile sessionFile = project.getFile(specificationName + '.'
					+ SiriusUtil.SESSION_RESOURCE_EXTENSION);
			URI representationsURI = URI
					.createPlatformResourceURI(sessionFile.getFullPath().toString(), true);

			Session session = this.getOrCreateAird(representationsURI, monitor);

			CompoundCommand compoundCommand = new CompoundCommand(I18n
					.getString(I18nKeys.DART_DESIGNER_PROJECT_CREATION_PREPARE_DART_DESIGNER_PROJECT));
			compoundCommand.append(new AddSemanticResourceCommand(session, dartSpecficationURi,
					new SubProgressMonitor(monitor, 1)));

			monitor.subTask(I18n.getString(I18nKeys.DART_DESIGNER_PROJECT_CREATION_LINK_THE_SPECIFICATION));
			session.getTransactionalEditingDomain().getCommandStack().execute(compoundCommand);

			session.save(monitor);

			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns or creates the aird file storing the session.
	 *
	 * @param representationsURI
	 *            The URI of the representation
	 * @param monitor
	 *            The progress monitor
	 * @return The session.
	 */
	private Session getOrCreateAird(URI representationsURI, IProgressMonitor monitor) {
		final Session session;
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {
			session = modelingProject.get().getSession();
		} else {
			Session tempSession = null;
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					representationsURI, monitor);
			try {
				sessionCreationOperation.execute();
				tempSession = sessionCreationOperation.getCreatedSession();
			} catch (CoreException e) {
				e.printStackTrace();
			}
			if (tempSession != null) {
				session = tempSession;
			} else {
				session = null;
			}
		}
		return session;
	}
}
