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
package org.obeonetwork.dsl.dart.usage.internal.preferences;

import org.eclipse.osgi.util.NLS;

/**
 * Messages used in usage report preferences.
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public final class PreferencesMessages extends NLS {
	/**
	 * The bundle name.
	 */
	private static final String BUNDLE_NAME = "org.obeonetwork.dsl.dart.usage.internal.preferences.messages"; //$NON-NLS-1$

	// CHECKSTYLE:OFF documentation is _still_ required!

	/**
	 * Reported values.
	 */
	public static String Usage_PreferencePage_ReportedValues;

	/**
	 * Locale.
	 */
	public static String Usage_PreferencePage_Locale;

	/**
	 * Operating system.
	 */
	public static String Usage_PreferencePage_OperatingSystem;

	/**
	 * Operating system version.
	 */
	public static String Usage_PreferencePage_OperatingSystemVersion;

	/**
	 * Product id.
	 */
	public static String Usage_PreferencePage_ProductId;

	/**
	 * Product version.
	 */
	public static String Usage_PreferencePage_ProductVersion;

	/**
	 * Diagrams.
	 */
	public static String Usage_PreferencePage_Diagrams;

	/**
	 * Allow reporting.
	 */
	public static String Usage_PreferencePage_AllowReporting;

	/**
	 * Description.
	 */
	public static String Usage_PreferencePage_Description;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, PreferencesMessages.class);
	}

	/**
	 * The constructor.
	 */
	private PreferencesMessages() {
		// prevent instantiation
	}
}
