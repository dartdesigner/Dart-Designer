/**
 *  Copyright (c) 2014 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.dart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.dart.Classifier;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
import org.obeonetwork.dsl.dart.Typedef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Library</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.LibraryImpl#getParts <em>Parts</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.LibraryImpl#getTypedefs <em>Typedefs</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.LibraryImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends DartResourceImpl implements Library {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> parts;

	/**
	 * The cached value of the '{@link #getTypedefs() <em>Typedefs</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Typedef> typedefs;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Classifier> getParts() {
		if (parts == null) {
			parts = new EObjectWithInverseResolvingEList<Classifier>(Classifier.class, this,
					DartPackage.LIBRARY__PARTS, DartPackage.CLASSIFIER__PARTOF);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Typedef> getTypedefs() {
		if (typedefs == null) {
			typedefs = new EObjectContainmentEList<Typedef>(Typedef.class, this,
					DartPackage.LIBRARY__TYPEDEFS);
		}
		return typedefs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<Metadata>(Metadata.class, this,
					DartPackage.LIBRARY__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts())
						.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case DartPackage.LIBRARY__TYPEDEFS:
				return ((InternalEList<?>)getTypedefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				return getParts();
			case DartPackage.LIBRARY__TYPEDEFS:
				return getTypedefs();
			case DartPackage.LIBRARY__METADATA:
				return getMetadata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Classifier>)newValue);
				return;
			case DartPackage.LIBRARY__TYPEDEFS:
				getTypedefs().clear();
				getTypedefs().addAll((Collection<? extends Typedef>)newValue);
				return;
			case DartPackage.LIBRARY__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				getParts().clear();
				return;
			case DartPackage.LIBRARY__TYPEDEFS:
				getTypedefs().clear();
				return;
			case DartPackage.LIBRARY__METADATA:
				getMetadata().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DartPackage.LIBRARY__PARTS:
				return parts != null && !parts.isEmpty();
			case DartPackage.LIBRARY__TYPEDEFS:
				return typedefs != null && !typedefs.isEmpty();
			case DartPackage.LIBRARY__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LibraryImpl
