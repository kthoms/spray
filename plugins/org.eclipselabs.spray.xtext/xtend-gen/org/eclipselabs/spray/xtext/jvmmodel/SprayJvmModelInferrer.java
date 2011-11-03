package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model.
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>
 */
@SuppressWarnings("all")
public class SprayJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  private GenModelHelper _genModelHelper;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameConverter converter;
  
  protected void _infer(final MetaClass clazz, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
      boolean _operator_or = false;
      EClass _type = clazz.getType();
      boolean _operator_equals = ObjectExtensions.operator_equals(_type, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        EClass _type_1 = clazz.getType();
        boolean _eIsProxy = _type_1.eIsProxy();
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _eIsProxy);
      }
      if (_operator_or) {
        return;
      }
      try {
        EClass _type_2 = clazz.getType();
        this._genModelHelper.getJavaInterfaceName(_type_2);
      } catch (final IllegalStateException e) {
        return;
      }
      EClass _type_3 = clazz.getType();
      String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(_type_3);
      final String instanceClassName = _javaInterfaceName;
      JvmTypeReference _typeForName = this.typeReferences.getTypeForName(instanceClassName, clazz, null);
      final JvmTypeReference eClassJvmType = _typeForName;
      EClass _type_4 = clazz.getType();
      EPackage _ePackage = _type_4.getEPackage();
      String _name = _ePackage.getName();
      String _operator_plus = StringExtensions.operator_plus(_name, ".");
      EClass _type_5 = clazz.getType();
      String _name_1 = _type_5.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      QualifiedName _qualifiedName = this.converter.toQualifiedName(_operator_plus_1);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              EList<JvmMember> _members = it.getMembers();
              JvmField _field = SprayJvmModelInferrer.this._jvmTypesBuilder.toField(it, "ecoreClass", eClassJvmType);
              CollectionExtensions.<JvmField>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmOperation _getter = SprayJvmModelInferrer.this._jvmTypesBuilder.toGetter(it, "ecoreClass", eClassJvmType);
              CollectionExtensions.<JvmOperation>operator_add(_members_1, _getter);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(clazz, _qualifiedName, _function);
      acceptor.accept(_class);
  }
  
  public void infer(final EObject clazz, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
    if (clazz instanceof MetaClass) {
      _infer((MetaClass)clazz, acceptor, prelinkingPhase);
    } else {
      _infer(clazz, acceptor, prelinkingPhase);
    }
  }
}
