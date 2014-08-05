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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.Project;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.PackageImpl#getName <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.PackageImpl#getLicense <em>License</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.PackageImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends ContainerImpl implements org.obeonetwork.dsl.dart.Package {
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
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.dart.Package> dependencies;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.PACKAGE__LICENSE, oldLicense,
					license));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.dart.Package> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<org.obeonetwork.dsl.dart.Package>(
					org.obeonetwork.dsl.dart.Package.class, this, DartPackage.PACKAGE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != DartPackage.PACKAGE__PROJECT)
			return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, DartPackage.PACKAGE__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer()
				|| (eContainerFeatureID() != DartPackage.PACKAGE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, DartPackage.PROJECT__PACKAGES,
						Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.PACKAGE__PROJECT, newProject,
					newProject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DartPackage.PACKAGE__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case DartPackage.PACKAGE__PROJECT:
				return basicSetProject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DartPackage.PACKAGE__PROJECT:
				return eInternalContainer().eInverseRemove(this, DartPackage.PROJECT__PACKAGES,
						Project.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.PACKAGE__NAME:
				return getName();
			case DartPackage.PACKAGE__LICENSE:
				return getLicense();
			case DartPackage.PACKAGE__DEPENDENCIES:
				return getDependencies();
			case DartPackage.PACKAGE__PROJECT:
				return getProject();
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
			case DartPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case DartPackage.PACKAGE__LICENSE:
				setLicense((String)newValue);
				return;
			case DartPackage.PACKAGE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends org.obeonetwork.dsl.dart.Package>)newValue);
				return;
			case DartPackage.PACKAGE__PROJECT:
				setProject((Project)newValue);
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
			case DartPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DartPackage.PACKAGE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case DartPackage.PACKAGE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case DartPackage.PACKAGE__PROJECT:
				setProject((Project)null);
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
			case DartPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DartPackage.PACKAGE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case DartPackage.PACKAGE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case DartPackage.PACKAGE__PROJECT:
				return getProject() != null;
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
		result.append(", license: ");
		result.append(license);
		result.append(')');
		return result.toString();
	}

} // PackageImpl
