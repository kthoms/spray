package org.eclipselabs.spray.generator.graphiti.formatting;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * Initially copied from org.eclipse.xpand2.output.JavaBeautifier
 * @author thoms
 *
 */
public class CodeFormatterProvider implements Provider<CodeFormatter>{
	private static final Log LOG = LogFactory.getLog(CodeFormatterProvider.class);
	public static final String JDT_FORMATTER_CONFIG = "org.eclipse.jdt.core.formatter.configfile";
	@Inject(optional=true)
	@Named(JDT_FORMATTER_CONFIG)
	private String configFile;
	@Override
	public CodeFormatter get() {
		Properties options;
		if ( configFile == null ) {
			options = new Properties();
			options.put("org.eclipse.jdt.core.compiler.compliance","1.5");
			options.put("org.eclipse.jdt.core.compiler.codegen.targetPlatform","1.5");
			options.put("org.eclipse.jdt.core.compiler.source","1.5");              
		} else {
			options = readConfig(configFile);
		}
		
		// instantiate the formatter
		CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(options);
		return codeFormatter;
	}
	/**
	 * Return a Java Properties file representing the options that are in the
	 * specified config file.
	 */
	private Properties readConfig(String filename) {
		BufferedInputStream stream = null;
		BufferedReader reader = null;
		
		try {
		   InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
		   final Properties formatterOptions = new Properties();
			if ( filename.endsWith(".xml")) {
			   Pattern pattern = Pattern.compile("<setting id=\"([^\"]*)\" value=\"([^\"]*)\"\\/>");
			   reader = new BufferedReader(new InputStreamReader(is));
			   for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				  Matcher matcher = pattern.matcher(line);
				  if ( matcher.matches() ) {
					 formatterOptions.put(matcher.group(1), matcher.group(2));
				  }
			   }
			}
			else {
			   stream = new BufferedInputStream(is);
			   formatterOptions.load(stream);
			}        
			
		    // add some settings for the compiler options
	        // which are not included in the Eclipse code style settings
	        // to make the code formatter working
	        // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=222736
		   
		   if( formatterOptions.get("org.eclipse.jdt.core.compiler.compliance") == null )
			   formatterOptions.put("org.eclipse.jdt.core.compiler.compliance", "1.5");
		   if( formatterOptions.get("org.eclipse.jdt.core.compiler.codegen.targetPlatform") == null )
			   formatterOptions.put("org.eclipse.jdt.core.compiler.codegen.targetPlatform", "1.5");
		   if( formatterOptions.get("org.eclipse.jdt.core.compiler.source") == null )
			   formatterOptions.put("org.eclipse.jdt.core.compiler.source", "1.5");             
			return formatterOptions;
		} catch (IOException e) {
			LOG.warn("Problem reading code formatter config file (" + e.getMessage() + ").");
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					/* ignore */
				}
			}
			if ( reader != null ) {
			   try {
				  reader.close();
			   } catch (IOException e) {
					/* ignore */
			   }
			}
		}
		return null;
	}}
