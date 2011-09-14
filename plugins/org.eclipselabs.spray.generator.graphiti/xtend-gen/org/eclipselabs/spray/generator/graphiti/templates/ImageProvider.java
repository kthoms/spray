package org.eclipselabs.spray.generator.graphiti.templates;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;

@SuppressWarnings("all")
public class ImageProvider extends FileGenerator {
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtentionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((Diagram) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, " ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public class ");
    _builder.append(className, " ");
    _builder.append(" extends ");
    _builder.append(className, " ");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package  ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.AbstractImageProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractImageProvider {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// The prefix for all identifiers of this image provider");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String PREFIX = \"");
    String _diagram_package_1 = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package_1, "    ");
    _builder.append(".\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,String> _function = new Function1<MetaClass,String>() {
          public String apply(final MetaClass m) {
            String _icon = m.getIcon();
            return _icon;
          }
        };
      List<String> _map = ListExtensions.<MetaClass, String>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      Set<String> _set = IterableExtensions.<String>toSet(_map);
      for(final String icon : _set) {
        {
          boolean _operator_and = false;
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(icon, null);
          if (!_operator_notEquals) {
            _operator_and = false;
          } else {
            boolean _equalsIgnoreCase = icon.equalsIgnoreCase("");
            boolean _operator_not = BooleanExtensions.operator_not(_equalsIgnoreCase);
            _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
          }
          if (_operator_and) {
            _builder.append("// The image identifier for an EReference.");
            _builder.newLine();
            _builder.append("public static final String ");
            String _name = diagram.getName();
            _builder.append(_name, "");
            _builder.append("_");
            String _base = GeneratorUtil.base(icon);
            _builder.append(_base, "");
            _builder.append("  = PREFIX + \"");
            String _base_1 = GeneratorUtil.base(icon);
            _builder.append(_base_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void addAvailableImages() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// register the path for each image identifier");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,String> _function_1 = new Function1<MetaClass,String>() {
          public String apply(final MetaClass m_1) {
            String _icon_1 = m_1.getIcon();
            return _icon_1;
          }
        };
      List<String> _map_1 = ListExtensions.<MetaClass, String>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_1);
      Set<String> _set_1 = IterableExtensions.<String>toSet(_map_1);
      for(final String icon_1 : _set_1) {
        {
          boolean _operator_and_1 = false;
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(icon_1, null);
          if (!_operator_notEquals_1) {
            _operator_and_1 = false;
          } else {
            boolean _equalsIgnoreCase_1 = icon_1.equalsIgnoreCase("");
            boolean _operator_not_1 = BooleanExtensions.operator_not(_equalsIgnoreCase_1);
            _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_1, _operator_not_1);
          }
          if (_operator_and_1) {
            _builder.append("    ");
            _builder.append("addImageFilePath(");
            String _name_1 = diagram.getName();
            _builder.append(_name_1, "    ");
            _builder.append("_");
            String _base_2 = GeneratorUtil.base(icon_1);
            _builder.append(_base_2, "    ");
            _builder.append(", \"icons/");
            _builder.append(icon_1, "    ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}