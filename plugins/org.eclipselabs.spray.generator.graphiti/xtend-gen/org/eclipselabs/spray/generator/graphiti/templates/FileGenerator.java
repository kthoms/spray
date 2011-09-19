package org.eclipselabs.spray.generator.graphiti.templates;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.GenFile;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.templates.TemplateUtil;
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties;

@SuppressWarnings("all")
public class FileGenerator extends TemplateUtil {
  
  private GenFile genFile;
  
  private JavaGenFile javaGenFile;
  
  public JavaGenFile getJavaGenFile() {
    return this.javaGenFile;
  }
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    return null;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    return null;
  }
  
  public void generate(final EObject modelElement, final GenFile genFile1) {
    {
      this.genFile = genFile1;
      if ((genFile1 instanceof org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile)) {
        this.javaGenFile = ((JavaGenFile) genFile1);
      }
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String s1) {
            String _importsAsString = XtendProperties.importsAsString();
            String _replaceAll = s1.replaceAll("// MARKER_IMPORT", _importsAsString);
            return _replaceAll;
          }
        };
      Function1<String,String> block = _function;
      if (this.genFile.hasExtensionPoint) {
        boolean _extensionFileExists = this.javaGenFile.extensionFileExists();
        if (_extensionFileExists) {
          String _fileName = this.javaGenFile.getFileName();
          String _operator_plus = StringExtensions.operator_plus("Not regenerating extension point [", _fileName);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "]");
          InputOutput.<String>println(_operator_plus_1);
        } else {
          {
            String _pathName = this.javaGenFile.getPathName();
            String _operator_plus_2 = StringExtensions.operator_plus("generating ", _pathName);
            InputOutput.<String>println(_operator_plus_2);
            XtendProperties.initializeImports();
            StringConcatenation _generateExtensionFile = this.generateExtensionFile(modelElement);
            StringConcatenation file = _generateExtensionFile;
            String _string = file.toString();
            String _importsAsString_1 = XtendProperties.importsAsString();
            String _replaceAll_1 = _string.replaceAll("// MARKER_IMPORT", _importsAsString_1);
            String result = _replaceAll_1;
            AbstractFileSystemAccess _fsa = this.javaGenFile.getFsa();
            String _pathName_1 = this.javaGenFile.getPathName();
            _fsa.generateFile(_pathName_1, result);
          }
        }
      }
      String _basePathName = this.javaGenFile.getBasePathName();
      String _operator_plus_3 = StringExtensions.operator_plus("generating ", _basePathName);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " from ");
      Class<? extends Object> _class = this.getClass();
      String _name = _class.getName();
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name);
      InputOutput.<String>println(_operator_plus_5);
      XtendProperties.initializeImports();
      StringConcatenation _generateBaseFile = this.generateBaseFile(modelElement);
      CharSequence base = _generateBaseFile;
      String _string_1 = base.toString();
      String _importsAsString_2 = XtendProperties.importsAsString();
      String _replaceAll_2 = _string_1.replaceAll("// MARKER_IMPORT", _importsAsString_2);
      String result_1 = _replaceAll_2;
      AbstractFileSystemAccess _fsa_1 = this.genFile.getFsa();
      String _basePathName_1 = this.javaGenFile.getBasePathName();
      _fsa_1.generateFile(_basePathName_1, result_1);
    }
  }
}