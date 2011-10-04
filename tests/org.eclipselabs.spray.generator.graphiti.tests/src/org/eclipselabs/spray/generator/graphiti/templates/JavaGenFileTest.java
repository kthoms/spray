package org.eclipselabs.spray.generator.graphiti.templates;

import java.math.BigDecimal;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class JavaGenFileTest {
    @Inject
    private IFileSystemAccess fsa;
    private JavaGenFile       fixture;

    @Before
    public void setUp() {
        fixture = new JavaGenFile((JavaIoFileSystemAccess) fsa);
    }

    @Test
    public void test_setPackageAndClass_String() {
        fixture.setPackageAndClass(BigDecimal.class.getName());
        assertEquals("java.math", fixture.getPackageName());
        assertEquals("BigDecimal", fixture.getClassName());
    }
}
