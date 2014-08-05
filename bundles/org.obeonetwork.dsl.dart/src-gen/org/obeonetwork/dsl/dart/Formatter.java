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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Formatter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Formatter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getFormatter()
 * @model
 * @generated
 */
public interface Formatter extends org.obeonetwork.dsl.dart.Class, AngularType {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Formatter Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatter Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Formatter Name</em>' attribute.
	 * @see #setFormatterName(String)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getFormatter_FormatterName()
	 * @model
	 * @generated
	 */
	String getFormatterName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Formatter#getFormatterName
	 * <em>Formatter Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Formatter Name</em>' attribute.
	 * @see #getFormatterName()
	 * @generated
	 */
	void setFormatterName(String value);

} // Formatter
