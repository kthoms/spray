package org.eclipselabs.spray.xtext.ui.commands;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jdt.core.ICompilationUnit;

public class CompilationUnitTester extends PropertyTester {
    public static final String   PROPERTY_EXTENSIONCLASS = "generatedExtensionClass";

    private SprayJavaProjectUtil projectUtil             = new SprayJavaProjectUtil();

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (receiver instanceof ICompilationUnit) {
            if (PROPERTY_EXTENSIONCLASS.equals(property)) {
                return projectUtil.isGeneratedExtensionFile((ICompilationUnit) receiver);
            }
        }
        return false;
    }

}
