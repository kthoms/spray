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
    _builder.append("diagram   ");
    String _diagramTypeName = info.getDiagramTypeName();
    _builder.append(_diagramTypeName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("extension \"");
    String _metamodelExtension = info.getMetamodelExtension();
    _builder.append(_metamodelExtension, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateProperties(final SprayProjectInfo info) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("diagramPackage \t= ");
    String _basePackage = info.getBasePackage();
    _builder.append(_basePackage, "");
    _builder.append(".diagram");
    _builder.newLineIfNotEmpty();
    _builder.append("featurePackage \t= ");
    String _basePackage_1 = info.getBasePackage();
    _builder.append(_basePackage_1, "");
    _builder.append(".features");
    _builder.newLineIfNotEmpty();
    _builder.append("propertyPackage = ");
    String _basePackage_2 = info.getBasePackage();
    _builder.append(_basePackage_2, "");
    _builder.append(".property");
    _builder.newLineIfNotEmpty();
    _builder.append("utilPackage \t= ");
    String _basePackage_3 = info.getBasePackage();
    _builder.append(_basePackage_3, "");
    _builder.append(".runtime.containers");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("srcGenPath \t\t= src-gen");
    _builder.newLine();
    _builder.append("resourceGenPath = resource-gen");
    _builder.newLine();
    _builder.append("srcManPath \t\t= src");
    _builder.newLine();
    _builder.append("resourceManPath = resource");
    _builder.newLine();
    _builder.append("projectPath \t= ./");
    String _projectName = info.getProjectName();
    _builder.append(_projectName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("headerTimestamp = false");
    _builder.newLine();
    return _builder;
  }
}