package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipselabs.spray.xtext.ui.SprayUiModule;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SprayNewProjectWizard extends XtextNewProjectWizard {
    private WizardNewProjectCreationPage mainPage;
    private SprayGeneratorSettingsPage   generatorSettingsPage;
    private SprayProjectInfo             projectInfo;

    @Inject
    private IWorkspace                   workspace;
    @Inject
    @Named(value = SprayUiModule.NEW_PROJECT_NAME)
    private String                       newProjectName;

    @Inject
    public SprayNewProjectWizard(IProjectCreator projectCreator) {
        super(projectCreator);
        setWindowTitle("New Spray Project");
    }

    /**
     * Use this method to add pages to the wizard.
     * The one-time generated version of this class will add a default new project page to the wizard.
     */
    public void addPages() {
        mainPage = new SprayWizardNewProjectCreationPage("basicNewProjectPage");
        mainPage.setTitle("Spray Project");
        mainPage.setDescription("Create a new Spray project.");
        ((SprayWizardNewProjectCreationPage) mainPage).setProjectInfo((SprayProjectInfo) getProjectInfo());
        String projectName = newProjectName;

        // check if project with default name already exists.  
        if (!workspace.getRoot().getProject(newProjectName).exists()) {
            mainPage.setInitialProjectName(projectName);
        } else {
            // append counter until project with appended counter does not exist
            int i = 1;
            do {
                projectName = newProjectName + i;
                if (!workspace.getRoot().getProject(projectName).exists()) {
                    mainPage.setInitialProjectName(projectName);
                    break;
                }
                i++;
            } while (true);
        }

        addPage(mainPage);

        generatorSettingsPage = new SprayGeneratorSettingsPage();
        generatorSettingsPage.setProjectInfo((SprayProjectInfo) getProjectInfo());
        addPage(generatorSettingsPage);
    }

    /**
     * Use this method to read the project settings from the wizard pages and feed them into the project info class.
     */
    @Override
    protected IProjectInfo getProjectInfo() {
        if (projectInfo == null) {
            projectInfo = new org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo();
        }
        projectInfo.setProjectName(mainPage.getProjectName());
        return projectInfo;
    }

}
