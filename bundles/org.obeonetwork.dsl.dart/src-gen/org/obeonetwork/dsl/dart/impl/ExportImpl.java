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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.DartResource;
import org.obeonetwork.dsl.dart.Export;
import org.obeonetwork.dsl.dart.Metadata;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Export</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ExportImpl#getDartResources <em>Dart Resources</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ExportImpl#getShow <em>Show</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ExportImpl#getHide <em>Hide</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ExportImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExportImpl extends MinimalEObjectImpl.Container implements Export {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getDartResources() <em>Dart Resources</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDartResources()
	 * @generated
	 * @ordered
	 */
	protected EList<DartResource> dartResources;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.dart.Class> show;

	/**
	 * The cached value of the '{@link #getHide() <em>Hide</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getHide()
	 * @generated
	 * @ordered
	 */
	protected org.obeonetwork.dsl.dart.Class hide;

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
	protected ExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.EXPORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DartResource> getDartResources() {
		if (dartResources == null) {
			dartResources = new EObjectResolvingEList<DartResource>(DartResource.class, this,
					DartPackage.EXPORT__DART_RESOURCES);
		}
		return dartResources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.dart.Class> getShow() {
		if (show == null) {
			show = new EObjectResolvingEList<org.obeonetwork.dsl.dart.Class>(
					org.obeonetwork.dsl.dart.Class.class, this, DartPackage.EXPORT__SHOW);
		}
		return show;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.obeonetwork.dsl.dart.Class getHide() {
		if (hide != null && hide.eIsProxy()) {
			InternalEObject oldHide = (InternalEObject)hide;
			hide = (org.obeonetwork.dsl.dart.Class)eResolveProxy(oldHide);
			if (hide != oldHide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.EXPORT__HIDE,
							oldHide, hide));
			}
		}
		return hide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.obeonetwork.dsl.dart.Class basicGetHide() {
		return hide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHide(org.obeonetwork.dsl.dart.Class newHide) {
		org.obeonetwork.dsl.dart.Class oldHide = hide;
		hide = newHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.EXPORT__HIDE, oldHide, hide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<Metadata>(Metadata.class, this, DartPackage.EXPORT__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.EXPORT__DART_RESOURCES:
				return getDartResources();
			case DartPackage.EXPORT__SHOW:
				return getShow();
			case DartPackage.EXPORT__HIDE:
				if (resolve)
					return getHide();
				return basicGetHide();
			case DartPackage.EXPORT__METADATA:
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
			case DartPackage.EXPORT__DART_RESOURCES:
				getDartResources().clear();
				getDartResources().addAll((Collection<? extends DartResource>)newValue);
				return;
			case DartPackage.EXPORT__SHOW:
				getShow().clear();
				getShow().addAll((Collection<? extends org.obeonetwork.dsl.dart.Class>)newValue);
				return;
			case DartPackage.EXPORT__HIDE:
				setHide((org.obeonetwork.dsl.dart.Class)newValue);
				return;
			case DartPackage.EXPORT__METADATA:
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
			case DartPackage.EXPORT__DART_RESOURCES:
				getDartResources().clear();
				return;
			case DartPackage.EXPORT__SHOW:
				getShow().clear();
				return;
			case DartPackage.EXPORT__HIDE:
				setHide((org.obeonetwork.dsl.dart.Class)null);
				return;
			case DartPackage.EXPORT__METADATA:
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
			case DartPackage.EXPORT__DART_RESOURCES:
				return dartResources != null && !dartResources.isEmpty();
			case DartPackage.EXPORT__SHOW:
				return show != null && !show.isEmpty();
			case DartPackage.EXPORT__HIDE:
				return hide != null;
			case DartPackage.EXPORT__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ExportImpl
