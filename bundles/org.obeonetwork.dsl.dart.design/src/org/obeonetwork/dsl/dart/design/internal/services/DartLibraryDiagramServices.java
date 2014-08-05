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
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.obeonetwork.dsl.dart.Classifier;
import org.obeonetwork.dsl.dart.Container;
import org.obeonetwork.dsl.dart.DartFactory;
import org.obeonetwork.dsl.dart.Export;
import org.obeonetwork.dsl.dart.Import;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Part;
import org.obeonetwork.dsl.dart.design.internal.utils.I18n;
import org.obeonetwork.dsl.dart.design.internal.utils.I18nKeys;

/**
 * Utility services for the Library Diagram.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartLibraryDiagramServices {
	/**
	 * Returns the name of the newly created library diagram for the given container.
	 *
	 * @param container
	 *            The container
	 * @return The name of the library diagram
	 */
	public String newLibraryDiagramName(Container container) {
		String containerName = ""; //$NON-NLS-1$
		if (container instanceof Package) {
			containerName = ((Package)container).getName();
		}
		return I18n.getString(I18nKeys.LIBRARY_DIAGRAM_NEW_NAME, containerName).trim();
	}

	/**
	 * Returns the list of all the elements that can be added to the library diagram.
	 *
	 * @param eObject
	 *            The currently selected eObject (the project in the background most of the time)
	 * @param containerView
	 *            The container view
	 * @return The list of Dart elements that can be added to the library diagram
	 */
	public List<EObject> getAddableLibraryDiagramElements(EObject eObject, DSemanticDecorator containerView) {
		List<EObject> result = new ArrayList<EObject>();

		Session session = SessionManager.INSTANCE.getSession(eObject);
		if (session != null) {
			Collection<Resource> semanticResources = session.getSemanticResources();
			for (Resource resource : semanticResources) {
				if (resource.getURI().isPlatformPlugin() || resource.getURI().isPlatformResource()) {
					TreeIterator<EObject> allContents = resource.getAllContents();
					while (allContents.hasNext()) {
						EObject containedEObject = allContents.next();
						if (containedEObject instanceof Library) {
							result.add(containedEObject);
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * Computes the list of imported libraries for the given library.
	 *
	 * @param eObject
	 *            The library
	 * @return The list of imported libraries
	 */
	public List<Library> getImportedLibrary(EObject eObject) {
		List<Library> libraries = new ArrayList<Library>();
		if (eObject instanceof Library) {
			Library library = (Library)eObject;
			List<Import> imports = library.getImports();
			for (Import imported : imports) {
				if (imported.getDartResource() instanceof Library) {
					libraries.add((Library)imported.getDartResource());
				}
			}
		}
		return libraries;
	}

	/**
	 * Returns the label of the Export object.
	 *
	 * @param eObject
	 *            The export
	 * @return The label of the Export object
	 */
	public String getExportLabel(EObject eObject) {
		String label = ""; //$NON-NLS-1$
		if (eObject instanceof Export) {
			Export export = (Export)eObject;
			if (export.getDartResource() != null) {
				label = export.getDartResource().getName();
			}
		}
		return label;
	}

	/**
	 * Returns the list of the elements that can be exported by the library.
	 *
	 * @param eObject
	 *            The library
	 * @return The list of the elements that can be exported by the library
	 */
	public List<EObject> getExportableElements(EObject eObject) {
		List<EObject> exportableElements = new ArrayList<EObject>();
		if (eObject instanceof Library) {
			Library library = (Library)eObject;
			List<Import> imports = library.getImports();
			for (Import anImport : imports) {
				if (anImport.getDartResource() instanceof Classifier) {
					exportableElements.add(anImport.getDartResource());
				} else if (anImport.getDartResource() instanceof Library) {
					Library importedLibrary = (Library)anImport.getDartResource();
					List<Part> parts = importedLibrary.getParts();
					for (Part part : parts) {
						exportableElements.add(part);
					}
				}
			}

			List<Part> parts = library.getParts();
			for (Part part : parts) {
				exportableElements.add(part);
			}
		}
		return exportableElements;
	}

	/**
	 * Reconnect the "imports" link between two library.
	 *
	 * @param element
	 *            The manipulated element (source or target library)
	 * @param edgeAfterReconnect
	 *            The edge after the reconnection
	 */
	public void reconnectImports(EObject element, DEdge edgeAfterReconnect) {
		if (edgeAfterReconnect.getSourceNode() instanceof DSemanticDecorator
				&& edgeAfterReconnect.getTargetNode() instanceof DSemanticDecorator) {

			EObject newSource = ((DSemanticDecorator)edgeAfterReconnect.getSourceNode()).getTarget();
			EObject newTarget = ((DSemanticDecorator)edgeAfterReconnect.getTargetNode()).getTarget();
			if (element instanceof Library && newSource instanceof Library && newTarget instanceof Library) {
				Library aLibrary = (Library)element;
				Library srcLibrary = (Library)newSource;
				Library targetLibrary = (Library)newTarget;

				Import importToRemove = null;
				List<Import> imports = aLibrary.getImports();
				for (Import anImport : imports) {
					if (targetLibrary.equals(anImport.getDartResource())) {
						importToRemove = anImport;
					}
				}

				if (importToRemove != null) {
					aLibrary.getImports().remove(importToRemove);
				}

				imports = srcLibrary.getImports();
				for (Import anImport : imports) {
					if (aLibrary.equals(anImport.getDartResource())) {
						importToRemove = anImport;
					}
				}

				if (importToRemove != null) {
					srcLibrary.getImports().remove(importToRemove);
				}

				Import importToAdd = DartFactory.eINSTANCE.createImport();
				importToAdd.setDartResource(targetLibrary);
				srcLibrary.getImports().add(importToAdd);
			}
		}
	}
}
