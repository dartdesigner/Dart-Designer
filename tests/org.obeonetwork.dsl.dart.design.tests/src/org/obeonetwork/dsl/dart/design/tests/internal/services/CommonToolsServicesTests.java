/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.dart.design.tests.internal.services;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.DartFactory;
import org.obeonetwork.dsl.dart.Function;
import org.obeonetwork.dsl.dart.IDartSpecificationConstants;
import org.obeonetwork.dsl.dart.Variable;
import org.obeonetwork.dsl.dart.design.internal.services.DartCommonToolsServices;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

import static org.junit.Assert.fail;

/**
 * Tests of the common tools services.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
@SuppressWarnings({"checkstyle:javadocmethod", "checkstyle:multiplestringliterals" })
public class CommonToolsServicesTests {

	@Test
	public void testEditMethod() {
		Function function = this.createFunction();

		new DartCommonToolsServices().editMethod(function, "doStuff(aParam: bool): String"); //$NON-NLS-1$

		assertThat(function.getName(), is("doStuff")); //$NON-NLS-1$
		assertThat(Integer.valueOf(function.getParameters().size()), is(Integer.valueOf(1)));
		assertThat(function.getParameters().get(0).getName(), is("aParam")); //$NON-NLS-1$
		assertThat(function.getParameters().get(0).getType(), is(notNullValue()));
		assertThat(function.getParameters().get(0).getType(), is(instanceOf(Class.class)));
		assertThat(((Class)function.getParameters().get(0).getType()).getName(), is("bool")); //$NON-NLS-1$
		assertThat(function.getType(), is(notNullValue()));
		assertThat(function.getType(), is(instanceOf(Class.class)));
		assertThat(((Class)function.getType()).getName(), is("String")); //$NON-NLS-1$
	}

	@Test
	public void testEditMethodName() {
		Function function = this.createFunction();

		new DartCommonToolsServices().editMethod(function, "do"); //$NON-NLS-1$

		assertThat(function.getName(), is("do")); //$NON-NLS-1$
		assertThat(Integer.valueOf(function.getParameters().size()), is(Integer.valueOf(0)));
		assertThat(function.getType(), is(nullValue()));
	}

	@Test
	public void testEditMethodType() {
		Function function = this.createFunction();

		new DartCommonToolsServices().editMethod(function, ":bool"); //$NON-NLS-1$

		assertThat(function.getName(), is(nullValue()));
		assertThat(Integer.valueOf(function.getParameters().size()), is(Integer.valueOf(0)));
		assertThat(function.getType(), is(notNullValue()));
		assertThat(function.getType(), is(instanceOf(Class.class)));
		assertThat(((Class)function.getType()).getName(), is("bool")); //$NON-NLS-1$
	}

	/**
	 * Creates a test function in a resource in a resource set with the standard library loaded.
	 *
	 * @return The test function
	 */
	private Function createFunction() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("test.xmi")); //$NON-NLS-1$

		Resource dartlangResource = resourceSet.getResource(URI.createURI(
				IDartSpecificationConstants.DARTLANG_URI, true), true);
		try {
			dartlangResource.load(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}

		Function function = DartFactory.eINSTANCE.createFunction();
		resource.getContents().add(function);
		return function;
	}

	@Test
	public void testEditField() {
		Variable variable = this.createVariable();

		new DartCommonToolsServices().editField(variable, "myName: String = Peter"); //$NON-NLS-1$

		assertThat(variable.getName(), is("myName")); //$NON-NLS-1$
		assertThat(variable.getType(), is(notNullValue()));
		assertThat(variable.getValue(), is("Peter")); //$NON-NLS-1$
		assertThat(variable.getType(), instanceOf(Class.class));
		assertThat(((Class)variable.getType()).getName(), is("String")); //$NON-NLS-1$
	}

	@Test
	public void testEditFieldName() {
		Variable variable = this.createVariable();

		new DartCommonToolsServices().editField(variable, "myTestName"); //$NON-NLS-1$

		assertThat(variable.getName(), is("myTestName")); //$NON-NLS-1$
		assertThat(variable.getType(), is(nullValue()));
		assertThat(variable.getValue(), is(nullValue()));
	}

	@Test
	public void testEditFieldType() {
		Variable variable = this.createVariable();

		new DartCommonToolsServices().editField(variable, ":bool"); //$NON-NLS-1$

		assertThat(variable.getName(), is(nullValue()));
		assertThat(variable.getType(), instanceOf(Class.class));
		assertThat(((Class)variable.getType()).getName(), is("bool")); //$NON-NLS-1$
		assertThat(variable.getValue(), is(nullValue()));
	}

	@Test
	public void testEditFieldValue() {
		Variable variable = this.createVariable();

		new DartCommonToolsServices().editField(variable, "=John"); //$NON-NLS-1$

		assertThat(variable.getName(), is(nullValue()));
		assertThat(variable.getType(), is(nullValue()));
		assertThat(variable.getValue(), is("John")); //$NON-NLS-1$
	}

	/**
	 * Creates a test variable in a resource in a resource set with the standard library loaded.
	 *
	 * @return The test variable
	 */
	private Variable createVariable() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("test.xmi")); //$NON-NLS-1$

		Resource dartlangResource = resourceSet.getResource(URI.createURI(
				IDartSpecificationConstants.DARTLANG_URI, true), true);
		try {
			dartlangResource.load(null);
		} catch (IOException e) {
			fail(e.getMessage());
		}

		Variable variable = DartFactory.eINSTANCE.createVariable();
		resource.getContents().add(variable);
		return variable;
	}
}
