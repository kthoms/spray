package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.GenFile;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.templates.TemplateUtil;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;

@SuppressWarnings("all")
public class FileGenerator extends TemplateUtil {
  private GenFile genFile;
  
  private JavaGenFile javaGenFile;
  
  @Inject
  private ImportUtil importUtil;
  
  public JavaGenFile getJavaGenFile() {
    return this.javaGenFile;
  }
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    return null;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    return null;
  }
  
  public String generate(final EObject modelElement, final GenFile genFile) {
    String _xblockexpression = null;
    {
      this.genFile = genFile;
      if ((genFile instanceof JavaGenFile)) {
        this.javaGenFile = ((JavaGenFile) genFile);
      } else {
        this.javaGenFile = null;
      }
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String s1) {
            String _printImports = FileGenerator.this.importUtil.printImports();
            String _replace = s1.replace("// MARKER_IMPORT", _printImports);
            return _replace;
          }
        };
      final Function1<String,String> organizeImports = _function;
      String fileContent = null;
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(this.javaGenFile, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, this.javaGenFile.hasExtensionPoint);
      }
      if (_operator_and) {
        {
          String _packageName = this.javaGenFile.getPackageName();
          this.importUtil.initImports(_packageName);
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
              StringConcatenation _generateExtensionFile = this.generateExtensionFile(modelElement);
              String _string = _generateExtensionFile.toString();
              fileContent = _string;
              String _apply = organizeImports.apply(fileContent);
              fileContent = _apply;
              AbstractFileSystemAccess _fsa = this.javaGenFile.getFsa();
              String _pathName_1 = this.javaGenFile.getPathName();
              _fsa.generateFile(_pathName_1, fileContent);
            }
          }
        }
      }
      String _xifexpression = null;
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(this.javaGenFile, null);
      if (_operator_notEquals_1) {
        if (this.javaGenFile.hasExtensionPoint) {
          {
            String _packageName_1 = this.javaGenFile.getPackageName();
            this.importUtil.initImports(_packageName_1);
            String _basePathName = this.javaGenFile.getBasePathName();
            String _operator_plus_3 = StringExtensions.operator_plus("generating 1 ", _basePathName);
            String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " from ");
            Class<? extends Object> _class = this.getClass();
            String _name = _class.getName();
            String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name);
            InputOutput.<String>println(_operator_plus_5);
            StringConcatenation _generateBaseFile = this.generateBaseFile(modelElement);
            String _string_1 = _generateBaseFile.toString();
            fileContent = _string_1;
            String _apply_1 = organizeImports.apply(fileContent);
            fileContent = _apply_1;
            AbstractFileSystemAccess _fsa_1 = genFile.getFsa();
            String _basePathName_1 = this.javaGenFile.getBasePathName();
            _fsa_1.generateFile(_basePathName_1, fileContent);
          }
        } else {
          {
            String _packageName_2 = this.javaGenFile.getPackageName();
            this.importUtil.initImports(_packageName_2);
            String _pathName_2 = this.javaGenFile.getPathName();
            String _operator_plus_6 = StringExtensions.operator_plus("generating 2 ", _pathName_2);
            String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, " from ");
            Class<? extends Object> _class_1 = this.getClass();
            String _name_1 = _class_1.getName();
            String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _name_1);
            InputOutput.<String>println(_operator_plus_8);
            StringConcatenation _generateBaseFile_1 = this.generateBaseFile(modelElement);
            String _string_2 = _generateBaseFile_1.toString();
            fileContent = _string_2;
            String _apply_2 = organizeImports.apply(fileContent);
            fileContent = _apply_2;
            AbstractFileSystemAccess _fsa_2 = genFile.getFsa();
            String _genOutputPath = this.javaGenFile.getGenOutputPath();
            _fsa_2.setOutputPath(_genOutputPath);
            AbstractFileSystemAccess _fsa_3 = genFile.getFsa();
            String _pathName_3 = this.javaGenFile.getPathName();
            _fsa_3.generateFile(_pathName_3, fileContent);
          }
        }
      } else {
        StringConcatenation _generateBaseFile_2 = this.generateBaseFile(modelElement);
        String _string_3 = _generateBaseFile_2.toString();
        String _fileContent = fileContent = _string_3;
        _xifexpression = _fileContent;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String shortName(final JvmTypeReference typeRef) {
    String _shortName = this.importUtil.shortName(typeRef);
    return _shortName;
  }
  
  public String shortName(final String qualifiedName) {
    String _shortName = this.importUtil.shortName(qualifiedName);
    return _shortName;
  }
  
  public String shortName(final Class<?> clazz) {
    String _shortName = this.importUtil.shortName(clazz);
    return _shortName;
  }
}
