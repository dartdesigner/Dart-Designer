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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Project</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Project#getName <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Project#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Project#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list. The list contents are
	 * of type {@link org.obeonetwork.dsl.dart.Package}. It is bidirectional and its opposite is '
	 * {@link org.obeonetwork.dsl.dart.Package#getProject <em>Project</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getProject_Packages()
	 * @see org.obeonetwork.dsl.dart.Package#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.dart.Package> getPackages();

} // Project
