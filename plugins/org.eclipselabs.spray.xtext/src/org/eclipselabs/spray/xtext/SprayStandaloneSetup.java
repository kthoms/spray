
package org.eclipselabs.spray.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SprayStandaloneSetup extends SprayStandaloneSetupGenerated{

	public static void doSetup() {
		new SprayStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

