package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class GuiceModule extends FileGenerator {
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private LayoutExtensions e2;
  
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
    _builder.append("package ");
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("// Add custom bindings here");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// public Class<? extends MyInterface> bindMyInterface () {");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//   return MyInterfaceImpl.class;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// }");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// Get instances through the Activator:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// MyInterface instance = Activator.get(MyInterface.class);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.service.AbstractGenericModule;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGenericModule {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// no bindings added yet, will be extended later");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
