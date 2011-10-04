package org.eclipselabs.spray.xtext.util;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class GenModelHelperTest {
    @Inject
    private GenModelHelper fixture;

    @BeforeClass
    public static void before() {
        // Normally, this should not be necessary, but the InjectorProvider only works for 
        // the first test case
        StandaloneSetup setup = new StandaloneSetup();
        setup.setPlatformUri("."); // current project is enough here
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        setup.addRegisterGenModelFile("platform:/resource/org.eclipselabs.spray.xtext.tests/model/Ecore.genmodel");
    }

    @Test
    public void test_getGenModel() {
        GenModel genModel = fixture.getGenModel(EcorePackage.Literals.ECLASSIFIER);
        assertNotNull(genModel);
    }

    @Test
    public void test_getFileExtension() {
        assertEquals("ecore", fixture.getFileExtension(EcorePackage.Literals.ECLASSIFIER));
    }

    @Test
    public void test_getEPackageClassName() {
        assertEquals("org.eclipse.emf.ecore.EcorePackage", fixture.getEPackageClassName(EcorePackage.Literals.ECLASSIFIER));
    }

    @Test
    public void test_getEFactoryInterfaceName() {
        assertEquals("org.eclipse.emf.ecore.EcoreFactory", fixture.getEFactoryInterfaceName(EcorePackage.Literals.ECLASSIFIER));
    }

    /**
     * Try to compute the Java Interface name for {@link EClassifier}. Register the Ecore GenModel before.
     */
    @Test
    public void test_getJavaInterfaceName() {
        assertEquals("org.eclipse.emf.ecore.EClassifier", fixture.getJavaInterfaceName(EcorePackage.Literals.ECLASSIFIER));
    }

    @Test
    public void test_getLiteralConstant() {
        assertEquals("ECLASSIFIER", fixture.getLiteralConstant(EcorePackage.Literals.ECLASSIFIER));
    }
}
