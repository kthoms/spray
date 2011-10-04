package org.eclipselabs.spray.generator.graphiti.util;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.util.FeatureType;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.mm.spray.Behaviour;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class NamingExtensions {
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private GenModelHelper genModelHelper;
  
  public String getDiagramTypeProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _operator_plus = StringExtensions.operator_plus(_diagram_package, ".");
    String _diagramTypeProviderSimpleClassName = this.getDiagramTypeProviderSimpleClassName(diagram);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _diagramTypeProviderSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getDiagramTypeProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "DiagramTypeProvider");
    return _operator_plus;
  }
  
  public String getFeatureProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _operator_plus = StringExtensions.operator_plus(_diagram_package, ".");
    String _featureProviderSimpleClassName = this.getFeatureProviderSimpleClassName(diagram);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _featureProviderSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getFeatureProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "FeatureProvider");
    return _operator_plus;
  }
  
  public String getImageProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _operator_plus = StringExtensions.operator_plus(_diagram_package, ".");
    String _imageProviderSimpleClassName = this.getImageProviderSimpleClassName(diagram);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _imageProviderSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getImageProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "ImageProvider");
    return _operator_plus;
  }
  
  public String getToolBehaviourProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _operator_plus = StringExtensions.operator_plus(_diagram_package, ".");
    String _olBehaviourProviderSimpleClassName = this.getToolBehaviourProviderSimpleClassName(diagram);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _olBehaviourProviderSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getToolBehaviourProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "ToolBehaviourProvider");
    return _operator_plus;
  }
  
  public String getDiagramEditorClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _operator_plus = StringExtensions.operator_plus(_diagram_package, ".");
    String _diagramEditorSimpleClassName = this.getDiagramEditorSimpleClassName(diagram);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _diagramEditorSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getDiagramEditorSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, "DiagramEditor");
    return _operator_plus;
  }
  
  public String getCreateFeatureClassName(final MetaClass clazz) {
    String _featureClassName = this.getFeatureClassName(clazz, FeatureType.Create);
    return _featureClassName;
  }
  
  public String getCreateFeatureSimpleClassName(final MetaClass clazz) {
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, FeatureType.Create);
    return _featureSimpleClassName;
  }
  
  public String getAddFeatureClassName(final MetaClass clazz) {
    String _featureClassName = this.getFeatureClassName(clazz, FeatureType.Add);
    return _featureClassName;
  }
  
  public String getAddFeatureSimpleClassName(final MetaClass clazz) {
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, FeatureType.Add);
    return _featureSimpleClassName;
  }
  
  public String getUpdateFeatureClassName(final MetaClass clazz) {
    String _featureClassName = this.getFeatureClassName(clazz, FeatureType.Update);
    return _featureClassName;
  }
  
  public String getUpdateFeatureSimpleClassName(final MetaClass clazz) {
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, FeatureType.Update);
    return _featureSimpleClassName;
  }
  
  public String getLayoutFeatureClassName(final MetaClass clazz) {
    String _featureClassName = this.getFeatureClassName(clazz, FeatureType.Layout);
    return _featureClassName;
  }
  
  public String getLayoutFeatureSimpleClassName(final MetaClass clazz) {
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, FeatureType.Layout);
    return _featureSimpleClassName;
  }
  
  public String getFeatureClassName(final MetaClass clazz, final FeatureType featureType) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, featureType);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _featureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getFeatureSimpleClassName(final MetaClass clazz, final FeatureType featureType) {
    Diagram _diagram = clazz.getDiagram();
    String _name = _diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _operator_plus = StringExtensions.operator_plus(_firstUpper, featureType);
    String _visibleName = GeneratorUtil.visibleName(clazz);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _visibleName);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Feature");
    return _operator_plus_2;
  }
  
  protected String _getFilterClassName(final MetaClass clazz) {
    String _property_package = GeneratorUtil.property_package();
    String _operator_plus = StringExtensions.operator_plus(_property_package, ".");
    String _filterSimpleClassName = this.getFilterSimpleClassName(clazz);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _filterSimpleClassName);
    return _operator_plus_1;
  }
  
  protected String _getFilterSimpleClassName(final MetaClass clazz) {
    String _name = this.e1.getName(clazz);
    String _operator_plus = StringExtensions.operator_plus(_name, "Filter");
    return _operator_plus;
  }
  
  public String getCreateFeatureClassName(final MetaReference reference) {
    String _featureClassName = this.getFeatureClassName(reference, FeatureType.Create);
    return _featureClassName;
  }
  
  public String getAddFeatureClassName(final MetaReference reference) {
    String _featureClassName = this.getFeatureClassName(reference, FeatureType.Add);
    return _featureClassName;
  }
  
  public String getUpdateFeatureClassName(final MetaReference reference) {
    String _featureClassName = this.getFeatureClassName(reference, FeatureType.Update);
    return _featureClassName;
  }
  
  public String getFeatureClassName(final MetaReference reference, final FeatureType featureType) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      String _feature_package = GeneratorUtil.feature_package();
      String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _firstUpper);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, featureType);
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _firstUpper_1);
      EReference _reference = reference.getReference();
      EClass _eReferenceType = _reference.getEReferenceType();
      String _name_3 = _eReferenceType.getName();
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name_3);
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "Feature");
      _xblockexpression = (_operator_plus_6);
    }
    return _xblockexpression;
  }
  
  public String getAddReferenceAsConnectionFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _addReferenceAsConnectionFeatureSimpleClassName = this.getAddReferenceAsConnectionFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _addReferenceAsConnectionFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getAddReferenceAsConnectionFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "AddReference");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "Feature");
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _createReferenceAsListFeatureSimpleClassName = this.getCreateReferenceAsListFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _createReferenceAsListFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getCreateReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Create");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      EReference _reference = reference.getReference();
      EClass _eReferenceType = _reference.getEReferenceType();
      String _name_3 = _eReferenceType.getName();
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_3);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "Feature");
      _xblockexpression = (_operator_plus_4);
    }
    return _xblockexpression;
  }
  
  public String getUpdateReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _updateReferenceAsListFeatureSimpleClassName = this.getUpdateReferenceAsListFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _updateReferenceAsListFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getUpdateReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Update");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "Feature");
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsListFeatureClassName(final MetaReference reference, final EClass subClass) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _createReferenceAsListFeatureSimpleClassName = this.getCreateReferenceAsListFeatureSimpleClassName(reference, subClass);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _createReferenceAsListFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getCreateReferenceAsListFeatureSimpleClassName(final MetaReference reference, final EClass subClass) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Create");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _name_3 = subClass.getName();
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_3);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "Feature");
      _xblockexpression = (_operator_plus_4);
    }
    return _xblockexpression;
  }
  
  public String getAddReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _addReferenceAsListFeatureSimpleClassName = this.getAddReferenceAsListFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _addReferenceAsListFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getAddReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Add");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "ListFeature");
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsConnectionFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _createReferenceAsConnectionFeatureSimpleClassName = this.getCreateReferenceAsConnectionFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _createReferenceAsConnectionFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getCreateReferenceAsConnectionFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Create");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "Feature");
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String getDeleteReferenceFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _deleteReferenceFeatureSimpleClassName = this.getDeleteReferenceFeatureSimpleClassName(reference);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _deleteReferenceFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getDeleteReferenceFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass cls = _containerOfType;
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "DeleteReference");
      String _name_1 = this.e1.getName(cls);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
      String _name_2 = this.e1.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _firstUpper_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "Feature");
      _xblockexpression = (_operator_plus_3);
    }
    return _xblockexpression;
  }
  
  public String getCustomFeatureClassName(final Behaviour behaviour) {
    String _feature_package = GeneratorUtil.feature_package();
    String _operator_plus = StringExtensions.operator_plus(_feature_package, ".");
    String _customFeatureSimpleClassName = this.getCustomFeatureSimpleClassName(behaviour);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _customFeatureSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getCustomFeatureSimpleClassName(final Behaviour behaviour) {
    String _xblockexpression = null;
    {
      Diagram _containerOfType = EcoreUtil2.<Diagram>getContainerOfType(behaviour, org.eclipselabs.spray.mm.spray.Diagram.class);
      final Diagram diagram = _containerOfType;
      String _name = diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Custom");
      String _name_1 = behaviour.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _firstUpper_1);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Feature");
      _xblockexpression = (_operator_plus_2);
    }
    return _xblockexpression;
  }
  
  protected String _getFilterClassName(final EClass clazz) {
    String _property_package = GeneratorUtil.property_package();
    String _operator_plus = StringExtensions.operator_plus(_property_package, ".");
    String _filterSimpleClassName = this.getFilterSimpleClassName(clazz);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _filterSimpleClassName);
    return _operator_plus_1;
  }
  
  protected String _getFilterSimpleClassName(final EClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Filter");
    return _operator_plus;
  }
  
  public String getPropertySectionClassName(final EAttribute attribute) {
    String _property_package = GeneratorUtil.property_package();
    String _operator_plus = StringExtensions.operator_plus(_property_package, ".");
    String _propertySectionSimpleClassName = this.getPropertySectionSimpleClassName(attribute);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _propertySectionSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getPropertySectionSimpleClassName(final EAttribute attribute) {
    EClass _eContainingClass = attribute.getEContainingClass();
    String _name = _eContainingClass.getName();
    String _name_1 = attribute.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _operator_plus = StringExtensions.operator_plus(_name, _firstUpper);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "Section");
    return _operator_plus_1;
  }
  
  public String getPropertySectionClassName(final EClass clazz, final EAttribute attribute) {
    String _property_package = GeneratorUtil.property_package();
    String _operator_plus = StringExtensions.operator_plus(_property_package, ".");
    String _propertySectionSimpleClassName = this.getPropertySectionSimpleClassName(clazz, attribute);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _propertySectionSimpleClassName);
    return _operator_plus_1;
  }
  
  public String getPropertySectionSimpleClassName(final EClass clazz, final EAttribute attribute) {
    String _name = clazz.getName();
    String _name_1 = attribute.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _operator_plus = StringExtensions.operator_plus(_name, _firstUpper);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "Section");
    return _operator_plus_1;
  }
  
  public String getJavaInterfaceName(final EClass eClass) {
    String _javaInterfaceName = this.genModelHelper.getJavaInterfaceName(eClass);
    return _javaInterfaceName;
  }
  
  public String getJavaInterfaceName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    String _javaInterfaceName = this.genModelHelper.getJavaInterfaceName(_type);
    return _javaInterfaceName;
  }
  
  public String getEPackageClassName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    String _ePackageClassName = this.genModelHelper.getEPackageClassName(_type);
    return _ePackageClassName;
  }
  
  public String getEPackageClassName(final EClass eClass) {
    String _ePackageClassName = this.genModelHelper.getEPackageClassName(eClass);
    return _ePackageClassName;
  }
  
  public String getLiteralConstant(final EClass eClass) {
    String _literalConstant = this.genModelHelper.getLiteralConstant(eClass);
    return _literalConstant;
  }
  
  public String getLiteralConstant(final MetaClass clazz) {
    EClass _type = clazz.getType();
    String _literalConstant = this.genModelHelper.getLiteralConstant(_type);
    return _literalConstant;
  }
  
  public String getEFactoryInterfaceName(final EClass clazz) {
    String _eFactoryInterfaceName = this.genModelHelper.getEFactoryInterfaceName(clazz);
    return _eFactoryInterfaceName;
  }
  
  public String getEFactoryInterfaceName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    String _eFactoryInterfaceName = this.genModelHelper.getEFactoryInterfaceName(_type);
    return _eFactoryInterfaceName;
  }
  
  public String getDiagramName(final MetaClass clazz) {
    Diagram _diagram = clazz.getDiagram();
    String _name = _diagram.getName();
    return _name;
  }
  
  public String getImageIdentifier(final Diagram diagram, final String imagePath) {
    {
      boolean _operator_equals = ObjectExtensions.operator_equals(imagePath, null);
      if (_operator_equals) {
        return null;
      }
      String _name = diagram.getName();
      String _upperCase = _name.toUpperCase();
      String _operator_plus = StringExtensions.operator_plus(_upperCase, "_");
      int _lastIndexOf = imagePath.lastIndexOf(".");
      String _substring = imagePath.substring(0, _lastIndexOf);
      String _replaceAll = _substring.replaceAll("\\W", "_");
      String _upperCase_1 = _replaceAll.toUpperCase();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _upperCase_1);
      return _operator_plus_1;
    }
  }
  
  public String getImageBaseName(final String imagePath) {
    {
      boolean _operator_equals = ObjectExtensions.operator_equals(imagePath, null);
      if (_operator_equals) {
        return null;
      }
      int _lastIndexOf = imagePath.lastIndexOf(".");
      String _substring = imagePath.substring(0, _lastIndexOf);
      String _replaceAll = _substring.replaceAll("\\W", "_");
      String _lowerCase = _replaceAll.toLowerCase();
      return _lowerCase;
    }
  }
  
  public String getFilterClassName(final EObject clazz) {
    if ((clazz instanceof EClass)) {
      return _getFilterClassName((EClass)clazz);
    } else if ((clazz instanceof MetaClass)) {
      return _getFilterClassName((MetaClass)clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(clazz).toString());
    }
  }
  
  public String getFilterSimpleClassName(final EObject clazz) {
    if ((clazz instanceof EClass)) {
      return _getFilterSimpleClassName((EClass)clazz);
    } else if ((clazz instanceof MetaClass)) {
      return _getFilterSimpleClassName((MetaClass)clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(clazz).toString());
    }
  }
}