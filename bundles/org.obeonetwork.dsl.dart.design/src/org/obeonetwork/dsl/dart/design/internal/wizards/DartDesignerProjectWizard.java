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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerEditorConstants;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerIcons;

/**
 * The wizard used to create new Dart Designer projects.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartDesignerProjectWizard extends BasicNewProjectResourceWizard {

	/**
	 * The page where the details of the project to create are configured.
	 */
	private DartDesignerProjectWizardPage projectPage;

	/**
	 * The page where the details of the specification to create are configured.
	 */
	// private DartDesignerProjectSpecificationConfigurationPage specificationPage;

	/**
	 * The page where the viewpoint to activate in the project are configured.
	 */
	// private DartDesignerProjectViewpointSelectionPage viewpointPage;

	/**
	 * The constructor.
	 */
	public DartDesignerProjectWizard() {
		this.setWindowTitle(I18n.getString(I18nKeys.DART_DESIGNER_PROJECT_WIZARD_NAME));
		this.setDefaultPageImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IDartDesignerEditorConstants.PLUGIN_ID, IDartDesignerIcons.DART_SPECIFICATION_WIZARD_BANNER));
		this.setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard#addPages()
	 */
	@Override
	public void addPages() {
		this.projectPage = new DartDesignerProjectWizardPage();
		// this.specificationPage = new DartDesignerProjectSpecificationConfigurationPage();
		// this.viewpointPage = new DartDesignerProjectViewpointSelectionPage();

		this.addPage(this.projectPage);
		// this.addPage(this.specificationPage);
		// this.addPage(this.viewpointPage);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean finished = true;

		final IProject project = this.projectPage.getProjectHandle();
		if (!project.exists()) {
			try {
				WorkspaceModifyOperation projectCreationOperation = new DartDesignerProjectCreationOperation(
						project);
				this.getContainer().run(true, false, projectCreationOperation);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
				finished = false;
			} catch (InterruptedException e) {
				e.printStackTrace();
				finished = false;
			}
		}
		return finished;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard#getNewProject()
	 */
	@Override
	public IProject getNewProject() {
		return super.getNewProject();
	}
}
