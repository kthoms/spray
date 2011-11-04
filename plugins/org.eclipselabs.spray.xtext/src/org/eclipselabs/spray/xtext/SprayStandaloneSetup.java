package org.eclipselabs.spray.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ecore.EcoreSupport;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class SprayStandaloneSetup extends SprayStandaloneSetupGenerated {

    public static void doSetup() {
        new SprayStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(SprayPackage.eNS_URI, SprayPackage.eINSTANCE);
        return super.createInjectorAndDoEMFRegistration();
    }

    @Override
    public void register(Injector injector) {
        super.register(injector);
        new EcoreSupport().registerServices(true);
    }
}
