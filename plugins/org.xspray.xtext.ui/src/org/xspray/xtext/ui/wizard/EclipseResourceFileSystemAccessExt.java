package org.xspray.xtext.ui.wizard;

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;

public class EclipseResourceFileSystemAccessExt extends EclipseResourceFileSystemAccess {
	@Override
	public void generateFile(String fileName, String slot, CharSequence contents) {
		super.generateFile(fileName, slot, contents);
		
	}
}
