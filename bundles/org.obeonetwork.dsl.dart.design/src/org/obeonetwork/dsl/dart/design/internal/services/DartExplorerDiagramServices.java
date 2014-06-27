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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.obeonetwork.dsl.dart.Asset;
import org.obeonetwork.dsl.dart.Container;
import org.obeonetwork.dsl.dart.Folder;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * Utility services for the explorer diagram.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartExplorerDiagramServices {

	/**
	 * Returns the name of the newly created explorer diagram for the given container.
	 *
	 * @param container
	 *            The container
	 * @return The name of the explorer diagram
	 */
	public String newExplorerDiagramName(Container container) {
		String containerName = ""; //$NON-NLS-1$
		if (container instanceof Folder) {
			containerName = ((Folder)container).getName();
		} else if (container instanceof Package) {
			containerName = ((Package)container).getName();
		}
		return I18n.getString(I18nKeys.EXPLORER_DIAGRAM_NEW_NAME, containerName).trim();
	}

	/**
	 * Returns the list of all the assets that can be added to the diagram.
	 *
	 * @param eObject
	 *            The currently selected eObject (the project in the background most of the time)
	 * @param containerView
	 *            The container view
	 * @return The list of Dart assets that can be added
	 */
	public List<Asset> getAddableExplorerDiagramElements(EObject eObject, DSemanticDecorator containerView) {
		List<Asset> result = new ArrayList<Asset>();

		if (eObject instanceof Container) {
			result.addAll(((Container)eObject).getAssets());
		}

		return result;
	}
}
