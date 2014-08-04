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
package org.obeonetwork.dsl.dart;

/**
 * Utility interface holding some constants.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public interface IDartSpecificationConstants {
	/**
	 * The URI of the dartlang specification file.
	 */
	String DARTLANG_URI = "platform:/plugin/org.obeonetwork.dsl.dart/model/dartlang.dartspec"; //$NON-NLS-1$

	/**
	 * The name of the dartlang package.
	 */
	String DARTLANG_PACKAGE_NAME = "Dart Standard Library"; //$NON-NLS-1$

	/**
	 * The Dart specification extension.
	 */
	String EXTENSION = "dartspec"; //$NON-NLS-1$

	/**
	 * The extension of dart files.
	 */
	String DART_FILE_EXTENSION = ".dart"; //$NON-NLS-1$
}
