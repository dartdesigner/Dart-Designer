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
	 * The feature id for the '<em><b>Dart Resource</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__DART_RESOURCE = 0;

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
	 * The feature id for the '<em><b>Dart Resource</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__DART_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Show</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT__SHOW = 1;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
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
	int TYPE = 8;

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
	int TYPEDEF = 17;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.LibraryImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 9;

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
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__VARIABLES = DART_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__FUNCTIONS = DART_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = DART_RESOURCE_FEATURE_COUNT + 5;

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
	int CLASSIFIER = 10;

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
	int METADATA = 11;

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
	int CLASS = 12;

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
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__CONSTRUCTORS = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.VariableImpl <em>Variable</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.VariableImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATIC = 3;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FINAL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__METADATA = 7;

	/**
	 * The number of structural features of the '<em>Variable</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Variable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ConstructorImpl <em>Constructor</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ConstructorImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 14;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CONSTANT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__METADATA = 2;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constructor</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.FunctionImpl <em>Function</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.FunctionImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__STATIC = 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__METADATA = 7;

	/**
	 * The number of structural features of the '<em>Function</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Function</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dart.impl.ParameterImpl <em>Parameter</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.dart.impl.ParameterImpl
	 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

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
	 * The feature id for the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__DOCUMENTATION = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__NAME = TYPE_FEATURE_COUNT + 1;

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
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Import#getDartResource
	 * <em>Dart Resource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Dart Resource</em>'.
	 * @see org.obeonetwork.dsl.dart.Import#getDartResource()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_DartResource();

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
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Export#getDartResource
	 * <em>Dart Resource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Dart Resource</em>'.
	 * @see org.obeonetwork.dsl.dart.Export#getDartResource()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_DartResource();

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
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Export#getHide
	 * <em>Hide</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Hide</em>'.
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
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Library#getVariables <em>Variables</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.obeonetwork.dsl.dart.Library#getVariables()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Variables();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Library#getFunctions <em>Functions</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.obeonetwork.dsl.dart.Library#getFunctions()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Functions();

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
	 * {@link org.obeonetwork.dsl.dart.Class#getConstructors <em>Constructors</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see org.obeonetwork.dsl.dart.Class#getConstructors()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Constructors();

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
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Variable <em>Variable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#getDocumentation()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Variable#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#isStatic
	 * <em>Static</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#isStatic()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#isConstant
	 * <em>Constant</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#isConstant()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#isFinal
	 * <em>Final</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#isFinal()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Variable#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Variable#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Variable#getMetadata()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.obeonetwork.dsl.dart.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Constructor#isConstant
	 * <em>Constant</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.obeonetwork.dsl.dart.Constructor#isConstant()
	 * @see #getConstructor()
	 * @generated
	 */
	EAttribute getConstructor_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Constructor#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.obeonetwork.dsl.dart.Constructor#getBody()
	 * @see #getConstructor()
	 * @generated
	 */
	EAttribute getConstructor_Body();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.obeonetwork.dsl.dart.Constructor#getMetadata <em>Metadata</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Constructor#getMetadata()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Metadata();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dart.Function <em>Function</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.obeonetwork.dsl.dart.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Function#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Function#getDocumentation
	 * <em>Documentation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getDocumentation()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dart.Function#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Function#isAbstract
	 * <em>Abstract</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#isAbstract()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Function#isStatic
	 * <em>Static</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#isStatic()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Function#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.obeonetwork.dsl.dart.Function#getParameters <em>Parameters</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dart.Function#getMetadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadata</em>'.
	 * @see org.obeonetwork.dsl.dart.Function#getMetadata()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Metadata();

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
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.dart.Parameter#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.obeonetwork.dsl.dart.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

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
		 * The meta object literal for the '<em><b>Dart Resource</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__DART_RESOURCE = eINSTANCE.getImport_DartResource();

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
		 * The meta object literal for the '<em><b>Dart Resource</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__DART_RESOURCE = eINSTANCE.getExport_DartResource();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EXPORT__SHOW = eINSTANCE.getExport_Show();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
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
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__VARIABLES = eINSTANCE.getLibrary_Variables();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__FUNCTIONS = eINSTANCE.getLibrary_Functions();

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
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__CONSTRUCTORS = eINSTANCE.getClass_Constructors();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.VariableImpl
		 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.VariableImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__DOCUMENTATION = eINSTANCE.getVariable_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__STATIC = eINSTANCE.getVariable_Static();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__CONSTANT = eINSTANCE.getVariable_Constant();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__FINAL = eINSTANCE.getVariable_Final();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VARIABLE__METADATA = eINSTANCE.getVariable_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.ConstructorImpl
		 * <em>Constructor</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.ConstructorImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRUCTOR__CONSTANT = eINSTANCE.getConstructor_Constant();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONSTRUCTOR__METADATA = eINSTANCE.getConstructor_Metadata();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dart.impl.FunctionImpl
		 * <em>Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.obeonetwork.dsl.dart.impl.FunctionImpl
		 * @see org.obeonetwork.dsl.dart.impl.DartPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__DOCUMENTATION = eINSTANCE.getFunction_Documentation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__ABSTRACT = eINSTANCE.getFunction_Abstract();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__STATIC = eINSTANCE.getFunction_Static();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__METADATA = eINSTANCE.getFunction_Metadata();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

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
