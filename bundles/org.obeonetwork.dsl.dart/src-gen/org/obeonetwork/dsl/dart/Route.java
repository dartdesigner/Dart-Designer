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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Route</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Route#getName <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Route#getPath <em>Path</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Route#getView <em>View</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Route#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
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
	 * @see org.obeonetwork.dsl.dart.DartPackage#getRoute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Route#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getRoute_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Route#getPath <em>Path</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(HTML)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getRoute_View()
	 * @model
	 * @generated
	 */
	HTML getView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Route#getView <em>View</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(HTML value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Route)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getRoute_Extends()
	 * @model
	 * @generated
	 */
	Route getExtends();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Route#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Route value);

} // Route
