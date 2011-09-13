package org.eclipse.xtext.example.fowlerdsl.diagram.builder;

import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.IColorConstant;

public class RectangleBuilder {
	private final Diagram diagram;
	private final IGaService gaService = Graphiti.getGaService();
	private final Rectangle rectangle;
	private IColorConstant foreground = IColorConstant.BLACK;
	private IColorConstant background = IColorConstant.WHITE;
	private int x = 0, y = 0;
	private int width = 100, height = 100;
	private int lineWidth = 1;

	private RectangleBuilder(final Diagram diagram,
			final ContainerShape containerShape) {
		this.diagram = diagram;
		rectangle = gaService.createRectangle(containerShape);
	}

	private Diagram getDiagram() {
		return diagram;
	}

	public static RectangleBuilder init(final Diagram diagram,
			final ContainerShape containerShape) {
		return new RectangleBuilder(diagram, containerShape);
	}

	public RectangleBuilder withForeground(IColorConstant foreground) {
		this.foreground = foreground;
		return this;
	}

	public RectangleBuilder withBackground(IColorConstant background) {
		this.background = background;
		return this;
	}

	public RectangleBuilder withLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	public RectangleBuilder withLocation(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public RectangleBuilder withWidth(int width) {
		this.width = width;
		return this;
	}

	public RectangleBuilder withHeight(int height) {
		this.height = height;
		return this;
	}

	public Rectangle build() {
		rectangle.setLineWidth(lineWidth);
		rectangle
				.setForeground(gaService.manageColor(getDiagram(), foreground));
		rectangle
				.setBackground(gaService.manageColor(getDiagram(), background));
		gaService.setLocationAndSize(rectangle, x, y, width, height);
		return rectangle;
	}
}
