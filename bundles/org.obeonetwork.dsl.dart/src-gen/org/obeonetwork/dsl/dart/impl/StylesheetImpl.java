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
package org.obeonetwork.dsl.dart.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.dart.DartPackage;
import org.obeonetwork.dsl.dart.Stylesheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stylesheet</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.obeonetwork.dsl.dart.impl.StylesheetImpl#getImports <em>Imports</em>}</li>
 * <li>{@link org.obeonetwork.dsl.dart.impl.StylesheetImpl#isPartial <em>Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StylesheetImpl extends AssetImpl implements Stylesheet {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Stylesheet> imports;

	/**
	 * The default value of the '{@link #isPartial() <em>Partial</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StylesheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.STYLESHEET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Stylesheet> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Stylesheet>(Stylesheet.class, this,
					DartPackage.STYLESHEET__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public boolean isPartial() {
		return this.getName() != null && this.getName().startsWith("_");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public void setPartial(boolean newPartial) {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetPartial() {
		// TODO: implement this method to unset the 'Partial' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	public boolean isSetPartial() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.STYLESHEET__IMPORTS:
				return getImports();
			case DartPackage.STYLESHEET__PARTIAL:
				return isPartial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DartPackage.STYLESHEET__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Stylesheet>)newValue);
				return;
			case DartPackage.STYLESHEET__PARTIAL:
				setPartial((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DartPackage.STYLESHEET__IMPORTS:
				getImports().clear();
				return;
			case DartPackage.STYLESHEET__PARTIAL:
				unsetPartial();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DartPackage.STYLESHEET__IMPORTS:
				return imports != null && !imports.isEmpty();
			case DartPackage.STYLESHEET__PARTIAL:
				return isSetPartial();
		}
		return super.eIsSet(featureID);
	}

} // StylesheetImpl
