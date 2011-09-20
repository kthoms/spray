package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayInjectorProvider;
import org.eclipselabs.spray.xtext.SprayStandaloneSetup;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SprayInjectorProvider.class)
public class ModelTests extends XtextTest {
    @Before
    public void before() {
        super.before();
        // Normally, this should not be necessary, but the InjectorProvider only works for 
        // the first test case
        SprayStandaloneSetup.doSetup();
        suppressSerialization();
        StandaloneSetup setup = new StandaloneSetup();
        setup.setPlatformUri("../..");
        setup.addRegisterGenModelFile("platform:/resource/org.eclipselabs.spray.xtext.tests/model/Ecore.genmodel");
        setup.addRegisterEcoreFile("platform:/resource/org.eclipselabs.spray.xtext.tests/model/Ecore.ecore");
    }

    @Test
    public void test_01_minimal() {
        testFile("testcases/01-minimal.spray");
    }
    @Test
    public void test_02_color() {
        testFile("testcases/02-color.spray", "mod4j/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_03_color() {
        testFile("testcases/03-color.spray", "mod4j/BusinessDomainDsl.ecore");
    }
    @Test
    public void test_30_expression_text() {
        testFile("testcases/30-expression_text.spray", "mod4j/BusinessDomainDsl.ecore");
    }
    @Test
    public void test_31_expression_text() {
        testFile("testcases/31-expression_text.spray", "Ecore.ecore");
    }
}
