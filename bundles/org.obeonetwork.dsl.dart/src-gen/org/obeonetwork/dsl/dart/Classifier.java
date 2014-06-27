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
package org.obeonetwork.dsl.dart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Classifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Classifier#getFields <em>Fields</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Classifier#getMetadata <em>Metadata</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Classifier#getPartof <em>Partof</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends DartResource {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list. The list contents are of
	 * type {@link org.obeonetwork.dsl.dart.Field}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClassifier_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Metadata}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClassifier_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Partof</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.obeonetwork.dsl.dart.Library#getParts <em>Parts</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partof</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Partof</em>' reference.
	 * @see #setPartof(Library)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClassifier_Partof()
	 * @see org.obeonetwork.dsl.dart.Library#getParts
	 * @model opposite="parts"
	 * @generated
	 */
	Library getPartof();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Classifier#getPartof <em>Partof</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Partof</em>' reference.
	 * @see #getPartof()
	 * @generated
	 */
	void setPartof(Library value);

} // Classifier
