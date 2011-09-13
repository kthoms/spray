package org.xspray.examples.one.tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.internal.figures.GFAbstractShape;
import org.eclipse.graphiti.ui.internal.figures.GFRoundedRectangle;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessClass;

@SuppressWarnings("restriction")
@RunWith(SWTBotJunit4ClassRunner.class)
public class SimpleUITest extends AbstractGraphitiTest {
	final String projectName = "org.xspray.examples.SimpleUITest";

	@Test
	public void testCreateNewBusinessClass() throws Exception {
		final String perspective = "Java";
		final String diagramFolder = "src";
		final String fileName = "ExampleOneTest";
		final String diagramTypeName = "mod4j";
		final String objectFromToolbar = "BusinessClass";
		final String businessClassName = "Test";
		int targetX = 50;
		int targetY = 60;

		bot.perspectiveByLabel(perspective).activate();
		createNewProject(projectName);
		selectFolderNode(projectName, diagramFolder);
		createDiagramViaGraphitiExampleWizard(diagramTypeName, fileName);
		SWTBotEditor editor = bot.activeEditor();
		editor.save();
		final SWTBotGefEditor ged = bot.gefEditor(editor.getTitle());
		createBusinessClass(ged, objectFromToolbar, businessClassName, targetX,
				targetY);
		assertBusinessClassRepresentationExists(ged, businessClassName,
				targetX, targetY);
	}

	private void createBusinessClass(final SWTBotGefEditor ged,
			final String objectFromToolbar, final String name, int targetX,
			int targetY) {
		ged.activateTool(objectFromToolbar);
		ged.drag(targetX, targetY, 55, 55);
		bot.text().setText(name);
		bot.button("OK").click();
	}

	private void assertBusinessClassRepresentationExists(SWTBotGefEditor ged,
			String shapeName, int targetX, int targetY) {
		SWTBotGefEditPart editPart = ged.getEditPart("Class7 " + shapeName
				+ " ;;;");
		IFigure figure = assertFigure(targetX, targetY, editPart);
		assertRoundedRectangle(targetX, targetY, figure);
		assertDomainObject(shapeName, editPart);
	}
	
	private IFigure assertFigure(int targetX, int targetY,
			SWTBotGefEditPart editPart) {
		IFigure figure = ((GraphicalEditPart) editPart.part()).getFigure();
		assertNotNull("figure not found", figure);
		assertEquals(targetX, figure.getBounds().x);
		assertEquals(targetY, figure.getBounds().y);
		return figure;
	}

	private void assertRoundedRectangle(int targetX, int targetY, IFigure figure) {
		assertTrue("rounded rectangle expected",
				figure instanceof GFRoundedRectangle);
		assertTrue(
				"rounded rectangle should be a specialization of abstract shape",
				figure instanceof GFAbstractShape);
		GFRoundedRectangle rectangle = (GFRoundedRectangle) figure;
		try {
			Method method = GFAbstractShape.class
					.getDeclaredMethod("getGraphicsAlgorithm");
			method.setAccessible(true);
			GraphicsAlgorithm ga = (GraphicsAlgorithm) method.invoke(rectangle);
			assertTrue(ga instanceof RoundedRectangle);
			RoundedRectangle rec = (RoundedRectangle) ga;
			assertEquals(targetX, rec.getX());
			assertEquals(targetY, rec.getY());
		} catch (SecurityException e) {
			fail(e.getMessage());
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			fail(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			fail(e.getMessage());
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail(e.getMessage());
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void assertDomainObject(String shapeName, SWTBotGefEditPart editPart) {
		Object model = ((GraphicalEditPart) editPart.part()).getModel();
		assertTrue("should have been shape", model instanceof Shape);
		Shape shape = (Shape) model;
		PictogramLink link = shape.getLink();
		assertNotNull("not linked with bo", link);
		assertEquals("not the expected bo count", 1, link.getBusinessObjects().size());
		EObject bo = link.getBusinessObjects().get(0);
		assertTrue("should have been business class", bo instanceof BusinessClass);
		BusinessClass bc = (BusinessClass) bo;
		assertNotNull("bc name set", bc.getName());
		assertEquals("not the expected bc name", shapeName, bc.getName());
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
}
