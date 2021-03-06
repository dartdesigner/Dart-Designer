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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.obeonetwork.dsl.dart.Asset;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.Component;
import org.obeonetwork.dsl.dart.Controller;
import org.obeonetwork.dsl.dart.Decorator;
import org.obeonetwork.dsl.dart.Formatter;
import org.obeonetwork.dsl.dart.HTML;
import org.obeonetwork.dsl.dart.Import;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
import org.obeonetwork.dsl.dart.Module;
import org.obeonetwork.dsl.dart.Package;
import org.obeonetwork.dsl.dart.Part;
import org.obeonetwork.dsl.dart.Route;
import org.obeonetwork.dsl.dart.Stylesheet;
import org.obeonetwork.dsl.dart.util.DartSwitch;

/**
 * This object will be used to compute the list of related elements.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class RelatedElementsSwitch extends DartSwitch<List<EObject>> {

	/**
	 * The related elements.
	 */
	private Set<EObject> relatedElements;

	/**
	 * The collection of cross references.
	 */
	private Collection<Setting> crossReferences;

	/**
	 * Returns the list of elements related to the given EObject.
	 *
	 * @param eObject
	 *            The EObject
	 * @return The list of elements related to the given EObject
	 */
	public Collection<EObject> getRelatedElements(EObject eObject) {
		Session session = SessionManager.INSTANCE.getSession(eObject);
		this.relatedElements = Sets.newLinkedHashSet();

		if (session != null) {
			this.crossReferences = session.getSemanticCrossReferencer().getInverseReferences(eObject);
		}

		this.doSwitch(eObject);

		// In case there is a reference from the EObject to itself
		relatedElements.remove(eObject);
		relatedElements.remove(null);

		return ImmutableList.copyOf(this.relatedElements);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#casePackage(org.obeonetwork.dsl.dart.Package)
	 */
	@Override
	public List<EObject> casePackage(Package aPackage) {
		this.relatedElements.addAll(aPackage.getDependencies());
		return super.casePackage(aPackage);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseClass(org.obeonetwork.dsl.dart.Class)
	 */
	@Override
	public List<EObject> caseClass(Class clazz) {
		this.relatedElements.addAll(clazz.getImplements());
		this.relatedElements.addAll(clazz.getMixins());
		this.relatedElements.add(clazz.getExtends());

		for (Setting setting : this.crossReferences) {
			if (setting.getEObject() instanceof Class) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof Library) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof Metadata) {
				this.relatedElements.add(setting.getEObject());
			}
		}

		return super.caseClass(clazz);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseLibrary(org.obeonetwork.dsl.dart.Library)
	 */
	@Override
	public List<EObject> caseLibrary(Library library) {
		this.relatedElements.addAll(library.getParts());

		for (Setting setting : this.crossReferences) {
			if (setting.getEObject() instanceof Class) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof Library) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof Metadata) {
				this.relatedElements.add(setting.getEObject());
			}
		}

		List<Part> parts = library.getParts();
		for (Part part : parts) {
			this.relatedElements.add(part);
		}

		List<Import> imports = library.getImports();
		for (Import anImport : imports) {
			relatedElements.add(anImport.getDartResource());
		}

		return super.caseLibrary(library);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseMetadata(org.obeonetwork.dsl.dart.Metadata)
	 */
	@Override
	public List<EObject> caseMetadata(Metadata metadata) {
		for (Setting setting : this.crossReferences) {
			if (setting.getEObject() instanceof Library) {
				this.relatedElements.add(setting.getEObject());
			}
		}
		return super.caseMetadata(metadata);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseAsset(org.obeonetwork.dsl.dart.Asset)
	 */
	@Override
	public List<EObject> caseAsset(Asset asset) {
		for (Setting setting : this.crossReferences) {
			if (setting.getEObject() instanceof HTML) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof Stylesheet) {
				this.relatedElements.add(setting.getEObject());
			}
		}
		return super.caseAsset(asset);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseHTML(org.obeonetwork.dsl.dart.HTML)
	 */
	@Override
	public List<EObject> caseHTML(HTML html) {
		this.relatedElements.addAll(html.getUses());
		return super.caseHTML(html);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseStylesheet(org.obeonetwork.dsl.dart.Stylesheet)
	 */
	@Override
	public List<EObject> caseStylesheet(Stylesheet stylesheet) {
		this.relatedElements.addAll(stylesheet.getImports());
		return super.caseStylesheet(stylesheet);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseRoute(org.obeonetwork.dsl.dart.Route)
	 */
	@Override
	public List<EObject> caseRoute(Route route) {
		this.relatedElements.add(route.getExtends());
		this.relatedElements.add(route.getView());

		for (Setting setting : this.crossReferences) {
			if (setting.getEObject() instanceof Route) {
				this.relatedElements.add(setting.getEObject());
			} else if (setting.getEObject() instanceof HTML) {
				this.relatedElements.add(setting.getEObject());
			}
		}

		return super.caseRoute(route);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseModule(org.obeonetwork.dsl.dart.Module)
	 */
	@Override
	public List<EObject> caseModule(Module module) {
		this.relatedElements.addAll(module.getTypes());
		return super.caseModule(module);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseController(org.obeonetwork.dsl.dart.Controller)
	 */
	@Override
	public List<EObject> caseController(Controller controller) {
		return super.caseController(controller);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseComponent(org.obeonetwork.dsl.dart.Component)
	 */
	@Override
	public List<EObject> caseComponent(Component component) {
		this.relatedElements.add(component.getStylesheet());
		this.relatedElements.add(component.getTemplate());
		return super.caseComponent(component);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseDecorator(org.obeonetwork.dsl.dart.Decorator)
	 */
	@Override
	public List<EObject> caseDecorator(Decorator decorator) {
		return super.caseDecorator(decorator);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.obeonetwork.dsl.dart.util.DartSwitch#caseFormatter(org.obeonetwork.dsl.dart.Formatter)
	 */
	@Override
	public List<EObject> caseFormatter(Formatter formatter) {
		return super.caseFormatter(formatter);
	}

}
