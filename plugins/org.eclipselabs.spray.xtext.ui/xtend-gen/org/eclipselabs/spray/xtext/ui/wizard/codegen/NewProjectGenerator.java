package org.eclipselabs.spray.xtext.ui.wizard.codegen;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipselabs.spray.xtext.ui.wizard.XsprayProjectInfo;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.ActivatorGenerator;
import org.eclipselabs.spray.xtext.ui.wizard.codegen.XsprayModelGenerator;

@SuppressWarnings("all")
public class NewProjectGenerator {
  
  @Inject
  private ActivatorGenerator generateActivator;
  
  @Inject
  private XsprayModelGenerator generateModel;
  
  public void doGenerate(final XsprayProjectInfo projectInfo, final IFileSystemAccess fsa) {
    {
      this.generateActivator.doGenerate(projectInfo, fsa);
      this.generateModel.doGenerate(projectInfo, fsa);
    }
  }
}