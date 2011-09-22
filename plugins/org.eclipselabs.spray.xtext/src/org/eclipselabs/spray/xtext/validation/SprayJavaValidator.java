package org.eclipselabs.spray.xtext.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

@SuppressWarnings("restriction")
public class SprayJavaValidator extends AbstractSprayJavaValidator {

    @Override
    protected Set<EReference> getTypeConformanceCheckedReferences() {
        Set<EReference> references = new HashSet<EReference>(super.getTypeConformanceCheckedReferences());
        references.add(SprayPackage.Literals.TEXT__VALUE);
        return references;
    }
}
