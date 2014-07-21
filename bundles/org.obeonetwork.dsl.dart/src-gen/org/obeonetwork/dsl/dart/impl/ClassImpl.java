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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.dart.Constructor;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.Function;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassImpl#getMixins <em>Mixins</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements org.obeonetwork.dsl.dart.Class {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected org.obeonetwork.dsl.dart.Class extends_;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.dart.Class> implements_;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.dart.Class> mixins;

	/**
	 * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Constructor> constructors;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> methods;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.CLASS__ABSTRACT, oldAbstract,
					abstract_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.obeonetwork.dsl.dart.Class getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (org.obeonetwork.dsl.dart.Class)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.CLASS__EXTENDS,
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
	public org.obeonetwork.dsl.dart.Class basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExtends(org.obeonetwork.dsl.dart.Class newExtends) {
		org.obeonetwork.dsl.dart.Class oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.CLASS__EXTENDS, oldExtends,
					extends_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.dart.Class> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<org.obeonetwork.dsl.dart.Class>(
					org.obeonetwork.dsl.dart.Class.class, this, DartPackage.CLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.dart.Class> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<org.obeonetwork.dsl.dart.Class>(
					org.obeonetwork.dsl.dart.Class.class, this, DartPackage.CLASS__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Constructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList<Constructor>(Constructor.class, this,
					DartPackage.CLASS__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Function> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Function>(Function.class, this, DartPackage.CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DartPackage.CLASS__CONSTRUCTORS:
				return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
			case DartPackage.CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
			case DartPackage.CLASS__ABSTRACT:
				return isAbstract();
			case DartPackage.CLASS__EXTENDS:
				if (resolve)
					return getExtends();
				return basicGetExtends();
			case DartPackage.CLASS__IMPLEMENTS:
				return getImplements();
			case DartPackage.CLASS__MIXINS:
				return getMixins();
			case DartPackage.CLASS__CONSTRUCTORS:
				return getConstructors();
			case DartPackage.CLASS__METHODS:
				return getMethods();
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
			case DartPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case DartPackage.CLASS__EXTENDS:
				setExtends((org.obeonetwork.dsl.dart.Class)newValue);
				return;
			case DartPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends org.obeonetwork.dsl.dart.Class>)newValue);
				return;
			case DartPackage.CLASS__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends org.obeonetwork.dsl.dart.Class>)newValue);
				return;
			case DartPackage.CLASS__CONSTRUCTORS:
				getConstructors().clear();
				getConstructors().addAll((Collection<? extends Constructor>)newValue);
				return;
			case DartPackage.CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Function>)newValue);
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
			case DartPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case DartPackage.CLASS__EXTENDS:
				setExtends((org.obeonetwork.dsl.dart.Class)null);
				return;
			case DartPackage.CLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case DartPackage.CLASS__MIXINS:
				getMixins().clear();
				return;
			case DartPackage.CLASS__CONSTRUCTORS:
				getConstructors().clear();
				return;
			case DartPackage.CLASS__METHODS:
				getMethods().clear();
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
			case DartPackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case DartPackage.CLASS__EXTENDS:
				return extends_ != null;
			case DartPackage.CLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case DartPackage.CLASS__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case DartPackage.CLASS__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
			case DartPackage.CLASS__METHODS:
				return methods != null && !methods.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} // ClassImpl
