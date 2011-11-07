package org.eclipselabs.spray.generator.graphiti;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipselabs.spray.generator.graphiti.SprayGraphitiGenerator;

@SuppressWarnings("all")
public class SprayGenerator implements IGenerator {
  @Inject
  private SprayGraphitiGenerator graphitiGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.graphitiGenerator.doGenerate(resource, fsa);
  }
}
