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
package org.obeonetwork.dsl.dart.usage.internal.analytics;

import org.eclipse.osgi.util.NLS;

/**
 * Messages used in usage enablement dialog.
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public final class UsageMessages extends NLS {
	/**
	 * The bundle name.
	 */
	private static final String BUNDLE_NAME = "org.obeonetwork.dsl.dart.usage.internal.analytics.messages"; //$NON-NLS-1$

	// CHECKSTYLE:OFF documentation is _still_ required!

	/**
	 * Google Analytics.
	 */
	public static String Usage_GoogleAnalytics;

	/**
	 * Activation page URL.
	 */
	public static String Usage_ActivationPageURL;

	/**
	 * Activation page title.
	 */
	public static String Usage_ActivationPageTitle;

	/**
	 * Creating Google Analytics config.
	 */
	public static String Error_CreatingGoogleAnalyticsConfig;

	/**
	 * 
	 */
	public static String Error_OpeningUsageHyperlink;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, UsageMessages.class);
	}

	/**
	 * The constructor.
	 */
	private UsageMessages() {
		// prevent instatiation
	}
}
