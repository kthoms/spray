package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.runtime.graphiti.SprayGraphitiStandaloneSetup;
import org.eclipselabs.spray.xtext.SprayGraphitiInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner.class)
@InjectWith(SprayGraphitiInjectorProvider.class)
public class Mod4jTest extends XtextTest {
    @Before
    public void before() {
        super.before();
        // Normally, this should not be necessary, but the InjectorProvider only works for 
        // the first test case
        SprayGraphitiStandaloneSetup.doSetup();
        suppressSerialization();
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
    }

    @Test
    @Ignore (value="Fails in Maven build, but not when executed locally")
    public void test_mod4j_busmod() {
        testFile("mod4j/mod4j-busmod.spray", "mod4j/BusinessDomainDsl.ecore");
    }
}
