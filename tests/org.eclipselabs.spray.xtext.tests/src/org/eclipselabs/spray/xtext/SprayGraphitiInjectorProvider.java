package org.eclipselabs.spray.xtext;

import org.eclipselabs.spray.runtime.graphiti.SprayGraphitiStandaloneSetup;

import com.google.inject.Injector;

/**
 * Sets up also bindings for Graphiti Generator and Runtime.
 * @author Karsten Thoms
 */
public class SprayGraphitiInjectorProvider extends SprayInjectorProvider {
	private Injector injector;

	public Injector getInjector() {
		if (injector == null) {
			this.injector = new SprayGraphitiStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
}
