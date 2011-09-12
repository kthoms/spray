package org.xspray.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class XsprayStandaloneSetup extends XsprayStandaloneSetupGenerated {
    public static void doSetup() {
        new XsprayStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public void register(Injector injector) {
        if (!EPackage.Registry.INSTANCE.containsKey("http://www.xspray.org/Xspray")) {
            EPackage.Registry.INSTANCE.put("http://http://www.xspray.org/Xspray", org.xspray.mm.xspray.XsprayPackage.eINSTANCE);
        }
        IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
        if (!IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore")) {
            IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", serviceProvider);
        }
        super.register(injector);
    }
}
