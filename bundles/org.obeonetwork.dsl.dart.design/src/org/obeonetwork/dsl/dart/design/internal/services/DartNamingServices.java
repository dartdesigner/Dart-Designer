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

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.Component;
import org.obeonetwork.dsl.dart.Controller;
import org.obeonetwork.dsl.dart.Decorator;
import org.obeonetwork.dsl.dart.Folder;
import org.obeonetwork.dsl.dart.Formatter;
import org.obeonetwork.dsl.dart.Function;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
import org.obeonetwork.dsl.dart.Module;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Parameter;
import org.obeonetwork.dsl.dart.Variable;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * Utility class containing the naming services.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartNamingServices {

	/**
	 * Convert the given name to the name of a metadata.
	 *
	 * @param any
	 *            The current EObject
	 * @param name
	 *            The name
	 * @return The metadata name
	 */
	public String toMetadataName(EObject any, String name) {
		if (name != null) {
			String newName = this.toCamelCase(any, name);
			if (!newName.startsWith("@")) { //$NON-NLS-1$
				return "@" + newName; //$NON-NLS-1$
			}
		}
		return name;
	}

	/**
	 * Return a camel case version of the given word.
	 *
	 * @param any
	 *            The current EObject
	 * @param word
	 *            The word
	 * @return The camel case version of the word
	 */
	public String toCamelCase(EObject any, String word) {
		if (word != null) {
			StringBuffer buffer = new StringBuffer(word.length());
			for (String part : Splitter.on(CharMatcher.WHITESPACE).trimResults().split(word)) {
				buffer.append(toU1Case(part));
			}
			return buffer.toString();
		}
		return word;
	}

	/**
	 * Put the first latter of the word to upper case.
	 *
	 * @param word
	 *            A word
	 * @return The word with its first letter in upper case
	 */
	private String toU1Case(String word) {
		if (word != null && word.length() > 0) {
			return new StringBuilder(word.length()).append(Ascii.toUpperCase(word.charAt(0))).append(
					word.substring(1)).toString();
		}
		return word;
	}

	/**
	 * Returns the name of the new folder.
	 *
	 * @param eObject
	 *            The folder
	 * @return The name of the new folder
	 */
	public String getNewFolderDefaultName(EObject eObject) {
		if (eObject instanceof Folder) {
			return I18n.getString(I18nKeys.NEW_FOLDER_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new package.
	 *
	 * @param eObject
	 *            The package
	 * @return The name of the new package
	 */
	public String getNewPackageDefaultName(EObject eObject) {
		if (eObject instanceof Package) {
			return I18n.getString(I18nKeys.NEW_PACKAGE_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new class.
	 *
	 * @param eObject
	 *            The class
	 * @return The name of the new class
	 */
	public String getNewClassDefaultName(EObject eObject) {
		if (eObject instanceof Class) {
			return I18n.getString(I18nKeys.NEW_CLASS_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new abstract class.
	 *
	 * @param eObject
	 *            The class
	 * @return The name of the new abstract class
	 */
	public String getNewAbstractClassDefaultName(EObject eObject) {
		if (eObject instanceof Class) {
			return "Abstract" + I18n.getString(I18nKeys.NEW_CLASS_NAME); //$NON-NLS-1$
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new metadata.
	 *
	 * @param eObject
	 *            The metadata
	 * @return The name of the new metadata
	 */
	public String getNewMetadataDefaultName(EObject eObject) {
		if (eObject instanceof Metadata) {
			return I18n.getString(I18nKeys.NEW_METADATA_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new library.
	 *
	 * @param eObject
	 *            The library
	 * @return The name of the new library
	 */
	public String getNewLibraryDefaultName(EObject eObject) {
		if (eObject instanceof Library) {
			return I18n.getString(I18nKeys.NEW_LIBRARY_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new field.
	 *
	 * @param eObject
	 *            The class
	 * @return The name of the new field
	 */
	public String getNewFieldDefaultName(EObject eObject) {
		if (eObject instanceof Variable) {
			return I18n.getString(I18nKeys.NEW_FIELD_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new method.
	 *
	 * @param eObject
	 *            The class
	 * @return The name of the new method
	 */
	public String getNewMethodDefaultName(EObject eObject) {
		if (eObject instanceof Function) {
			return I18n.getString(I18nKeys.NEW_METHOD_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new parameter.
	 *
	 * @param eObject
	 *            The class
	 * @return The name of the new parameter
	 */
	public String getNewParameterDefaultName(EObject eObject) {
		if (eObject instanceof Parameter) {
			return I18n.getString(I18nKeys.NEW_PARAMETER_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new module.
	 *
	 * @param eObject
	 *            The module
	 * @return The name of the new module
	 */
	public String getNewModuleDefaultName(EObject eObject) {
		if (eObject instanceof Module) {
			return I18n.getString(I18nKeys.NEW_MODULE_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new controller.
	 *
	 * @param eObject
	 *            The module
	 * @return The name of the new controller
	 */
	public String getNewControllerDefaultName(EObject eObject) {
		if (eObject instanceof Controller) {
			return I18n.getString(I18nKeys.NEW_CONTROLLER_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new component.
	 *
	 * @param eObject
	 *            The module
	 * @return The name of the new component
	 */
	public String getNewComponentDefaultName(EObject eObject) {
		if (eObject instanceof Component) {
			return I18n.getString(I18nKeys.NEW_COMPONENT_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new decorator.
	 *
	 * @param eObject
	 *            The module
	 * @return The name of the new decorator
	 */
	public String getNewDecoratorDefaultName(EObject eObject) {
		if (eObject instanceof Decorator) {
			return I18n.getString(I18nKeys.NEW_DECORATOR_NAME);
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the name of the new decorator.
	 *
	 * @param eObject
	 *            The module
	 * @return The name of the new decorator
	 */
	public String getNewFormatterDefaultName(EObject eObject) {
		if (eObject instanceof Formatter) {
			return I18n.getString(I18nKeys.NEW_FORMATTER_NAME);
		}
		return ""; //$NON-NLS-1$
	}
}
