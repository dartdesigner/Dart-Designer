/*******************************************************************************
 * Copyright (c) Red Hat
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.obeonetwork.dsl.dart.usage.internal.analytics;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IProduct;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * Emulates a Firefox Browser User-Agent String but reports eclipse related informations.
 * 
 * @author Andre Dietisheim
 */
public class EclipseUserAgent {

	/**
	 * Browser locale delimiter.
	 */
	public static final char BROWSER_LOCALE_DELIMITER = '-';

	/**
	 * Java locale delimiter.
	 */
	public static final char JAVA_LOCALE_DELIMITER = '_';

	/**
	 * Version delimiter.
	 */
	public static final char VERSION_DELIMITER = '.';

	/**
	 * The eclipse runtime id.
	 */
	private static final String ECLIPSE_RUNTIME_BULDEID = "org.eclipse.core.runtime"; //$NON-NLS-1$

	/**
	 * Windows user agent.
	 */
	private static final String USERAGENT_WIN = "{0}/{1} (Windows; U; Windows NT {2}; {3})"; //$NON-NLS-1$

	/**
	 * Mac OS X user agent.
	 */
	private static final String USERAGENT_MAC = "{0}/{1} (Macintosh; U; Intel Mac OS X {2}; {3})"; //$NON-NLS-1$

	/**
	 * Linux user agent.
	 */
	private static final String USERAGENT_LINUX = "{0}/{1} (X11; U; Linux i686; {3})"; //$NON-NLS-1$

	/**
	 * OS Version.
	 */
	private static final String PROP_OS_VERSION = "os.version"; //$NON-NLS-1$

	/**
	 * The browser language.
	 */
	private String browserLanguage;

	/**
	 * Returns the browser language.
	 * 
	 * @return The browser language
	 */
	private String createBrowserLanguage() {
		String language = ""; //$NON-NLS-1$

		String nl = getNL();
		if (nl != null) {
			int indexOf = nl.indexOf(JAVA_LOCALE_DELIMITER);
			if (indexOf <= 0) {
				language = nl;
			}

			StringBuilder builder = new StringBuilder();
			builder.append(nl.substring(0, indexOf));
			builder.append(BROWSER_LOCALE_DELIMITER);
			builder.append(nl.substring(indexOf + 1));
			language = builder.toString();
		}
		return language;
	}

	/**
	 * Returns the current locale id.
	 * 
	 * @return The current locale id
	 */
	protected String getNL() {
		return Platform.getNL();
	}

	/**
	 * Return the browser language.
	 * 
	 * @return The browser language
	 */
	public String getBrowserLanguage() {
		if (browserLanguage == null) {
			browserLanguage = createBrowserLanguage();
		}
		return browserLanguage;
	}

	@Override
	public String toString() {
		String productId = getApplicationName();
		String productVersion = getApplicationVersion();

		return MessageFormat.format(getUserAgentPattern(getOS()), productId, productVersion, getOSVersion(),
				getBrowserLanguage());
	}

	/**
	 * Returns the OS.
	 * 
	 * @return The OS
	 */
	public String getOS() {
		return Platform.getOS();
	}

	/**
	 * Returns the OS version.
	 * 
	 * @return The OS version
	 */
	public String getOSVersion() {
		return System.getProperty(PROP_OS_VERSION);
	}

	/**
	 * Returns the user agent pattern.
	 * 
	 * @param os
	 *            The os
	 * @return The user agent pattern
	 */
	private String getUserAgentPattern(String os) {
		String userAgentPattern = ""; //$NON-NLS-1$
		if (Platform.OS_LINUX.equals(os)) {
			userAgentPattern = USERAGENT_LINUX;
		} else if (Platform.OS_MACOSX.equals(os)) {
			userAgentPattern = USERAGENT_MAC;
		} else if (Platform.OS_WIN32.equals(os)) {
			userAgentPattern = USERAGENT_WIN;
		}
		return userAgentPattern;
	}

	/**
	 * Returns the application name.
	 * 
	 * @return The application name
	 */
	public String getApplicationName() {
		return getApplicationBundle().getSymbolicName();
	}

	/**
	 * Returns the application version.
	 * 
	 * @return The application version
	 */
	public String getApplicationVersion() {
		String fullVersion = getApplicationBundle().getVersion().toString();
		int productVersionStart = fullVersion.lastIndexOf(VERSION_DELIMITER);
		if (productVersionStart > 0) {
			return fullVersion.substring(0, productVersionStart);
		}
		return fullVersion;
	}

	/**
	 * Returns the bundle that launched the application that this class runs in.
	 * 
	 * @return the defining bundle
	 */
	private Bundle getApplicationBundle() {
		IProduct product = Platform.getProduct();
		if (product != null) {
			return product.getDefiningBundle();
		}
		return Platform.getBundle(ECLIPSE_RUNTIME_BULDEID);
	}
}
