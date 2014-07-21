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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerConstants;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerIcons;

/**
 * The page in which the settings of the new project are configured.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartDesignerProjectWizardPage extends WizardNewProjectCreationPage {

	/**
	 * The identifier of the java working set.
	 */
	private static final String JAVA_WORKING_SET_ID = "org.eclipse.jdt.ui.JavaWorkingSetPage"; //$NON-NLS-1$

	/**
	 * The identifier of the PDE working set.
	 */
	private static final String PDE_WORKING_SET_ID = "org.eclipse.pde.ui.pluginWorkingSet"; //$NON-NLS-1$

	/**
	 * The identifier of the resource working set.
	 */
	private static final String RESOURCE_WORKING_SET_ID = "org.eclipse.ui.resourceWorkingSetPage"; //$NON-NLS-1$

	/**
	 * The constructor.
	 */
	public DartDesignerProjectWizardPage() {
		super(I18n.getString(I18nKeys.DART_DESIGNER_PROJECT_WIZARD_PAGE_NAME));
		this.setTitle(I18n.getString(I18nKeys.DART_DESIGNER_PROJECT_WIZARD_PAGE_TITLE));
		this.setDescription(I18n.getString(I18nKeys.DART_DESIGNER_PROJECT_WIZARD_PAGE_DESCRIPTION));
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IDartDesignerConstants.PLUGIN_ID, IDartDesignerIcons.ICONS
						+ IDartDesignerIcons.DART_DESIGNER_PROJECT_WIZARD_BANNER));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		Control control = this.getControl();
		if (control instanceof Composite) {
			Composite composite = (Composite)control;
			GridLayout layout = new GridLayout();
			composite.setLayout(layout);
			this.createWorkingSetGroup(composite, new StructuredSelection(), new String[] {
					JAVA_WORKING_SET_ID, PDE_WORKING_SET_ID, RESOURCE_WORKING_SET_ID, });

			Dialog.applyDialogFont(composite);
		}

	}

}
