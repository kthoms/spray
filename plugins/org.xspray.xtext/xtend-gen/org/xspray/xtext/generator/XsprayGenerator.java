package org.xspray.xtext.generator;

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
import org.xspray.generator.graphiti.templates.AddConnectionFeature;
import org.xspray.generator.graphiti.templates.AddReferenceAsConnectionFeature;
import org.xspray.generator.graphiti.templates.AddReferenceAsListFeature;
import org.xspray.generator.graphiti.templates.AddShapeFeature;
import org.xspray.generator.graphiti.templates.CreateConnectionFeature;
import org.xspray.generator.graphiti.templates.CreateReferenceAsConnectionFeature;
import org.xspray.generator.graphiti.templates.CreateReferenceAsListFeature;
import org.xspray.generator.graphiti.templates.CreateShapeFeature;
import org.xspray.generator.graphiti.templates.CustomFeature;
import org.xspray.generator.graphiti.templates.DeleteReferenceFeature;
import org.xspray.generator.graphiti.templates.DiagramTypeProvider;
import org.xspray.generator.graphiti.templates.FeatureProvider;
import org.xspray.generator.graphiti.templates.Filter;
import org.xspray.generator.graphiti.templates.ImageProvider;
import org.xspray.generator.graphiti.templates.JavaGenFile;
import org.xspray.generator.graphiti.templates.LayoutFeature;
import org.xspray.generator.graphiti.templates.Plugin;
import org.xspray.generator.graphiti.templates.PropertySection;
import org.xspray.generator.graphiti.templates.ToolBehaviourProvider;
import org.xspray.generator.graphiti.templates.UpdateConnectionFeature;
import org.xspray.generator.graphiti.templates.UpdateReferenceAsListFeature;
import org.xspray.generator.graphiti.templates.UpdateShapeFeature;
import org.xspray.generator.graphiti.util.GeneratorUtil;
import org.xspray.generator.graphiti.util.MetaModel;
import org.xspray.generator.graphiti.util.ProjectProperties;
import org.xspray.generator.graphiti.util.StringHelpers;
import org.xspray.mm.xspray.Behaviour;
import org.xspray.mm.xspray.Connection;
import org.xspray.mm.xspray.Container;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;
import org.xspray.mm.xspray.Shape;
import org.xspray.mm.xspray.SprayElement;

