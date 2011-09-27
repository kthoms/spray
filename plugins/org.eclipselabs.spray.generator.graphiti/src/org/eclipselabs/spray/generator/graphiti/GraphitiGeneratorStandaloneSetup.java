package org.eclipselabs.spray.generator.graphiti;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.eclipselabs.spray.xtext.SprayStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class GraphitiGeneratorStandaloneSetup extends SprayStandaloneSetup {
    public static void doSetup() {
        new GraphitiGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule()));
    }
}
