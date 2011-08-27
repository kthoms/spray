
package org.xspray.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.xspray.mm.xspray.*;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XsprayStandaloneSetup extends XsprayStandaloneSetupGenerated{

	public static void doSetup() {
		new XsprayStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.xspray.org/Xspray")) {
			EPackage.Registry.INSTANCE.put("http://http://www.xspray.org/Xspray", org.xspray.mm.xspray.XsprayPackage.eINSTANCE);
		}

		super.register(injector);
	}

}

