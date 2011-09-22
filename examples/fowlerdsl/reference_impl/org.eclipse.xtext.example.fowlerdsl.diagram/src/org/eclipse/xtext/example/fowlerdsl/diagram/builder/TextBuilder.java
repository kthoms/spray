package org.eclipse.xtext.example.fowlerdsl.diagram.builder;

import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.IColorConstant;

public class TextBuilder {
	private final Diagram diagram;
	private final IGaService gaService = Graphiti.getGaService();
	private final Shape textShape;
	private final Text text;
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	private String fontName = "Arial";
	private int fontSize = 12;
	private boolean italic = false;
	private boolean bold = false;

	private TextBuilder(final Diagram diagram,
			final ContainerShape containerShape) {
		this(Graphiti.getPeCreateService().createShape(containerShape, false),
				diagram);
	}

	private TextBuilder(final Diagram diagram,
			final ConnectionDecorator connectionDecorator) {
		this(connectionDecorator, diagram);
	}

	private TextBuilder(final Shape shape, final Diagram diagram) {
		this.diagram = diagram;
		textShape = shape;
		text = gaService.createText(shape, "");
	}

	private Diagram getDiagram() {
		return diagram;
	}

	public static TextBuilder init(final Diagram diagram,
			final ContainerShape containerShape) {
		return new TextBuilder(diagram, containerShape);
	}

	public static TextBuilder init(final Diagram diagram,
			final ConnectionDecorator connectionDecorator) {
		return new TextBuilder(diagram, connectionDecorator);
	}

	public TextBuilder withText(String textStr) {
		text.setValue(textStr);
		return this;
	}

	public TextBuilder withForeground(IColorConstant foreground) {
		text.setForeground(gaService.manageColor(getDiagram(), foreground));
		return this;
	}

	public TextBuilder withBackground(IColorConstant background) {
		text.setBackground(gaService.manageColor(getDiagram(), background));
		return this;
	}

	public TextBuilder alignHorizontal(Orientation horiOri) {
		text.setHorizontalAlignment(horiOri);
		return this;
	}

	public TextBuilder alignVertical(Orientation vertiOri) {
		text.setVerticalAlignment(vertiOri);
		return this;
	}

	public TextBuilder withWidth(int width) {
		this.width = width;
		return this;
	}

	public TextBuilder withHeight(int height) {
		this.height = height;
		return this;
	}

	public TextBuilder withLocation(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public TextBuilder withFont(String fontName) {
		this.fontName = fontName;
		return this;
	}

	public TextBuilder withFontSize(int fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	public TextBuilder withBoldFont() {
		this.bold = true;
		return this;
	}

	public TextBuilder withItalicFont() {
		this.italic = true;
		return this;
	}

	public Shape build() {
		text.setFont(gaService.manageFont(getDiagram(), fontName, fontSize,
				italic, bold));
		gaService.setLocation(text, x, y);
		if (width > 0 && height > 0) {
			gaService.setSize(text, width, height);
		}
		return textShape;
	}
}
