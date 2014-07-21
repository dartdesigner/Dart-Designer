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
import org.obeonetwork.dsl.dart.Classifier;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.Library;
import org.obeonetwork.dsl.dart.Metadata;
import org.obeonetwork.dsl.dart.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Classifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassifierImpl#getFields <em>Fields</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassifierImpl#getMetadata <em>Metadata</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.ClassifierImpl#getPartof <em>Partof</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends DartResourceImpl implements Classifier {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> fields;

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
	 * The cached value of the '{@link #getPartof() <em>Partof</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPartof()
	 * @generated
	 * @ordered
	 */
	protected Library partof;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Variable> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Variable>(Variable.class, this,
					DartPackage.CLASSIFIER__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<Metadata>(Metadata.class, this,
					DartPackage.CLASSIFIER__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library getPartof() {
		if (partof != null && partof.eIsProxy()) {
			InternalEObject oldPartof = (InternalEObject)partof;
			partof = (Library)eResolveProxy(oldPartof);
			if (partof != oldPartof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.CLASSIFIER__PARTOF,
							oldPartof, partof));
			}
		}
		return partof;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library basicGetPartof() {
		return partof;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPartof(Library newPartof, NotificationChain msgs) {
		Library oldPartof = partof;
		partof = newPartof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DartPackage.CLASSIFIER__PARTOF, oldPartof, newPartof);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPartof(Library newPartof) {
		if (newPartof != partof) {
			NotificationChain msgs = null;
			if (partof != null)
				msgs = ((InternalEObject)partof).eInverseRemove(this, DartPackage.LIBRARY__PARTS,
						Library.class, msgs);
			if (newPartof != null)
				msgs = ((InternalEObject)newPartof).eInverseAdd(this, DartPackage.LIBRARY__PARTS,
						Library.class, msgs);
			msgs = basicSetPartof(newPartof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.CLASSIFIER__PARTOF, newPartof,
					newPartof));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DartPackage.CLASSIFIER__PARTOF:
				if (partof != null)
					msgs = ((InternalEObject)partof).eInverseRemove(this, DartPackage.LIBRARY__PARTS,
							Library.class, msgs);
				return basicSetPartof((Library)otherEnd, msgs);
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
			case DartPackage.CLASSIFIER__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DartPackage.CLASSIFIER__PARTOF:
				return basicSetPartof(null, msgs);
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
			case DartPackage.CLASSIFIER__FIELDS:
				return getFields();
			case DartPackage.CLASSIFIER__METADATA:
				return getMetadata();
			case DartPackage.CLASSIFIER__PARTOF:
				if (resolve)
					return getPartof();
				return basicGetPartof();
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
			case DartPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Variable>)newValue);
				return;
			case DartPackage.CLASSIFIER__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case DartPackage.CLASSIFIER__PARTOF:
				setPartof((Library)newValue);
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
			case DartPackage.CLASSIFIER__FIELDS:
				getFields().clear();
				return;
			case DartPackage.CLASSIFIER__METADATA:
				getMetadata().clear();
				return;
			case DartPackage.CLASSIFIER__PARTOF:
				setPartof((Library)null);
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
			case DartPackage.CLASSIFIER__FIELDS:
				return fields != null && !fields.isEmpty();
			case DartPackage.CLASSIFIER__METADATA:
				return metadata != null && !metadata.isEmpty();
			case DartPackage.CLASSIFIER__PARTOF:
				return partof != null;
		}
		return super.eIsSet(featureID);
	}

} // ClassifierImpl
