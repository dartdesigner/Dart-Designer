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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.obeonetwork.dsl.dart.design.internal.DartDesignerPlugin;
import org.obeonetwork.dsl.dart.usage.internal.analytics.EclipseUserAgent;

/**
 * Usage preference page.
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UsagePreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * The constructor.
	 */
	public UsagePreferencesPage() {
		super(GRID);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		createReportingData((Composite)control);
		return control;
	}

	/**
	 * Creates the reporting data section.
	 * 
	 * @param parent
	 *            The composite parent
	 */
	private void createReportingData(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(PreferencesMessages.Usage_PreferencePage_ReportedValues);
		GridDataFactory.fillDefaults().grab(true, true).hint(SWT.FILL, SWT.FILL).applyTo(group);
		FillLayout fillLayout = new FillLayout();
		final int marginWidth = 8;
		fillLayout.marginHeight = 4;
		fillLayout.marginWidth = marginWidth;
		group.setLayout(fillLayout);
		StyledText text = new StyledText(group, SWT.BORDER | SWT.V_SCROLL);
		text.setEditable(false);
		createText(text);
	}

	/**
	 * Creates the text section.
	 * 
	 * @param text
	 *            The text to display.
	 */
	private void createText(StyledText text) {
		List<StyleRange> styles = new ArrayList<StyleRange>();
		StringBuilder builder = new StringBuilder();

		EclipseUserAgent eclipseUserAgent = new EclipseUserAgent();
		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_ProductId, eclipseUserAgent
				.getApplicationName(), builder, styles);

		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_ProductVersion, eclipseUserAgent
				.getApplicationVersion(), builder, styles);
		builder.append(System.lineSeparator());

		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_OperatingSystem,
				eclipseUserAgent.getOS(), builder, styles);
		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_OperatingSystemVersion, eclipseUserAgent
				.getOSVersion(), builder, styles);
		builder.append(System.lineSeparator());

		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_Locale, eclipseUserAgent
				.getBrowserLanguage(), builder, styles);
		builder.append(System.lineSeparator());

		appendLabeledValue(PreferencesMessages.Usage_PreferencePage_Diagrams, DartDesignerPlugin.getDefault()
				.getPreferenceStore().getString(UsagePreferences.USAGE_DIAGRAMS_ID), builder, styles);
		builder.append(System.lineSeparator());

		text.setText(builder.toString());

		for (StyleRange style : styles) {
			text.setStyleRange(style);
		}

	}

	/**
	 * Appends a labeled value to the given string builder and adds a bold font style range to the given
	 * styles.
	 * 
	 * @param label
	 *            the label to append
	 * @param value
	 *            the value to append
	 * @param builder
	 *            the builder to append the strings (label, value) to
	 * @param styles
	 *            the styles list to add the style range to
	 */
	private void appendLabeledValue(String label, String value, StringBuilder builder, List<StyleRange> styles) {
		StyleRange styleRange = startLabelStyleRange(builder);
		builder.append(label);
		finishLabelStyleRange(builder, styleRange);
		builder.append(value).append(System.lineSeparator());
		styles.add(styleRange);
	}

	/**
	 * Creates the start style range.
	 * 
	 * @param builder
	 *            The string builder.
	 * @return The style range
	 */
	private StyleRange startLabelStyleRange(StringBuilder builder) {
		StyleRange styleRange = new StyleRange();
		styleRange.start = builder.length();
		styleRange.fontStyle = SWT.BOLD;
		return styleRange;
	}

	/**
	 * Creates the finish style range.
	 * 
	 * @param builder
	 *            The string builder.
	 * @param styleRange
	 *            The start style range
	 * @return The style range
	 */
	private StyleRange finishLabelStyleRange(StringBuilder builder, StyleRange styleRange) {
		styleRange.length = builder.length() - styleRange.start;
		return styleRange;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(UsagePreferences.USAGE_ENABLED_ID,
				PreferencesMessages.Usage_PreferencePage_AllowReporting, getFieldEditorParent()));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(DartDesignerPlugin.getDefault().getPreferenceStore());
		setDescription(PreferencesMessages.Usage_PreferencePage_Description);
	}
}
