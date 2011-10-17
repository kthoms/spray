package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;

@SuppressWarnings("all")
public class SprayModelGenerator {
  
  public void doGenerate(final SprayProjectInfo info, final IFileSystemAccess fsa) {
    {
      String _projectName = info.getProjectName();
      final String project = _projectName;
      String _diagramTypeName = info.getDiagramTypeName();
      String _operator_plus = StringExtensions.operator_plus("model/", _diagramTypeName);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".spray");
      String _projectName_1 = info.getProjectName();
      StringConcatenation _generateModel = this.generateModel(info);
      fsa.generateFile(_operator_plus_1, _projectName_1, _generateModel);
      String _diagramTypeName_1 = info.getDiagramTypeName();
      String _operator_plus_2 = StringExtensions.operator_plus("model/", _diagramTypeName_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ".properties");
      String _projectName_2 = info.getProjectName();
      StringConcatenation _generateProperties = this.generateProperties(info);
      fsa.generateFile(_operator_plus_3, _projectName_2, _generateProperties);
    }
  }
  
  public StringConcatenation generateModel(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*************************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Spray diagram definition");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This file contains the definition of a graphical editor using the Spray Language.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See also ");
    String _diagramTypeName = info.getDiagramTypeName();
    _builder.append(_diagramTypeName, " ");
    _builder.append(".properties to configure generator properties.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*************************************************************************************/");
    _builder.newLine();
    _builder.append("diagram   ");
    String _diagramTypeName_1 = info.getDiagramTypeName();
    _builder.append(_diagramTypeName_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// Add import statements here, e.g.");
    _builder.newLine();
    _builder.append("// import BusinessDomainDsl.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Add class mappings here. Refer to EClasses here. Don\'t forget to configure a");
    _builder.newLine();
    _builder.append("// dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.");
    _builder.newLine();
    _builder.append("// It is required to have a genmodel for the metamodel. ");
    _builder.newLine();
    _builder.append("// Currently, the metamodel plugin must be deployed in your Eclipse installation,");
    _builder.newLine();
    _builder.append("// i.e. it is not possible to refer to an Ecore model within your workspace.");
    _builder.newLine();
    _builder.append("//");
    _builder.newLine();
    _builder.append("// Example class mapping:");
    _builder.newLine();
    _builder.append("//   class BusinessClass:");
    _builder.newLine();
    _builder.append("//     container  ( fill=dark_green ) ");
    _builder.newLine();
    _builder.append("//     [");
    _builder.newLine();
    _builder.append("//       text ( )  { \"<<\"+eClass.name+\">> \" + name};");
    _builder.newLine();
    _builder.append("//     ]");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateProperties(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pluginId        = ");
    String _basePackage = info.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.newLineIfNotEmpty();
    _builder.append("mainPackage     = ");
    String _basePackage_1 = info.getBasePackage();
    _builder.append(_basePackage_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("diagramPackage  = ");
    String _basePackage_2 = info.getBasePackage();
    _builder.append(_basePackage_2, "");
    _builder.append(".diagram");
    _builder.newLineIfNotEmpty();
    _builder.append("featurePackage     = ");
    String _basePackage_3 = info.getBasePackage();
    _builder.append(_basePackage_3, "");
    _builder.append(".features");
    _builder.newLineIfNotEmpty();
    _builder.append("propertyPackage = ");
    String _basePackage_4 = info.getBasePackage();
    _builder.append(_basePackage_4, "");
    _builder.append(".property");
    _builder.newLineIfNotEmpty();
    _builder.append("utilPackage     = org.eclipselabs.spray.runtime.graphiti.containers");
    _builder.newLine();
    _builder.newLine();
    _builder.append("srcGenPath         = src-gen");
    _builder.newLine();
    _builder.append("resourceGenPath = resource-gen");
    _builder.newLine();
    _builder.append("srcManPath         = src");
    _builder.newLine();
    _builder.append("resourceManPath = resource");
    _builder.newLine();
    _builder.append("projectPath     = ./");
    String _projectName = info.getProjectName();
    _builder.append(_projectName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("headerTimestamp = false");
    _builder.newLine();
    return _builder;
  }
}