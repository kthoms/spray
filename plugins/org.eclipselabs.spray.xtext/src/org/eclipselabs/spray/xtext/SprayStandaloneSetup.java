package org.eclipselabs.spray.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class SprayStandaloneSetup extends SprayStandaloneSetupGenerated {
    public static void doSetup() {
        new SprayStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public void register(Injector injector) {
        if (!EPackage.Registry.INSTANCE.containsKey(SprayPackage.eNS_URI)) {
            EPackage.Registry.INSTANCE.put(SprayPackage.eNS_URI, SprayPackage.eINSTANCE);
        }
        IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
        if (!IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore")) {
            IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", serviceProvider);
        }
        super.register(injector);
    }
}
