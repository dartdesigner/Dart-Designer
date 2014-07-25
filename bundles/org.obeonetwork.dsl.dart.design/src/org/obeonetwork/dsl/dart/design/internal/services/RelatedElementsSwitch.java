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
import org.obeonetwork.dsl.dart.HTML;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
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

}
