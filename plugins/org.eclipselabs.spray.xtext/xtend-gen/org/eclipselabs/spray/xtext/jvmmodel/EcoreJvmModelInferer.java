package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EcoreJvmModelInferer implements IJvmModelInferrer {
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator jvmModelAssociator;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  private HashSet<JvmDeclaredType> types;
  
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
  
  protected Iterable<JvmDeclaredType> _transform(final EPackage ePackage) {
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    final Function1<EClassifier,Iterable<JvmDeclaredType>> _function = new Function1<EClassifier,Iterable<JvmDeclaredType>>() {
        public Iterable<JvmDeclaredType> apply(final EClassifier e) {
          Iterable<JvmDeclaredType> _transform = EcoreJvmModelInferer.this.transform(e);
          return _transform;
        }
      };
    List<Iterable<JvmDeclaredType>> _map = ListExtensions.<EClassifier, Iterable<JvmDeclaredType>>map(_eClassifiers, _function);
    Iterable<JvmDeclaredType> _flatten = IterableExtensions.<JvmDeclaredType>flatten(_map);
    return _flatten;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final EClass eClass) {
    HashSet<JvmDeclaredType> _xblockexpression = null;
    {
      HashSet<JvmDeclaredType> _newHashSet = CollectionLiterals.<JvmDeclaredType>newHashSet();
      this.types = _newHashSet;
      this.internalTransform(eClass);
      _xblockexpression = (this.types);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType internalTransform(final EClassifier eClassifier) {
    JvmGenericType _switchResult = null;
    final EClassifier eClassifier_1 = eClassifier;
    boolean matched = false;
    if (!matched) {
      if (eClassifier_1 instanceof EClass) {
        final EClass eClassifier_2 = (EClass) eClassifier_1;
        matched=true;
        JvmGenericType _internalTransform = this.internalTransform(eClassifier_2);
        _switchResult = _internalTransform;
      }
    }
    if (!matched) {
      if (eClassifier_1 instanceof EDataType) {
        final EDataType eClassifier_3 = (EDataType) eClassifier_1;
        matched=true;
        JvmGenericType _internalTransform_1 = this.internalTransform(eClassifier_3);
        _switchResult = _internalTransform_1;
      }
    }
    return _switchResult;
  }
  
  private final HashMap<ArrayList<?>,JvmGenericType> _createCache_internalTransform = new HashMap<ArrayList<?>,JvmGenericType>();
  
  public JvmGenericType internalTransform(final EClass eClass) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(eClass);
    final JvmGenericType jvmClass;
    synchronized (_createCache_internalTransform) {
      if (_createCache_internalTransform.containsKey(_cacheKey)) {
        return _createCache_internalTransform.get(_cacheKey);
      }
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      jvmClass = _createJvmGenericType;
      _createCache_internalTransform.put(_cacheKey, jvmClass);
    }
    {
      this.jvmModelAssociator.associatePrimary(eClass, jvmClass);
      CollectionExtensions.<JvmDeclaredType>operator_add(this.types, jvmClass);
      String _name = eClass.getName();
      jvmClass.setSimpleName(_name);
      QualifiedName _fullyQualifiedName = this.qualifiedNameProvider.getFullyQualifiedName(eClass);
      QualifiedName _skipLast = _fullyQualifiedName.skipLast(1);
      String _string = _skipLast.toString();
      jvmClass.setPackageName(_string);
      jvmClass.setVisibility(JvmVisibility.PUBLIC);
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      for (final EClass superType : _eSuperTypes) {
        {
          JvmGenericType _internalTransform = this.internalTransform(superType);
          final JvmGenericType jvmSuperType = _internalTransform;
          JvmParameterizedTypeReference _createJvmParameterizedTypeReference = this.typesFactory.createJvmParameterizedTypeReference();
          final JvmParameterizedTypeReference superTypeJvmTypeRef = _createJvmParameterizedTypeReference;
          superTypeJvmTypeRef.setType(jvmSuperType);
          EList<JvmTypeReference> _superTypes = jvmClass.getSuperTypes();
          CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, superTypeJvmTypeRef);
        }
      }
      EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
      for (final EStructuralFeature f : _eStructuralFeatures) {
        JvmField _transform = this.transform(f, jvmClass);
        final JvmField field = _transform;
      }
    }
    return jvmClass;
  }
  
  private final HashMap<ArrayList<?>,JvmGenericType> _createCache_internalTransform_1 = new HashMap<ArrayList<?>,JvmGenericType>();
  
  public JvmGenericType internalTransform(final EDataType eClass) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(eClass);
    final JvmGenericType jvmClass;
    synchronized (_createCache_internalTransform_1) {
      if (_createCache_internalTransform_1.containsKey(_cacheKey)) {
        return _createCache_internalTransform_1.get(_cacheKey);
      }
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      jvmClass = _createJvmGenericType;
      _createCache_internalTransform_1.put(_cacheKey, jvmClass);
    }
    {
      this.jvmModelAssociator.associatePrimary(eClass, jvmClass);
      CollectionExtensions.<JvmDeclaredType>operator_add(this.types, jvmClass);
      String _name = eClass.getName();
      jvmClass.setSimpleName(_name);
      QualifiedName _fullyQualifiedName = this.qualifiedNameProvider.getFullyQualifiedName(eClass);
      QualifiedName _skipLast = _fullyQualifiedName.skipLast(1);
      String _string = _skipLast.toString();
      jvmClass.setPackageName(_string);
      jvmClass.setVisibility(JvmVisibility.PUBLIC);
    }
    return jvmClass;
  }
  
  public JvmField transform(final EStructuralFeature property, final JvmGenericType type) {
    {
      JvmParameterizedTypeReference _createJvmParameterizedTypeReference = this.typesFactory.createJvmParameterizedTypeReference();
      final JvmParameterizedTypeReference jvmFieldTypeRef = _createJvmParameterizedTypeReference;
      JvmField _createJvmField = this.typesFactory.createJvmField();
      final JvmField jvmField = _createJvmField;
      String _name = property.getName();
      jvmField.setSimpleName(_name);
      jvmField.setVisibility(JvmVisibility.PRIVATE);
      EClassifier _eType = property.getEType();
      JvmGenericType _internalTransform = this.internalTransform(_eType);
      jvmFieldTypeRef.setType(_internalTransform);
      jvmField.setType(jvmFieldTypeRef);
      EList<JvmMember> _members = type.getMembers();
      CollectionExtensions.<JvmMember>operator_add(_members, jvmField);
      this.jvmModelAssociator.associatePrimary(property, jvmField);
      JvmOperation _createJvmOperation = this.typesFactory.createJvmOperation();
      final JvmOperation jvmGetter = _createJvmOperation;
      String _name_1 = property.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      String _operator_plus = StringExtensions.operator_plus("get", _firstUpper);
      jvmGetter.setSimpleName(_operator_plus);
      JvmTypeReference _type = jvmField.getType();
      JvmTypeReference _cloneWithProxies = EcoreUtil2.<JvmTypeReference>cloneWithProxies(_type);
      jvmGetter.setReturnType(_cloneWithProxies);
      jvmGetter.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmMember> _members_1 = type.getMembers();
      CollectionExtensions.<JvmMember>operator_add(_members_1, jvmGetter);
      this.jvmModelAssociator.associatePrimary(property, jvmGetter);
      JvmOperation _createJvmOperation_1 = this.typesFactory.createJvmOperation();
      final JvmOperation jvmSetter = _createJvmOperation_1;
      String _name_2 = property.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_1 = StringExtensions.operator_plus("set", _firstUpper_1);
      jvmSetter.setSimpleName(_operator_plus_1);
      JvmFormalParameter _createJvmFormalParameter = this.typesFactory.createJvmFormalParameter();
      final JvmFormalParameter parameter = _createJvmFormalParameter;
      String _name_3 = property.getName();
      String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
      parameter.setName(_firstUpper_2);
      JvmTypeReference _type_1 = jvmField.getType();
      JvmTypeReference _cloneWithProxies_1 = EcoreUtil2.<JvmTypeReference>cloneWithProxies(_type_1);
      parameter.setParameterType(_cloneWithProxies_1);
      jvmSetter.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmFormalParameter> _parameters = jvmSetter.getParameters();
      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, parameter);
      EList<JvmMember> _members_2 = type.getMembers();
      CollectionExtensions.<JvmMember>operator_add(_members_2, jvmSetter);
      this.jvmModelAssociator.associatePrimary(property, jvmSetter);
      return jvmField;
    }
  }
  
  public Iterable<JvmDeclaredType> transform(final EObject eClass) {
    if ((eClass instanceof EClass)) {
      return _transform((EClass)eClass);
    } else if ((eClass instanceof EPackage)) {
      return _transform((EPackage)eClass);
    } else if ((eClass instanceof EObject)) {
      return _transform((EObject)eClass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(eClass).toString());
    }
  }
}