@SuppressWarnings("all")
public class XsprayGenerator implements IGenerator {
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    {
      JavaIoFileSystemAccess javaFsa = null;
      EclipseResourceFileSystemAccess eclipseFsa = null;
      URI _uRI = resource.getURI();
      String _devicePath = _uRI.devicePath();
      String modelPath = _devicePath;
      String _replaceLastSubstring = StringHelpers.replaceLastSubstring(modelPath, "xspray", "properties");
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
      Plugin _plugin = new Plugin();
      Plugin plugin = _plugin;
      StringConcatenation _generate = plugin.generate(diagram);
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
      String _name = diagram.getName();
      String _operator_plus_4 = StringExtensions.operator_plus(_name, "DiagramTypeProvider");
      java.setPackageAndClass(_diagram_package, _operator_plus_4);
      DiagramTypeProvider _diagramTypeProvider = new DiagramTypeProvider();
      DiagramTypeProvider dtp = _diagramTypeProvider;
      dtp.generate(diagram, java);
      String _diagram_package_1 = GeneratorUtil.diagram_package();
      String _name_1 = diagram.getName();
      String _operator_plus_5 = StringExtensions.operator_plus(_name_1, "FeatureProvider");
      java.setPackageAndClass(_diagram_package_1, _operator_plus_5);
      FeatureProvider _featureProvider = new FeatureProvider();
      FeatureProvider fp = _featureProvider;
      fp.generate(diagram, java);
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy = m.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof org.xspray.mm.xspray.Container));
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      for (final MetaClass metaClass : _filter) {
        {
          Shape _representedBy_1 = metaClass.getRepresentedBy();
          Container container = ((Container) _representedBy_1);
          String _feature_package = GeneratorUtil.feature_package();
          Diagram _diagram = metaClass.getDiagram();
          String _name_2 = _diagram.getName();
          String _operator_plus_6 = StringExtensions.operator_plus(_name_2, "Add");
          String _visibleName = GeneratorUtil.visibleName(metaClass);
          String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, _visibleName);
          String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, "Feature");
          java.setPackageAndClass(_feature_package, _operator_plus_8);
          AddShapeFeature _addShapeFeature = new AddShapeFeature();
          AddShapeFeature sf = _addShapeFeature;
          sf.generate(container, java);
        }
      }
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_1 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_1) {
            Shape _representedBy_2 = m_1.getRepresentedBy();
            return ((Boolean)(_representedBy_2 instanceof org.xspray.mm.xspray.Connection));
          }
        };
      Iterable<MetaClass> _filter_1 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_1);
      for (final MetaClass metaClass_1 : _filter_1) {
        {
          Shape _representedBy_3 = metaClass_1.getRepresentedBy();
          Connection connection = ((Connection) _representedBy_3);
          String _feature_package_1 = GeneratorUtil.feature_package();
          Diagram _diagram_1 = metaClass_1.getDiagram();
          String _name_3 = _diagram_1.getName();
          String _operator_plus_9 = StringExtensions.operator_plus(_name_3, "Add");
          String _visibleName_1 = GeneratorUtil.visibleName(metaClass_1);
          String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, _visibleName_1);
          String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, "Feature");
          java.setPackageAndClass(_feature_package_1, _operator_plus_11);
          AddConnectionFeature _addConnectionFeature = new AddConnectionFeature();
          AddConnectionFeature sf_1 = _addConnectionFeature;
          sf_1.generate(metaClass_1, java);
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
            Diagram _diagram_2 = metaClass_2.getDiagram();
            String _name_4 = _diagram_2.getName();
            String _operator_plus_12 = StringExtensions.operator_plus(_name_4, "AddReference");
            String _name_5 = metaClass_2.getName();
            String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, _name_5);
            String _name_6 = reference.getName();
            String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, _name_6);
            String _operator_plus_15 = StringExtensions.operator_plus(_operator_plus_14, "Feature");
            java.setPackageAndClass(_feature_package_2, _operator_plus_15);
            AddReferenceAsConnectionFeature _addReferenceAsConnectionFeature = new AddReferenceAsConnectionFeature();
            AddReferenceAsConnectionFeature sf_2 = _addReferenceAsConnectionFeature;
            sf_2.generate(reference, java);
          }
        }
      }
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      for (final MetaClass metaClass_3 : _metaClasses_3) {
        Shape _representedBy_5 = metaClass_3.getRepresentedBy();
        if ((_representedBy_5 instanceof org.xspray.mm.xspray.Container)) {
          {
            Shape _representedBy_6 = metaClass_3.getRepresentedBy();
            Container container_1 = ((Container) _representedBy_6);
            SprayElement[] _parts = container_1.getParts();
            Iterable<MetaReference> _filter_3 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.xspray.mm.xspray.MetaReference.class);
            for (final MetaReference metaRef : _filter_3) {
              {
                String _feature_package_3 = GeneratorUtil.feature_package();
                Diagram _diagram_3 = metaClass_3.getDiagram();
                String _name_7 = _diagram_3.getName();
                String _operator_plus_16 = StringExtensions.operator_plus(_name_7, "Add");
                String _name_8 = metaClass_3.getName();
                String _operator_plus_17 = StringExtensions.operator_plus(_operator_plus_16, _name_8);
                String _name_9 = metaRef.getName();
                String _operator_plus_18 = StringExtensions.operator_plus(_operator_plus_17, _name_9);
                String _operator_plus_19 = StringExtensions.operator_plus(_operator_plus_18, "ListFeature");
                java.setPackageAndClass(_feature_package_3, _operator_plus_19);
                AddReferenceAsListFeature _addReferenceAsListFeature = new AddReferenceAsListFeature();
                AddReferenceAsListFeature ft = _addReferenceAsListFeature;
                ft.generate(metaRef, java);
              }
            }
          }
        }
      }
      MetaClass[] _metaClasses_4 = diagram.getMetaClasses();
      for (final MetaClass metaClass_4 : _metaClasses_4) {
        Shape _representedBy_7 = metaClass_4.getRepresentedBy();
        if ((_representedBy_7 instanceof org.xspray.mm.xspray.Connection)) {
          {
            String _feature_package_4 = GeneratorUtil.feature_package();
            Diagram _diagram_4 = metaClass_4.getDiagram();
            String _name_10 = _diagram_4.getName();
            String _operator_plus_20 = StringExtensions.operator_plus(_name_10, "Create");
            String _visibleName_2 = GeneratorUtil.visibleName(metaClass_4);
            String _operator_plus_21 = StringExtensions.operator_plus(_operator_plus_20, _visibleName_2);
            String _operator_plus_22 = StringExtensions.operator_plus(_operator_plus_21, "Feature");
            java.setPackageAndClass(_feature_package_4, _operator_plus_22);
            CreateConnectionFeature _createConnectionFeature = new CreateConnectionFeature();
            CreateConnectionFeature sf_3 = _createConnectionFeature;
            sf_3.generate(metaClass_4, java);
          }
        } else {
          {
            String _feature_package_5 = GeneratorUtil.feature_package();
            Diagram _diagram_5 = metaClass_4.getDiagram();
            String _name_11 = _diagram_5.getName();
            String _operator_plus_23 = StringExtensions.operator_plus(_name_11, "Create");
            String _visibleName_3 = GeneratorUtil.visibleName(metaClass_4);
            String _operator_plus_24 = StringExtensions.operator_plus(_operator_plus_23, _visibleName_3);
            String _operator_plus_25 = StringExtensions.operator_plus(_operator_plus_24, "Feature");
            java.setPackageAndClass(_feature_package_5, _operator_plus_25);
            CreateShapeFeature _createShapeFeature = new CreateShapeFeature();
            CreateShapeFeature sf_4 = _createShapeFeature;
            sf_4.generate(metaClass_4, java);
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
      Iterable<Container> _filter_5 = IterableExtensions.<Container>filter(_map, org.xspray.mm.xspray.Container.class);
      final Function1<Container,Iterable<MetaReference>> _function_5 = new Function1<Container,Iterable<MetaReference>>() {
          public Iterable<MetaReference> apply(final Container c) {
            SprayElement[] _parts_1 = ((Container) c).getParts();
            Iterable<MetaReference> _filter_6 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.xspray.mm.xspray.MetaReference.class);
            return _filter_6;
          }
        };
      Iterable<Iterable<MetaReference>> _map_1 = IterableExtensions.<Container, Iterable<MetaReference>>map(_filter_5, _function_5);
      Iterable<MetaReference> _flatten = IterableExtensions.<MetaReference>flatten(_map_1);
      for (final MetaReference reference_1 : _flatten) {
        {
          String _name_12 = reference_1.getName();
          final String referenceName = _name_12;
          EObject _eContainer = reference_1.eContainer();
          MetaClass _represents = ((Container) _eContainer).getRepresents();
          MetaClass metaClass_5 = _represents;
          EClass _type = metaClass_5.getType();
          EList<EReference> _eAllReferences = _type.getEAllReferences();
          final Function1<EReference,Boolean> _function_6 = new Function1<EReference,Boolean>() {
              public Boolean apply(final EReference e) {
                String _name_13 = e.getName();
                boolean _operator_equals = ObjectExtensions.operator_equals(_name_13, referenceName);
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
              String _name_14 = targetType.getName();
              String _operator_plus_26 = StringExtensions.operator_plus("NOT ABSTRACT: ", _name_14);
              InputOutput.<String>println(_operator_plus_26);
              String _feature_package_6 = GeneratorUtil.feature_package();
              Diagram _diagram_6 = metaClass_5.getDiagram();
              String _name_15 = _diagram_6.getName();
              String _operator_plus_27 = StringExtensions.operator_plus(_name_15, "Create");
              String _name_16 = metaClass_5.getName();
              String _operator_plus_28 = StringExtensions.operator_plus(_operator_plus_27, _name_16);
              String _name_17 = reference_1.getName();
              String _operator_plus_29 = StringExtensions.operator_plus(_operator_plus_28, _name_17);
              String _name_18 = targetType.getName();
              String _operator_plus_30 = StringExtensions.operator_plus(_operator_plus_29, _name_18);
              String _operator_plus_31 = StringExtensions.operator_plus(_operator_plus_30, "Feature");
              java.setPackageAndClass(_feature_package_6, _operator_plus_31);
              CreateReferenceAsListFeature _createReferenceAsListFeature = new CreateReferenceAsListFeature();
              CreateReferenceAsListFeature ft_1 = _createReferenceAsListFeature;
              ft_1.setTarget(targetType);
              ft_1.generate(reference_1, java);
            }
          } else {
            String _name_19 = targetType.getName();
            String _operator_plus_32 = StringExtensions.operator_plus("ABSTRACT: ", _name_19);
            InputOutput.<String>println(_operator_plus_32);
          }
          List<EClass> _subclasses = MetaModel.getSubclasses(targetType);
          for (final EClass subclass : _subclasses) {
            boolean _isAbstract_1 = subclass.isAbstract();
            boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
            if (_operator_not_1) {
              {
                String _name_20 = subclass.getName();
                String _operator_plus_33 = StringExtensions.operator_plus("NOT ABSTRACT subclass: ", _name_20);
                InputOutput.<String>println(_operator_plus_33);
                String _feature_package_7 = GeneratorUtil.feature_package();
                Diagram _diagram_7 = metaClass_5.getDiagram();
                String _name_21 = _diagram_7.getName();
                String _operator_plus_34 = StringExtensions.operator_plus(_name_21, "Create");
                String _name_22 = metaClass_5.getName();
                String _operator_plus_35 = StringExtensions.operator_plus(_operator_plus_34, _name_22);
                String _name_23 = reference_1.getName();
                String _operator_plus_36 = StringExtensions.operator_plus(_operator_plus_35, _name_23);
                String _name_24 = subclass.getName();
                String _operator_plus_37 = StringExtensions.operator_plus(_operator_plus_36, _name_24);
                String _operator_plus_38 = StringExtensions.operator_plus(_operator_plus_37, "Feature");
                java.setPackageAndClass(_feature_package_7, _operator_plus_38);
                CreateReferenceAsListFeature _createReferenceAsListFeature_1 = new CreateReferenceAsListFeature();
                CreateReferenceAsListFeature cc = _createReferenceAsListFeature_1;
                cc.setTarget(subclass);
                cc.generate(reference_1, java);
              }
            } else {
              {
                String _name_25 = subclass.getName();
                String _operator_plus_39 = StringExtensions.operator_plus("ABSTRACT subclass: ", _name_25);
                InputOutput.<String>println(_operator_plus_39);
                String _feature_package_8 = GeneratorUtil.feature_package();
                Diagram _diagram_8 = metaClass_5.getDiagram();
                String _name_26 = _diagram_8.getName();
                String _operator_plus_40 = StringExtensions.operator_plus(_name_26, "Create");
                String _name_27 = metaClass_5.getName();
                String _operator_plus_41 = StringExtensions.operator_plus(_operator_plus_40, _name_27);
                String _name_28 = reference_1.getName();
                String _operator_plus_42 = StringExtensions.operator_plus(_operator_plus_41, _name_28);
                String _name_29 = subclass.getName();
                String _operator_plus_43 = StringExtensions.operator_plus(_operator_plus_42, _name_29);
                String _operator_plus_44 = StringExtensions.operator_plus(_operator_plus_43, "Feature");
                java.setPackageAndClass(_feature_package_8, _operator_plus_44);
                CreateReferenceAsListFeature _createReferenceAsListFeature_2 = new CreateReferenceAsListFeature();
                CreateReferenceAsListFeature cc_1 = _createReferenceAsListFeature_2;
                cc_1.setTarget(subclass);
                cc_1.generate(reference_1, java);
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
            CreateReferenceAsConnectionFeature _createReferenceAsConnectionFeature = new CreateReferenceAsConnectionFeature();
            CreateReferenceAsConnectionFeature ft_2 = _createReferenceAsConnectionFeature;
            String _feature_package_9 = GeneratorUtil.feature_package();
            Diagram _diagram_9 = metaClass_6.getDiagram();
            String _name_30 = _diagram_9.getName();
            String _operator_plus_45 = StringExtensions.operator_plus(_name_30, "Create");
            String _name_31 = metaClass_6.getName();
            String _operator_plus_46 = StringExtensions.operator_plus(_operator_plus_45, _name_31);
            String _name_32 = reference_2.getName();
            String _operator_plus_47 = StringExtensions.operator_plus(_operator_plus_46, _name_32);
            String _operator_plus_48 = StringExtensions.operator_plus(_operator_plus_47, "Feature");
            java.setPackageAndClass(_feature_package_9, _operator_plus_48);
            ft_2.generate(reference_2, java);
          }
        }
      }
      MetaClass[] _metaClasses_7 = diagram.getMetaClasses();
      for (final MetaClass metaClass_7 : _metaClasses_7) {
        Shape _representedBy_11 = metaClass_7.getRepresentedBy();
        if ((_representedBy_11 instanceof org.xspray.mm.xspray.Connection)) {
          {
            UpdateConnectionFeature _updateConnectionFeature = new UpdateConnectionFeature();
            UpdateConnectionFeature conn = _updateConnectionFeature;
            String _feature_package_10 = GeneratorUtil.feature_package();
            Diagram _diagram_10 = metaClass_7.getDiagram();
            String _name_33 = _diagram_10.getName();
            String _operator_plus_49 = StringExtensions.operator_plus(_name_33, "Update");
            String _visibleName_4 = GeneratorUtil.visibleName(metaClass_7);
            String _operator_plus_50 = StringExtensions.operator_plus(_operator_plus_49, _visibleName_4);
            String _operator_plus_51 = StringExtensions.operator_plus(_operator_plus_50, "Feature");
            java.setPackageAndClass(_feature_package_10, _operator_plus_51);
            Shape _representedBy_12 = metaClass_7.getRepresentedBy();
            conn.generate(_representedBy_12, java);
          }
        } else {
          Shape _representedBy_13 = metaClass_7.getRepresentedBy();
          if ((_representedBy_13 instanceof org.xspray.mm.xspray.Container)) {
            {
              LayoutFeature _layoutFeature = new LayoutFeature();
              LayoutFeature layout = _layoutFeature;
              String _feature_package_11 = GeneratorUtil.feature_package();
              Diagram _diagram_11 = metaClass_7.getDiagram();
              String _name_34 = _diagram_11.getName();
              String _operator_plus_52 = StringExtensions.operator_plus(_name_34, "Layout");
              String _visibleName_5 = GeneratorUtil.visibleName(metaClass_7);
              String _operator_plus_53 = StringExtensions.operator_plus(_operator_plus_52, _visibleName_5);
              String _operator_plus_54 = StringExtensions.operator_plus(_operator_plus_53, "Feature");
              java.setPackageAndClass(_feature_package_11, _operator_plus_54);
              Shape _representedBy_14 = metaClass_7.getRepresentedBy();
              layout.generate(_representedBy_14, java);
              UpdateShapeFeature _updateShapeFeature = new UpdateShapeFeature();
              UpdateShapeFeature shape = _updateShapeFeature;
              String _feature_package_12 = GeneratorUtil.feature_package();
              Diagram _diagram_12 = metaClass_7.getDiagram();
              String _name_35 = _diagram_12.getName();
              String _operator_plus_55 = StringExtensions.operator_plus(_name_35, "Update");
              String _visibleName_6 = GeneratorUtil.visibleName(metaClass_7);
              String _operator_plus_56 = StringExtensions.operator_plus(_operator_plus_55, _visibleName_6);
              String _operator_plus_57 = StringExtensions.operator_plus(_operator_plus_56, "Feature");
              java.setPackageAndClass(_feature_package_12, _operator_plus_57);
              Shape _representedBy_15 = metaClass_7.getRepresentedBy();
              shape.generate(_representedBy_15, java);
              Shape _representedBy_16 = metaClass_7.getRepresentedBy();
              Container container_2 = ((Container) _representedBy_16);
              SprayElement[] _parts_2 = container_2.getParts();
              final Function1<SprayElement,Boolean> _function_8 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p) {
                    return ((Boolean)(p instanceof org.xspray.mm.xspray.MetaReference));
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
                  String _name_36 = reference_3.getName();
                  final String referenceName_1 = _name_36;
                  EClass _type_1 = metaClass_7.getType();
                  EList<EReference> _eAllReferences_1 = _type_1.getEAllReferences();
                  final Function1<EReference,Boolean> _function_10 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference e_1) {
                        String _name_37 = e_1.getName();
                        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_37, referenceName_1);
                        return ((Boolean)_operator_equals_1);
                      }
                    };
                  EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_10);
                  EClass _eReferenceType_1 = _findFirst_1.getEReferenceType();
                  EClass eClass = _eReferenceType_1;
                  UpdateReferenceAsListFeature _updateReferenceAsListFeature = new UpdateReferenceAsListFeature();
                  UpdateReferenceAsListFeature list = _updateReferenceAsListFeature;
                  list.setTarget(eClass);
                  String _feature_package_13 = GeneratorUtil.feature_package();
                  String _name_38 = diagram.getName();
                  String _operator_plus_58 = StringExtensions.operator_plus(_name_38, "Update");
                  String _name_39 = metaClass_7.getName();
                  String _operator_plus_59 = StringExtensions.operator_plus(_operator_plus_58, _name_39);
                  String _name_40 = reference_3.getName();
                  String _operator_plus_60 = StringExtensions.operator_plus(_operator_plus_59, _name_40);
                  String _operator_plus_61 = StringExtensions.operator_plus(_operator_plus_60, "Feature");
                  java.setPackageAndClass(_feature_package_13, _operator_plus_61);
                  list.generate(reference_3, java);
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
            DeleteReferenceFeature _deleteReferenceFeature = new DeleteReferenceFeature();
            DeleteReferenceFeature del = _deleteReferenceFeature;
            String _feature_package_14 = GeneratorUtil.feature_package();
            Diagram _diagram_13 = metaClass_8.getDiagram();
            String _name_41 = _diagram_13.getName();
            String _operator_plus_62 = StringExtensions.operator_plus(_name_41, "DeleteReference");
            String _name_42 = metaClass_8.getName();
            String _operator_plus_63 = StringExtensions.operator_plus(_operator_plus_62, _name_42);
            String _name_43 = reference_4.getName();
            String _operator_plus_64 = StringExtensions.operator_plus(_operator_plus_63, _name_43);
            String _operator_plus_65 = StringExtensions.operator_plus(_operator_plus_64, "Feature");
            java.setPackageAndClass(_feature_package_14, _operator_plus_65);
            del.generate(reference_4, java);
          }
        }
      }
      String _diagram_package_2 = GeneratorUtil.diagram_package();
      String _name_44 = diagram.getName();
      String _operator_plus_66 = StringExtensions.operator_plus(_name_44, "ImageProvider");
      java.setPackageAndClass(_diagram_package_2, _operator_plus_66);
      ImageProvider _imageProvider = new ImageProvider();
      ImageProvider im = _imageProvider;
      im.generate(diagram, java);
      String _diagram_package_3 = GeneratorUtil.diagram_package();
      String _name_45 = diagram.getName();
      String _operator_plus_67 = StringExtensions.operator_plus(_name_45, "ToolBehaviourProvider");
      java.setPackageAndClass(_diagram_package_3, _operator_plus_67);
      ToolBehaviourProvider _toolBehaviourProvider = new ToolBehaviourProvider();
      ToolBehaviourProvider tool = _toolBehaviourProvider;
      tool.generate(diagram, java);
      MetaClass[] _metaClasses_9 = diagram.getMetaClasses();
      for (final MetaClass metaClass_9 : _metaClasses_9) {
        {
          EClass _type_2 = metaClass_9.getType();
          final EClass eClass1 = _type_2;
          EList<EAttribute> _eAllAttributes = eClass1.getEAllAttributes();
          for (final EAttribute attribute : _eAllAttributes) {
            {
              String _property_package = GeneratorUtil.property_package();
              String _name_46 = eClass1.getName();
              String _name_47 = attribute.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_47);
              String _operator_plus_68 = StringExtensions.operator_plus(_name_46, _firstUpper);
              String _operator_plus_69 = StringExtensions.operator_plus(_operator_plus_68, "Section");
              java.setPackageAndClass(_property_package, _operator_plus_69);
              PropertySection _propertySection = new PropertySection();
              PropertySection section = _propertySection;
              section.setDiagram(diagram);
              section.generate(attribute, java);
            }
          }
          Shape _representedBy_17 = metaClass_9.getRepresentedBy();
          if ((_representedBy_17 instanceof org.xspray.mm.xspray.Container)) {
            {
              Shape _representedBy_18 = metaClass_9.getRepresentedBy();
              final Container container_3 = ((Container) _representedBy_18);
              SprayElement[] _parts_3 = container_3.getParts();
              final Function1<SprayElement,Boolean> _function_11 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p_2) {
                    return ((Boolean)(p_2 instanceof org.xspray.mm.xspray.MetaReference));
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
                  String _name_48 = reference_5.getName();
                  final String referenceName_2 = _name_48;
                  EClass _type_3 = metaClass_9.getType();
                  EList<EReference> _eAllReferences_2 = _type_3.getEAllReferences();
                  final Function1<EReference,Boolean> _function_13 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference r) {
                        String _name_49 = r.getName();
                        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_49, referenceName_2);
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
                      String _name_50 = eClass_1.getName();
                      String _name_51 = attribute_1.getName();
                      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_51);
                      String _operator_plus_70 = StringExtensions.operator_plus(_name_50, _firstUpper_1);
                      String _operator_plus_71 = StringExtensions.operator_plus(_operator_plus_70, "Section");
                      java.setPackageAndClass(_property_package_1, _operator_plus_71);
                      PropertySection _propertySection_1 = new PropertySection();
                      PropertySection section_1 = _propertySection_1;
                      section_1.setDiagram(diagram);
                      section_1.generate(attribute_1, java);
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
          Filter _filter_10 = new Filter();
          final Filter fil = _filter_10;
          fil.setDiagram(diagram);
          String _property_package_2 = GeneratorUtil.property_package();
          String _name_52 = metaClass_10.getName();
          String _operator_plus_72 = StringExtensions.operator_plus(_name_52, "Filter");
          java.setPackageAndClass(_property_package_2, _operator_plus_72);
          EClass _type_4 = metaClass_10.getType();
          fil.generate(_type_4, java);
          Shape _representedBy_19 = metaClass_10.getRepresentedBy();
          if ((_representedBy_19 instanceof org.xspray.mm.xspray.Container)) {
            {
              Shape _representedBy_20 = metaClass_10.getRepresentedBy();
              final Container container_4 = ((Container) _representedBy_20);
              SprayElement[] _parts_4 = container_4.getParts();
              final Function1<SprayElement,Boolean> _function_14 = new Function1<SprayElement,Boolean>() {
                  public Boolean apply(final SprayElement p_4) {
                    return ((Boolean)(p_4 instanceof org.xspray.mm.xspray.MetaReference));
                  }
                };
              Iterable<SprayElement> _filter_11 = IterableExtensions.<SprayElement>filter(((Iterable<SprayElement>)Conversions.doWrapArray(_parts_4)), _function_14);
              final Function1<SprayElement,MetaReference> _function_15 = new Function1<SprayElement,MetaReference>() {
                  public MetaReference apply(final SprayElement p_5) {
                    return ((MetaReference) p_5);
                  }
                };
              Iterable<MetaReference> _map_4 = IterableExtensions.<SprayElement, MetaReference>map(_filter_11, _function_15);
              for (final MetaReference reference_6 : _map_4) {
                {
                  String _name_53 = reference_6.getName();
                  final String referenceName_3 = _name_53;
                  EClass _type_5 = metaClass_10.getType();
                  EList<EReference> _eAllReferences_3 = _type_5.getEAllReferences();
                  final Function1<EReference,Boolean> _function_16 = new Function1<EReference,Boolean>() {
                      public Boolean apply(final EReference ref_2) {
                        String _name_54 = ref_2.getName();
                        boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_54, referenceName_3);
                        return ((Boolean)_operator_equals_3);
                      }
                    };
                  EReference _findFirst_3 = IterableExtensions.<EReference>findFirst(_eAllReferences_3, _function_16);
                  EClass _eReferenceType_3 = _findFirst_3.getEReferenceType();
                  final EClass eClass_2 = _eReferenceType_3;
                  Filter _filter_12 = new Filter();
                  final Filter fil2 = _filter_12;
                  fil2.setDiagram(diagram);
                  String _property_package_3 = GeneratorUtil.property_package();
                  String _name_55 = eClass_2.getName();
                  String _operator_plus_73 = StringExtensions.operator_plus(_name_55, "Filter");
                  java.setPackageAndClass(_property_package_3, _operator_plus_73);
                  fil2.generate(eClass_2, java);
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
            CustomFeature _customFeature = new CustomFeature();
            final CustomFeature custom = _customFeature;
            String _feature_package_15 = GeneratorUtil.feature_package();
            Diagram _diagram_14 = metaClass_11.getDiagram();
            String _name_56 = _diagram_14.getName();
            String _operator_plus_74 = StringExtensions.operator_plus(_name_56, "Custom");
            String _name_57 = behaviour.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_57);
            String _operator_plus_75 = StringExtensions.operator_plus(_operator_plus_74, _firstUpper_2);
            String _operator_plus_76 = StringExtensions.operator_plus(_operator_plus_75, "Feature");
            java.setPackageAndClass(_feature_package_15, _operator_plus_76);
            custom.generate(behaviour, java);
          }
        }
      }
    }
  }
}