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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Part</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Part#getPartOf <em>Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getPart()
 * @model abstract="true"
 * @generated
 */
public interface Part extends DartResource {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.obeonetwork.dsl.dart.Library#getParts <em>Parts</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Part Of</em>' reference.
	 * @see #setPartOf(Library)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getPart_PartOf()
	 * @see org.obeonetwork.dsl.dart.Library#getParts
	 * @model opposite="parts"
	 * @generated
	 */
	Library getPartOf();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Part#getPartOf <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Part Of</em>' reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Library value);

} // Part
