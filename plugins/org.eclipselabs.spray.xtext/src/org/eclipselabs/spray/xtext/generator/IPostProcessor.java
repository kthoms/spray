package org.eclipselabs.spray.xtext.generator;

public interface IPostProcessor {
	/**
	 * @param fileName The path of the file that would be postprocessed
	 * @return <code>true</code> when this postprocessor handles this file
	 */
	public boolean accepts (String fileName);
	/**
	 * Processes the file content
	 * @param fileName The path of the file that would be postprocessed
	 * @param contents
	 * @return Potentially modified content
	 */
	public CharSequence process (String fileName, CharSequence contents);
}
