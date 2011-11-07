package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.LayoutExtensions;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class ExecutableExtensionFactory extends FileGenerator {
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private LayoutExtensions e2;
  
  @Inject
  private NamingExtensions naming;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _className);
    return _mainFile;
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
    _builder.append("import com.google.inject.Injector;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.Bundle;");
    _builder.newLine();
    _builder.append("import ");
    String _main_package = GeneratorUtil.main_package();
    _builder.append(_main_package, "");
    _builder.append(".Activator;");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGuiceAwareExecutableExtensionFactory {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Bundle getBundle() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _activatorSimpleClassName = this.naming.getActivatorSimpleClassName(diagram);
    _builder.append(_activatorSimpleClassName, "        ");
    _builder.append(".getDefault().getBundle();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Injector getInjector() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _activatorSimpleClassName_1 = this.naming.getActivatorSimpleClassName(diagram);
    _builder.append(_activatorSimpleClassName_1, "        ");
    _builder.append(".getDefault().getInjector();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}