package org.eclipselabs.spray.xtext.jvmmodel;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(XtextRunner.class)
@InjectWith(SprayInjectorProvider.class)
public class GenModelHelperTest {
    @Inject
    private GenModelHelper fixture;
    
    /**
     * Try to compute the Java Interface name for {@link EClassifier}. This will fail since the genmodel is not available
     * in the registry.
     */
    @Test (expected=IllegalStateException.class)
    public void test_getJavaInterfaceName_unregistered_genmodel () {
        assertEquals ("org.eclipse.emf.ecore.EClassifier", fixture.getJavaInterfaceName(EcorePackage.Literals.ECLASSIFIER));
    }

    /**
     * Try to compute the Java Interface name for {@link EClassifier}. Register the Ecore GenModel before.
     */
    @Test
    public void test_getJavaInterfaceName () {
        StandaloneSetup setup = new StandaloneSetup();
        setup.setPlatformUri("."); // current project is enough here
        setup.addRegisterGenModelFile("platform:/resource/org.eclipselabs.spray.xtext.tests/model/Ecore.genmodel");
        assertEquals ("org.eclipse.emf.ecore.EClassifier", fixture.getJavaInterfaceName(EcorePackage.Literals.ECLASSIFIER));
    }
}
