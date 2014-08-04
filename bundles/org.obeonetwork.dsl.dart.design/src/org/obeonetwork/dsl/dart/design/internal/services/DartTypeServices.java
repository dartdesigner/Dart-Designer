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

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.dart.Asset;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.Container;
import org.obeonetwork.dsl.dart.DartResource;
import org.obeonetwork.dsl.dart.Folder;
import org.obeonetwork.dsl.dart.HTML;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
import org.obeonetwork.dsl.dart.Stylesheet;

/**
 * Utility services to identify the type of an EObject.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartTypeServices {

	/**
	 * Returns <code>true</code> if the EObject is a Dart class.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart class
	 */
	public boolean isClass(EObject eObject) {
		return eObject instanceof Class;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart folder.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart folder
	 */
	public boolean isFolder(EObject eObject) {
		return eObject instanceof Folder;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart container.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart container
	 */
	public boolean isContainer(EObject eObject) {
		return eObject instanceof Container;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart resource.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart resource
	 */
	public boolean isDartResource(EObject eObject) {
		return eObject instanceof DartResource;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart library.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart library
	 */
	public boolean isLibrary(EObject eObject) {
		return eObject instanceof Library;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart metadata.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart metadata
	 */
	public boolean isMetadata(EObject eObject) {
		return eObject instanceof Metadata;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart asset.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart asset
	 */
	public boolean isAsset(EObject eObject) {
		return eObject instanceof Asset;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart asset.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart asset
	 */
	public boolean isStrictlyAsset(EObject eObject) {
		return eObject instanceof Asset && !(eObject instanceof HTML) && !(eObject instanceof Stylesheet);
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart HTML.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart HTML
	 */
	public boolean isHtml(EObject eObject) {
		return eObject instanceof HTML;
	}

	/**
	 * Returns <code>true</code> if the EObject is a Dart stylesheet.
	 *
	 * @param eObject
	 *            The EObject
	 * @return <code>true</code> if the EObject is a Dart stylesheet
	 */
	public boolean isStylesheet(EObject eObject) {
		return eObject instanceof Stylesheet;
	}

}
