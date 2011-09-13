package org.eclipse.xtext.example.fowlerdsl.diagram.features.add;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.example.fowlerdsl.diagram.builder.TextBuilder;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;

public class AddTransitionFeature extends AbstractAddFeature {

	public AddTransitionFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		boolean canAdd = false;
		if (context instanceof IAddConnectionContext
				&& context.getNewObject() instanceof Transition) {
			canAdd = true;
		}
		return canAdd;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		Transition transition = (Transition) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		Connection connection = peCreateService
				.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());
		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineWidth(1);
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		addArrow(connection);
		addLabel(connection, transition);
		link(connection, transition);
		return connection;
	}

	private void addLabel(Connection connection, Transition transition) {
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		TextBuilder.init(getDiagram(), textDecorator)
				.withText(transition.getEvent().getName())
				.withForeground(IColorConstant.BLACK).withLocation(10, 0)
				.build();
	}

	private Polygon addArrow(Connection connection) {
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ConnectionDecorator cd = peCreateService.createConnectionDecorator(
				connection, false, 1, true);
		IGaService gaService = Graphiti.getGaService();
		Polygon polygon = gaService.createPolygon(cd, new int[] { -10, 5, 0, 0,
				-10, -5 });
		polygon.setForeground(manageColor(IColorConstant.BLACK));
		polygon.setBackground(manageColor(IColorConstant.BLACK));
		polygon.setLineWidth(1);
		return polygon;
	}
}
