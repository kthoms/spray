package org.xspray.examples.one.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

public abstract class AbstractGraphitiTest extends AbstractUITest {
	private final int DIL = 5;

	protected void createDiagramViaGraphitiExampleWizard(
			String diagramTypeName, String fileName) {
		bot.menu("File").menu("New").menu("Other...").click();
		bot.waitUntil(Conditions.shellIsActive("New"));
		SWTBotTree wizardTree = bot.tree();
		try {
    		openNodePathFromTree(wizardTree, "Examples", "Graphiti",
    				"Graphiti Diagram").select();
		} catch (WidgetNotFoundException e) {
		    // Maven Build
            openNodePathFromTree(wizardTree, "Examples",
                    "Graphiti Diagram").select();
		}
		bot.button("Next >").click();
		bot.comboBox().setSelection(diagramTypeName);
		bot.button("Next >").click();
		bot.text().setText(fileName);
		bot.button("Finish").click();
	}

	protected <U, V, W> void dragConnection(final SWTBotGefEditor ged,
			IFigure figure1, String figure1Label, Class<U> figure1Class,
			IFigure figure2, String figure2Label, Class<V> figure2Class,
			String connectionToolName, String connectionLabel,
			Class<W> connectionClass) throws InterruptedException {
		dragConnection(ged, connectionToolName, figure1.getBounds().x,
				figure1.getBounds().y, figure2.getBounds().x,
				figure2.getBounds().y);
		assertAssociationCreated(ged, figure1Label, figure1Class, figure2Label,
				figure2Class, connectionLabel, connectionClass);
	}

	private void dragConnection(final SWTBotGefEditor ed,
			final String objectFromToolbar, final int xOfShape1,
			final int yOfShape1, final int xOfShape2, final int yOfShape2)
			throws InterruptedException {
		ed.activateTool(objectFromToolbar);
		ed.drag(xOfShape1 + DIL, yOfShape1 + DIL, xOfShape2 + DIL, yOfShape2
				+ DIL);
		ed.click(xOfShape2 + DIL, yOfShape2 + DIL);
	}

	protected <U, V, W> void assertAssociationCreated(
			final SWTBotGefEditor ged, String figure1Label,
			Class<U> figure1Class, String figure2Label, Class<V> figure2Class,
			String connectionLabel, Class<W> connectionClass) {
		if(connectionClass == null) {
			U u = getBusinessObject(ged, figure1Class, figure1Label);
			V v = getBusinessObject(ged, figure2Class, figure2Label);
			assertConnectionIsDrawn(ged, u, v, connectionLabel);
		} else {
			assertConnectionIsDrawn(ged, connectionClass, connectionLabel);
		}
		
		fail("Should have found association between " + figure1Label + " and "
				+ figure2Label + ".");
	}

	protected <U> void assertConnectionIsDrawn(SWTBotGefEditor ged,
			Class<U> connectionClass, String connectionLabel) {
		List<SWTBotGefEditPart> selectedEditParts = ged.selectedEditParts();
		assertTrue(selectedEditParts.size() > 0);
		for (SWTBotGefEditPart selectedEditPart : selectedEditParts) {
			assertTrue(selectedEditPart.part().getModel() instanceof Connection);
			Connection conn = (Connection) selectedEditPart.part().getModel();
			assertTrue(conn.getLink().getBusinessObjects().size() > 0);
			assertTrue(conn.getLink().getBusinessObjects().get(0).getClass()
					.equals(connectionClass));
		}
	}
	
	protected <U, V> void assertConnectionIsDrawn(SWTBotGefEditor ged,
			U figure1Object, V figure2Object, String connectionLabel) {
		List<SWTBotGefEditPart> selectedEditParts = ged.selectedEditParts();
		assertTrue(selectedEditParts.size() > 0);
		for (SWTBotGefEditPart selectedEditPart : selectedEditParts) {
			assertTrue(selectedEditPart.part().getModel() instanceof Connection);
			Connection conn = (Connection) selectedEditPart.part().getModel();
			assertTrue(conn.getLink().getBusinessObjects().size() > 1);
			assertTrue(conn.getLink().getBusinessObjects().get(0).
					equals(figure1Object));
			assertTrue(conn.getLink().getBusinessObjects().get(1).
					equals(figure2Object));
		}
	}

