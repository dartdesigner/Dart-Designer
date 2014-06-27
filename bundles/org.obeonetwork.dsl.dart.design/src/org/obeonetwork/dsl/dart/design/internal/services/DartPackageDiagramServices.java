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
package org.obeonetwork.dsl.dart.design.internal.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Project;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * Utility services for the package diagram.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartPackageDiagramServices {
	/**
	 * Returns the name of a newly created package diagram for the given project.
	 *
	 * @param project
	 *            The name of the project
	 * @return The name of the package diagram
	 */
	public String newPackageDiagramName(Project project) {
		String projectName = ""; //$NON-NLS-1$
		if (project.getName() != null) {
			projectName = project.getName();
		}
		return I18n.getString(I18nKeys.PACKAGE_DIAGRAM_NEW_NAME, projectName).trim();
	}

	/**
	 * Returns the list of imported packages for the given project.
	 *
	 * @param project
	 *            The project
	 * @return The list of packages imported by the packages of the project
	 */
	public List<Package> getImportedPackages(Project project) {
		List<Package> packages = new ArrayList<Package>();
		for (Package aPackage : project.getPackages()) {
			packages.addAll(aPackage.getDependencies());
		}
		return packages;
	}

	/**
	 * Returns the list of all the packages that can be added to the diagram.
	 *
	 * @param eObject
	 *            The currently selected eObject (the project in the background most of the time)
	 * @param containerView
	 *            The container view
	 * @return The list of Dart packages that can be added
	 */
	public List<Package> getAddablePackageDiagramElements(EObject eObject, DSemanticDecorator containerView) {
		List<Package> result = new ArrayList<Package>();

		Session session = SessionManager.INSTANCE.getSession(eObject);
		if (session != null) {
			Collection<Resource> semanticResources = session.getSemanticResources();
			for (Resource resource : semanticResources) {
				if (resource.getURI().isPlatformPlugin() || resource.getURI().isPlatformResource()) {
					TreeIterator<EObject> allContents = resource.getAllContents();
					while (allContents.hasNext()) {
						EObject containedEObject = allContents.next();
						if (containedEObject instanceof Package) {
							result.add((Package)containedEObject);
						}
					}
				}
			}
		}
		return result;
	}
}
