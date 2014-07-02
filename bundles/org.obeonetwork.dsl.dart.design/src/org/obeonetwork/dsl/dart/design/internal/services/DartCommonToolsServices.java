package org.obeonetwork.dsl.dart.design.internal.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.DartFactory;
import org.obeonetwork.dsl.dart.Field;
import org.obeonetwork.dsl.dart.Method;
import org.obeonetwork.dsl.dart.Parameter;
import org.obeonetwork.dsl.dart.Type;
import org.obeonetwork.dsl.dart.Typedef;

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
	public boolean active(EObject object) {
		return true;
	}

	/**
	 * Edit the label of the method with the given label.
	 *
	 * @param eObject
	 *            The method to edit
	 * @param label
	 *            The label
	 * @return The edited method
	 */
	public EObject editMethod(EObject eObject, String label) {
		if (eObject instanceof Method) {
			Method method = (Method)eObject;

			int indexOfParameterStart = label.indexOf('(');
			int indexOfParameterStop = label.indexOf(')');

			int indexOfTypeSeparator = label.indexOf(':');

			// Method name
			int indexOfEndLabel = label.length();
			if (indexOfParameterStart != -1 && indexOfParameterStart < indexOfEndLabel) {
				indexOfEndLabel = indexOfParameterStart;
			}
			if (indexOfTypeSeparator != -1 && indexOfTypeSeparator < indexOfEndLabel) {
				indexOfEndLabel = indexOfTypeSeparator;
			}
			if (indexOfEndLabel > 0) {
				String name = label.substring(0, indexOfEndLabel);
				if (name.length() > 0) {
					method.setName(name);
				}
			}

			// Parameters
			if (indexOfParameterStart != -1 && indexOfParameterStop != -1
					&& indexOfParameterStart < indexOfParameterStop) {
				String parameters = label.substring(indexOfParameterStart + 1, indexOfParameterStop);

				this.editParameters(method, parameters);
			}

			// Method return type
			if (indexOfTypeSeparator != -1) {
				String typeName = label.substring(indexOfTypeSeparator + 1);
				Type type = this.findTypeByName(this.allRoots(method), typeName);
				if (type != null) {
					method.setType(type);
				}
			}
		}
		return eObject;
	}

	/**
	 * Edit the content of the parameters.
	 *
	 * @param method
	 *            The method
	 * @param parameters
	 *            The string representing the parameters
	 */
	private void editParameters(Method method, String parameters) {
		int counter = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(parameters, ","); //$NON-NLS-1$

		if (!stringTokenizer.hasMoreTokens()) {
			method.getParameters().clear();
		}

		while (stringTokenizer.hasMoreTokens()) {
			String nextToken = stringTokenizer.nextToken().trim();

			Parameter parameter = null;
			if (method.getParameters().size() > counter) {
				parameter = method.getParameters().get(counter);
			} else if (nextToken.length() > 0) {
				parameter = DartFactory.eINSTANCE.createParameter();
				String name = new DartNamingServices().getNewParameterDefaultName(parameter);
				parameter.setName(name);
				method.getParameters().add(parameter);
			}

			int indexOfParameterType = nextToken.indexOf(':');
			if (indexOfParameterType != -1 && parameter != null) {
				String parameterName = nextToken.substring(0, indexOfParameterType);
				String parameterType = nextToken.substring(indexOfParameterType + 1);
				if (parameterName.length() > 0) {
					parameter.setName(parameterName);
				}

				if (parameterType.length() > 0) {
					Type type = this.findTypeByName(this.allRoots(method), parameterType);
					if (type != null) {
						parameter.setType(type);
					}
				} else {
					parameter.setType(null);
				}
			}

			counter++;
		}
	}

	/**
	 * Edit the label of the field with the given label.
	 *
	 * @param eObject
	 *            The field to edit
	 * @param label
	 *            The label
	 * @return The edited field
	 */
	public EObject editField(EObject eObject, String label) {
		if (eObject instanceof Field) {
			Field field = (Field)eObject;

			int indexOfTypeSeparator = label.indexOf(':');
			if (indexOfTypeSeparator != -1) {
				String name = label.substring(0, indexOfTypeSeparator);
				if (name.length() > 0) {
					field.setName(name);
				}

				String typeName = label.substring(indexOfTypeSeparator + 1);
				Type type = this.findTypeByName(this.allRoots(field), typeName);
				if (type != null) {
					field.setType(type);
				}
			} else if (label.length() > 0) {
				field.setName(label);
			}
		}
		return eObject;
	}

	/**
	 * Returns all the root objects of all the resources in the same resource-set as the specified object.
	 *
	 * @param any
	 *            an EObject.
	 * @return all the root objects in the same resource-set as <code>any</code> or an empty collection if
	 *         <code>any</code> is not inside a resource-set.
	 */
	private Collection<EObject> allRoots(EObject any) {
		Resource res = any.eResource();
		if (res != null && res.getResourceSet() != null) {
			Collection<EObject> roots = new ArrayList<EObject>();
			for (Resource childRes : res.getResourceSet().getResources()) {
				roots.addAll(childRes.getContents());
			}
			return roots;
		}
		return Collections.emptySet();
	}

	/**
	 * Return a type with the given name starting from the given root EObjects.
	 *
	 * @param eObjects
	 *            The roots
	 * @param name
	 *            The name of the type
	 * @return The type
	 */
	private Type findTypeByName(Iterable<EObject> eObjects, String name) {
		for (EObject root : eObjects) {
			Type result = this.findTypeByNameFrom(root, name);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Return the type with the given name starting from the given root.
	 *
	 * @param root
	 *            The root
	 * @param name
	 *            The name of the type
	 * @return the type
	 */
	private Type findTypeByNameFrom(EObject root, String name) {
		Type type = null;
		TreeIterator<EObject> eAllContents = root.eAllContents();
		while (eAllContents.hasNext()) {
			EObject eObject = eAllContents.next();
			if (eObject instanceof Class && name.equals(((Class)eObject).getName())) {
				type = (Class)eObject;
			} else if (eObject instanceof Typedef && name.equals(((Typedef)eObject).getName())) {
				type = (Typedef)eObject;
			}
		}
		return type;
	}
}
