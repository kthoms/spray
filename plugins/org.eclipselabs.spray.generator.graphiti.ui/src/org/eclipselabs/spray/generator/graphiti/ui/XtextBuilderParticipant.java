package org.eclipselabs.spray.generator.graphiti.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Inject;

public class XtextBuilderParticipant implements IXtextBuilderParticipant {
    @Inject
    private IGenerator generator;
    @Override
    public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        
    }

}
