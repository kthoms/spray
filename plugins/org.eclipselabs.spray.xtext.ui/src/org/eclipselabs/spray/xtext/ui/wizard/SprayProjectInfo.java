package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;

public class SprayProjectInfo extends DefaultProjectInfo {
    // TODO : Remove mock values
    private String diagramTypeName;
    private String metamodelBundleName = "org.mod4j.dsl.businessdomain.mm";
    private String metamodelExtension  = "BusinessDomainDsl";

    public void setDiagramTypeName(String diagramTypeName) {
        this.diagramTypeName = diagramTypeName;
    }

    /**
     * @return If property was not set, returns the last segment
     */
    public String getDiagramTypeName() {
        if (diagramTypeName != null) {
            return diagramTypeName;
        } else {
            int idx = getProjectName().lastIndexOf('.');
            return idx >= 0 ? getProjectName().substring(getProjectName().lastIndexOf('.') + 1) : getProjectName();
        }
    }

    public void setMetamodelBundleName(String metamodelBundleName) {
        this.metamodelBundleName = metamodelBundleName;
    }

    public String getMetamodelBundleName() {
        return metamodelBundleName;
    }

    public void setMetamodelExtension(String metamodelExtension) {
        this.metamodelExtension = metamodelExtension;
    }

    public String getMetamodelExtension() {
        return metamodelExtension;
    }

    /**
     * @return Project name to lower case
     */
    public String getBasePackage() {
        return getProjectName().toLowerCase();
    }

    public String getBasePath() {
        return getBasePackage().replace('.', '/');
    }
}
