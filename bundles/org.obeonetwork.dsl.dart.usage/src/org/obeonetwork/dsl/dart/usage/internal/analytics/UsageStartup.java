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

import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Activates listener on SIrius editors at startup.
 * 
 * @author Cedric Brun <a href="mailto:cedric.brun@obeo.fr">cedric.brun@obeo.fr</a>
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UsageStartup implements IStartup {

	/**
	 * The usage window listener.
	 * 
	 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
	 */
	private final class UsageWindowListener implements IWindowListener {
		@Override
		public void windowOpened(IWorkbenchWindow window) {
			// do nothing
		}

		@Override
		public void windowDeactivated(IWorkbenchWindow window) {
			// do nothing
		}

		@Override
		public void windowClosed(IWorkbenchWindow window) {
			// do nothing
		}

		@Override
		public void windowActivated(IWorkbenchWindow window) {
			if (usageListener == null && PlatformUI.getWorkbench() != null
					&& PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
				usageListener = new SiriusEditorsListener();
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(
						usageListener);
			}

		}
	}

	/**
	 * Sirius editors listener.
	 */
	private SiriusEditorsListener usageListener;

	/**
	 * Called at Eclipse startup.
	 */
	@Override
	public void earlyStartup() {
		PlatformUI.getWorkbench().addWindowListener(new UsageWindowListener());
	}

}
