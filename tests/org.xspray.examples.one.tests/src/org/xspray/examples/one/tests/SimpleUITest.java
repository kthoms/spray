package org.xspray.examples.one.tests;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.eclipse.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;

public class SimpleUITest extends AbstractGraphitiTest {
	final String projectName = "Test";

	public void testCreateNewBusinessClass() throws Exception {
		final String perspective = "Java";
		final String diagramFolder = "src";
		final String fileName = "ExampleOneTest";
		final String diagramTypeName = "mod4j";
		final String objectFromToolbar = "BusinessClass";
		final String businessClassName = "Test";

		bot.perspectiveByLabel(perspective).activate();
		createNewProject(projectName);
		selectFolderNode(projectName, diagramFolder);
		createDiagramViaGraphitiExampleWizard(diagramTypeName, fileName);
		SWTBotEditor editor = bot.activeEditor();
		editor.save();
		final SWTBotGefEditor ged = bot.gefEditor(editor.getTitle());
		createBusinessClass(ged, objectFromToolbar, businessClassName);
		assertBusinessClassRepresentationExists(ged, businessClassName);
	}

	private void createBusinessClass(final SWTBotGefEditor ged, final String objectFromToolbar,
			final String name) {
		ged.activateTool(objectFromToolbar);
		int targetX = 150;
		int targetY = 100;
		ged.drag(55, 55, targetX, targetY);
		bot.text().setText(name);
		bot.button("OK").click();
	}

	private void assertBusinessClassRepresentationExists(SWTBotGefEditor ged,
			String shapeName) {
		SWTBotGefEditPart editPart = ged.getEditPart("Class7 " + shapeName + " ;;;");
		IFigure figure = ((GraphicalEditPart) editPart.part()).getFigure();
		assertNotNull("figure not found", figure);
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
}
