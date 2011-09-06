package org.xspray.generator.graphiti.util;
/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class ProjectProperties {

    public static void setPropertiesFile(String filename) {
        System.err.println("PROPERTIES [" + filename + "]");
        propertyFile = filename;
        readAllProperties();
    }

    private static void readAllProperties() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(propertyFile));
        } catch (FileNotFoundException e) {
            System.err.println("PropjectProperties: cannot find properties file [" + propertyFile + "]");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("PropjectProperties: cannot read properties file [" + propertyFile + "]");
            e.printStackTrace();
        }
        // overload with System properties
        for (Entry<Object, Object>  entry : System.getProperties().entrySet()) {
        	properties.put(entry.getKey(), entry.getValue());
        }

        diagramPackage = properties.getProperty("diagramPackage");
        featurePackage = properties.getProperty("featurePackage");
        propertyPackage = properties.getProperty("propertyPackage");
        utilPackage = properties.getProperty("utilPackage");
        srcGenPath = properties.getProperty("srcGenPath");
        resourceGenPath = properties.getProperty("resourceGenPath");
        srcManPath = properties.getProperty("srcManPath");
        resourceManPath = properties.getProperty("resourceManPath");
        projectPath = properties.getProperty("projectPath");

//        applicationName = properties.getProperty("applicationName");
//        applicationVersion = properties.getProperty("applicationVersion");
//        applicationPath = properties.getProperty("applicationPath");
//        dslModelsModuleName = properties.getProperty("dslModelsModuleName");
//        domainModuleName = properties.getProperty("domainModuleName");
//        businessModuleName = properties.getProperty("businessModuleName");
//        rootPackage = properties.getProperty("rootPackage");
//        businessRootPackage = properties.getProperty("businessRootPackage");
//        //environmentPropertiesFileName = properties.getProperty("environmentPropertiesFileName");
//        fileEncoding = properties.getProperty("fileEncoding");

    }

    private static String       projectPath                   = "/";

    private static String       propertyFile                  = "DEFAULT";

    private static String       applicationVersion            = "DEFAULT";

    private static String       applicationName               = "DEFAULT";

    private static String       applicationPath               = "DEFAULT";

    private static String       dslModelsModuleName           = "dslModels";

    private static final String SRC_MODEL_PATH                = "src/model";

    private static String       businessModuleName            = "DEFAULT";

    private static String       domainModuleName              = "org.sample.domain";

    private static String       rootPackage                   = "org.sample.domain";

    private static String       businessRootPackage           = "DEFAULT";

    private static String       diagramPackage                = "diagrams";
    private static String       featurePackage                = "features";
    private static String       propertyPackage               = "property";
    private static String       utilPackage                   = "org.xspray.runtime.containers";

    private static String       srcGenPath                    = "src-gen";

    private static String       resourceGenPath               = "resource-gen";

    private static String       srcManPath                    = "src";

    private static String       resourceManPath               = "resource";

    private static final String environmentPropertiesFileName = "environment.properties";

    private static String       fileEncoding                  = "UTF-8";

    public static final String  IMPLBASE_SUFFIX               = "ImplBase";

    private static String       workDir                       = "/";

    public static void setWorkDir(String dir) {
        workDir = dir;
    }

    public static String getApplicationName() {
        return applicationName;
    }

    public static String getApplicationVersion() {
        return applicationVersion;
    }

    public static String getApplicationPath() {
        if (applicationPath != null) {
            if (applicationPath.startsWith("..")) {
                if (applicationPath.equals("..")) {
                    int last = workDir.lastIndexOf("/");
                    if (last == -1) {
                        last = workDir.lastIndexOf("\\");
                    }
                    if (last > -1) {
                        return workDir.substring(0, last);
                    }
                } else {
                    int last = workDir.lastIndexOf("/");
                    return workDir.substring(0, last) + applicationPath.substring(2);
                }
            }
        }
        return workDir + "/" + applicationPath;
    }

    public static String getDslModelsModulePath() {
        return getApplicationPath() + "/" + getDslModelsModuleName();
    }

    public static String getDslModelsModuleName() {
        return dslModelsModuleName;
    }

    public static String getDomainModulePath() {
        return getApplicationPath() + "/" + getDomainModuleName();
    }

    public static String getDomainModuleName() {
        return domainModuleName;
    }

    public static String getBusinessModuleName() {
        return businessModuleName;
    }

    public static String getBusinessModulePath() {
        return getApplicationPath() + "/" + getBusinessModuleName();
    }

    public static String getRootPackage() {
        return rootPackage;
    }

    public static String getBusinessRootPackage() {
        return businessRootPackage;
    }

    public static String getBusinessRootPackageAsPath() {
        return getBusinessRootPackage().replaceAll("\\.", "/");
    }

    public static String getProjectPath() {
        return projectPath;
    }
    public static String getDiagramPackage() {
        return diagramPackage;
    }
    public static String getFeaturePackage() {
        return featurePackage;
    }
    public static String getPropertyPackage() {
        return propertyPackage;
    }
    public static String getUtilPackage() {
        return utilPackage;
    }

    public static String getDomainRootPackageAsPath() {
        return getDiagramPackage().replaceAll("\\.", "/");
    }

    public static String getSrcModelPath() {
        return SRC_MODEL_PATH;
    }

    public static String getSrcGenPath() {
        return srcGenPath;
    }

    public static String getResourceGenPath() {
        return resourceGenPath;
    }

    public static String getSrcManPath() {
        return srcManPath;
    }

    public static String getResourceManPath() {
        return resourceManPath;
    }

    public static String getEnvPropFileName() {
        return environmentPropertiesFileName;
    }

    public static String getFileEncoding() {
        return fileEncoding;
    }

    private static String project = "/";

    public static String getProject() {
        return project;
    }

    public static String getProjectForEObject(EObject object) {
        if (project.equals("/")) {
            URI uri = object.eResource().getURI();
            return uri.segment(1);
        } else {
            return project;
        }
    }

    public static void setProject(String project) {
        ProjectProperties.project = project;
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClass(String cls) {
        return StringHelpers.firstCharToUpper(cls);
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaDomainClassPath(String cls) {
        String packageName = ProjectProperties.getDiagramPackage();
        return packageName + "." + javaDomainClass(cls);
    }

    public static String javaDomainClassFolder(String cls) {
        String packageName = ProjectProperties.getDiagramPackage();
        return packageName + "." + javaDomainClass(cls);
    }

}
