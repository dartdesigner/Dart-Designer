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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.HTML;
import org.obeonetwork.dsl.dart.Route;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Route</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.RouteImpl#getName <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.RouteImpl#getPath <em>Path</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.RouteImpl#getView <em>View</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.RouteImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected HTML view;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Route extends_;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.ROUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.ROUTE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HTML getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (HTML)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.ROUTE__VIEW,
							oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HTML basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setView(HTML newView) {
		HTML oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.ROUTE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Route getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (Route)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.ROUTE__EXTENDS,
							oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Route basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExtends(Route newExtends) {
		Route oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.ROUTE__EXTENDS, oldExtends,
					extends_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.ROUTE__NAME:
				return getName();
			case DartPackage.ROUTE__PATH:
				return getPath();
			case DartPackage.ROUTE__VIEW:
				if (resolve)
					return getView();
				return basicGetView();
			case DartPackage.ROUTE__EXTENDS:
				if (resolve)
					return getExtends();
				return basicGetExtends();
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
			case DartPackage.ROUTE__NAME:
				setName((String)newValue);
				return;
			case DartPackage.ROUTE__PATH:
				setPath((String)newValue);
				return;
			case DartPackage.ROUTE__VIEW:
				setView((HTML)newValue);
				return;
			case DartPackage.ROUTE__EXTENDS:
				setExtends((Route)newValue);
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
			case DartPackage.ROUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DartPackage.ROUTE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DartPackage.ROUTE__VIEW:
				setView((HTML)null);
				return;
			case DartPackage.ROUTE__EXTENDS:
				setExtends((Route)null);
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
			case DartPackage.ROUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DartPackage.ROUTE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DartPackage.ROUTE__VIEW:
				return view != null;
			case DartPackage.ROUTE__EXTENDS:
				return extends_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} // RouteImpl
