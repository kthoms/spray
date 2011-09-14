package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties;
import org.eclipselabs.spray.mm.spray.Behaviour;
import org.eclipselabs.spray.mm.spray.BehaviourType;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.xspray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class ToolBehaviourProvider extends FileGenerator {
  
  @Inject
  private SprayExtensions e1;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtentionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((Diagram) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public class ");
    _builder.append(className, " ");
    _builder.append(" extends ");
    _builder.append(className, " ");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package  ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Behaviour[]> _function = new Function1<MetaClass,Behaviour[]>() {
          public Behaviour[] apply(final MetaClass m) {
            Behaviour[] _behaviours = m.getBehaviours();
            return _behaviours;
          }
        };
      List<Behaviour[]> _map = ListExtensions.<MetaClass, Behaviour[]>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      for(final Behaviour[] behaviours : _map) {
        {
          final Behaviour[] typeConverted_behaviours = (Behaviour[])behaviours;
          final Function1<Behaviour,Boolean> _function_1 = new Function1<Behaviour,Boolean>() {
              public Boolean apply(final Behaviour e) {
                BehaviourType _type = e.getType();
                boolean _operator_equals = ObjectExtensions.operator_equals(_type, BehaviourType.CREATE_BEHAVIOUR);
                return ((Boolean)_operator_equals);
              }
            };
          Iterable<Behaviour> _filter = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(typeConverted_behaviours)), _function_1);
          for(final Behaviour behaviour : _filter) {
            MetaClass _metaClass = behaviour.getMetaClass();
            EClass _type_1 = _metaClass.getType();
            EClass target = _type_1;
            _builder.newLineIfNotEmpty();
            {
              boolean _isAbstract = target.isAbstract();
              boolean _operator_not = BooleanExtensions.operator_not(_isAbstract);
              if (_operator_not) {
                _builder.append("// ");
                MetaClass _metaClass_1 = behaviour.getMetaClass();
                String _name = this.e1.getName(_metaClass_1);
                _builder.append(_name, "");
                _builder.newLineIfNotEmpty();
                _builder.append("import ");
                String _feature_package = GeneratorUtil.feature_package();
                _builder.append(_feature_package, "");
                _builder.append(".");
                String _name_1 = diagram.getName();
                _builder.append(_name_1, "");
                _builder.append("Create");
                MetaClass _metaClass_2 = behaviour.getMetaClass();
                String _visibleName = GeneratorUtil.visibleName(_metaClass_2);
                _builder.append(_visibleName, "");
                _builder.append("Feature;");
                _builder.newLineIfNotEmpty();} else {
                _builder.append("// \timport ");
                String _feature_package_1 = GeneratorUtil.feature_package();
                _builder.append(_feature_package_1, "");
                _builder.append(".");
                String _name_2 = diagram.getName();
                _builder.append(_name_2, "");
                _builder.append("Create");
                MetaClass _metaClass_3 = behaviour.getMetaClass();
                String _visibleName_1 = GeneratorUtil.visibleName(_metaClass_3);
                _builder.append(_visibleName_1, "");
                _builder.append("Feature;");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append("  extends DefaultToolBehaviorProvider   {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public IPaletteCompartmentEntry[] getPalette() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Map<String, PaletteCompartmentEntry> compartments = new HashMap<String, PaletteCompartmentEntry>();");
    _builder.newLine();
    _builder.newLine();
    {
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_2 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_1) {
            Shape _representedBy = m_1.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof org.eclipselabs.spray.mm.spray.Container));
          }
        };
      Iterable<MetaClass> _filter_1 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_2);
      for(final MetaClass metaClass : _filter_1) {
        {
          Behaviour[] _behaviours_1 = metaClass.getBehaviours();
          final Function1<Behaviour,Boolean> _function_3 = new Function1<Behaviour,Boolean>() {
              public Boolean apply(final Behaviour e_1) {
                BehaviourType _type_2 = e_1.getType();
                boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_2, BehaviourType.CREATE_BEHAVIOUR);
                return ((Boolean)_operator_equals_1);
              }
            };
          Iterable<Behaviour> _filter_2 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(_behaviours_1)), _function_3);
          for(final Behaviour behaviour_1 : _filter_2) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("ICreateFeature createFeature = new ");
            String _feature_package_2 = GeneratorUtil.feature_package();
            String _name_3 = diagram.getName();
            String _operator_plus = StringExtensions.operator_plus(_name_3, "Create");
            MetaClass _metaClass_4 = behaviour_1.getMetaClass();
            String _visibleName_2 = GeneratorUtil.visibleName(_metaClass_4);
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _visibleName_2);
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Feature");
            String _addToImports = XtendProperties.addToImports(_feature_package_2, _operator_plus_2);
            _builder.append(_addToImports, "	");
            _builder.append("(this.getFeatureProvider());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t        ");
            _builder.append("ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);");
            _builder.newLine();
            _builder.append("\t\t\t        ");
            _builder.append("PaletteCompartmentEntry compartment = compartments.get(\"");
            String _paletteCompartment = behaviour_1.getPaletteCompartment();
            _builder.append(_paletteCompartment, "			        ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t        ");
            _builder.append("if( compartment == null ){");
            _builder.newLine();
            _builder.append("\t\t    \t        ");
            _builder.append("compartment = new PaletteCompartmentEntry(\"");
            String _paletteCompartment_1 = behaviour_1.getPaletteCompartment();
            _builder.append(_paletteCompartment_1, "		    	        ");
            _builder.append("\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t    \t    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t\t        ");
            _builder.append("compartments.put(\"");
            String _paletteCompartment_2 = behaviour_1.getPaletteCompartment();
            _builder.append(_paletteCompartment_2, "			        ");
            _builder.append("\", compartment);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t            ");
            _builder.append("compartment.addToolEntry(objectCreationToolEntry);");
            _builder.newLine();
            _builder.append("\t\t        ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t        ");
            _builder.newLine();
            _builder.append("\t\t        ");
            Shape _representedBy_1 = metaClass.getRepresentedBy();
            Container container = ((Container) _representedBy_1);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_3 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference : _filter_3) {
                String _name_4 = this.e1.getName(reference);
                final String referenceName = _name_4;
                _builder.newLineIfNotEmpty();
                EClass _type_3 = metaClass.getType();
                EList<EReference> _eAllReferences = _type_3.getEAllReferences();
                final Function1<EReference,Boolean> _function_4 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_2) {
                      String _name_5 = e_2.getName();
                      boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_5, referenceName);
                      return ((Boolean)_operator_equals_2);
                    }
                  };
                EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_4);
                EReference target_1 = _findFirst;
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType = target_1.getEReferenceType();
                  boolean _isAbstract_1 = _eReferenceType.isAbstract();
                  boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
                  if (_operator_not_1) {
                    _builder.append("\t\t\t\t\t");
                    Diagram _diagram = metaClass.getDiagram();
                    String _name_6 = _diagram.getName();
                    String _operator_plus_3 = StringExtensions.operator_plus(_name_6, "Create");
                    String _name_7 = this.e1.getName(metaClass);
                    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _name_7);
                    String _name_8 = this.e1.getName(reference);
                    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name_8);
                    EClass _eReferenceType_1 = target_1.getEReferenceType();
                    String _name_9 = _eReferenceType_1.getName();
                    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, _name_9);
                    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "Feature(this)");
                    StringConcatenation _objectCreationEntry = this.objectCreationEntry(_operator_plus_7, "XXX");
                    _builder.append(_objectCreationEntry, "					");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//\t\t\t\t\t, new ");
                    Diagram _diagram_1 = metaClass.getDiagram();
                    String _name_10 = _diagram_1.getName();
                    _builder.append(_name_10, "");
                    _builder.append("Create");
                    String _name_11 = this.e1.getName(metaClass);
                    _builder.append(_name_11, "");
                    String _name_12 = this.e1.getName(reference);
                    _builder.append(_name_12, "");
                    EClass _eReferenceType_2 = target_1.getEReferenceType();
                    String _name_13 = _eReferenceType_2.getName();
                    _builder.append(_name_13, "");
                    _builder.append("Feature(this)");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EClass _eReferenceType_3 = target_1.getEReferenceType();
                  List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_3);
                  for(final EClass subclass : _subclasses) {
                    {
                      boolean _isAbstract_2 = subclass.isAbstract();
                      boolean _operator_not_2 = BooleanExtensions.operator_not(_isAbstract_2);
                      if (_operator_not_2) {
                        _builder.append("\t\t\t\t\t\t\t");
                        Diagram _diagram_2 = metaClass.getDiagram();
                        String _name_14 = _diagram_2.getName();
                        String _operator_plus_8 = StringExtensions.operator_plus(_name_14, "Create");
                        String _name_15 = this.e1.getName(metaClass);
                        String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, _name_15);
                        String _name_16 = this.e1.getName(reference);
                        String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, _name_16);
                        String _name_17 = subclass.getName();
                        String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, _name_17);
                        String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, "Feature");
                        StringConcatenation _objectCreationEntry_1 = this.objectCreationEntry(_operator_plus_12, "XXX");
                        _builder.append(_objectCreationEntry_1, "							");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//\t\t\t\t\t, new ");
                        Diagram _diagram_3 = metaClass.getDiagram();
                        String _name_18 = _diagram_3.getName();
                        _builder.append(_name_18, "");
                        _builder.append("Create");
                        String _name_19 = this.e1.getName(metaClass);
                        _builder.append(_name_19, "");
                        String _name_20 = this.e1.getName(reference);
                        _builder.append(_name_20, "");
                        String _name_21 = subclass.getName();
                        _builder.append(_name_21, "");
                        _builder.append("Feature(this)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_5 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_2) {
            Shape _representedBy_2 = m_2.getRepresentedBy();
            return ((Boolean)(_representedBy_2 instanceof org.eclipselabs.spray.mm.spray.Container));
          }
        };
      Iterable<MetaClass> _filter_4 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_2)), _function_5);
      final Function1<MetaClass,Container> _function_6 = new Function1<MetaClass,Container>() {
          public Container apply(final MetaClass m_3) {
            Shape _representedBy_3 = m_3.getRepresentedBy();
            return ((Container) _representedBy_3);
          }
        };
      Iterable<Container> _map_1 = IterableExtensions.<MetaClass, Container>map(_filter_4, _function_6);
      for(final Container container_1 : _map_1) {
        {
          SprayElement[] _parts_1 = container_1.getParts();
          Iterable<MetaReference> _filter_5 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.eclipselabs.spray.mm.spray.MetaReference.class);
          for(final MetaReference metaRef : _filter_5) {
            _builder.append("\t\t        ");
            String _name_22 = this.e1.getName(metaRef);
            final String metaRefName = _name_22;
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t    ");
            MetaClass _represents = container_1.getRepresents();
            EClass _type_4 = _represents.getType();
            EList<EReference> _eAllReferences_1 = _type_4.getEAllReferences();
            final Function1<EReference,Boolean> _function_7 = new Function1<EReference,Boolean>() {
                public Boolean apply(final EReference e_3) {
                  String _name_23 = e_3.getName();
                  boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_23, metaRefName);
                  return ((Boolean)_operator_equals_3);
                }
              };
            EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_7);
            final EReference target_2 = _findFirst_1;
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t        ");
            String _name_24 = diagram.getName();
            String _operator_plus_13 = StringExtensions.operator_plus(_name_24, "Create");
            MetaClass _represents_1 = container_1.getRepresents();
            String _name_25 = this.e1.getName(_represents_1);
            String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, _name_25);
            String _name_26 = this.e1.getName(metaRef);
            String _operator_plus_15 = StringExtensions.operator_plus(_operator_plus_14, _name_26);
            EClass _eReferenceType_4 = target_2.getEReferenceType();
            String _name_27 = _eReferenceType_4.getName();
            String _operator_plus_16 = StringExtensions.operator_plus(_operator_plus_15, _name_27);
            String _operator_plus_17 = StringExtensions.operator_plus(_operator_plus_16, "Feature");
            final String createFeatureName = _operator_plus_17;
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t    ");
            _builder.append("// 00000 Embedded list of references ");
            _builder.append(createFeatureName, "			    ");
            _builder.newLineIfNotEmpty();
            _builder.append("//\t\t        {");
            _builder.newLine();
            _builder.append("//\t\t            ICreateFeature createFeature = new !!!addToImports(feature_package(), createFeatureName)!!!(this.getFeatureProvider());");
            _builder.newLine();
            _builder.append("//\t\t            ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);");
            _builder.newLine();
            _builder.append("//\t\t            PaletteCompartmentEntry compartment = compartments.get(\"Other\");");
            _builder.newLine();
            _builder.append("//\t\t            if( compartment == null ){");
            _builder.newLine();
            _builder.append("//\t\t                compartment = new PaletteCompartmentEntry(\"Other\", null);");
            _builder.newLine();
            _builder.append("//\t\t            }");
            _builder.newLine();
            _builder.append("//\t\t            compartments.put(\"Other\", compartment);");
            _builder.newLine();
            _builder.append("//\t\t            compartment.addToolEntry(objectCreationToolEntry);");
            _builder.newLine();
            _builder.append("//\t\t        }");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// do the same for connection creators");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_8 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_4) {
            Shape _representedBy_4 = m_4.getRepresentedBy();
            return ((Boolean)(_representedBy_4 instanceof org.eclipselabs.spray.mm.spray.Connection));
          }
        };
      Iterable<MetaClass> _filter_6 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_3)), _function_8);
      final Function1<MetaClass,Behaviour[]> _function_9 = new Function1<MetaClass,Behaviour[]>() {
          public Behaviour[] apply(final MetaClass m_5) {
            Behaviour[] _behaviours_2 = m_5.getBehaviours();
            return _behaviours_2;
          }
        };
      Iterable<Behaviour[]> _map_2 = IterableExtensions.<MetaClass, Behaviour[]>map(_filter_6, _function_9);
      for(final Behaviour[] behaviours2 : _map_2) {
        {
          final Behaviour[] typeConverted_behaviours2 = (Behaviour[])behaviours2;
          final Function1<Behaviour,Boolean> _function_10 = new Function1<Behaviour,Boolean>() {
              public Boolean apply(final Behaviour e_4) {
                BehaviourType _type_5 = e_4.getType();
                boolean _operator_equals_4 = ObjectExtensions.operator_equals(_type_5, BehaviourType.CREATE_BEHAVIOUR);
                return ((Boolean)_operator_equals_4);
              }
            };
          Iterable<Behaviour> _filter_7 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(typeConverted_behaviours2)), _function_10);
          for(final Behaviour behaviour_2 : _filter_7) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("ICreateConnectionFeature createFeature = new ");
            String _feature_package_3 = GeneratorUtil.feature_package();
            String _name_28 = diagram.getName();
            String _operator_plus_18 = StringExtensions.operator_plus(_name_28, "Create");
            MetaClass _metaClass_5 = behaviour_2.getMetaClass();
            String _visibleName_3 = GeneratorUtil.visibleName(_metaClass_5);
            String _operator_plus_19 = StringExtensions.operator_plus(_operator_plus_18, _visibleName_3);
            String _operator_plus_20 = StringExtensions.operator_plus(_operator_plus_19, "Feature");
            String _addToImports_1 = XtendProperties.addToImports(_feature_package_3, _operator_plus_20);
            _builder.append(_addToImports_1, "    ");
            _builder.append("(this.getFeatureProvider());");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("objectCreationToolEntry.addCreateConnectionFeature(createFeature);");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("PaletteCompartmentEntry compartment = compartments.get(\"");
            String _paletteCompartment_3 = behaviour_2.getPaletteCompartment();
            _builder.append(_paletteCompartment_3, "    ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("if( compartment == null ){");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("compartment = new PaletteCompartmentEntry(\"");
            String _paletteCompartment_4 = behaviour_2.getPaletteCompartment();
            _builder.append(_paletteCompartment_4, "        ");
            _builder.append("\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("compartments.put(\"");
            String _paletteCompartment_5 = behaviour_2.getPaletteCompartment();
            _builder.append(_paletteCompartment_5, "    ");
            _builder.append("\", compartment);");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("compartment.addToolEntry(objectCreationToolEntry);");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_4 = diagram.getMetaClasses();
      for(final MetaClass metaClass_1 : _metaClasses_4) {
        {
          MetaReference[] _references = metaClass_1.getReferences();
          for(final MetaReference metaReference : _references) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("// ");
            String _name_29 = this.e1.getName(metaReference);
            _builder.append(_name_29, "    ");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("ICreateConnectionFeature createFeature = new ");
            String _feature_package_4 = GeneratorUtil.feature_package();
            String _name_30 = diagram.getName();
            String _operator_plus_21 = StringExtensions.operator_plus(_name_30, "Create");
            MetaClass _metaClass_6 = metaReference.getMetaClass();
            String _name_31 = this.e1.getName(_metaClass_6);
            String _operator_plus_22 = StringExtensions.operator_plus(_operator_plus_21, _name_31);
            String _name_32 = this.e1.getName(metaReference);
            String _operator_plus_23 = StringExtensions.operator_plus(_operator_plus_22, _name_32);
            String _operator_plus_24 = StringExtensions.operator_plus(_operator_plus_23, "Feature");
            String _addToImports_2 = XtendProperties.addToImports(_feature_package_4, _operator_plus_24);
            _builder.append(_addToImports_2, "    ");
            _builder.append("(this.getFeatureProvider());");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("ConnectionCreationToolEntry objectCreationToolEntry = new ConnectionCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId());");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("objectCreationToolEntry.addCreateConnectionFeature(createFeature);");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("PaletteCompartmentEntry compartment = compartments.get(\"Other\");");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("if( compartment == null ){");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("compartment = new PaletteCompartmentEntry(\"Other\", null);");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("compartments.put(\"Other\", compartment);");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("compartment.addToolEntry(objectCreationToolEntry);");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("        ");
    _builder.append("IPaletteCompartmentEntry[] res = compartments.values().toArray(new IPaletteCompartmentEntry[compartments.size()]);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return res;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation objectCreationEntry(final String className, final String paletteCompartment) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ICreateFeature createFeature = new ");
    String _feature_package = GeneratorUtil.feature_package();
    String _addToImports = XtendProperties.addToImports(_feature_package, className);
    _builder.append(_addToImports, "	");
    _builder.append("(this.getFeatureProvider());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("PaletteCompartmentEntry compartment = compartments.get(\"");
    _builder.append(paletteCompartment, "	        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("if( compartment == null ){");
    _builder.newLine();
    _builder.append("    \t        ");
    _builder.append("compartment = new PaletteCompartmentEntry(\"");
    _builder.append(paletteCompartment, "    	        ");
    _builder.append("\", null);");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("compartments.put(\"");
    _builder.append(paletteCompartment, "	        ");
    _builder.append("\", compartment);");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("compartment.addToolEntry(objectCreationToolEntry);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}