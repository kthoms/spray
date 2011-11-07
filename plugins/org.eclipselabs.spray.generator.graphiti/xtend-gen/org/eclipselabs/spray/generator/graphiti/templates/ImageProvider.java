package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;

@SuppressWarnings("all")
public class ImageProvider extends FileGenerator {
  @Inject
  private NamingExtensions naming;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
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
    MetaClass[] _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
        public Boolean apply(final MetaClass m) {
          String _icon = m.getIcon();
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_icon, null);
          return ((Boolean)_operator_notEquals);
        }
      };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
    final Function1<MetaClass,String> _function_1 = new Function1<MetaClass,String>() {
        public String apply(final MetaClass m) {
          String _icon = m.getIcon();
          return _icon;
        }
      };
    Iterable<String> _map = IterableExtensions.<MetaClass, String>map(_filter, _function_1);
    Set<String> _set = IterableExtensions.<String>toSet(_map);
    final Set<String> icons = _set;
    _builder.newLineIfNotEmpty();
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
      for(final String icon : icons) {
        _builder.append("    ");
        _builder.append("// The image identifier for an EReference.");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public static final String ");
        String _imageIdentifier = this.naming.getImageIdentifier(diagram, icon);
        _builder.append(_imageIdentifier, "    ");
        _builder.append("  = PREFIX + \"");
        String _imageBaseName = this.naming.getImageBaseName(icon);
        _builder.append(_imageBaseName, "    ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
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
      for(final String icon_1 : icons) {
        _builder.append("    ");
        _builder.append("addImageFilePath(");
        String _imageIdentifier_1 = this.naming.getImageIdentifier(diagram, icon_1);
        _builder.append(_imageIdentifier_1, "    ");
        _builder.append(", \"icons/");
        _builder.append(icon_1, "    ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
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
