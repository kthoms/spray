package org.xspray.generator.graphiti.templates;

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.xspray.generator.graphiti.util.GeneratorUtil;

public class JavaGenFile extends GenFile {
	
	public JavaGenFile(JavaIoFileSystemAccess fsa) {
		super(fsa);
	}

	public JavaGenFile(EclipseResourceFileSystemAccess fsa) {
		super(fsa);
	}

	protected  String className;
	
	public String getClassName() {
		return className;
	}
	
	protected String packageName;

	public void setPackageAndClass(String pack, String cls){
		this.packageName = pack;
		this.className = cls;
	}

	public String getBaseClassName() {
		return className + "Base" ;
	}
	
	public String getBaseFileName() {
		return getBaseClassName() + ".java";
	}

	public String getFileName() {
		return getClassName() + ".java";
	}
	
	public String getPathName(){
		return packageName.replaceAll("\\.", "/") + "/" + getFileName();
	}

	public String getBasePathName(){
		return packageName.replaceAll("\\.", "/") + "/" + getBaseFileName();
	}
	
	@Override
	public boolean extensionFileExists(){
		return GeneratorUtil.fileExist("C:/xspray/xspray-runtime/org.xspray.examples.one/src/" + getPathName());
	}

}
