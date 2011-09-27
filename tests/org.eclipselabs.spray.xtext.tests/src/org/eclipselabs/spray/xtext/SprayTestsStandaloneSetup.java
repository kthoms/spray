package org.eclipselabs.spray.xtext;

import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SprayTestsStandaloneSetup extends SprayStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new SprayTestsModule());
    }
}
