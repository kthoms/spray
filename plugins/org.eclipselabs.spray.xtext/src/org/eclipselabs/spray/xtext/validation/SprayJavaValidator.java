package org.eclipselabs.spray.xtext.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SprayJavaValidator extends AbstractSprayJavaValidator {
    @Inject
    private GenModelHelper genModelHelper;

    /**
     * Add additional EReferences for type conformance validation of expressions.
     */
    @Override
    protected Set<EReference> getTypeConformanceCheckedReferences() {
        Set<EReference> references = new HashSet<EReference>(super.getTypeConformanceCheckedReferences());
        references.add(SprayPackage.Literals.TEXT__VALUE);
        return references;
    }

    @Check
    public void checkGenModelAvailable(MetaClass clazz) {
        EClass type = clazz.getType();
        try {
            // call of getEPackageClassName will result in an IllegalStateException when no GenModel was found
            if (type.eIsProxy()) {
                return; // scoping problem; will be reported as separate problem
            }
            genModelHelper.getEPackageClassName(type);
        } catch (IllegalStateException e) {
            error("No genmodel registered for EClass " + type.getName(), clazz, SprayPackage.Literals.META_CLASS__TYPE, IssueCodes.MISSING_GENMODEL);
        }
    }

}
