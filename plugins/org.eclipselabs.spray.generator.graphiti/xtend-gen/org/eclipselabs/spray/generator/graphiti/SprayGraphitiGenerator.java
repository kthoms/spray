package org.eclipselabs.spray.generator.graphiti;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.AddConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.AddReferenceAsConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.AddReferenceAsListFeature;
import org.eclipselabs.spray.generator.graphiti.templates.AddShapeFeature;
import org.eclipselabs.spray.generator.graphiti.templates.CreateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.CreateReferenceAsConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.CreateReferenceAsListFeature;
import org.eclipselabs.spray.generator.graphiti.templates.CreateShapeFeature;
import org.eclipselabs.spray.generator.graphiti.templates.CustomFeature;
import org.eclipselabs.spray.generator.graphiti.templates.DeleteReferenceFeature;
import org.eclipselabs.spray.generator.graphiti.templates.DiagramTypeProvider;
import org.eclipselabs.spray.generator.graphiti.templates.FeatureProvider;
import org.eclipselabs.spray.generator.graphiti.templates.Filter;
import org.eclipselabs.spray.generator.graphiti.templates.ImageProvider;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.templates.LayoutFeature;
import org.eclipselabs.spray.generator.graphiti.templates.Plugin;
import org.eclipselabs.spray.generator.graphiti.templates.PropertySection;
import org.eclipselabs.spray.generator.graphiti.templates.ToolBehaviourProvider;
import org.eclipselabs.spray.generator.graphiti.templates.UpdateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.UpdateReferenceAsListFeature;
import org.eclipselabs.spray.generator.graphiti.templates.UpdateShapeFeature;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.util.StringHelpers;
import org.eclipselabs.spray.mm.spray.Behaviour;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class SprayGraphitiGenerator implements IGenerator {
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private NamingExtensions naming;
  
  @Inject
  private Plugin plugin;
  
  @Inject
  private DiagramTypeProvider dtp;
  
  @Inject
  private FeatureProvider fp;
  
  @Inject
  private AddShapeFeature addShapeFeature;
  
  @Inject
  private AddConnectionFeature addConnectionFeature;
  
  @Inject
  private AddReferenceAsConnectionFeature addReferenceAsConnectionFeature;
  
  @Inject
  private AddReferenceAsListFeature addReferenceAsListFeature;
  
  @Inject
  private CreateConnectionFeature createConnectionFeature;
  
  @Inject
  private CreateShapeFeature createShapeFeature;
  
  @Inject
  private CreateReferenceAsListFeature createReferenceAsListFeature;
  
  @Inject
  private CreateReferenceAsListFeature createReferenceAsListFeature_1;
  
  @Inject
  private CreateReferenceAsListFeature createReferenceAsListFeature_2;
  
  @Inject
  private CreateReferenceAsConnectionFeature createReferenceAsConnectionFeature;
  
  @Inject
  private UpdateConnectionFeature updateConnectionFeature;
  
  @Inject
  private LayoutFeature layoutFeature;
  
  @Inject
  private UpdateShapeFeature updateShapeFeature;
  
  @Inject
  private UpdateReferenceAsListFeature updateReferenceAsListFeature;
  
  @Inject
  private DeleteReferenceFeature deleteReferenceFeature;
  
  @Inject
  private ImageProvider imageProvider;
  
  @Inject
  private ToolBehaviourProvider toolBehaviourProvider;
  
  @Inject
  private PropertySection propertySection;
  
  @Inject
  private Filter filter;
  
  @Inject
  private Filter filter2;
  
  @Inject
  private CustomFeature customFeature;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    {
      JavaIoFileSystemAccess javaFsa = null;
      EclipseResourceFileSystemAccess eclipseFsa = null;
      URI _uRI = resource.getURI();
      String _devicePath = _uRI.devicePath();
      String modelPath = _devicePath;
      String _replaceLastSubstring = StringHelpers.replaceLastSubstring(modelPath, "spray", "properties");
      String propertiesPath = _replaceLastSubstring;
      URI _uRI_1 = resource.getURI();
      ProjectProperties.setModelUri(_uRI_1);
      String _projectPath = ProjectProperties.getProjectPath();
      String _operator_plus = StringExtensions.operator_plus(_projectPath, "/");
      String _srcGenPath = ProjectProperties.getSrcGenPath();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _srcGenPath);
      String genOutputPath = _operator_plus_1;
      String _projectPath_1 = ProjectProperties.getProjectPath();
      String _operator_plus_2 = StringExtensions.operator_plus(_projectPath_1, "/");
      String _srcManPath = ProjectProperties.getSrcManPath();
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _srcManPath);
      String manOutputPath = _operator_plus_3;
      if ((fsa instanceof org.eclipse.xtext.generator.JavaIoFileSystemAccess)) {
        javaFsa = ((JavaIoFileSystemAccess) fsa);
      }
      if ((fsa instanceof org.eclipse.xtext.builder.EclipseResourceFileSystemAccess)) {
        {
          InputOutput.<String>println("EclipseResourceFileSystemAccess: WARNING: dos not work yet");
          eclipseFsa = ((EclipseResourceFileSystemAccess) fsa);
        }
      }
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      Diagram diagram = ((Diagram) _head);
      StringConcatenation _generate = this.plugin.generate(diagram);
      fsa.generateFile("plugin.xml", _generate);
      JavaGenFile java = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(javaFsa, null);
      if (_operator_notEquals) {
        {
          JavaGenFile _javaGenFile = new JavaGenFile(javaFsa);
          java = _javaGenFile;
          java.setGenOutputPath(genOutputPath);
          java.setManOutputPath(manOutputPath);
        }
      } else {
        JavaGenFile _javaGenFile_1 = new JavaGenFile(eclipseFsa);
        java = _javaGenFile_1;
      }
      java.hasExtensionPoint = true;
      String _diagram_package = GeneratorUtil.diagram_package();
      String _diagramTypeProviderSimpleClassName = this.naming.getDiagramTypeProviderSimpleClassName(diagram);
      java.setPackageAndClass(_diagram_package, _diagramTypeProviderSimpleClassName);
      this.dtp.generate(diagram, java);
      String _diagram_package_1 = GeneratorUtil.diagram_package();
      String _featureProviderSimpleClassName = this.naming.getFeatureProviderSimpleClassName(diagram);
      java.setPackageAndClass(_diagram_package_1, _featureProviderSimpleClassName);
      this.fp.generate(diagram, java);
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy = m.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof org.eclipselabs.spray.mm.spray.Container));
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      for (final MetaClass metaClass : _filter) {
        {
          Shape _representedBy_1 = metaClass.getRepresentedBy();
          Container container = ((Container) _representedBy_1);
          String _feature_package = GeneratorUtil.feature_package();
          String _addFeatureSimpleClassName = this.naming.getAddFeatureSimpleClassName(metaClass);
          java.setPackageAndClass(_feature_package, _addFeatureSimpleClassName);
          this.addShapeFeature.generate(container, java);
        }
      }
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_1 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_1) {
            Shape _representedBy_2 = m_1.getRepresentedBy();
            return ((Boolean)(_representedBy_2 instanceof org.eclipselabs.spray.mm.spray.Connection));
          }
        };
      Iterable<MetaClass> _filter_1 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_1);
      for (final MetaClass metaClass_1 : _filter_1) {
        {
          Shape _representedBy_3 = metaClass_1.getRepresentedBy();
          Connection connection = ((Connection) _representedBy_3);
          String _feature_package_1 = GeneratorUtil.feature_package();
          String _addFeatureSimpleClassName_1 = this.naming.getAddFeatureSimpleClassName(metaClass_1);
          java.setPackageAndClass(_feature_package_1, _addFeatureSimpleClassName_1);
          this.addConnectionFeature.generate(metaClass_1, java);
        }
      }
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      for (final MetaClass metaClass_2 : _metaClasses_2) {
        MetaReference[] _references = metaClass_2.getReferences();
        final Function1<MetaReference,Boolean> _function_2 = new Function1<MetaReference,Boolean>() {
            public Boolean apply(final MetaReference ref) {
              Connection _representedBy_4 = ref.getRepresentedBy();
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_representedBy_4, null);
              return ((Boolean)_operator_notEquals_1);
            }
          };
        Iterable<MetaReference> _filter_2 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function_2);
        for (final MetaReference reference : _filter_2) {
          {
            String _feature_package_2 = GeneratorUtil.feature_package();
            String _addReferenceAsConnectionFeatureSimpleClassName = this.naming.getAddReferenceAsConnectionFeatureSimpleClassName(reference);
            java.setPackageAndClass(_feature_package_2, _addReferenceAsConnectionFeatureSimpleClassName);
            this.addReferenceAsConnectionFeature.generate(reference, java);
          }
        }
      }
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      for (final MetaClass metaClass_3 : _metaClasses_3) {
        Shape _representedBy_5 = metaClass_3.getRepresentedBy();
        if ((_representedBy_5 instanceof org.eclipselabs.spray.mm.spray.Container)) {
          {
            Shape _representedBy_6 = metaClass_3.getRepresentedBy();
            Container container_1 = ((Container) _representedBy_6);
            SprayElement[] _parts = container_1.getParts();
            Iterable<MetaReference> _filter_3 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
            for (final MetaReference metaRef : _filter_3) {
              {
                String _feature_package_3 = GeneratorUtil.feature_package();
                String _addReferenceAsListFeatureSimpleClassName = this.naming.getAddReferenceAsListFeatureSimpleClassName(metaRef);
                java.setPackageAndClass(_feature_package_3, _addReferenceAsListFeatureSimpleClassName);
                this.addReferenceAsListFeature.generate(metaRef, java);
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_4 = diagram.getMetaClasses();
      for (final MetaClass metaClass_4 : _metaClasses_4) {
        Shape _representedBy_7 = metaClass_4.getRepresentedBy();
        if ((_representedBy_7 instanceof org.eclipselabs.spray.mm.spray.Connection)) {
          {
            String _feature_package_4 = GeneratorUtil.feature_package();
            String _createFeatureSimpleClassName = this.naming.getCreateFeatureSimpleClassName(metaClass_4);
            java.setPackageAndClass(_feature_package_4, _createFeatureSimpleClassName);
            this.createConnectionFeature.generate(metaClass_4, java);
          }
        } else {
          {
            String _feature_package_5 = GeneratorUtil.feature_package();
            String _createFeatureSimpleClassName_1 = this.naming.getCreateFeatureSimpleClassName(metaClass_4);
            java.setPackageAndClass(_feature_package_5, _createFeatureSimpleClassName_1);
            this.createShapeFeature.generate(metaClass_4, java);
          }
        }
      }
      MetaClass[] _metaClasses_5 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_3 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_2) {
            Shape _representedBy_8 = m_2.getRepresentedBy();
            boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_representedBy_8, null);
            return ((Boolean)_operator_notEquals_2);
          }
        };
      Iterable<MetaClass> _filter_4 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_5)), _function_3);
      final Function1<MetaClass,Shape> _function_4 = new Function1<MetaClass,Shape>() {
          public Shape apply(final MetaClass m_3) {
            Shape _representedBy_9 = m_3.getRepresentedBy();
            return _representedBy_9;
          }
        };
      Iterable<Shape> _map = IterableExtensions.<MetaClass, Shape>map(_filter_4, _function_4);
      Iterable<Container> _filter_5 = IterableExtensions.<Container>filter(_map, org.eclipselabs.spray.mm.spray.Container.class);
      final Function1<Container,Iterable<MetaReference>> _function_5 = new Function1<Container,Iterable<MetaReference>>() {
          public Iterable<MetaReference> apply(final Container c) {
            SprayElement[] _parts_1 = ((Container) c).getParts();
            Iterable<MetaReference> _filter_6 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.eclipselabs.spray.mm.spray.MetaReference.class);
            return _filter_6;
          }
        };
      Iterable<Iterable<MetaReference>> _map_1 = IterableExtensions.<Container, Iterable<MetaReference>>map(_filter_5, _function_5);
      Iterable<MetaReference> _flatten = IterableExtensions.<MetaReference>flatten(_map_1);
      for (final MetaReference reference_1 : _flatten) {
        {
          String _name = this.e1.getName(reference_1);
          final String referenceName = _name;
          EObject _eContainer = reference_1.eContainer();
          MetaClass _represents = ((Container) _eContainer).getRepresents();
          MetaClass metaClass_5 = _represents;
          EClass _type = metaClass_5.getType();
          EList<EReference> _eAllReferences = _type.getEAllReferences();
          final Function1<EReference,Boolean> _function_6 = new Function1<EReference,Boolean>() {
              public Boolean apply(final EReference e) {
                String _name_1 = e.getName();
                boolean _operator_equals = ObjectExtensions.operator_equals(_name_1, referenceName);
                return ((Boolean)_operator_equals);
              }
            };
          EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_6);
          EReference target = _findFirst;
          EClass _eReferenceType = target.getEReferenceType();
          EClass targetType = _eReferenceType;
          boolean _isAbstract = targetType.isAbstract();
          boolean _operator_not = BooleanExtensions.operator_not(_isAbstract);
          if (_operator_not) {
            {
              String _name_2 = targetType.getName();
              String _operator_plus_4 = StringExtensions.operator_plus("NOT ABSTRACT: ", _name_2);
              InputOutput.<String>println(_operator_plus_4);
              String _feature_package_6 = GeneratorUtil.feature_package();
              String _createReferenceAsListFeatureSimpleClassName = this.naming.getCreateReferenceAsListFeatureSimpleClassName(reference_1);
              java.setPackageAndClass(_feature_package_6, _createReferenceAsListFeatureSimpleClassName);
              this.createReferenceAsListFeature.setTarget(targetType);
              this.createReferenceAsListFeature.generate(reference_1, java);
            }
          } else {
            String _name_3 = targetType.getName();
            String _operator_plus_5 = StringExtensions.operator_plus("ABSTRACT: ", _name_3);
            InputOutput.<String>println(_operator_plus_5);
          }
          List<EClass> _subclasses = MetaModel.getSubclasses(targetType);
          for (final EClass subclass : _subclasses) {
            boolean _isAbstract_1 = subclass.isAbstract();
            boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
            if (_operator_not_1) {
              {
                String _name_4 = subclass.getName();
                String _operator_plus_6 = StringExtensions.operator_plus("NOT ABSTRACT subclass: ", _name_4);
                InputOutput.<String>println(_operator_plus_6);
                String _feature_package_7 = GeneratorUtil.feature_package();
                String _createReferenceAsListFeatureSimpleClassName_1 = this.naming.getCreateReferenceAsListFeatureSimpleClassName(reference_1, subclass);
                java.setPackageAndClass(_feature_package_7, _createReferenceAsListFeatureSimpleClassName_1);
                this.createReferenceAsListFeature.setTarget(subclass);
                this.createReferenceAsListFeature.generate(reference_1, java);
              }
            } else {
              {
                String _name_5 = subclass.getName();
                String _operator_plus_7 = StringExtensions.operator_plus("ABSTRACT subclass: ", _name_5);
                InputOutput.<String>println(_operator_plus_7);
                String _feature_package_8 = GeneratorUtil.feature_package();
                String _createReferenceAsListFeatureSimpleClassName_2 = this.naming.getCreateReferenceAsListFeatureSimpleClassName(reference_1, subclass);
                java.setPackageAndClass(_feature_package_8, _createReferenceAsListFeatureSimpleClassName_2);
                this.createReferenceAsListFeature.setTarget(subclass);
                this.createReferenceAsListFeature.generate(reference_1, java);
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_6 = diagram.getMetaClasses();
      for (final MetaClass metaClass_6 : _metaClasses_6) {
        MetaReference[] _references_1 = metaClass_6.getReferences();
        final Function1<MetaReference,Boolean> _function_7 = new Function1<MetaReference,Boolean>() {
            public Boolean apply(final MetaReference ref_1) {
              Connection _representedBy_10 = ref_1.getRepresentedBy();
              boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_representedBy_10, null);
              return ((Boolean)_operator_notEquals_3);
            }
          };
        Iterable<MetaReference> _filter_7 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_1)), _function_7);
        for (final MetaReference reference_2 : _filter_7) {
          {
            String _feature_package_9 = GeneratorUtil.feature_package();
            String _createReferenceAsConnectionFeatureSimpleClassName = this.naming.getCreateReferenceAsConnectionFeatureSimpleClassName(reference_2);
            java.setPackageAndClass(_feature_package_9, _createReferenceAsConnectionFeatureSimpleClassName);
            this.createReferenceAsConnectionFeature.generate(reference_2, java);
          }
        }
      }
      MetaClass[] _metaClasses_7 = diagram.getMetaClasses();
      for (final MetaClass metaClass_7 : _metaClasses_7) {
        Shape _representedBy_11 = metaClass_7.getRepresentedBy();
        if ((_representedBy_11 instanceof org.eclipselabs.spray.mm.spray.Connection)) {
          {
            String _feature_package_10 = GeneratorUtil.feature_package();
            String _updateFeatureSimpleClassName = this.naming.getUpdateFeatureSimpleClassName(metaClass_7);
            java.setPackageAndClass(_feature_package_10, _updateFeatureSimpleClassName);
            Shape _representedBy_12 = metaClass_7.getRepresentedBy();
            this.updateConnectionFeature.generate(_representedBy_12, java);
          }
        } else {
          Shape _representedBy_13 = metaClass_7.getRepresentedBy();
          if ((_representedBy_13 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            {
              String _feature_package_11 = GeneratorUtil.feature_package();
              String _layoutFeatureSimpleClassName = this.naming.getLayoutFeatureSimpleClassName(metaClass_7);
              java.setPackageAndClass(_feature_package_11, _layoutFeatureSimpleClassName);
              Shape _representedBy_14 = metaClass_7.getRepresentedBy();
              this.layoutFeature.generate(_representedBy_14, java);
              String _feature_package_12 = GeneratorUtil.feature_package();
              String _updateFeatureSimpleClassName_1 = this.naming.getUpdateFeatureSimpleClassName(metaClass_7);
              java.setPackageAndClass(_feature_package_12, _updateFeatureSimpleClassName_1);
              Shape _representedBy_15 = metaClass_7.getRepresentedBy();
              this.updateShapeFeature.generate(_representedBy_15, java);
              Shape _representedBy_16 = metaClass_7.getRepresentedBy();
              Container container_2 = ((Container) _representedBy_16);
              SprayElement[] _parts_2 = container_2.getParts();
              final Function1<SprayElement,Boolean> _function_8 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p) {
                    return ((Boolean)(p instanceof org.eclipselabs.spray.mm.spray.MetaReference));
                  }
                };
              Iterable<SprayElement> _filter_8 = IterableExtensions.<SprayElement>filter(((Iterable<SprayElement>)Conversions.doWrapArray(_parts_2)), _function_8);
              final Function1<SprayElement,MetaReference> _function_9 = new Function1<SprayElement,MetaReference>() {
                  public MetaReference apply(final SprayElement p_1) {
                    return ((MetaReference) p_1);
                  }
                };
              Iterable<MetaReference> _map_2 = IterableExtensions.<SprayElement, MetaReference>map(_filter_8, _function_9);
              for (final MetaReference reference_3 : _map_2) {
                {
                  String _name_6 = this.e1.getName(reference_3);
                  final String referenceName_1 = _name_6;
                  EClass _type_1 = metaClass_7.getType();
                  EList<EReference> _eAllReferences_1 = _type_1.getEAllReferences();
                  final Function1<EReference,Boolean> _function_10 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference e_1) {
                        String _name_7 = e_1.getName();
                        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_7, referenceName_1);
                        return ((Boolean)_operator_equals_1);
                      }
                    };
                  EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_10);
                  EClass _eReferenceType_1 = _findFirst_1.getEReferenceType();
                  EClass eClass = _eReferenceType_1;
                  this.updateReferenceAsListFeature.setTarget(eClass);
                  String _feature_package_13 = GeneratorUtil.feature_package();
                  String _updateReferenceAsListFeatureSimpleClassName = this.naming.getUpdateReferenceAsListFeatureSimpleClassName(reference_3);
                  java.setPackageAndClass(_feature_package_13, _updateReferenceAsListFeatureSimpleClassName);
                  this.updateReferenceAsListFeature.generate(reference_3, java);
                }
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_8 = diagram.getMetaClasses();
      for (final MetaClass metaClass_8 : _metaClasses_8) {
        MetaReference[] _references_2 = metaClass_8.getReferences();
        for (final MetaReference reference_4 : _references_2) {
          {
            String _feature_package_14 = GeneratorUtil.feature_package();
            String _deleteReferenceFeatureSimpleClassName = this.naming.getDeleteReferenceFeatureSimpleClassName(reference_4);
            java.setPackageAndClass(_feature_package_14, _deleteReferenceFeatureSimpleClassName);
            this.deleteReferenceFeature.generate(reference_4, java);
          }
        }
      }
      String _diagram_package_2 = GeneratorUtil.diagram_package();
      String _imageProviderSimpleClassName = this.naming.getImageProviderSimpleClassName(diagram);
      java.setPackageAndClass(_diagram_package_2, _imageProviderSimpleClassName);
      this.imageProvider.generate(diagram, java);
      String _diagram_package_3 = GeneratorUtil.diagram_package();
      String _olBehaviourProviderSimpleClassName = this.naming.getToolBehaviourProviderSimpleClassName(diagram);
      java.setPackageAndClass(_diagram_package_3, _olBehaviourProviderSimpleClassName);
      this.toolBehaviourProvider.generate(diagram, java);
      MetaClass[] _metaClasses_9 = diagram.getMetaClasses();
      for (final MetaClass metaClass_9 : _metaClasses_9) {
        {
          EClass _type_2 = metaClass_9.getType();
          final EClass eClass1 = _type_2;
          EList<EAttribute> _eAllAttributes = eClass1.getEAllAttributes();
          for (final EAttribute attribute : _eAllAttributes) {
            {
              String _property_package = GeneratorUtil.property_package();
              String _propertySectionSimpleClassName = this.naming.getPropertySectionSimpleClassName(eClass1, attribute);
              java.setPackageAndClass(_property_package, _propertySectionSimpleClassName);
              this.propertySection.setDiagram(diagram);
              this.propertySection.generate(attribute, java);
            }
          }
          Shape _representedBy_17 = metaClass_9.getRepresentedBy();
          if ((_representedBy_17 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            {
              Shape _representedBy_18 = metaClass_9.getRepresentedBy();
              final Container container_3 = ((Container) _representedBy_18);
              SprayElement[] _parts_3 = container_3.getParts();
              final Function1<SprayElement,Boolean> _function_11 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p_2) {
                    return ((Boolean)(p_2 instanceof org.eclipselabs.spray.mm.spray.MetaReference));
                  }
                };
              Iterable<SprayElement> _filter_9 = IterableExtensions.<SprayElement>filter(((Iterable<SprayElement>)Conversions.doWrapArray(_parts_3)), _function_11);
              final Function1<SprayElement,MetaReference> _function_12 = new Function1<SprayElement,MetaReference>() {
                  public MetaReference apply(final SprayElement p_3) {
                    return ((MetaReference) p_3);
                  }
                };
              Iterable<MetaReference> _map_3 = IterableExtensions.<SprayElement, MetaReference>map(_filter_9, _function_12);
              for (final MetaReference reference_5 : _map_3) {
                {
                  String _name_8 = this.e1.getName(reference_5);
                  final String referenceName_2 = _name_8;
                  EClass _type_3 = metaClass_9.getType();
                  EList<EReference> _eAllReferences_2 = _type_3.getEAllReferences();
                  final Function1<EReference,Boolean> _function_13 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference r) {
                        String _name_9 = r.getName();
                        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_9, referenceName_2);
                        return ((Boolean)_operator_equals_2);
                      }
                    };
                  EReference _findFirst_2 = IterableExtensions.<EReference>findFirst(_eAllReferences_2, _function_13);
                  EClass _eReferenceType_2 = _findFirst_2.getEReferenceType();
                  EClass eClass_1 = _eReferenceType_2;
                  EList<EAttribute> _eAllAttributes_1 = eClass_1.getEAllAttributes();
                  for (final EAttribute attribute_1 : _eAllAttributes_1) {
                    {
                      String _property_package_1 = GeneratorUtil.property_package();
                      String _propertySectionSimpleClassName_1 = this.naming.getPropertySectionSimpleClassName(eClass_1, attribute_1);
                      java.setPackageAndClass(_property_package_1, _propertySectionSimpleClassName_1);
                      this.propertySection.setDiagram(diagram);
                      this.propertySection.generate(attribute_1, java);
                    }
                  }
                }
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_10 = diagram.getMetaClasses();
      for (final MetaClass metaClass_10 : _metaClasses_10) {
        {
          this.filter.setDiagram(diagram);
          String _property_package_2 = GeneratorUtil.property_package();
          String _filterSimpleClassName = this.naming.getFilterSimpleClassName(metaClass_10);
          java.setPackageAndClass(_property_package_2, _filterSimpleClassName);
          EClass _type_4 = metaClass_10.getType();
          this.filter.generate(_type_4, java);
          Shape _representedBy_19 = metaClass_10.getRepresentedBy();
          if ((_representedBy_19 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            {
              Shape _representedBy_20 = metaClass_10.getRepresentedBy();
              final Container container_4 = ((Container) _representedBy_20);
              SprayElement[] _parts_4 = container_4.getParts();
              final Function1<SprayElement,Boolean> _function_14 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p_4) {
                    return ((Boolean)(p_4 instanceof org.eclipselabs.spray.mm.spray.MetaReference));
                  }
                };
              Iterable<SprayElement> _filter_10 = IterableExtensions.<SprayElement>filter(((Iterable<SprayElement>)Conversions.doWrapArray(_parts_4)), _function_14);
              final Function1<SprayElement,MetaReference> _function_15 = new Function1<SprayElement,MetaReference>() {
                  public MetaReference apply(final SprayElement p_5) {
                    return ((MetaReference) p_5);
                  }
                };
              Iterable<MetaReference> _map_4 = IterableExtensions.<SprayElement, MetaReference>map(_filter_10, _function_15);
              for (final MetaReference reference_6 : _map_4) {
                {
                  String _name_10 = this.e1.getName(reference_6);
                  final String referenceName_3 = _name_10;
                  EClass _type_5 = metaClass_10.getType();
                  EList<EReference> _eAllReferences_3 = _type_5.getEAllReferences();
                  final Function1<EReference,Boolean> _function_16 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference ref_2) {
                        String _name_11 = ref_2.getName();
                        boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_11, referenceName_3);
                        return ((Boolean)_operator_equals_3);
                      }
                    };
                  EReference _findFirst_3 = IterableExtensions.<EReference>findFirst(_eAllReferences_3, _function_16);
                  EClass _eReferenceType_3 = _findFirst_3.getEReferenceType();
                  final EClass eClass_2 = _eReferenceType_3;
                  this.filter2.setDiagram(diagram);
                  String _property_package_3 = GeneratorUtil.property_package();
                  String _filterSimpleClassName_1 = this.naming.getFilterSimpleClassName(eClass_2);
                  java.setPackageAndClass(_property_package_3, _filterSimpleClassName_1);
                  this.filter2.generate(eClass_2, java);
                }
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_11 = diagram.getMetaClasses();
      for (final MetaClass metaClass_11 : _metaClasses_11) {
        Behaviour[] _behaviours = metaClass_11.getBehaviours();
        for (final Behaviour behaviour : _behaviours) {
          {
            String _feature_package_15 = GeneratorUtil.feature_package();
            String _customFeatureSimpleClassName = this.naming.getCustomFeatureSimpleClassName(behaviour);
            java.setPackageAndClass(_feature_package_15, _customFeatureSimpleClassName);
            this.customFeature.generate(behaviour, java);
          }
        }
      }
    }
  }
}