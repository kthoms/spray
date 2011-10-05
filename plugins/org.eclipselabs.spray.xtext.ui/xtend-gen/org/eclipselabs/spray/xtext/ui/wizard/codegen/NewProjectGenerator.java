package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.ActivatorGenerator;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.SprayModelGenerator;

@SuppressWarnings("all")
public class NewProjectGenerator {
  
  @Inject
  private ActivatorGenerator generateActivator;
  
  @Inject
  private SprayModelGenerator generateModel;
  
  public void doGenerate(final SprayProjectInfo projectInfo, final IFileSystemAccess fsa) {
    this.generateModel.doGenerate(projectInfo, fsa);
  }
}