package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.SprayModelGenerator;

@SuppressWarnings("all")
public class NewProjectGenerator {
  @Inject
  private SprayModelGenerator generateModel;
  
  public void doGenerate(final SprayProjectInfo projectInfo, final IFileSystemAccess fsa) {
      this.generateModel.doGenerate(projectInfo, fsa);
      this.generateBuildProperties(projectInfo, fsa);
  }
  
  public void generateBuildProperties(final SprayProjectInfo pi, final IFileSystemAccess fsa) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("source.. = ");
      String _javaMainSrcDir = pi.getJavaMainSrcDir();
      _builder.append(_javaMainSrcDir, "");
      _builder.append("/,\\");
      _builder.newLineIfNotEmpty();
      _builder.append("           ");
      String _javaGenSrcDir = pi.getJavaGenSrcDir();
      _builder.append(_javaGenSrcDir, "           ");
      _builder.append("/,\\");
      _builder.newLineIfNotEmpty();
      _builder.append("           ");
      String _sprayModelDir = pi.getSprayModelDir();
      _builder.append(_sprayModelDir, "           ");
      _builder.append("/");
      _builder.newLineIfNotEmpty();
      _builder.append("bin.includes = META-INF/,\\");
      _builder.newLine();
      _builder.append("               ");
      _builder.append("plugin.xml,\\");
      _builder.newLine();
      _builder.append("               ");
      _builder.append("icons/,\\");
      _builder.newLine();
      _builder.append("               ");
      String _sprayModelDir_1 = pi.getSprayModelDir();
      _builder.append(_sprayModelDir_1, "               ");
      _builder.append("/");
      _builder.newLineIfNotEmpty();
      final StringConcatenation content = _builder;
      String _projectName = pi.getProjectName();
      fsa.generateFile("build.properties", _projectName, content);
  }
}
