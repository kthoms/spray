package org.xspray.xtext.generator;

import org.eclipse.xtext.mwe.Reader;

/**
 * Required due to Bug#356750
 * 
 * @author thoms
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=356750
 */
public class ReaderExt extends Reader {
	@Override
	public void addPath(String path) {
		for (String p : path.split(",")) {
			super.addPath(p.trim());
		}
	}
}
