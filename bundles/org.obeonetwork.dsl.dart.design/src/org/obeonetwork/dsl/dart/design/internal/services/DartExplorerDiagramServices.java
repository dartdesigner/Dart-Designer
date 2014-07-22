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
import org.obeonetwork.dsl.dart.DartResource;
import org.obeonetwork.dsl.dart.Folder;
import org.obeonetwork.dsl.dart.IDartSpecificationConstants;
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

	/**
	 * Indicates if the given folder is empty.
	 *
	 * @param eObject
	 *            The folder
	 * @return <code>true</code> if the folder is empty, <code>false</code> otherwise
	 */
	public boolean isEmpty(EObject eObject) {
		if (eObject instanceof Folder && ((Folder)eObject).getAssets().size() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Indicates if the given folder is not empty.
	 *
	 * @param eObject
	 *            The folder
	 * @return <code>true</code> if the folder is not empty, <code>false</code> otherwise
	 */
	public boolean isNotEmpty(EObject eObject) {
		if (eObject instanceof Folder && ((Folder)eObject).getAssets().size() >= 0) {
			return true;
		}
		return false;
	}

	/**
	 * Return the name of the dart file for the given dart resource.
	 *
	 * @param eObject
	 *            The dart resource
	 * @return The name of the file
	 */
	public String getDartResourceFileName(EObject eObject) {
		if (eObject instanceof DartResource) {
			String name = ((DartResource)eObject).getName();
			if (name != null) {
				return name + IDartSpecificationConstants.DART_FILE_EXTENSION;
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Indicates if the name of the eObject matches a gif file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isGif(EObject eObject) {
		return this.hasExtension(eObject, ".gif"); //$NON-NLS-1$
	}

	/**
	 * Indicates if the name of the eObject matches a png file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isPng(EObject eObject) {
		return this.hasExtension(eObject, ".png"); //$NON-NLS-1$
	}

	/**
	 * Indicates if the name of the eObject matches a jpg file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isJpeg(EObject eObject) {
		return this.hasExtension(eObject, ".jpeg") || this.hasExtension(eObject, ".jpg"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Indicates if the name of the eObject matches a mp4 file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isMp4(EObject eObject) {
		return this.hasExtension(eObject, ".mp4"); //$NON-NLS-1$
	}

	/**
	 * Indicates if the name of the eObject matches a sass file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isSass(EObject eObject) {
		return this.hasExtension(eObject, ".scss") || this.hasExtension(eObject, ".sass"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Indicates if the name of the eObject matches a less file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isLess(EObject eObject) {
		return this.hasExtension(eObject, ".less"); //$NON-NLS-1$
	}

	/**
	 * Indicates if the name of the eObject matches a css file.
	 *
	 * @param eObject
	 *            The asset
	 * @return <code>true</code> if it matches, <code>false</code> otherwise
	 */
	public boolean isCss(EObject eObject) {
		return this.hasExtension(eObject, ".css"); //$NON-NLS-1$
	}

	/**
	 * Indicates if the given eObject is an asset with a name ending by the given extension.
	 *
	 * @param eObject
	 *            The asset
	 * @param extension
	 *            The extension
	 * @return <code>true</code> if the name of the asset is ended by the given extension, <code>false</code>
	 *         otherwise
	 */
	private boolean hasExtension(EObject eObject, String extension) {
		return eObject instanceof Asset && ((Asset)eObject).getName() != null
				&& ((Asset)eObject).getName().endsWith(extension);
	}
}
