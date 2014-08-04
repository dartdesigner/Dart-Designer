package org.obeonetwork.dsl.dart.design.internal.services;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.obeonetwork.dsl.dart.Class;
import org.obeonetwork.dsl.dart.DartFactory;
import org.obeonetwork.dsl.dart.DartResource;
import org.obeonetwork.dsl.dart.Export;
import org.obeonetwork.dsl.dart.Function;
import org.obeonetwork.dsl.dart.Import;
import org.obeonetwork.dsl.dart.Parameter;
import org.obeonetwork.dsl.dart.Type;
import org.obeonetwork.dsl.dart.Typedef;
import org.obeonetwork.dsl.dart.Variable;

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
		if (eObject instanceof Function) {
			Function method = (Function)eObject;

			int indexOfParameterStart = label.indexOf('(');
			int indexOfParameterStop = label.indexOf(')');

			int indexOfTypeSeparator = label.lastIndexOf(':');

			// Method name
			int indexOfEndLabel = label.length();
			if (indexOfParameterStart != -1 && indexOfParameterStart < indexOfEndLabel) {
				indexOfEndLabel = indexOfParameterStart;
			}
			if (indexOfTypeSeparator != -1 && indexOfTypeSeparator < indexOfEndLabel) {
				indexOfEndLabel = indexOfTypeSeparator;
			}
			if (indexOfEndLabel > 0) {
				String name = label.substring(0, indexOfEndLabel).trim();
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
				String typeName = label.substring(indexOfTypeSeparator + 1).trim();
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
	private void editParameters(Function method, String parameters) {
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
				String parameterName = nextToken.substring(0, indexOfParameterType).trim();
				String parameterType = nextToken.substring(indexOfParameterType + 1).trim();
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
		if (eObject instanceof Variable) {
			Variable field = (Variable)eObject;

			int indexOfTypeSeparator = label.indexOf(':');
			int indexOfValueSeparator = label.indexOf('=');

			int firstSeparator = label.length();
			if (indexOfTypeSeparator != -1 && indexOfTypeSeparator < firstSeparator) {
				firstSeparator = indexOfTypeSeparator;
			}
			if (indexOfValueSeparator != -1 && indexOfValueSeparator < firstSeparator) {
				firstSeparator = indexOfValueSeparator;
			}

			if (firstSeparator >= 0) {
				String name = label.substring(0, firstSeparator).trim();
				if (name.length() > 0) {
					field.setName(name);
				}

				if (indexOfTypeSeparator != -1
						&& (indexOfValueSeparator == -1 || indexOfValueSeparator < indexOfTypeSeparator)) {
					String typeName = label.substring(indexOfTypeSeparator + 1).trim();
					Type type = this.findTypeByName(this.allRoots(field), typeName);
					field.setType(type);
				} else if (indexOfTypeSeparator != -1 && indexOfValueSeparator > indexOfTypeSeparator) {
					String typeName = label.substring(indexOfTypeSeparator + 1, indexOfValueSeparator).trim();
					Type type = this.findTypeByName(this.allRoots(field), typeName);
					field.setType(type);
				}

				if (indexOfValueSeparator != -1
						&& (indexOfTypeSeparator == -1 || indexOfTypeSeparator < indexOfValueSeparator)) {
					String value = label.substring(indexOfValueSeparator + 1).trim();
					field.setValue(value);
				} else if (indexOfValueSeparator != -1 && indexOfTypeSeparator > indexOfValueSeparator) {
					String value = label.substring(indexOfValueSeparator + 1, indexOfTypeSeparator).trim();
					field.setValue(value);
				}
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

	/**
	 * Returns the list of related elements.
	 *
	 * @param firstView
	 *            The view
	 * @param allSelectedViews
	 *            All the selected views
	 * @param diag
	 *            The diagram
	 * @return The list of related elements
	 */
	public Collection<EObject> getRelatedElements(EObject firstView, List<EObject> allSelectedViews,
			DDiagram diag) {
		Set<EObject> relateds = Sets.newLinkedHashSet();
		for (DSemanticDecorator decorator : Iterables.filter(allSelectedViews, DSemanticDecorator.class)) {
			relateds.addAll(new RelatedElementsSwitch().getRelatedElements(decorator.getTarget()));
		}
		return relateds;
	}

	/**
	 * Returns the semantic source of the edge.
	 *
	 * @param element
	 *            The element
	 * @param edge
	 *            The edge
	 * @return The semantic source of the edge
	 */
	public EObject getEdgeSourceSemantic(EObject element, DEdge edge) {
		if (edge.getSourceNode() instanceof DSemanticDecorator) {
			return ((DSemanticDecorator)edge.getSourceNode()).getTarget();
		}
		return null;
	}

	/**
	 * Returns the semantic target of the edge.
	 *
	 * @param element
	 *            The element
	 * @param edge
	 *            The edge
	 * @return The semantic target of the edge
	 */
	public EObject getEdgeTargetSemantic(EObject element, DEdge edge) {
		if (edge.getTargetNode() instanceof DSemanticDecorator) {
			return ((DSemanticDecorator)edge.getTargetNode()).getTarget();
		}
		return null;
	}

	/**
	 * Delete the import relationship.
	 *
	 * @param eObject
	 *            The context
	 * @param edge
	 *            The edge
	 * @return The context
	 */
	public EObject deleteImport(EObject eObject, DEdge edge) {
		EObject source = this.getEdgeSourceSemantic(eObject, edge);
		EObject target = this.getEdgeTargetSemantic(eObject, edge);

		if (source instanceof DartResource && target instanceof DartResource) {
			DartResource sourceResource = (DartResource)source;
			DartResource targetResource = (DartResource)target;

			Import importToDelete = null;

			List<Import> imports = sourceResource.getImports();
			for (Import anImport : imports) {
				if (targetResource.equals(anImport.getDartResource())) {
					importToDelete = anImport;
				}
			}

			if (importToDelete != null) {
				sourceResource.getImports().remove(importToDelete);
			}
		}

		return eObject;
	}

	/**
	 * Delete the export relationship.
	 *
	 * @param eObject
	 *            The context
	 * @param edge
	 *            The edge
	 * @return The context
	 */
	public EObject deleteExport(EObject eObject, DEdge edge) {
		EObject source = this.getEdgeSourceSemantic(eObject, edge);
		EObject target = this.getEdgeTargetSemantic(eObject, edge);

		if (source instanceof DartResource && target instanceof DartResource) {
			DartResource sourceResource = (DartResource)source;
			DartResource targetResource = (DartResource)target;

			Export exportToDelete = null;

			List<Export> exports = sourceResource.getExports();
			for (Export anExport : exports) {
				if (targetResource.equals(anExport.getDartResource())) {
					exportToDelete = anExport;
				}
			}

			if (exportToDelete != null) {
				sourceResource.getExports().remove(exportToDelete);
			}
		}

		return eObject;
	}
}
