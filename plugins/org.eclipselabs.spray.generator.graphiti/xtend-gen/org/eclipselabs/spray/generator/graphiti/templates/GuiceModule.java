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
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.tb.IToolBehaviorProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.IImageProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.service.AbstractGenericModule;");
    _builder.newLine();
    _builder.append("import com.google.inject.Binder;");
    _builder.newLine();
    _builder.append("import com.google.inject.Scopes;");
    _builder.newLine();
    _builder.append("import ");
    String _diagramTypeProviderClassName = this.naming.getDiagramTypeProviderClassName(diagram);
    _builder.append(_diagramTypeProviderClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _featureProviderClassName = this.naming.getFeatureProviderClassName(diagram);
    _builder.append(_featureProviderClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _imageProviderClassName = this.naming.getImageProviderClassName(diagram);
    _builder.append(_imageProviderClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _olBehaviourProviderClassName = this.naming.getToolBehaviourProviderClassName(diagram);
    _builder.append(_olBehaviourProviderClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGenericModule {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public void configureIDiagramTypeProvider (Binder binder) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IDiagramTypeProvider.class).to(");
    String _diagramTypeProviderSimpleClassName = this.naming.getDiagramTypeProviderSimpleClassName(diagram);
    _builder.append(_diagramTypeProviderSimpleClassName, "        ");
    _builder.append(".class).in(Scopes.SINGLETON);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void configureIFeatureProvider (Binder binder) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IFeatureProvider.class).to(");
    String _featureProviderSimpleClassName = this.naming.getFeatureProviderSimpleClassName(diagram);
    _builder.append(_featureProviderSimpleClassName, "        ");
    _builder.append(".class).in(Scopes.SINGLETON);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void configureIImageProvider (Binder binder) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IImageProvider.class).to(");
    String _imageProviderSimpleClassName = this.naming.getImageProviderSimpleClassName(diagram);
    _builder.append(_imageProviderSimpleClassName, "        ");
    _builder.append(".class).in(Scopes.SINGLETON);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void configureIToolBehaviorProvider (Binder binder) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IToolBehaviorProvider.class).to(");
    String _olBehaviourProviderSimpleClassName = this.naming.getToolBehaviourProviderSimpleClassName(diagram);
    _builder.append(_olBehaviourProviderSimpleClassName, "        ");
    _builder.append(".class).in(Scopes.SINGLETON);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
