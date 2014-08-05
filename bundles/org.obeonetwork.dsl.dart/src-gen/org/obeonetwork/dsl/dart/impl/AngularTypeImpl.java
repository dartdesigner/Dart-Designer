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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.dart.AngularType;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.DartResource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Angular Type</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.AngularTypeImpl#getDartResource <em>Dart Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AngularTypeImpl extends ElementImpl implements AngularType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getDartResource() <em>Dart Resource</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDartResource()
	 * @generated
	 * @ordered
	 */
	protected DartResource dartResource;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AngularTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.ANGULAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DartResource getDartResource() {
		if (dartResource != null && dartResource.eIsProxy()) {
			InternalEObject oldDartResource = (InternalEObject)dartResource;
			dartResource = (DartResource)eResolveProxy(oldDartResource);
			if (dartResource != oldDartResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DartPackage.ANGULAR_TYPE__DART_RESOURCE, oldDartResource, dartResource));
			}
		}
		return dartResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DartResource basicGetDartResource() {
		return dartResource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDartResource(DartResource newDartResource) {
		DartResource oldDartResource = dartResource;
		dartResource = newDartResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.ANGULAR_TYPE__DART_RESOURCE,
					oldDartResource, dartResource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.ANGULAR_TYPE__DART_RESOURCE:
				if (resolve)
					return getDartResource();
				return basicGetDartResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DartPackage.ANGULAR_TYPE__DART_RESOURCE:
				setDartResource((DartResource)newValue);
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
			case DartPackage.ANGULAR_TYPE__DART_RESOURCE:
				setDartResource((DartResource)null);
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
			case DartPackage.ANGULAR_TYPE__DART_RESOURCE:
				return dartResource != null;
		}
		return super.eIsSet(featureID);
	}

} // AngularTypeImpl
