package org.eclipse.xtext.example.fowlerdsl.diagram.features.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.example.fowlerdsl.diagram.builder.RectangleBuilder;
import org.eclipse.xtext.example.fowlerdsl.diagram.builder.TextBuilder;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;

public class AddStateFeature extends AbstractFowlerDslAddFeature {

	public AddStateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof State
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		final State state = (State) context.getNewObject();
		final ContainerShape containerShape = createContainerShape(getDiagram());
		
		final int width = 100;
		final int height = 50;

		RectangleBuilder.init(getDiagram(), containerShape)
				.withLocation(context.getX(), context.getY()).withHeight(height)
				.withWidth(width).withLineWidth(1)
				.withForeground(IColorConstant.BLACK)
				.withBackground(IColorConstant.WHITE).build();

		Shape textShape = TextBuilder.init(getDiagram(), containerShape)
				.withText(state.getName()).withWidth(width).withHeight(height)
				.withLocation(0, 0).withForeground(IColorConstant.BLACK)
				.alignHorizontal(Orientation.ALIGNMENT_CENTER)
				.alignVertical(Orientation.ALIGNMENT_MIDDLE).withFont("Arial")
				.withFontSize(12).withBoldFont().build();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		peCreateService.createChopboxAnchor(containerShape);
		layoutPictogramElement(containerShape);

		link(state, containerShape, textShape);

		return containerShape;
	}
}
