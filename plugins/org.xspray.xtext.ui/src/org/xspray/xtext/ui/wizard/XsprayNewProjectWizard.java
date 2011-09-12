package org.xspray.xtext.ui.wizard;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.xspray.xtext.ui.XsprayUiModule;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class XsprayNewProjectWizard extends XtextNewProjectWizard {
	private WizardNewProjectCreationPage mainPage;
	@Inject
	private IWorkspace workspace;
	@Inject @Named(value=XsprayUiModule.NEW_PROJECT_NAME)
	private String newProjectName;

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
		String projectName = newProjectName;
		if (!workspace.getRoot().getProject(newProjectName).exists()) {
			mainPage.setInitialProjectName(projectName);
		} else {
			int i=1;
			do {
				projectName = newProjectName+i;
				if (!workspace.getRoot().getProject(projectName).exists()) {
					mainPage.setInitialProjectName(projectName);
					break;
				}
				i++;
			} while (true);
		}
		
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
