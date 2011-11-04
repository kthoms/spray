package org.eclipselabs.spray.xtext;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SprayTestsStandaloneSetup extends SprayStandaloneSetup {
    @Override
    public Injector createInjector() {
        return Guice.createInjector(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new SprayTestsModule());
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
        return super.createInjectorAndDoEMFRegistration();
    }
}
