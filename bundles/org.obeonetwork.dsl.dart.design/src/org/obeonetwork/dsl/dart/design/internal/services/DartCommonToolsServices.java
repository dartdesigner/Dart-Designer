package org.obeonetwork.dsl.dart.design.internal.services;

/**
 * This class will hold utility operations for the common tools.
 *
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 */
public class DartCommonToolsServices {
	/**
	 * This operation will always return false.
	 *
	 * @param object
	 *            The current context
	 * @return <code>false</code>
	 */
	public boolean inactive(Object object) {
		return false;
	}

	/**
	 * This operation will always return true.
	 *
	 * @param object
	 *            The current context
	 * @return <code>true</code>
	 */
	public boolean active(Object object) {
		return true;
	}
}
