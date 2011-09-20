package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.jvmmodel.EcoreJvmModelInferrer;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class SprayJvmModelInferrer implements IJvmModelInferrer {
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator jvmModelAssociator;
  
  @Inject
  private EcoreJvmModelInferrer ecoreJvmModelInferrer;
  
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  private GenModelHelper genModelHelper;
  
  public List<? extends JvmDeclaredType> inferJvmModel(final EObject sourceObject) {
    List<JvmDeclaredType> _xblockexpression = null;
    {
      this.jvmModelAssociator.disassociate(sourceObject);
      Iterable<JvmDeclaredType> _transform = this.transform(sourceObject);
      List<JvmDeclaredType> _list = IterableExtensions.<JvmDeclaredType>toList(_transform);
      _xblockexpression = (_list);
    }
    return _xblockexpression;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final EObject object) {
    List<JvmDeclaredType> _emptyList = CollectionLiterals.<JvmDeclaredType>emptyList();
    return _emptyList;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final Diagram model) {
    Iterable<JvmDeclaredType> _xblockexpression = null;
    {
      MetaClass[] _metaClasses = model.getMetaClasses();
      final Function1<MetaClass,Iterable<JvmDeclaredType>> _function = new Function1<MetaClass,Iterable<JvmDeclaredType>>() {
          public Iterable<JvmDeclaredType> apply(final MetaClass e) {
            Iterable<JvmDeclaredType> _transform = SprayJvmModelInferrer.this.transform(e);
            return _transform;
          }
        };
      List<Iterable<JvmDeclaredType>> _map = ListExtensions.<MetaClass, Iterable<JvmDeclaredType>>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      Iterable<JvmDeclaredType> _flatten = IterableExtensions.<JvmDeclaredType>flatten(_map);
      final Iterable<JvmDeclaredType> types1 = _flatten;
      _xblockexpression = (types1);
    }
    return _xblockexpression;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final MetaClass clazz) {
    ArrayList<JvmDeclaredType> _xblockexpression = null;
    {
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      final JvmGenericType jvmClass = _createJvmGenericType;
      EClass _type = clazz.getType();
      String _name = _type.getName();
      jvmClass.setSimpleName(_name);
      String _diagramPackage = ProjectProperties.getDiagramPackage();
      jvmClass.setPackageName(_diagramPackage);
      this.jvmModelAssociator.associatePrimary(clazz, jvmClass);
      jvmClass.setVisibility(JvmVisibility.PUBLIC);
      EClass _type_1 = clazz.getType();
      String _instanceClassName = this.genModelHelper.getInstanceClassName(_type_1);
      final String instanceClassName = _instanceClassName;
      JvmTypeReference _typeForName = this.typeReferences.getTypeForName(instanceClassName, clazz, null);
      final JvmTypeReference eClassJvmType = _typeForName;
      JvmField _createJvmField = this.typesFactory.createJvmField();
      final JvmField jvmField = _createJvmField;
      jvmField.setSimpleName("eClass");
      jvmField.setVisibility(JvmVisibility.PRIVATE);
      this.jvmModelAssociator.associatePrimary(clazz, jvmField);
      jvmField.setType(eClassJvmType);
      EList<JvmMember> _members = jvmClass.getMembers();
      CollectionExtensions.<JvmMember>operator_add(_members, jvmField);
      JvmOperation _createJvmOperation = this.typesFactory.createJvmOperation();
      final JvmOperation jvmGetter = _createJvmOperation;
      jvmGetter.setSimpleName("getEClass");
      JvmTypeReference _type_2 = jvmField.getType();
      JvmTypeReference _cloneWithProxies = EcoreUtil2.<JvmTypeReference>cloneWithProxies(_type_2);
      jvmGetter.setReturnType(_cloneWithProxies);
      jvmGetter.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmMember> _members_1 = jvmClass.getMembers();
      CollectionExtensions.<JvmMember>operator_add(_members_1, jvmGetter);
      this.jvmModelAssociator.associatePrimary(clazz, jvmGetter);
      ArrayList<JvmDeclaredType> _newArrayList = CollectionLiterals.<JvmDeclaredType>newArrayList(((JvmDeclaredType) jvmClass));
      _xblockexpression = (_newArrayList);
    }
    return _xblockexpression;
  }
  
  public Iterable<JvmDeclaredType> transform(final EObject model) {
    if ((model instanceof Diagram)) {
      return _transform((Diagram)model);
    } else if ((model instanceof MetaClass)) {
      return _transform((MetaClass)model);
    } else if ((model instanceof EObject)) {
      return _transform((EObject)model);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(model).toString());
    }
  }
}