package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.mm.spray.Text;

import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class SprayTypeProvider extends XbaseTypeProvider {
    /**
     * The expected type of the 'value' expression of type Text is String
     */
    protected JvmTypeReference _expectedType(Text text, EReference reference, int index, boolean rawType) {
        if (reference == SprayPackage.Literals.TEXT__VALUE) {
            return getTypeReferences().getTypeForName(String.class, text, (JvmTypeReference[]) null);
        }
        return null;
    }
}
