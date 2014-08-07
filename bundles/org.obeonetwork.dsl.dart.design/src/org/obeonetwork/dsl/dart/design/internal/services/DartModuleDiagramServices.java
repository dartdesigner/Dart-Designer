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
import org.obeonetwork.dsl.dart.Component;
import org.obeonetwork.dsl.dart.Container;
import org.obeonetwork.dsl.dart.Controller;
import org.obeonetwork.dsl.dart.Decorator;
import org.obeonetwork.dsl.dart.Folder;
import org.obeonetwork.dsl.dart.Formatter;
import org.obeonetwork.dsl.dart.HTML;
import org.obeonetwork.dsl.dart.Module;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Stylesheet;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * Utility services for the Module diagram.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartModuleDiagramServices {
	/**
	 * Returns the name of the newly created module diagram for the given container.
	 *
	 * @param container
	 *            The container
	 * @return The name of the module diagram
	 */
	public String newModuleDiagramName(Container container) {
		String containerName = ""; //$NON-NLS-1$
		if (container instanceof Package) {
			containerName = ((Package)container).getName();
		} else if (container instanceof Folder) {
			containerName = ((Folder)container).getName();
		}
		return I18n.getString(I18nKeys.MODULE_DIAGRAM_NEW_NAME, containerName).trim();
	}

	/**
	 * Returns the list of all the elements that can be added to the module diagram.
	 *
	 * @param eObject
	 *            The currently selected eObject (the project in the background most of the time)
	 * @param containerView
	 *            The container view
	 * @return The list of Dart elements that can be added to the module diagram
	 */
	public List<EObject> getAddableModuleDiagramElements(EObject eObject, DSemanticDecorator containerView) {
		List<EObject> result = new ArrayList<EObject>();

		Session session = SessionManager.INSTANCE.getSession(eObject);
		if (session != null) {
			Collection<Resource> semanticResources = session.getSemanticResources();
			for (Resource resource : semanticResources) {
				if (resource.getURI().isPlatformPlugin() || resource.getURI().isPlatformResource()) {
					TreeIterator<EObject> allContents = resource.getAllContents();
					while (allContents.hasNext()) {
						EObject containedEObject = allContents.next();
						if (containedEObject instanceof Module) {
							result.add(containedEObject);
						} else if (containedEObject instanceof Controller) {
							result.add(containedEObject);
						} else if (containedEObject instanceof Component) {
							result.add(containedEObject);
						} else if (containedEObject instanceof Decorator) {
							result.add(containedEObject);
						} else if (containedEObject instanceof Formatter) {
							result.add(containedEObject);
						} else if (containedEObject instanceof HTML) {
							result.add(containedEObject);
						} else if (containedEObject instanceof Stylesheet) {
							result.add(containedEObject);
						}
					}
				}
			}
		}
		return result;
	}
}
