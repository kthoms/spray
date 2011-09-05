package org.xspray.examples.one.tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.ui.internal.figures.GFAbstractShape;
import org.eclipse.graphiti.ui.internal.figures.GFRoundedRectangle;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;

@SuppressWarnings("restriction")
public class SimpleUITest extends AbstractGraphitiTest {
	final String projectName = "Test";

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
		IFigure figure = ((GraphicalEditPart) editPart.part()).getFigure();
		assertNotNull("figure not found", figure);
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

	@Override
	protected String getProjectName() {
		return projectName;
	}
}
