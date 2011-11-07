package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler;
import org.eclipselabs.spray.mm.spray.Text;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class TemplateUtil {
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private SprayCompiler compiler;
  
  public StringConcatenation header(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains generated and should not be changed.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Use the extension point class (the direct subclass of this class) to add manual code");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation extensionHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file is an extension point: copy to \"src\" folder to manually add code to this");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* extension point.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation pluginHeader(final Object templateClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("Generated ");
    String _timestamp = GeneratorUtil.timestamp();
    _builder.append(_timestamp, " ");
    _builder.append("by Spray ");
    Class<? extends Object> _class = templateClass.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, " ");
    _builder.append(".xtend");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("This file will be generated oinly once if it need to be regenerated, remove this file.");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("-->");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate the fulle expression to calculate the  value of a Text, existing of string literals and navigation expressions
   */
  public StringConcatenation valueGenerator(final Text text, final String metaClassVariable) {
    try {
      {
        this.compiler.setMetaClassVariable(metaClassVariable);
        ImportManager _importManager = new ImportManager(false);
        String _compile = this.compiler.compile(text, _importManager);
        final String body = _compile;
        StringConcatenation _stringConcatenation = new StringConcatenation();
        final StringConcatenation result = _stringConcatenation;
        result.append(body);
        return result;
      }
    } finally {
      this.compiler.setMetaClassVariable(null);
    }
  }
  
  /**
   * Generate a unique key for the full expression to be used in map storage
   */
  public String keyGenerator(final Text text) {
    XExpression _value = text.getValue();
    String _string = _value.toString();
    return _string;
  }
}
