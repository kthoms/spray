package org.eclipse.xtext.example.fowlerdsl.diagram.properties;

import java.beans.PropertyChangeEvent;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.adapters.SemanticAdapter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.properties.sections.PropertiesEditionSection;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.internal.command.CommandExec;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.ui.internal.T;
import org.eclipse.graphiti.ui.internal.editor.DiagramEditorInternal;
import org.eclipse.graphiti.ui.internal.parts.FreeFormConnectionEditPart;
import org.eclipse.graphiti.ui.internal.parts.IContainerShapeEditPart;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IContributedContentsView;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;

public class FowlerDslPropertiesEditionSection extends PropertiesEditionSection {
	private PictogramElement pe = null;
	private FowlerDslElementFilter filter = new FowlerDslElementFilter();

	/**
	 * @return the selected pictogram element.
	 */
	protected PictogramElement getSelectedPictogramElement() {
		if (getSelection() instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) getSelection();

			Object firstElement = structuredSelection.getFirstElement();

			if (firstElement instanceof PictogramElement) {
				return (PictogramElement) firstElement;
			}

			EditPart editPart = null;
			if (firstElement instanceof EditPart) {
				editPart = (EditPart) firstElement;
			} else if (firstElement instanceof IAdaptable) {
				editPart = (EditPart) ((IAdaptable) firstElement)
						.getAdapter(EditPart.class);
			}
			if (editPart != null
					&& editPart.getModel() instanceof PictogramElement) {
				return (PictogramElement) editPart.getModel();
			}
		}
		return null;
	}

	/**
	 * Executes the feature and adds it to the command stack.
	 * 
	 * @param feature
	 *            the feature
	 * @param context
	 *            the context
	 */
	public void execute(IFeature feature, IContext context) {
		try {
			CommandExec.executeFeatureWithContext(feature, context);
		} catch (Exception e) {
			if (e instanceof OperationCanceledException) {
				// Just log it as info (operation was cancelled on purpose)
				T.racer().log(IStatus.INFO,
						"GFCommandStack.execute(Command) " + e, e); //$NON-NLS-1$
			} else {
				// Just log it as an error
				T.racer().error("GFCommandStack.execute(Command) " + e, e); //$NON-NLS-1$
			}
		}
	}

	public void propertyChange(PropertyChangeEvent evt) {
		refresh();
	}

	/**
	 * @return the {@link IDiagramEditor} diagram editor.
	 */
	protected IDiagramEditor getDiagramEditor() {
		IWorkbenchPart part = getPart();
		if (part instanceof DiagramEditorInternal) {
			return (DiagramEditorInternal) part;
		}
		IContributedContentsView contributedView = (IContributedContentsView) part
				.getAdapter(IContributedContentsView.class);
		if (contributedView != null) {
			part = contributedView.getContributingPart();
		}
		if (part instanceof DiagramEditorInternal) {
			return (DiagramEditorInternal) part;
		}

		return null;
	}

	/**
	 * @return the diagram.
	 */
	protected Diagram getDiagram() {
		IDiagramTypeProvider diagramTypeProvider = getDiagramTypeProvider();
		if (diagramTypeProvider == null) {
			return null;
		}
		return diagramTypeProvider.getDiagram();
	}

	/**
	 * @return the diagram type provider.
	 */
	protected IDiagramTypeProvider getDiagramTypeProvider() {
		IDiagramEditor diagramEditor = getDiagramEditor();
		if (diagramEditor == null) {
			return null;
		}
		return diagramEditor.getDiagramTypeProvider();
	}

	protected EObject resolveSemanticObject(Object object) {
		if (object instanceof EObject) {
			return (EObject) object;
		} else if (object instanceof IContainerShapeEditPart) {
			pe = ((IContainerShapeEditPart) object).getPictogramElement();
			PictogramLink link = pe.getLink();
			if (link != null) {
				for (EObject bo : link.getBusinessObjects()) {
					if (filter.accept(bo)) {
						return bo;
					}
				}
			}
		} else if (object instanceof FreeFormConnectionEditPart) {
			pe = ((FreeFormConnectionEditPart) object).getPictogramElement();
			PictogramLink link = pe.getLink();
			if (link != null) {
				for (EObject bo : link.getBusinessObjects()) {
					if (filter.accept(bo)) {
						return bo;
					}
				}
			}
		} else if (object instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) object;
			if (adaptable.getAdapter(SemanticAdapter.class) != null) {
				SemanticAdapter semanticAdapter = (SemanticAdapter) adaptable
						.getAdapter(SemanticAdapter.class);
				return semanticAdapter.getEObject();
			} else if (adaptable.getAdapter(EObject.class) != null) {
				return (EObject) adaptable.getAdapter(EObject.class);
			}
		}
		return null;
	}

	@Override
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (pe != null) {
			UpdateContext context = new UpdateContext(pe);
			if (getDiagramEditor() != null
					&& getDiagramEditor().getDiagramTypeProvider() != null
					&& getDiagramEditor().getDiagramTypeProvider()
							.getFeatureProvider() != null) {
				getDiagramEditor().getDiagramTypeProvider()
						.getFeatureProvider().updateIfPossible(context);
			}
		}
	}
}
