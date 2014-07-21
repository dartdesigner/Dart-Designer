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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.Class#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Class#getExtends <em>Extends</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Class#getImplements <em>Implements</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Class#getMixins <em>Mixins</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Class#getConstructors <em>Constructors</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.Class#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier, Type {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Class)
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Extends()
	 * @model
	 * @generated
	 */
	Class getExtends();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dart.Class#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Class value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Class}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	EList<Class> getImplements();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list. The list contents are of type
	 * {@link org.obeonetwork.dsl.dart.Class}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Mixins()
	 * @model
	 * @generated
	 */
	EList<Class> getMixins();

	/**
	 * Returns the value of the '<em><b>Constructors</b></em>' containment reference list. The list contents
	 * are of type {@link org.obeonetwork.dsl.dart.Constructor}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Constructors</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Constructors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constructor> getConstructors();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list. The list contents are of
	 * type {@link org.obeonetwork.dsl.dart.Function}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dart.DartPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getMethods();

} // Class
