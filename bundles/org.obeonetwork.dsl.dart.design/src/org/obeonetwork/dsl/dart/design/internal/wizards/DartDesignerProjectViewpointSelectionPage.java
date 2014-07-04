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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerEditorConstants;
import org.obeonetwork.dsl.dart.design.internal.utils.IDartDesignerIcons;

/**
 * This wizard page will be used to select the viewpoints to use in the new Dart Designer project.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartDesignerProjectViewpointSelectionPage extends WizardPage {

	/**
	 * The constructor.
	 */
	public DartDesignerProjectViewpointSelectionPage() {
		super(I18n.getString(I18nKeys.DART_DESIGNER_VIEWPOINT_WIZARD_PAGE_NAME));
		this.setTitle(I18n.getString(I18nKeys.DART_DESIGNER_VIEWPOINT_WIZARD_PAGE_TITLE));
		this.setDescription(I18n.getString(I18nKeys.DART_DESIGNER_VIEWPOINT_WIZARD_PAGE_DESCRIPTION));
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IDartDesignerEditorConstants.PLUGIN_ID, IDartDesignerIcons.ICONS
						+ IDartDesignerIcons.DART_VIEWPOINT_WIZARD_BANNER));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		// do nothing
	}

}
