package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("restriction")
public class SpraySimpleNameProvider extends IdentifiableSimpleNameProvider {
    @Override
    public String getSimpleName(JvmIdentifiableElement element) {
        if (element instanceof JvmType) {
            return "this";
        } else {
            return super.getSimpleName(element);
        }
    }
}
