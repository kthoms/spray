package org.eclipselabs.spray.generator.graphiti.ui;

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipselabs.spray.generator.graphiti.formatting.IPostProcessor;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class EclipseResourceFileSystemAccessExt extends EclipseResourceFileSystemAccess2 {
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
