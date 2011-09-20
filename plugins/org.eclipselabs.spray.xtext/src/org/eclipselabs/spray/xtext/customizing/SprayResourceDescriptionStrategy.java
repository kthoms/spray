package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipselabs.spray.xtext.jvmmodel.EcoreJvmModelInferrer;

import com.google.inject.Inject;

public class SprayResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
    @Inject
    private EcoreJvmModelInferrer ecoreJvmModelInferrer;

    @Override
    public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
        //        if (eObject instanceof EPackage) {
        //            EPackage pck = (EPackage) eObject;
        //            HashSet<JvmDeclaredType> types = Sets.newHashSet();
        //            for (EClassifier clz : pck.getEClassifiers()) {
        //                types.addAll(ecoreJvmModelInferrer.inferJvmModel(clz));
        //            }
        //            for (JvmDeclaredType type : types) {
        //                IEObjectDescription objDesc = EObjectDescription.create(type.getQualifiedName('.'), type);
        //                acceptor.accept(objDesc);
        //            }
        //        }
        return super.createEObjectDescriptions(eObject, acceptor);
    }
}
