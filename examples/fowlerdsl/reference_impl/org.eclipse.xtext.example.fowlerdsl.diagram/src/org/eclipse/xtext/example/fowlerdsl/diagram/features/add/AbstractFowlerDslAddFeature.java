package org.eclipse.xtext.example.fowlerdsl.diagram.features.add;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeCreateService;

public abstract class AbstractFowlerDslAddFeature extends
		AbstractAddShapeFeature {

	public AbstractFowlerDslAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	protected ContainerShape createContainerShape(final Diagram targetDiagram) {
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		return peCreateService.createContainerShape(targetDiagram, true);
	}

	protected void link(EObject eObject, Shape... shapes) {
		if (eObject.eResource() == null) {
			getDiagram().eResource().getContents().add(eObject);
		}
		for (Shape shape : shapes) {
			link(shape, eObject);
		}
	}
}
