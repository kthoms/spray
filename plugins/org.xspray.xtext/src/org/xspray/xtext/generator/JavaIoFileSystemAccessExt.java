package org.xspray.xtext.generator;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class JavaIoFileSystemAccessExt extends JavaIoFileSystemAccess {
	@Inject
	@Named("java")
	private IPostProcessor javaPostProcessor;
	
	@Override
	public void generateFile(String fileName, CharSequence contents) {
		if (javaPostProcessor.accepts(fileName)) {
			contents = javaPostProcessor.process(fileName, contents);
		}
		super.generateFile(fileName, contents);
	}
}
