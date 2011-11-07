package org.eclipselabs.spray.generator.graphiti.templates;

import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipselabs.spray.generator.graphiti.util.EclipseHelpers;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;

public class JavaGenFile extends GenFile {

    public JavaGenFile(JavaIoFileSystemAccess fsa) {
        super(fsa);
    }

    public JavaGenFile(EclipseResourceFileSystemAccess2 fsa) {
        super(fsa);
    }

    protected String className;

    public String getClassName() {
        return className;
    }

    protected String packageName;
    protected String genOutputPath;
    protected String manOutputPath;

    public String getGenOutputPath() {
        return genOutputPath;
    }

    public String getManOutputPath() {
        return manOutputPath;
    }

    public void setGenOutputPath(String s) {
        System.out.println("genOutputPath: " + s);
        genOutputPath = s;
        if (javaFsa != null)
            javaFsa.setOutputPath(genOutputPath);
        else
            fsaEclipse.setOutputPath(genOutputPath);
    }

    public void setManOutputPath(String s) {
        System.out.println("manOutputPath: " + s);
        manOutputPath = s;
    }

    public void setPackageAndClass(String pack, String cls) {
        this.packageName = pack;
        this.className = cls;
    }

    public void setPackageAndClass(String qualifiedName) {
        int idx = qualifiedName.lastIndexOf('.');
        if (idx < 0)
            throw new IllegalArgumentException("Not a qualified class name: " + qualifiedName);
        this.packageName = qualifiedName.substring(0, idx);
        this.className = qualifiedName.substring(idx + 1);
    }

    public String getBaseClassName() {
        return className + "Base";
    }

    public String getBaseFileName() {
        return getBaseClassName() + ".java";
    }

    public String getFileName() {
        return getClassName() + ".java";
    }

    public String getAbsolutePathName() {
        return genOutputPath + "/" + packageName.replaceAll("\\.", "/") + "/" + getFileName();
    }

    public String getPathName() {
        return packageName.replaceAll("\\.", "/") + "/" + getFileName();
    }

    public String getAbsoluteBasePathName() {
        return genOutputPath + "/" + packageName.replaceAll("\\.", "/") + "/" + getBaseFileName();
    }

    public String getBasePathName() {
        return packageName.replaceAll("\\.", "/") + "/" + getBaseFileName();
    }

    @Override
    public boolean extensionFileExists() {
        if (javaFsa != null) {
            return GeneratorUtil.fileExist(manOutputPath + "/" + getPathName());
        } else {
            return EclipseHelpers.getIFile(new Path(manOutputPath + "/" + getPathName())).exists();
        }
    }

    public String getPackageName() {
        return packageName;
    }

}
