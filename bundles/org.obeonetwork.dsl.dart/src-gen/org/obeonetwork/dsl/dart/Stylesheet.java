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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stylesheet</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Stylesheet#getImports <em>Imports</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Stylesheet#isPartial <em>Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getStylesheet()
 * @model
 * @generated
 */
public interface Stylesheet extends Asset {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Stylesheet}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getStylesheet_Imports()
	 * @model
	 * @generated
	 */
	EList<Stylesheet> getImports();

	/**
	 * Returns the value of the '<em><b>Partial</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partial</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Partial</em>' attribute.
	 * @see #isSetPartial()
	 * @see #unsetPartial()
	 * @see #setPartial(boolean)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getStylesheet_Partial()
	 * @model unsettable="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isPartial();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Stylesheet#isPartial <em>Partial</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Partial</em>' attribute.
	 * @see #isSetPartial()
	 * @see #unsetPartial()
	 * @see #isPartial()
	 * @generated
	 */
	void setPartial(boolean value);

	/**
	 * Unsets the value of the '{@link org.obeonetwork.dsl.dart.Stylesheet#isPartial <em>Partial</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetPartial()
	 * @see #isPartial()
	 * @see #setPartial(boolean)
	 * @generated
	 */
	void unsetPartial();

	/**
	 * Returns whether the value of the '{@link org.obeonetwork.dsl.dart.Stylesheet#isPartial
	 * <em>Partial</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Partial</em>' attribute is set.
	 * @see #unsetPartial()
	 * @see #isPartial()
	 * @see #setPartial(boolean)
	 * @generated
	 */
	boolean isSetPartial();

} // Stylesheet
