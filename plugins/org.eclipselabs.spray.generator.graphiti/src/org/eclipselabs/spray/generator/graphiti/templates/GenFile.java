package org.eclipselabs.spray.generator.graphiti.templates;

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;

public class GenFile {

    public JavaIoFileSystemAccess           javaFsa;
    public EclipseResourceFileSystemAccess2 fsaEclipse;

    protected String                        fileName;

    protected String                        pathName;

    public boolean                          hasExtensionPoint;

    //	public FileType fileType;

    public GenFile(JavaIoFileSystemAccess fsa) {
        this.javaFsa = fsa;
    }

    public AbstractFileSystemAccess getFsa() {
        if (javaFsa != null) {
            return javaFsa;
        } else {
            return fsaEclipse;
        }
    }

    public GenFile(EclipseResourceFileSystemAccess2 fsa) {
        this.fsaEclipse = fsa;
    }

    public boolean extensionFileExists() {
        return GeneratorUtil.fileExist(pathName);
    }

}
