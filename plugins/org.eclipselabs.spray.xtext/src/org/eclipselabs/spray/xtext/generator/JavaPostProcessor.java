package org.eclipselabs.spray.xtext.generator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

import com.google.inject.Inject;

/**
 * Parts copied from org.eclipse.xpand2.output.JavaBeautifier
 * @author Karsten Thoms
 *
 */
public class JavaPostProcessor implements IPostProcessor {
	private static final Log LOG = LogFactory.getLog(JavaPostProcessor.class);
	
	@Inject
	private CodeFormatter javaCodeFormatter;

	@Override
	public boolean accepts(String fileName) {
		return fileName.endsWith(".java");
	}

	@Override
	public CharSequence process(String fileName, CharSequence contents) {
		if (!accepts(fileName)) throw new IllegalArgumentException("Unsupported file "+fileName);

		IDocument doc = new Document(contents.toString());
		TextEdit edit = javaCodeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, doc.get(), 0,
				doc.get().length(), 0, null);

		// check if text formatted successfully
		if (edit != null) {
			try {
				edit.apply(doc);
				if (LOG.isDebugEnabled()) LOG.debug("Formatted "+fileName);
				return doc.get();
			} catch (MalformedTreeException e) {
				LOG.warn("Error during code formatting. Illegal code edit tree (" + e.getMessage() + ").");
			} catch (BadLocationException e) {
				LOG.warn("Error during code formatting. Bad location (" + e.getMessage() + ").");
			}
		} else {
			LOG.warn("File " + fileName
					+ " could not be formatted. Make sure your template produces legal Java code!");
		}
		// if modified, the result was already returned. if reached here, return the original content
		return contents;
	}
}
