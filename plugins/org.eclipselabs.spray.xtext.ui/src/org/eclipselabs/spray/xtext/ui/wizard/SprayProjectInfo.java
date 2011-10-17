package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;

public class SprayProjectInfo extends DefaultProjectInfo {
    // TODO : Remove mock values
    private String  diagramTypeName;
    private String  javaMainSrcDir  = "src";
    private String  javaGenSrcDir   = "src-gen";
    private String  sprayModelDir   = "model";
    private String  resourceManDir  = "resource";
    private String  resourceGenDir  = "resource-gen";
    private String  basePackage;
    private String  diagramPackage  = "diagram";
    private String  featurePackage  = "features";
    private String  propertyPackage = "property";
    private boolean createTimestamp = true;
    private String  epackageURI;
    private String  genmodelURI;

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

    public String getMetamodelBundleName() {
        if (epackageURI == null)
            return null;

        URI uri = URI.createURI(epackageURI);
        if (uri.isPlatform()) {
            return uri.segment(1);
        } else {
            return null;
        }
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

    public String getJavaMainSrcDir() {
        return javaMainSrcDir;
    }

    public void setJavaMainSrcDir(String javaMainSrcDir) {
        this.javaMainSrcDir = javaMainSrcDir;
    }

    public String getJavaGenSrcDir() {
        return javaGenSrcDir;
    }

    public void setJavaGenSrcDir(String javaGenSrcDir) {
        this.javaGenSrcDir = javaGenSrcDir;
    }

    public String getSprayModelDir() {
        return sprayModelDir;
    }

    public void setSprayModelDir(String sprayModelDir) {
        this.sprayModelDir = sprayModelDir;
    }

    public String getDiagramPackage() {
        return diagramPackage;
    }

    public void setDiagramPackage(String diagramPackage) {
        this.diagramPackage = diagramPackage;
    }

    public String getFeaturePackage() {
        return featurePackage;
    }

    public void setFeaturePackage(String featurePackage) {
        this.featurePackage = featurePackage;
    }

    public String getPropertyPackage() {
        return propertyPackage;
    }

    public void setPropertyPackage(String propertyPackage) {
        this.propertyPackage = propertyPackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public boolean isCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(boolean createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getResourceManDir() {
        return resourceManDir;
    }

    public void setResourceManDir(String resourceManDir) {
        this.resourceManDir = resourceManDir;
    }

    public String getResourceGenDir() {
        return resourceGenDir;
    }

    public void setResourceGenDir(String resourceGenDir) {
        this.resourceGenDir = resourceGenDir;
    }

    public String getEpackageURI() {
        return epackageURI;
    }

    public void setEpackageURI(String epackageURI) {
        this.epackageURI = epackageURI;
    }

    public String getGenmodelURI() {
        return genmodelURI;
    }

    public void setGenmodelURI(String genmodelURI) {
        this.genmodelURI = genmodelURI;
    }
}
