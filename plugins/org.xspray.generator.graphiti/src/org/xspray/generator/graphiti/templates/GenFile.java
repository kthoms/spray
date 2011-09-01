package org.xspray.generator.graphiti.templates;

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.xspray.generator.graphiti.util.GeneratorUtil;

public class GenFile {

	public JavaIoFileSystemAccess javaFsa; 
	public EclipseResourceFileSystemAccess fsaEclipse;
	
	protected String fileName;
	
	protected String pathName;
	
	public boolean hasExtensionPoint;
	
//	public FileType fileType;
	
	public GenFile(JavaIoFileSystemAccess fsa) {
		this.javaFsa = fsa;
	}
	
	public AbstractFileSystemAccess getFsa(){
		if( javaFsa != null ){
			return javaFsa;
		} else {
			return fsaEclipse;
		}
	}

	public GenFile(EclipseResourceFileSystemAccess fsa) {
		this.fsaEclipse = fsa;
	}
	
	public boolean extensionFileExists(){
		return GeneratorUtil.fileExist(pathName);
	}
	
}
