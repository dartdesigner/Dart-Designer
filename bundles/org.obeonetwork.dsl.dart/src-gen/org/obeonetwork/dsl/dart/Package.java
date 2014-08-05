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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Package</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Package#getName <em>Name</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Package#getLicense <em>License</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Package#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Package#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Container {
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
	 * @see org.obeonetwork.dsl.dart.DartPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Package#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getPackage_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Package#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Package}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getPackage_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Package> getDependencies();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.obeonetwork.dsl.dart.Project#getPackages <em>Packages</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getPackage_Project()
	 * @see org.obeonetwork.dsl.dart.Project#getPackages
	 * @model opposite="packages" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Package#getProject <em>Project</em>}' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Package
