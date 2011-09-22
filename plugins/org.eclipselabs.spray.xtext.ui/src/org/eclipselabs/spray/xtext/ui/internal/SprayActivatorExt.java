package org.eclipselabs.spray.xtext.ui.internal;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;

import com.google.inject.Module;

public class SprayActivatorExt extends SprayActivator {
    @Override
    protected Module getRuntimeModule(String grammar) {
        // TODO: Get rid of direct dependencies to Graphiti, add Extension Point for additional modules
        return Modules2.mixin(super.getRuntimeModule(grammar), new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule());
    }
}
