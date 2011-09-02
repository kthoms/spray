package org.xspray.examples.one.tests;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

public abstract class AbstractGraphitiTest extends AbstractUITest {

	protected void createDiagramViaGraphitiExampleWizard(
			String diagramTypeName, String fileName) {
		bot.menu("File").menu("New").menu("Other...").click();
		SWTBotTree wizardTree = bot.tree();
		openNodePathFromTree(wizardTree, "Examples", "Graphiti",
				"Graphiti Diagram").select();
		bot.button("Next >").click();
		bot.comboBox().setSelection(diagramTypeName);
		bot.button("Next >").click();
		bot.text().setText(fileName);
		bot.button("Finish").click();
	}
}
