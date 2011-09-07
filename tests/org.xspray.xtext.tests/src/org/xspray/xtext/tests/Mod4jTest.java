package org.xspray.xtext.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xspray.xtext.XsprayInjectorProvider;
import org.xspray.xtext.XsprayStandaloneSetup;

@RunWith(XtextRunner.class)
@InjectWith(XsprayInjectorProvider.class)
public class Mod4jTest extends XtextTest {
	@Before
	public void before () {
		super.before();
		// Normally, this should not be necessary, but the InjectorProvider only works for 
		// the first test case
		XsprayStandaloneSetup.doSetup();
		suppressSerialization();
	}
	
	@Test
	public void test_mod4j_busmod () {
		testFile("mod4j/mod4j-busmod.xspray", "mod4j/BusinessDomainDsl.ecore");
	}
}
