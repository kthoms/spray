package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.spray.xtext.SprayTestsStandaloneSetup;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ModelTests extends XtextTest {
    @Before
    public void before() {
        super.before();
        // Normally, this should not be necessary, but the InjectorProvider only works for 
        // the first test case
        SprayTestsStandaloneSetup.doSetup();
        suppressSerialization();
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
    }

    @Test
    public void test_01_minimal() {
        testFile("testcases/01-minimal.spray");
    }
    @Test
    public void test_20_color() {
        testFile("testcases/20-color.spray", "mod4j/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_21_color() {
        testFile("testcases/21-color.spray", "mod4j/BusinessDomainDsl.ecore");
    }
    @Test
    public void test_22_color() {
        testFile("testcases/22-color.spray", "mod4j/BusinessDomainDsl.ecore");
    }
    @Test
    public void test_30_expression_text() {
        testFile("testcases/30-expression_text.spray", "mod4j/BusinessDomainDsl.ecore");
    }
    @Test
    public void test_31_expression_text() {
        testFile("testcases/31-expression_text.spray", "mod4j/BusinessDomainDsl.ecore");
    }
}
