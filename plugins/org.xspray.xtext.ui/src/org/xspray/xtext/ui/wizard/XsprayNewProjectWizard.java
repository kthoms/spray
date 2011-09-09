package org.xspray.xtext.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class XsprayNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public XsprayNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Xspray Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new XsprayWizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Xspray Project");
		mainPage.setDescription("Create a new Xspray project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		org.xspray.xtext.ui.wizard.XsprayProjectInfo projectInfo = new org.xspray.xtext.ui.wizard.XsprayProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
