package org.eclipselabs.spray.xtext;

import com.google.inject.Injector;

/**
 * Sets up also bindings for Graphiti Generator and Runtime.
 * @author Karsten Thoms
 */
public class SprayTestsInjectorProvider extends SprayInjectorProvider {
	private Injector injector;

	public Injector getInjector() {
		if (injector == null) {
			this.injector = new SprayTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
}
