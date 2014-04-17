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

import com.dmurph.tracking.AnalyticsConfigData;
import com.dmurph.tracking.JGoogleAnalyticsTracker;
import com.dmurph.tracking.JGoogleAnalyticsTracker.GoogleAnalyticsVersion;
import com.google.common.io.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.UUID;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.dart.usage.internal.UsageActivator;
import org.obeonetwork.dsl.dart.usage.internal.dialog.UsageDialog;
import org.obeonetwork.dsl.dart.usage.internal.preferences.UsagePreferences;

/**
 * Detect when a Sirius editor is used and send information to google analytics.
 * 
 * @author Cedric Brun <a href="mailto:cedric.brun@obeo.fr">cedric.brun@obeo.fr</a>
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class SiriusEditorsListener implements IPartListener2 {

	/**
	 * The Google Analytics ID.
	 */
	private static final String ANALYTICS_ID = UsageMessages.Usage_GoogleAnalytics;

	/**
	 * The Google Analytics tracker.
	 */
	private JGoogleAnalyticsTracker tracker;

	/**
	 * The Eclipse User Agent.
	 */
	private EclipseUserAgent eclipseUserAgent;

	/**
	 * The host name.
	 */
	private String hostname;

	/**
	 * The usage preferences.
	 */
	private UsagePreferences preferences = new UsagePreferences();

	/**
	 * The constructor.
	 */
	public SiriusEditorsListener() {
		AnalyticsConfigData config = new AnalyticsConfigData(ANALYTICS_ID);
		// if you want to set your own config parameters:
		eclipseUserAgent = new EclipseUserAgent();
		config.setUserAgent(eclipseUserAgent.toString());
		tracker = new JGoogleAnalyticsTracker(config, GoogleAnalyticsVersion.V_4_7_2);
		hostname = getOrCreateHostname();
	}

	/**
	 * Returns or creates the host name.
	 * 
	 * @return The host name
	 */
	private String getOrCreateHostname() {
		UUID idOne = UUID.randomUUID();
		String found = idOne.toString();
		try {
			found = retrieveMarker(found);
		} catch (IOException e) {
			UsageActivator.log(IStatus.ERROR, UsageMessages.Error_CreatingGoogleAnalyticsConfig, e);
		}
		return found;
	}

	/**
	 * Retrieves the marker.
	 * 
	 * @param found
	 *            The id found.
	 * @return The marker.
	 * @throws IOException
	 *             In case of issues
	 */
	private String retrieveMarker(String found) throws IOException {
		IPath path = Platform.getStateLocation(UsageActivator.getDefault().getBundle());
		if (path != null) {
			path = path.append("hostname"); //$NON-NLS-1$
			if (!path.toFile().exists()) {
				Files.write(found, path.toFile(), Charset.forName("UTF-8")); //$NON-NLS-1$
			} else {
				if (path.toFile().canRead()) {
					return Files.readFirstLine(path.toFile(), Charset.forName("UTF-8")); //$NON-NLS-1$
				}
			}
		}
		return found;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partActivated(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partBroughtToTop(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partClosed(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partDeactivated(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partOpened(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// If usage report is enabled send data to google analytics
		IWorkbenchPart part = partRef.getPart(false);
		if (part instanceof DialectEditor) {
			// Ask to the user for usage report enablement
			askUser();

			if (!preferences.isEnabled()) {
				return;
			}
			DialectEditor dEditor = (DialectEditor)part;
			DRepresentation rep = dEditor.getRepresentation();
			if (rep != null && DialectManager.INSTANCE.getDescription(rep) != null) {
				RepresentationDescription description = DialectManager.INSTANCE.getDescription(rep);
				if (description != null) {
					String diagURI = EcoreUtil.getURI(description).toString();
					String diagTypeName = description.getName();
					String viewpointName = ((Viewpoint)description.eContainer()).getName();
					preferences.storeDiagramsUsage(diagTypeName);
					tracker.trackPageViewFromReferrer(viewpointName + "/" + diagTypeName, diagURI.toString(), //$NON-NLS-1$
							hostname, eclipseUserAgent.getApplicationName() + ":" //$NON-NLS-1$
									+ eclipseUserAgent.getApplicationVersion(), ""); //$NON-NLS-1$
				}
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partHidden(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partVisible(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IPartListener2#partInputChanged(org.eclipse.ui.IWorkbenchPartReference)
	 */
	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// do nothing.
	}

	/**
	 * Ask to user if it is ok to send some statistics about its usage of UML Designer.
	 */
	private void askUser() {
		// Check preference to see if user already answer the question
		if (preferences.hasAnswered()) {
			return;
		}

		// User does not answer to the question, ask him
		Shell shell = PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
		UsageDialog dialog = new UsageDialog(shell);
		int answer = dialog.open();

		// Set the user answer to the preference store in order to not ask him
		// anymore if he answered. If the user just close the dialog, the
		// question will be ask again at next startup. The user can update its
		// answer at any time in the preferences page.
		preferences.storeUserAnswer(answer);

		// Send to google analytics information of usage report activation
		if (preferences.isEnabled()) {
			tracker.trackPageViewFromReferrer(UsageMessages.Usage_ActivationPageURL,
					UsageMessages.Usage_ActivationPageTitle, hostname, eclipseUserAgent.getApplicationName()
							+ ":" + eclipseUserAgent.getApplicationVersion(), ""); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

}
