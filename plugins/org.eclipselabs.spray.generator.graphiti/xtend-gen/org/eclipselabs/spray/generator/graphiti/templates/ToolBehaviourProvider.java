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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.XtendProperties;
import org.eclipselabs.spray.mm.spray.Behaviour;
import org.eclipselabs.spray.mm.spray.BehaviourType;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class ToolBehaviourProvider extends FileGenerator {
  
  @Inject
  private ImportUtil importUtil;
  
  @Inject
  private NamingExtensions naming;
  
  @Inject
  private SprayExtensions e1;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
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
    String _feature_package = GeneratorUtil.feature_package();
    this.importUtil.initImports(_feature_package);
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    StringConcatenation _mainFileBody = this.mainFileBody(diagram, className);
    final StringConcatenation body = _mainFileBody;
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
    String _printImports = this.importUtil.printImports();
    _builder.append(_printImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation mainFileBody(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
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
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy = m.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof org.eclipselabs.spray.mm.spray.Container));
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      for(final MetaClass metaClass : _filter) {
        {
          Behaviour[] _behaviours = metaClass.getBehaviours();
          final Function1<Behaviour,Boolean> _function_1 = new Function1<Behaviour,Boolean>() {
              public Boolean apply(final Behaviour e) {
                BehaviourType _type = e.getType();
                boolean _operator_equals = ObjectExtensions.operator_equals(_type, BehaviourType.CREATE_BEHAVIOUR);
                return ((Boolean)_operator_equals);
              }
            };
          Iterable<Behaviour> _filter_1 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(_behaviours)), _function_1);
          for(final Behaviour behaviour : _filter_1) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("ICreateFeature createFeature = new ");
            String _feature_package = GeneratorUtil.feature_package();
            String _name = diagram.getName();
            String _operator_plus = StringExtensions.operator_plus(_name, "Create");
            MetaClass _metaClass = behaviour.getMetaClass();
            String _visibleName = GeneratorUtil.visibleName(_metaClass);
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _visibleName);
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Feature");
            String _addToImports = XtendProperties.addToImports(_feature_package, _operator_plus_2);
            _builder.append(_addToImports, "	");
            _builder.append("(this.getFeatureProvider());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t        ");
            _builder.append("ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(createFeature.getCreateName(), createFeature.getCreateDescription(), createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);");
            _builder.newLine();
            _builder.append("\t\t\t        ");
            _builder.append("PaletteCompartmentEntry compartment = compartments.get(\"");
            String _paletteCompartment = behaviour.getPaletteCompartment();
            _builder.append(_paletteCompartment, "			        ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t        ");
            _builder.append("if( compartment == null ){");
            _builder.newLine();
            _builder.append("\t\t    \t        ");
            _builder.append("compartment = new PaletteCompartmentEntry(\"");
            String _paletteCompartment_1 = behaviour.getPaletteCompartment();
            _builder.append(_paletteCompartment_1, "		    	        ");
            _builder.append("\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t    \t    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t\t        ");
            _builder.append("compartments.put(\"");
            String _paletteCompartment_2 = behaviour.getPaletteCompartment();
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
              Iterable<MetaReference> _filter_2 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference : _filter_2) {
                String _name_1 = this.e1.getName(reference);
                final String referenceName = _name_1;
                _builder.newLineIfNotEmpty();
                EClass _type_1 = metaClass.getType();
                EList<EReference> _eAllReferences = _type_1.getEAllReferences();
                final Function1<EReference,Boolean> _function_2 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_1) {
                      String _name_2 = e_1.getName();
                      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_2, referenceName);
                      return ((Boolean)_operator_equals_1);
                    }
                  };
                EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_2);
                EReference target = _findFirst;
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType = target.getEReferenceType();
                  boolean _isAbstract = _eReferenceType.isAbstract();
                  boolean _operator_not = BooleanExtensions.operator_not(_isAbstract);
                  if (_operator_not) {
                    _builder.append("\t\t\t\t\t");
                    String _createFeatureClassName = this.naming.getCreateFeatureClassName(reference);
                    String _shortName = this.importUtil.shortName(_createFeatureClassName);
                    StringConcatenation _objectCreationEntry = this.objectCreationEntry(_shortName, "XXX");
                    _builder.append(_objectCreationEntry, "					");
                    _builder.newLineIfNotEmpty();
                    _builder.append("//\t\t\t\t\t, new ");
                    String _createFeatureClassName_1 = this.naming.getCreateFeatureClassName(reference);
                    _builder.append(_createFeatureClassName_1, "");
                    _builder.append("(this)");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EClass _eReferenceType_1 = target.getEReferenceType();
                  List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_1);
                  for(final EClass subclass : _subclasses) {
                    {
                      boolean _isAbstract_1 = subclass.isAbstract();
                      boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
                      if (_operator_not_1) {
                        _builder.append("\t\t\t\t\t\t\t");
                        String _createReferenceAsListFeatureClassName = this.naming.getCreateReferenceAsListFeatureClassName(reference, subclass);
                        String _shortName_1 = this.importUtil.shortName(_createReferenceAsListFeatureClassName);
                        StringConcatenation _objectCreationEntry_1 = this.objectCreationEntry(_shortName_1, "XXX");
                        _builder.append(_objectCreationEntry_1, "							");
                        _builder.newLineIfNotEmpty();
                        _builder.append("//\t\t\t\t\t, new ");
                        String _createReferenceAsListFeatureClassName_1 = this.naming.getCreateReferenceAsListFeatureClassName(reference, subclass);
                        _builder.append(_createReferenceAsListFeatureClassName_1, "");
                        String _name_3 = subclass.getName();
                        _builder.append(_name_3, "");
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
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_3 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_1) {
            Shape _representedBy_2 = m_1.getRepresentedBy();
            return ((Boolean)(_representedBy_2 instanceof org.eclipselabs.spray.mm.spray.Container));
          }
        };
      Iterable<MetaClass> _filter_3 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_3);
      final Function1<MetaClass,Container> _function_4 = new Function1<MetaClass,Container>() {
          public Container apply(final MetaClass m_2) {
            Shape _representedBy_3 = m_2.getRepresentedBy();
            return ((Container) _representedBy_3);
          }
        };
      Iterable<Container> _map = IterableExtensions.<MetaClass, Container>map(_filter_3, _function_4);
      for(final Container container_1 : _map) {
        {
          SprayElement[] _parts_1 = container_1.getParts();
          Iterable<MetaReference> _filter_4 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.eclipselabs.spray.mm.spray.MetaReference.class);
          for(final MetaReference metaRef : _filter_4) {
            _builder.append("\t\t        ");
            String _name_4 = this.e1.getName(metaRef);
            final String metaRefName = _name_4;
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t    ");
            MetaClass _represents = container_1.getRepresents();
            EClass _type_2 = _represents.getType();
            EList<EReference> _eAllReferences_1 = _type_2.getEAllReferences();
            final Function1<EReference,Boolean> _function_5 = new Function1<EReference,Boolean>() {
                public Boolean apply(final EReference e_2) {
                  String _name_5 = e_2.getName();
                  boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_5, metaRefName);
                  return ((Boolean)_operator_equals_2);
                }
              };
            EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_5);
            final EReference target_1 = _findFirst_1;
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t        ");
            String _name_6 = diagram.getName();
            String _operator_plus_3 = StringExtensions.operator_plus(_name_6, "Create");
            MetaClass _represents_1 = container_1.getRepresents();
            String _name_7 = this.e1.getName(_represents_1);
            String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _name_7);
            String _name_8 = this.e1.getName(metaRef);
            String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name_8);
            EClass _eReferenceType_2 = target_1.getEReferenceType();
            String _name_9 = _eReferenceType_2.getName();
            String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, _name_9);
            String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "Feature");
            final String createFeatureName = _operator_plus_7;
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
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_6 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_3) {
            Shape _representedBy_4 = m_3.getRepresentedBy();
            return ((Boolean)(_representedBy_4 instanceof org.eclipselabs.spray.mm.spray.Connection));
          }
        };
      Iterable<MetaClass> _filter_5 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_2)), _function_6);
      final Function1<MetaClass,Behaviour[]> _function_7 = new Function1<MetaClass,Behaviour[]>() {
          public Behaviour[] apply(final MetaClass m_4) {
            Behaviour[] _behaviours_1 = m_4.getBehaviours();
            return _behaviours_1;
          }
        };
      Iterable<Behaviour[]> _map_1 = IterableExtensions.<MetaClass, Behaviour[]>map(_filter_5, _function_7);
      for(final Behaviour[] behaviours2 : _map_1) {
        {
          final Behaviour[] typeConverted_behaviours2 = (Behaviour[])behaviours2;
          final Function1<Behaviour,Boolean> _function_8 = new Function1<Behaviour,Boolean>() {
              public Boolean apply(final Behaviour e_3) {
                BehaviourType _type_3 = e_3.getType();
                boolean _operator_equals_3 = ObjectExtensions.operator_equals(_type_3, BehaviourType.CREATE_BEHAVIOUR);
                return ((Boolean)_operator_equals_3);
              }
            };
          Iterable<Behaviour> _filter_6 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(typeConverted_behaviours2)), _function_8);
          for(final Behaviour behaviour_1 : _filter_6) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("ICreateConnectionFeature createFeature = new ");
            String _feature_package_1 = GeneratorUtil.feature_package();
            String _name_10 = diagram.getName();
            String _operator_plus_8 = StringExtensions.operator_plus(_name_10, "Create");
            MetaClass _metaClass_1 = behaviour_1.getMetaClass();
            String _visibleName_1 = GeneratorUtil.visibleName(_metaClass_1);
            String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, _visibleName_1);
            String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, "Feature");
            String _addToImports_1 = XtendProperties.addToImports(_feature_package_1, _operator_plus_10);
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
            String _paletteCompartment_3 = behaviour_1.getPaletteCompartment();
            _builder.append(_paletteCompartment_3, "    ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("if( compartment == null ){");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("compartment = new PaletteCompartmentEntry(\"");
            String _paletteCompartment_4 = behaviour_1.getPaletteCompartment();
            _builder.append(_paletteCompartment_4, "        ");
            _builder.append("\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("compartments.put(\"");
            String _paletteCompartment_5 = behaviour_1.getPaletteCompartment();
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
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      for(final MetaClass metaClass_1 : _metaClasses_3) {
        {
          MetaReference[] _references = metaClass_1.getReferences();
          for(final MetaReference metaReference : _references) {
            _builder.append("{");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("// ");
            String _name_11 = this.e1.getName(metaReference);
            _builder.append(_name_11, "    ");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("ICreateConnectionFeature createFeature = new ");
            String _feature_package_2 = GeneratorUtil.feature_package();
            String _name_12 = diagram.getName();
            String _operator_plus_11 = StringExtensions.operator_plus(_name_12, "Create");
            MetaClass _metaClass_2 = metaReference.getMetaClass();
            String _name_13 = this.e1.getName(_metaClass_2);
            String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, _name_13);
            String _name_14 = this.e1.getName(metaReference);
            String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, _name_14);
            String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, "Feature");
            String _addToImports_2 = XtendProperties.addToImports(_feature_package_2, _operator_plus_14);
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