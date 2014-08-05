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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Library</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Library#getParts <em>Parts</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Library#getTypedefs <em>Typedefs</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Library#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends DartResource {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Part}. It is bidirectional and its opposite is '
	 * {@link org.obeonetwork.dsl.dart.Part#getPartOf <em>Part Of</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parts</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary_Parts()
	 * @see org.obeonetwork.dsl.dart.Part#getPartOf
	 * @model opposite="partOf"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Typedefs</b></em>' containment reference list. The list contents are
	 * of type {@link org.obeonetwork.dsl.dart.Typedef}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typedefs</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Typedefs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary_Typedefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Typedef> getTypedefs();

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
	 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list. The list contents are
	 * of type {@link org.obeonetwork.dsl.dart.Variable}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list. The list contents are
	 * of type {@link org.obeonetwork.dsl.dart.Function}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getLibrary_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Library
