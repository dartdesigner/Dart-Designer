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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Import</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Import#getDartResources <em>Dart Resources</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Import#getAs <em>As</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Import#getShow <em>Show</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Import#getHide <em>Hide</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Import#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Dart Resource</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dart Resource</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dart Resource</em>' reference.
	 * @see #setDartResource(DartResource)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getImport_DartResource()
	 * @model
	 * @generated
	 */
	DartResource getDartResource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Import#getDartResource <em>Dart Resource</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Dart Resource</em>' reference.
	 * @see #getDartResource()
	 * @generated
	 */
	void setDartResource(DartResource value);

	/**
	 * Returns the value of the '<em><b>As</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>As</em>' attribute.
	 * @see #setAs(String)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getImport_As()
	 * @model
	 * @generated
	 */
	String getAs();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Import#getAs <em>As</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>As</em>' attribute.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.DartResource}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Show</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getImport_Show()
	 * @model
	 * @generated
	 */
	EList<DartResource> getShow();

	/**
	 * Returns the value of the '<em><b>Hide</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.DartResource}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hide</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getImport_Hide()
	 * @model
	 * @generated
	 */
	EList<DartResource> getHide();

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
	 * @see org.obeonetwork.dsl.dart.DartPackage#getImport_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Import