	@SuppressWarnings("unchecked")
	protected <T> T getBusinessObject(final SWTBotGefEditor ged,
			Class<T> clazz, String name) {
		Shape shape = getShape(ged, name);
		assertNotNull("shape should have link", shape.getLink());
		assertEquals("expected associated BO", 1, shape.getLink()
				.getBusinessObjects().size());
		assertTrue(
				"BO should be of type " + clazz.getName(),
				clazz.isAssignableFrom(shape.getLink().getBusinessObjects()
						.get(0).getClass()));
		return ((T) shape.getLink().getBusinessObjects().get(0));
	}

	protected Shape getShape(final SWTBotGefEditor ged, String name) {
		SWTBotGefEditPart editPart = ged.getEditPart(name);
		assertNotNull("should have found element " + name + " in diagram",
				editPart);
		assertTrue("edit part should be a graphical edit part",
				editPart.part() instanceof GraphicalEditPart);
		assertTrue(
				"model of edit part should be shape",
				((GraphicalEditPart) editPart.part()).getModel() instanceof Shape);
		return (Shape) ((GraphicalEditPart) editPart.part()).getModel();
	}
	
	protected IFigure getFirstElement(final SWTBotGefEditor ged, String label) {
		SWTBotGefEditPart foundPart = ged.getEditPart(label);
		assertNotNull("should have found edit part for " + label, foundPart);
		return ((GraphicalEditPart) foundPart.part()).getFigure();
	}
	
	protected IFigure getElement(final SWTBotGefEditor ged, String label, int x,
			int y) {
		IFigure foundFigure = null;
		List<IFigure> figures = getElements(ged, label);
		for (IFigure figure : figures) {
			if (figure.getBounds().x == x && figure.getBounds().y == y) {
				foundFigure = figure;
			}
		}
		return foundFigure;
	}

	protected List<IFigure> getElements(final SWTBotGefEditor ged, String label) {
		List<IFigure> figures = new ArrayList<IFigure>();
		SWTBotGefViewer viewer = ged.getSWTBotGefViewer();
		List<SWTBotGefEditPart> allEditParts = viewer.mainEditPart().children();
		List<SWTBotGefEditPart> foundParts = getEditpart(label, allEditParts);
		for (SWTBotGefEditPart foundPart : foundParts) {
			figures.add(((GraphicalEditPart) foundPart.part()).getFigure());
		}
		return figures;
	}

	// copied from SWTBotGefViewer and modified
	public List<SWTBotGefEditPart> getEditpart(String label,
			List<SWTBotGefEditPart> allEditParts) {
		List<SWTBotGefEditPart> foundParts = new ArrayList<SWTBotGefEditPart>();
		for (SWTBotGefEditPart child : allEditParts) {
			IFigure figure = ((GraphicalEditPart) child.part()).getFigure();

			if (isLabel(figure, label)) {
				foundParts.add(child);
			}

			foundParts.addAll(getEditPart(child, label));

			if (findLabelFigure(figure, label))
				foundParts.add(child);
		}
		return foundParts;
	}

	// copied from SWTBotGefViewer
	protected List<SWTBotGefEditPart> getEditPart(SWTBotGefEditPart editPart,
			String label) {
		List<SWTBotGefEditPart> foundParts = new ArrayList<SWTBotGefEditPart>();
		if (editPart.children().isEmpty()
				&& findLabelFigure(
						((GraphicalEditPart) editPart.part()).getFigure(),
						label)) {
			foundParts.add(editPart);
			return foundParts;
		}

		List<SWTBotGefEditPart> allEditParts = editPart.children();
		allEditParts.addAll(editPart.sourceConnections());
		return getEditpart(label, allEditParts);
	}

	// copied from SWTBotGefViewer
	protected boolean isLabel(IFigure figure, String label) {
		// case 1 : gef label
		if ((figure instanceof Label && ((Label) figure).getText()
				.equals(label))) {
			return true;
		}

		// case 2 : no gef label
		if ((figure instanceof TextFlow && ((TextFlow) figure).getText()
				.equals(label))) {
			return true;
		}
		return false;
	}

	// copied from SWTBotGefViewer
	protected boolean findLabelFigure(IFigure figure, String label) {
		if (isLabel(figure, label)) {
			return true;
		}
		for (Object figureChild : figure.getChildren()) {
			if (isLabel((IFigure) figureChild, label)
					|| findLabelFigure((IFigure) figureChild, label)) {
				return true;
			}
		}
		return false;
	}
}
