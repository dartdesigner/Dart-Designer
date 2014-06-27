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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Export</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Export#getDartResources <em>Dart Resources</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Export#getShow <em>Show</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Export#getHide <em>Hide</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Export#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Dart Resources</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.DartResource}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dart Resources</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dart Resources</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getExport_DartResources()
	 * @model
	 * @generated
	 */
	EList<DartResource> getDartResources();

	/**
	 * Returns the value of the '<em><b>Show</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Class}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Show</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getExport_Show()
	 * @model
	 * @generated
	 */
	EList<org.obeonetwork.dsl.dart.Class> getShow();

	/**
	 * Returns the value of the '<em><b>Hide</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hide</em>' reference.
	 * @see #setHide(org.obeonetwork.dsl.dart.Class)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getExport_Hide()
	 * @model
	 * @generated
	 */
	org.obeonetwork.dsl.dart.Class getHide();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Export#getHide <em>Hide</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Hide</em>' reference.
	 * @see #getHide()
	 * @generated
	 */
	void setHide(org.obeonetwork.dsl.dart.Class value);

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
	 * @see org.obeonetwork.dsl.dart.DartPackage#getExport_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Export
