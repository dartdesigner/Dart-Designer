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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to
 * represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.obeonetwork.dsl.dart.DartFactory
 * @model kind="package"
 * @generated
 */
public interface DartPackage extends EPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "dart";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/2014/dart";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "dart";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	DartPackage eINSTANCE = org.obeonetwork.dsl.dart.impl.DartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ProjectImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.Asset <em>Asset</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.Asset
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Asset</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asset</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ContainerImpl <em>Container</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ContainerImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ASSETS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.FolderImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER__ASSETS = CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Folder</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.PackageImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ASSETS = CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LICENSE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DEPENDENCIES = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Package</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.DartResourceImpl <em>Resource</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.DartResourceImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getDartResource()
	 * @generated
	 */
	int DART_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE__DOCUMENTATION = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE__IMPORTS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE__EXPORTS = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DART_RESOURCE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ImportImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Dart Resources</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__DART_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__AS = 1;

	/**
	 * The feature id for the '<em><b>Show</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__SHOW = 2;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__HIDE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__METADATA = 4;

	/**
	 * The number of structural features of the '<em>Import</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Import</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ExportImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 7;

	/**
	 * The feature id for the '<em><b>Dart Resources</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__DART_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Show</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__SHOW = 1;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__HIDE = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Export</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Export</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.Type <em>Type</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.Type
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.TypedefImpl <em>Typedef</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.TypedefImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getTypedef()
	 * @generated
	 */
	int TYPEDEF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__DOCUMENTATION = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__TYPE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__PARAMETERS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__METADATA = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typedef</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Typedef</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ApplicationImpl <em>Application</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ApplicationImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = DART_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DOCUMENTATION = DART_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IMPORTS = DART_RESOURCE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__EXPORTS = DART_RESOURCE__EXPORTS;

	/**
	 * The feature id for the '<em><b>Typedefs</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TYPEDEFS = DART_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION__METADATA = DART_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = DART_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = DART_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.LibraryImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = DART_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DOCUMENTATION = DART_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IMPORTS = DART_RESOURCE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__EXPORTS = DART_RESOURCE__EXPORTS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PARTS = DART_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typedefs</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TYPEDEFS = DART_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__METADATA = DART_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = DART_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Library</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = DART_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ClassifierImpl <em>Classifier</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ClassifierImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = DART_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DOCUMENTATION = DART_RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTS = DART_RESOURCE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__EXPORTS = DART_RESOURCE__EXPORTS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FIELDS = DART_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__METADATA = DART_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partof</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PARTOF = DART_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = DART_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Classifier</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = DART_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.MetadataImpl <em>Metadata</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.MetadataImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__DOCUMENTATION = CLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__IMPORTS = CLASSIFIER__IMPORTS;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__EXPORTS = CLASSIFIER__EXPORTS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__METADATA = CLASSIFIER__METADATA;

	/**
	 * The feature id for the '<em><b>Partof</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA__PARTOF = CLASSIFIER__PARTOF;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metadata</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ClassImpl <em>Class</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ClassImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__DOCUMENTATION = CLASSIFIER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTS = CLASSIFIER__IMPORTS;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__EXPORTS = CLASSIFIER__EXPORTS;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__FIELDS = CLASSIFIER__FIELDS;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__METADATA = CLASSIFIER__METADATA;

	/**
	 * The feature id for the '<em><b>Partof</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__PARTOF = CLASSIFIER__PARTOF;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__ABSTRACT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__MIXINS = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Class</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.FieldImpl <em>Field</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.FieldImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__STATIC = 3;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__FINAL = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD__METADATA = 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Field</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.MethodImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__STATIC = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD__METADATA = 6;

	/**
	 * The number of structural features of the '<em>Method</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Method</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ParameterImpl <em>Parameter</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ParameterImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__METADATA = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Project <em>Project</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.obeonetwork.dsl.dart.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Project#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Project#getPackages <em>Packages</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.obeonetwork.dsl.dart.Project#getPackages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Packages();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Asset <em>Asset</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.obeonetwork.dsl.dart.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Asset#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Container <em>Container</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.obeonetwork.dsl.dart.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Container#getAssets <em>Assets</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see org.obeonetwork.dsl.dart.Container#getAssets()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Assets();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Folder <em>Folder</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.obeonetwork.dsl.dart.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Package <em>Package</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.obeonetwork.dsl.dart.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Package#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Package#getLicense
	 * <em>License</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.obeonetwork.dsl.dart.Package#getLicense()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_License();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.obeonetwork.dsl.dart.Package#getDependencies <em>Dependencies</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.obeonetwork.dsl.dart.Package#getDependencies()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Dependencies();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.DartResource <em>Resource</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.obeonetwork.dsl.dart.DartResource
	 * @generated
	 */
	EClass getDartResource();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.obeonetwork.dsl.dart.DartResource#getDocumentation <em>Documentation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.DartResource#getDocumentation()
	 * @see #getDartResource()
	 * @generated
	 */
	EAttribute getDartResource_Documentation();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.DartResource#getImports <em>Imports</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.obeonetwork.dsl.dart.DartResource#getImports()
	 * @see #getDartResource()
	 * @generated
	 */
	EReference getDartResource_Imports();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.DartResource#getExports <em>Exports</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see org.obeonetwork.dsl.dart.DartResource#getExports()
	 * @see #getDartResource()
	 * @generated
	 */
	EReference getDartResource_Exports();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Import <em>Import</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.obeonetwork.dsl.dart.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.obeonetwork.dsl.dart.Import#getDartResources <em>Dart Resources</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Dart Resources</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getDartResources()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_DartResources();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Import#getAs <em>As</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>As</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getAs()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_As();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Import#getShow
	 * <em>Show</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Show</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getShow()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Show();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Import#getHide
	 * <em>Hide</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Hide</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getHide()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Hide();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Import#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getMetadata()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Export <em>Export</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Export</em>'.
	 * @see org.obeonetwork.dsl.dart.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.obeonetwork.dsl.dart.Export#getDartResources <em>Dart Resources</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Dart Resources</em>'.
	 * @see org.obeonetwork.dsl.dart.Export#getDartResources()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_DartResources();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Export#getShow
	 * <em>Show</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Show</em>'.
	 * @see org.obeonetwork.dsl.dart.Export#getShow()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Show();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Export#getHide
	 * <em>Hide</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Hide</em>'.
	 * @see org.obeonetwork.dsl.dart.Export#getHide()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Hide();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Export#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Export#getMetadata()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Typedef <em>Typedef</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Typedef</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef
	 * @generated
	 */
	EClass getTypedef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Typedef#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef#getName()
	 * @see #getTypedef()
	 * @generated
	 */
	EAttribute getTypedef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Typedef#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef#getDocumentation()
	 * @see #getTypedef()
	 * @generated
	 */
	EAttribute getTypedef_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Typedef#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef#getType()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Type();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Typedef#getParameters <em>Parameters</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef#getParameters()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Typedef#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Typedef#getMetadata()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Type <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Application <em>Application</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.obeonetwork.dsl.dart.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Application#getTypedefs <em>Typedefs</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Typedefs</em>'.
	 * @see org.obeonetwork.dsl.dart.Application#getTypedefs()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Typedefs();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.obeonetwork.dsl.dart.Application#getMetadata <em>Metadata</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Application#getMetadata()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Library <em>Library</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.obeonetwork.dsl.dart.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Library#getParts
	 * <em>Parts</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Parts</em>'.
	 * @see org.obeonetwork.dsl.dart.Library#getParts()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Parts();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Library#getTypedefs <em>Typedefs</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Typedefs</em>'.
	 * @see org.obeonetwork.dsl.dart.Library#getTypedefs()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Typedefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Library#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Library#getMetadata()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.obeonetwork.dsl.dart.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Classifier#getFields <em>Fields</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.obeonetwork.dsl.dart.Classifier#getFields()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Fields();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Classifier#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Classifier#getMetadata()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Metadata();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Classifier#getPartof
	 * <em>Partof</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Partof</em>'.
	 * @see org.obeonetwork.dsl.dart.Classifier#getPartof()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Partof();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Metadata <em>Metadata</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Class <em>Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.obeonetwork.dsl.dart.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Class#isAbstract
	 * <em>Abstract</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#isAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Abstract();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Class#getExtends
	 * <em>Extends</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Class#getImplements
	 * <em>Implements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Class#getMixins
	 * <em>Mixins</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#getMixins()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Mixins();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Class#getMethods <em>Methods</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Field <em>Field</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.obeonetwork.dsl.dart.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Field#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Field#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#getDocumentation()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Field#getType <em>Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Field#isStatic
	 * <em>Static</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#isStatic()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Field#isConstant
	 * <em>Constant</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#isConstant()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Field#isFinal
	 * <em>Final</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#isFinal()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Final();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Field#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Field#getMetadata()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Method <em>Method</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.obeonetwork.dsl.dart.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Method#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Method#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#getDocumentation()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Method#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Method#isAbstract
	 * <em>Abstract</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#isAbstract()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Method#isStatic
	 * <em>Static</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#isStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Static();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Method#getParameters <em>Parameters</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#getParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Method#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Method#getMetadata()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Parameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Parameter#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Parameter#getDefaultValue
	 * <em>Default Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Parameter#isOptional
	 * <em>Optional</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Parameter#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Parameter#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#getMetadata()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Metadata();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DartFactory getDartFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ProjectImpl <em>Project</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ProjectImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROJECT__PACKAGES = eINSTANCE.getProject_Packages();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.Asset <em>Asset</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.Asset
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ContainerImpl
		 * <em>Container</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ContainerImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__ASSETS = eINSTANCE.getContainer_Assets();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.FolderImpl <em>Folder</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.FolderImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.PackageImpl <em>Package</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.PackageImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PACKAGE__LICENSE = eINSTANCE.getPackage_License();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__DEPENDENCIES = eINSTANCE.getPackage_Dependencies();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.DartResourceImpl
		 * <em>Resource</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.DartResourceImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getDartResource()
		 * @generated
		 */
		EClass DART_RESOURCE = eINSTANCE.getDartResource();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DART_RESOURCE__DOCUMENTATION = eINSTANCE.getDartResource_Documentation();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DART_RESOURCE__IMPORTS = eINSTANCE.getDartResource_Imports();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DART_RESOURCE__EXPORTS = eINSTANCE.getDartResource_Exports();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ImportImpl <em>Import</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ImportImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Dart Resources</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__DART_RESOURCES = eINSTANCE.getImport_DartResources();

		/**
		 * The meta object literal for the '<em><b>As</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IMPORT__AS = eINSTANCE.getImport_As();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__SHOW = eINSTANCE.getImport_Show();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__HIDE = eINSTANCE.getImport_Hide();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__METADATA = eINSTANCE.getImport_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ExportImpl <em>Export</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ExportImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '<em><b>Dart Resources</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__DART_RESOURCES = eINSTANCE.getExport_DartResources();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__SHOW = eINSTANCE.getExport_Show();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__HIDE = eINSTANCE.getExport_Hide();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__METADATA = eINSTANCE.getExport_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.TypedefImpl <em>Typedef</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.TypedefImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getTypedef()
		 * @generated
		 */
		EClass TYPEDEF = eINSTANCE.getTypedef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPEDEF__NAME = eINSTANCE.getTypedef_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPEDEF__DOCUMENTATION = eINSTANCE.getTypedef_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPEDEF__TYPE = eINSTANCE.getTypedef_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPEDEF__PARAMETERS = eINSTANCE.getTypedef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPEDEF__METADATA = eINSTANCE.getTypedef_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.Type <em>Type</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.Type
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ApplicationImpl
		 * <em>Application</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ApplicationImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APPLICATION__TYPEDEFS = eINSTANCE.getApplication_Typedefs();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APPLICATION__METADATA = eINSTANCE.getApplication_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.LibraryImpl <em>Library</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.LibraryImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__PARTS = eINSTANCE.getLibrary_Parts();

		/**
		 * The meta object literal for the '<em><b>Typedefs</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__TYPEDEFS = eINSTANCE.getLibrary_Typedefs();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__METADATA = eINSTANCE.getLibrary_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ClassifierImpl
		 * <em>Classifier</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ClassifierImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER__FIELDS = eINSTANCE.getClassifier_Fields();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER__METADATA = eINSTANCE.getClassifier_Metadata();

		/**
		 * The meta object literal for the '<em><b>Partof</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER__PARTOF = eINSTANCE.getClassifier_Partof();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.MetadataImpl
		 * <em>Metadata</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.MetadataImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ClassImpl <em>Class</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ClassImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__MIXINS = eINSTANCE.getClass_Mixins();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.FieldImpl <em>Field</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.FieldImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIELD__DOCUMENTATION = eINSTANCE.getField_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIELD__STATIC = eINSTANCE.getField_Static();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIELD__CONSTANT = eINSTANCE.getField_Constant();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIELD__FINAL = eINSTANCE.getField_Final();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FIELD__METADATA = eINSTANCE.getField_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.MethodImpl <em>Method</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.MethodImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__DOCUMENTATION = eINSTANCE.getMethod_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD__STATIC = eINSTANCE.getMethod_Static();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD__METADATA = eINSTANCE.getMethod_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ParameterImpl
		 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ParameterImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER__METADATA = eINSTANCE.getParameter_Metadata();

	}

} // DartPackage
