package org.xspray.generator.graphiti.templates;

import com.google.inject.Inject;
import java.util.ArrayList;
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
import org.xspray.generator.graphiti.templates.FileGenerator;
import org.xspray.generator.graphiti.templates.JavaGenFile;
import org.xspray.generator.graphiti.util.GeneratorUtil;
import org.xspray.generator.graphiti.util.MetaModel;
import org.xspray.mm.xspray.Behaviour;
import org.xspray.mm.xspray.BehaviourType;
import org.xspray.mm.xspray.Connection;
import org.xspray.mm.xspray.Container;
import org.xspray.mm.xspray.Diagram;
import org.xspray.mm.xspray.MetaClass;
import org.xspray.mm.xspray.MetaReference;
import org.xspray.mm.xspray.Shape;
import org.xspray.mm.xspray.SprayElement;
import org.xspray.mm.xspray.extensions.XsprayExtensions;

@SuppressWarnings("all")
public class FeatureProvider extends FileGenerator {
  
  @Inject
  private XsprayExtensions e1;
  
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
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICopyFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IDirectEditingFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ILayoutFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IMoveShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IPasteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IResizeShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IUpdateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICopyContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICustomContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDirectEditingContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ILayoutContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IMoveShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IPasteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IPictogramElementContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IResizeShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.custom.ICustomFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDeleteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDeleteContext;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".OwnerPropertyDeleteFeature;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("import ");
        String _feature_package = GeneratorUtil.feature_package();
        _builder.append(_feature_package, "");
        _builder.append(".");
        String _name = diagram.getName();
        _builder.append(_name, "");
        _builder.append("Add");
        String _visibleName = GeneratorUtil.visibleName(cls);
        _builder.append(_visibleName, "");
        _builder.append("Feature;    // 1");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _feature_package_1 = GeneratorUtil.feature_package();
        _builder.append(_feature_package_1, "");
        _builder.append(".");
        String _name_1 = diagram.getName();
        _builder.append(_name_1, "");
        _builder.append("Create");
        String _visibleName_1 = GeneratorUtil.visibleName(cls);
        _builder.append(_visibleName_1, "");
        _builder.append("Feature; ");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _feature_package_2 = GeneratorUtil.feature_package();
        _builder.append(_feature_package_2, "");
        _builder.append(".");
        String _name_2 = diagram.getName();
        _builder.append(_name_2, "");
        _builder.append("Update");
        String _visibleName_2 = GeneratorUtil.visibleName(cls);
        _builder.append(_visibleName_2, "");
        _builder.append("Feature; // 3");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy = m.getRepresentedBy();
            boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof org.xspray.mm.xspray.Connection));
            return ((Boolean)_operator_not);
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function);
      for(final MetaClass cls_1 : _filter) {
        _builder.append("import ");
        String _feature_package_3 = GeneratorUtil.feature_package();
        _builder.append(_feature_package_3, "");
        _builder.append(".");
        String _name_3 = diagram.getName();
        _builder.append(_name_3, "");
        _builder.append("Layout");
        String _visibleName_3 = GeneratorUtil.visibleName(cls_1);
        _builder.append(_visibleName_3, "");
        _builder.append("Feature; // 4");
        _builder.newLineIfNotEmpty();
        {
          Shape _representedBy_1 = cls_1.getRepresentedBy();
          if ((_representedBy_1 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t        ");
            Shape _representedBy_2 = cls_1.getRepresentedBy();
            Container container = ((Container) _representedBy_2);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_1 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference : _filter_1) {
                _builder.append("\t\t\t");
                EClass _type = cls_1.getType();
                EList<EReference> _eAllReferences = _type.getEAllReferences();
                EList<EReference> references = _eAllReferences;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                String _name_4 = this.e1.getName(reference);
                final String referenceName = _name_4;
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                final Function1<EReference,Boolean> _function_1 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e) {
                      String _name_5 = e.getName();
                      boolean _operator_equals = ObjectExtensions.operator_equals(_name_5, referenceName);
                      return ((Boolean)_operator_equals);
                    }
                  };
                EReference _findFirst = IterableExtensions.<EReference>findFirst(references, _function_1);
                EReference target = _findFirst;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType = target.getEReferenceType();
                  boolean _isAbstract = _eReferenceType.isAbstract();
                  boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract);
                  if (_operator_not_1) {
                    _builder.append("import ");
                    String _feature_package_4 = GeneratorUtil.feature_package();
                    _builder.append(_feature_package_4, "");
                    _builder.append(".");
                    Diagram _diagram = cls_1.getDiagram();
                    String _name_6 = _diagram.getName();
                    _builder.append(_name_6, "");
                    _builder.append("Create");
                    String _name_7 = this.e1.getName(cls_1);
                    _builder.append(_name_7, "");
                    String _name_8 = this.e1.getName(reference);
                    _builder.append(_name_8, "");
                    EClass _eReferenceType_1 = target.getEReferenceType();
                    String _name_9 = _eReferenceType_1.getName();
                    _builder.append(_name_9, "");
                    _builder.append("Feature; // 5");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("import ");
                String _feature_package_5 = GeneratorUtil.feature_package();
                _builder.append(_feature_package_5, "");
                _builder.append(".");
                Diagram _diagram_1 = cls_1.getDiagram();
                String _name_10 = _diagram_1.getName();
                _builder.append(_name_10, "");
                _builder.append("Update");
                String _name_11 = this.e1.getName(cls_1);
                _builder.append(_name_11, "");
                String _name_12 = this.e1.getName(reference);
                _builder.append(_name_12, "");
                _builder.append("Feature; // 5");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType_2 = target.getEReferenceType();
                  List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_2);
                  for(final EClass subclass : _subclasses) {
                    {
                      boolean _isAbstract_1 = subclass.isAbstract();
                      boolean _operator_not_2 = BooleanExtensions.operator_not(_isAbstract_1);
                      if (_operator_not_2) {
                        _builder.append("import ");
                        String _feature_package_6 = GeneratorUtil.feature_package();
                        _builder.append(_feature_package_6, "");
                        _builder.append(".");
                        Diagram _diagram_2 = cls_1.getDiagram();
                        String _name_13 = _diagram_2.getName();
                        _builder.append(_name_13, "");
                        _builder.append("Create");
                        String _name_14 = this.e1.getName(cls_1);
                        _builder.append(_name_14, "");
                        String _name_15 = this.e1.getName(reference);
                        _builder.append(_name_15, "");
                        String _name_16 = subclass.getName();
                        _builder.append(_name_16, "");
                        _builder.append("Feature; // 6");
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
    {
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      for(final MetaClass cls_2 : _metaClasses_2) {
        _builder.append("import ");
        EClass _type_1 = cls_2.getType();
        String _fullPackageName = MetaModel.fullPackageName(_type_1);
        _builder.append(_fullPackageName, "");
        _builder.append(".impl.");
        String _name_17 = this.e1.getName(cls_2);
        _builder.append(_name_17, "");
        _builder.append("Impl; // 7");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        EClass _type_2 = cls_2.getType();
        String _fullPackageName_1 = MetaModel.fullPackageName(_type_2);
        _builder.append(_fullPackageName_1, "");
        _builder.append(".");
        String _name_18 = this.e1.getName(cls_2);
        _builder.append(_name_18, "");
        _builder.append("; // 77");
        _builder.newLineIfNotEmpty();
        {
          MetaReference[] _references = cls_2.getReferences();
          final Function1<MetaReference,Boolean> _function_2 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref) {
                Connection _representedBy_3 = ref.getRepresentedBy();
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_representedBy_3, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<MetaReference> _filter_2 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function_2);
          for(final MetaReference reference_1 : _filter_2) {
            _builder.append("import ");
            String _feature_package_7 = GeneratorUtil.feature_package();
            _builder.append(_feature_package_7, "");
            _builder.append(".");
            String _name_19 = diagram.getName();
            _builder.append(_name_19, "");
            _builder.append("AddReference");
            String _name_20 = this.e1.getName(cls_2);
            _builder.append(_name_20, "");
            String _name_21 = this.e1.getName(reference_1);
            _builder.append(_name_21, "");
            _builder.append("Feature; // 8");
            _builder.newLineIfNotEmpty();
            _builder.append("import ");
            String _feature_package_8 = GeneratorUtil.feature_package();
            _builder.append(_feature_package_8, "");
            _builder.append(".");
            String _name_22 = diagram.getName();
            _builder.append(_name_22, "");
            _builder.append("Create");
            MetaClass _metaClass = reference_1.getMetaClass();
            String _name_23 = this.e1.getName(_metaClass);
            _builder.append(_name_23, "");
            String _name_24 = this.e1.getName(reference_1);
            _builder.append(_name_24, "");
            _builder.append("Feature;");
            _builder.newLineIfNotEmpty();
            _builder.append("import ");
            String _feature_package_9 = GeneratorUtil.feature_package();
            _builder.append(_feature_package_9, "");
            _builder.append(".");
            String _name_25 = diagram.getName();
            _builder.append(_name_25, "");
            _builder.append("DeleteReference");
            MetaClass _metaClass_1 = reference_1.getMetaClass();
            String _name_26 = this.e1.getName(_metaClass_1);
            _builder.append(_name_26, "");
            String _name_27 = this.e1.getName(reference_1);
            _builder.append(_name_27, "");
            _builder.append("Feature;");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Shape _representedBy_4 = cls_2.getRepresentedBy();
          if ((_representedBy_4 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t        ");
            Shape _representedBy_5 = cls_2.getRepresentedBy();
            Container container_1 = ((Container) _representedBy_5);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_1 = container_1.getParts();
              Iterable<MetaReference> _filter_3 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference_2 : _filter_3) {
                String _name_28 = this.e1.getName(reference_2);
                final String referenceName_1 = _name_28;
                _builder.newLineIfNotEmpty();
                EClass _type_3 = cls_2.getType();
                EList<EReference> _eAllReferences_1 = _type_3.getEAllReferences();
                final Function1<EReference,Boolean> _function_3 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_1) {
                      String _name_29 = e_1.getName();
                      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_29, referenceName_1);
                      return ((Boolean)_operator_equals_1);
                    }
                  };
                EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_3);
                EReference target_1 = _findFirst_1;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("import ");
                EClass _eReferenceType_3 = target_1.getEReferenceType();
                String _fullPackageName_2 = MetaModel.fullPackageName(_eReferenceType_3);
                _builder.append(_fullPackageName_2, "");
                _builder.append(".");
                EClass _eReferenceType_4 = target_1.getEReferenceType();
                String _name_30 = _eReferenceType_4.getName();
                _builder.append(_name_30, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("import ");
                String _feature_package_10 = GeneratorUtil.feature_package();
                _builder.append(_feature_package_10, "");
                _builder.append(".");
                String _name_31 = diagram.getName();
                _builder.append(_name_31, "");
                _builder.append("Add");
                String _name_32 = this.e1.getName(cls_2);
                _builder.append(_name_32, "");
                String _name_33 = this.e1.getName(reference_2);
                _builder.append(_name_33, "");
                _builder.append("ListFeature; // 9");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType_5 = target_1.getEReferenceType();
                  boolean _isAbstract_2 = _eReferenceType_5.isAbstract();
                  boolean _operator_not_3 = BooleanExtensions.operator_not(_isAbstract_2);
                  if (_operator_not_3) {
                    _builder.append("import ");
                    String _feature_package_11 = GeneratorUtil.feature_package();
                    _builder.append(_feature_package_11, "");
                    _builder.append(".");
                    String _name_34 = diagram.getName();
                    _builder.append(_name_34, "");
                    _builder.append("Update");
                    EClass _eReferenceType_6 = target_1.getEReferenceType();
                    String _name_35 = _eReferenceType_6.getName();
                    _builder.append(_name_35, "");
                    _builder.append("Feature;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("// import all custom features");
    _builder.newLine();
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> allnames1 = _arrayList;
    _builder.newLineIfNotEmpty();
    {
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      for(final MetaClass metaClass : _metaClasses_3) {
        {
          Behaviour[] _behaviours = metaClass.getBehaviours();
          for(final Behaviour behaviour : _behaviours) {
            {
              String _name_36 = behaviour.getName();
              boolean _contains = allnames1.contains(_name_36);
              boolean _operator_not_4 = BooleanExtensions.operator_not(_contains);
              if (_operator_not_4) {
                _builder.append("import ");
                String _feature_package_12 = GeneratorUtil.feature_package();
                _builder.append(_feature_package_12, "");
                _builder.append(".");
                String _name_37 = diagram.getName();
                _builder.append(_name_37, "");
                _builder.append("Custom");
                String _name_38 = behaviour.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_38);
                _builder.append(_firstUpper, "");
                _builder.append("Feature;// ");
                String _name_39 = behaviour.getName();
                boolean _add = allnames1.add(_name_39);
                _builder.append(_add, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends DefaultFeatureProvider {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "	");
    _builder.append("(IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IAddFeature getAddFeature(IAddContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// is object for add request a EClass or EReference?");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Object object = context.getNewObject() ;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String reference = (String)context.getProperty(\"REFERENCE\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_4 = diagram.getMetaClasses();
      for(final MetaClass cls_3 : _metaClasses_4) {
        _builder.append("\t\t");
        _builder.append("if ( is");
        String _visibleName_4 = GeneratorUtil.visibleName(cls_3);
        _builder.append(_visibleName_4, "		");
        _builder.append("(object) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t            ");
        _builder.append("if ( reference == null ){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return new ");
        String _name_40 = diagram.getName();
        _builder.append(_name_40, "				");
        _builder.append("Add");
        String _visibleName_5 = GeneratorUtil.visibleName(cls_3);
        _builder.append(_visibleName_5, "				");
        _builder.append("Feature(this);");
        _builder.newLineIfNotEmpty();
        {
          MetaReference[] _references_1 = cls_3.getReferences();
          final Function1<MetaReference,Boolean> _function_4 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref_1) {
                Connection _representedBy_6 = ref_1.getRepresentedBy();
                boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_representedBy_6, null);
                return ((Boolean)_operator_notEquals_1);
              }
            };
          Iterable<MetaReference> _filter_4 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_1)), _function_4);
          for(final MetaReference reference_3 : _filter_4) {
            _builder.append("\t\t\t            ");
            _builder.append("} else if( reference.equals(\"");
            String _name_41 = this.e1.getName(reference_3);
            _builder.append(_name_41, "			            ");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t            ");
            _builder.append("    ");
            _builder.append("return new ");
            String _name_42 = diagram.getName();
            _builder.append(_name_42, "			                ");
            _builder.append("AddReference");
            String _name_43 = this.e1.getName(cls_3);
            _builder.append(_name_43, "			                ");
            String _name_44 = this.e1.getName(reference_3);
            _builder.append(_name_44, "			                ");
            _builder.append("Feature(this);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("} ");
        _builder.newLine();
        {
          Shape _representedBy_7 = cls_3.getRepresentedBy();
          if ((_representedBy_7 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_8 = cls_3.getRepresentedBy();
            Container container_2 = ((Container) _representedBy_8);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_2 = container_2.getParts();
              Iterable<MetaReference> _filter_5 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_2)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference_4 : _filter_5) {
                String _name_45 = this.e1.getName(reference_4);
                final String referenceName_2 = _name_45;
                _builder.newLineIfNotEmpty();
                EClass _type_4 = cls_3.getType();
                EList<EReference> _eAllReferences_2 = _type_4.getEAllReferences();
                final Function1<EReference,Boolean> _function_5 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_2) {
                      String _name_46 = e_2.getName();
                      boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_46, referenceName_2);
                      return ((Boolean)_operator_equals_2);
                    }
                  };
                EReference _findFirst_2 = IterableExtensions.<EReference>findFirst(_eAllReferences_2, _function_5);
                EReference target_2 = _findFirst_2;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("if( object instanceof ");
                EClass _eReferenceType_7 = target_2.getEReferenceType();
                String _name_47 = _eReferenceType_7.getName();
                _builder.append(_name_47, "");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return new ");
                Diagram _diagram_3 = cls_3.getDiagram();
                String _name_48 = _diagram_3.getName();
                _builder.append(_name_48, "	");
                _builder.append("Add");
                String _name_49 = this.e1.getName(cls_3);
                _builder.append(_name_49, "	");
                String _name_50 = this.e1.getName(reference_4);
                _builder.append(_name_50, "	");
                _builder.append("ListFeature(this);");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return super.getAddFeature(context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ICreateFeature[] getCreateFeatures() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ICreateFeature[] { ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_5 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_6 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_3) {
            Shape _representedBy_9 = e_3.getRepresentedBy();
            boolean _operator_not_5 = BooleanExtensions.operator_not((_representedBy_9 instanceof org.xspray.mm.xspray.Connection));
            return ((Boolean)_operator_not_5);
          }
        };
      Iterable<MetaClass> _filter_6 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_5)), _function_6);
      boolean hasAnyElements = false;
      for(final MetaClass cls_4 : _filter_6) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        _builder.append("new ");
        String _name_51 = diagram.getName();
        _builder.append(_name_51, "		");
        _builder.append("Create");
        String _visibleName_6 = GeneratorUtil.visibleName(cls_4);
        _builder.append(_visibleName_6, "		");
        _builder.append("Feature(this) ");
        _builder.newLineIfNotEmpty();
        {
          Shape _representedBy_10 = cls_4.getRepresentedBy();
          if ((_representedBy_10 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_11 = cls_4.getRepresentedBy();
            Container container_3 = ((Container) _representedBy_11);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_3 = container_3.getParts();
              Iterable<MetaReference> _filter_7 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_3)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference_5 : _filter_7) {
                String _name_52 = this.e1.getName(reference_5);
                final String referenceName_3 = _name_52;
                _builder.newLineIfNotEmpty();
                EClass _type_5 = cls_4.getType();
                EList<EReference> _eAllReferences_3 = _type_5.getEAllReferences();
                final Function1<EReference,Boolean> _function_7 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_4) {
                      String _name_53 = e_4.getName();
                      boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_53, referenceName_3);
                      return ((Boolean)_operator_equals_3);
                    }
                  };
                EReference _findFirst_3 = IterableExtensions.<EReference>findFirst(_eAllReferences_3, _function_7);
                EReference target_3 = _findFirst_3;
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType_8 = target_3.getEReferenceType();
                  boolean _isAbstract_3 = _eReferenceType_8.isAbstract();
                  boolean _operator_not_6 = BooleanExtensions.operator_not(_isAbstract_3);
                  if (_operator_not_6) {
                    _builder.append(", new ");
                    Diagram _diagram_4 = cls_4.getDiagram();
                    String _name_54 = _diagram_4.getName();
                    _builder.append(_name_54, "");
                    _builder.append("Create");
                    String _name_55 = this.e1.getName(cls_4);
                    _builder.append(_name_55, "");
                    String _name_56 = this.e1.getName(reference_5);
                    _builder.append(_name_56, "");
                    EClass _eReferenceType_9 = target_3.getEReferenceType();
                    String _name_57 = _eReferenceType_9.getName();
                    _builder.append(_name_57, "");
                    _builder.append("Feature(this)");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EClass _eReferenceType_10 = target_3.getEReferenceType();
                  List<EClass> _subclasses_1 = MetaModel.getSubclasses(_eReferenceType_10);
                  for(final EClass subclass_1 : _subclasses_1) {
                    {
                      boolean _isAbstract_4 = subclass_1.isAbstract();
                      boolean _operator_not_7 = BooleanExtensions.operator_not(_isAbstract_4);
                      if (_operator_not_7) {
                        _builder.append(", new ");
                        Diagram _diagram_5 = cls_4.getDiagram();
                        String _name_58 = _diagram_5.getName();
                        _builder.append(_name_58, "");
                        _builder.append("Create");
                        String _name_59 = this.e1.getName(cls_4);
                        _builder.append(_name_59, "");
                        String _name_60 = this.e1.getName(reference_5);
                        _builder.append(_name_60, "");
                        String _name_61 = subclass_1.getName();
                        _builder.append(_name_61, "");
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
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IUpdateFeature getUpdateFeature(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//\tif (pictogramElement instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_6 = diagram.getMetaClasses();
      for(final MetaClass cls_5 : _metaClasses_6) {
        {
          Shape _representedBy_12 = cls_5.getRepresentedBy();
          boolean _operator_not_8 = BooleanExtensions.operator_not((_representedBy_12 instanceof org.xspray.mm.xspray.Connection));
          if (_operator_not_8) {
            _builder.append("if ( is");
            String _visibleName_7 = GeneratorUtil.visibleName(cls_5);
            _builder.append(_visibleName_7, "");
            _builder.append("(bo) ) { // 11");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("return new ");
            String _name_62 = diagram.getName();
            _builder.append(_name_62, "						");
            _builder.append("Update");
            String _visibleName_8 = GeneratorUtil.visibleName(cls_5);
            _builder.append(_visibleName_8, "						");
            _builder.append("Feature(this); ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          Shape _representedBy_13 = cls_5.getRepresentedBy();
          if ((_representedBy_13 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_14 = cls_5.getRepresentedBy();
            Container container_4 = ((Container) _representedBy_14);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_4 = container_4.getParts();
              Iterable<MetaReference> _filter_8 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_4)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference_6 : _filter_8) {
                String _name_63 = this.e1.getName(reference_6);
                final String referenceName_4 = _name_63;
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t\t    \t\t");
                EClass _type_6 = cls_5.getType();
                EList<EReference> _eAllReferences_4 = _type_6.getEAllReferences();
                final Function1<EReference,Boolean> _function_8 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_5) {
                      String _name_64 = e_5.getName();
                      boolean _operator_equals_4 = ObjectExtensions.operator_equals(_name_64, referenceName_4);
                      return ((Boolean)_operator_equals_4);
                    }
                  };
                EReference _findFirst_4 = IterableExtensions.<EReference>findFirst(_eAllReferences_4, _function_8);
                EClass _eReferenceType_11 = _findFirst_4.getEReferenceType();
                EClass eClass = _eReferenceType_11;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isAbstract_5 = eClass.isAbstract();
                  if (_isAbstract_5) {
                    _builder.append("if (bo instanceof ");
                    String _name_65 = eClass.getName();
                    _builder.append(_name_65, "");
                    _builder.append(") { // 22");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("return new ");
                    String _name_66 = diagram.getName();
                    _builder.append(_name_66, "	");
                    _builder.append("Update");
                    String _name_67 = this.e1.getName(cls_5);
                    _builder.append(_name_67, "	");
                    String _name_68 = this.e1.getName(reference_6);
                    _builder.append(_name_68, "	");
                    _builder.append("Feature(this); ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }} else {
            Shape _representedBy_15 = cls_5.getRepresentedBy();
            if ((_representedBy_15 instanceof org.xspray.mm.xspray.Connection)) {
              _builder.append("\t\t\t\t        ");
              Shape _representedBy_16 = cls_5.getRepresentedBy();
              Connection connection = ((Connection) _representedBy_16);
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              EClass _type_7 = cls_5.getType();
              EClass eClass_1 = _type_7;
              _builder.append(" ");
              _builder.newLineIfNotEmpty();
              {
                boolean _isAbstract_6 = eClass_1.isAbstract();
                boolean _operator_not_9 = BooleanExtensions.operator_not(_isAbstract_6);
                if (_operator_not_9) {
                  _builder.append("if (bo instanceof ");
                  String _name_69 = eClass_1.getName();
                  _builder.append(_name_69, "");
                  _builder.append(") { // 33");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return new ");
                  String _name_70 = diagram.getName();
                  _builder.append(_name_70, "	");
                  _builder.append("Update");
                  String _name_71 = eClass_1.getName();
                  _builder.append(_name_71, "	");
                  _builder.append("Feature(this); ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          }
        }
      }
    }
    _builder.append("//\t\t}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return super.getUpdateFeature(context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ILayoutFeature getLayoutFeature(ILayoutContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_7 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_9 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m_1) {
            Shape _representedBy_17 = m_1.getRepresentedBy();
            boolean _operator_not_10 = BooleanExtensions.operator_not((_representedBy_17 instanceof org.xspray.mm.xspray.Connection));
            return ((Boolean)_operator_not_10);
          }
        };
      Iterable<MetaClass> _filter_9 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_7)), _function_9);
      for(final MetaClass cls_6 : _filter_9) {
        _builder.append("if ( is");
        String _visibleName_9 = GeneratorUtil.visibleName(cls_6);
        _builder.append(_visibleName_9, "");
        _builder.append("(bo) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("return new ");
        String _name_72 = diagram.getName();
        _builder.append(_name_72, "					");
        _builder.append("Layout");
        String _visibleName_10 = GeneratorUtil.visibleName(cls_6);
        _builder.append(_visibleName_10, "					");
        _builder.append("Feature(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("return super.getLayoutFeature(context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ICreateConnectionFeature[] getCreateConnectionFeatures() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ICreateConnectionFeature[] { ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_8 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_10 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_6) {
            Shape _representedBy_18 = e_6.getRepresentedBy();
            return ((Boolean)(_representedBy_18 instanceof org.xspray.mm.xspray.Connection));
          }
        };
      Iterable<MetaClass> _filter_10 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_8)), _function_10);
      boolean hasAnyElements_1 = false;
      for(final MetaClass cls_7 : _filter_10) {
        if (!hasAnyElements_1) {
          hasAnyElements_1 = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        _builder.append("new ");
        String _name_73 = diagram.getName();
        _builder.append(_name_73, "		");
        _builder.append("Create");
        String _visibleName_11 = GeneratorUtil.visibleName(cls_7);
        _builder.append(_visibleName_11, "		");
        _builder.append("Feature(this) ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MetaClass[] _metaClasses_9 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_11 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_7) {
            Shape _representedBy_19 = e_7.getRepresentedBy();
            return ((Boolean)(_representedBy_19 instanceof org.xspray.mm.xspray.Connection));
          }
        };
      Iterable<MetaClass> _filter_11 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_9)), _function_11);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter_11);
      boolean _operator_not_11 = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not_11) {
        _builder.append("\t\t");
        _builder.append(",");
        _builder.newLine();
      }
    }
    {
      MetaClass[] _metaClasses_10 = diagram.getMetaClasses();
      boolean hasAnyElements_2 = false;
      for(final MetaClass metaClass_1 : _metaClasses_10) {
        if (!hasAnyElements_2) {
          hasAnyElements_2 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        {
          MetaReference[] _references_2 = metaClass_1.getReferences();
          final Function1<MetaReference,Boolean> _function_12 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref_2) {
                Connection _representedBy_20 = ref_2.getRepresentedBy();
                boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_representedBy_20, null);
                return ((Boolean)_operator_notEquals_2);
              }
            };
          Iterable<MetaReference> _filter_12 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_2)), _function_12);
          boolean hasAnyElements_3 = false;
          for(final MetaReference reference_7 : _filter_12) {
            if (!hasAnyElements_3) {
              hasAnyElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("new ");
            String _name_74 = diagram.getName();
            _builder.append(_name_74, "");
            _builder.append("Create");
            MetaClass _metaClass_2 = reference_7.getMetaClass();
            String _name_75 = this.e1.getName(_metaClass_2);
            _builder.append(_name_75, "");
            String _name_76 = this.e1.getName(reference_7);
            _builder.append(_name_76, "");
            _builder.append("Feature(this) ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* (non-Javadoc)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @see");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* org.eclipse.graphiti.features.edit.IFeatureProvider#getDeleteFeatures()");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IDeleteFeature getDeleteFeature(IDeleteContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String reference = Graphiti.getPeService().getPropertyValue(pictogramElement, \"REFERENCE\");");
    _builder.newLine();
    _builder.newLine();
    {
      MetaClass[] _metaClasses_11 = diagram.getMetaClasses();
      for(final MetaClass cls_8 : _metaClasses_11) {
        _builder.append("\t\t        ");
        _builder.append("if ( is");
        String _visibleName_12 = GeneratorUtil.visibleName(cls_8);
        _builder.append(_visibleName_12, "		        ");
        _builder.append("(bo) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("if( reference == null ){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return new DefaultDeleteFeature(this); ");
        _builder.newLine();
        {
          MetaReference[] _references_3 = cls_8.getReferences();
          final Function1<MetaReference,Boolean> _function_13 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref_3) {
                Connection _representedBy_21 = ref_3.getRepresentedBy();
                boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_representedBy_21, null);
                return ((Boolean)_operator_notEquals_3);
              }
            };
          Iterable<MetaReference> _filter_13 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_3)), _function_13);
          for(final MetaReference reference_8 : _filter_13) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("} else if( reference.equals(\"");
            String _name_77 = this.e1.getName(reference_8);
            _builder.append(_name_77, "			");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return new ");
            String _name_78 = diagram.getName();
            _builder.append(_name_78, "				");
            _builder.append("DeleteReference");
            String _name_79 = this.e1.getName(cls_8);
            _builder.append(_name_79, "				");
            String _name_80 = this.e1.getName(reference_8);
            _builder.append(_name_80, "				");
            _builder.append("Feature(this);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("} ");
        _builder.newLine();
        {
          Shape _representedBy_22 = cls_8.getRepresentedBy();
          if ((_representedBy_22 instanceof org.xspray.mm.xspray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_23 = cls_8.getRepresentedBy();
            Container container_5 = ((Container) _representedBy_23);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_5 = container_5.getParts();
              Iterable<MetaReference> _filter_14 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_5)), org.xspray.mm.xspray.MetaReference.class);
              for(final MetaReference reference_9 : _filter_14) {
                _builder.append("\t");
                String _name_81 = this.e1.getName(reference_9);
                final String referenceName_5 = _name_81;
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                EClass _type_8 = cls_8.getType();
                EList<EReference> _eAllReferences_5 = _type_8.getEAllReferences();
                final Function1<EReference,Boolean> _function_14 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_8) {
                      String _name_82 = e_8.getName();
                      boolean _operator_equals_5 = ObjectExtensions.operator_equals(_name_82, referenceName_5);
                      return ((Boolean)_operator_equals_5);
                    }
                  };
                EReference _findFirst_5 = IterableExtensions.<EReference>findFirst(_eAllReferences_5, _function_14);
                EReference target_4 = _findFirst_5;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("if( bo instanceof ");
                EClass _eReferenceType_12 = target_4.getEReferenceType();
                String _name_83 = _eReferenceType_12.getName();
                _builder.append(_name_83, "");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return new OwnerPropertyDeleteFeature(this);");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new DefaultDeleteFeature(this); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/** Ensure that any shape with property CAN_MOVE set to false will not have a move feature.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Shape s = context.getShape();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String stat  = Graphiti.getPeService().getPropertyValue(s, \"CAN_MOVE\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if( (stat != null) && (stat.equals(\"false\") )){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return super.getMoveShapeFeature(context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ICustomFeature[] getCustomFeatures(ICustomContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);");
    _builder.newLine();
    {
      MetaClass[] _metaClasses_12 = diagram.getMetaClasses();
      for(final MetaClass metaClass_2 : _metaClasses_12) {
        {
          Behaviour[] _behaviours_1 = metaClass_2.getBehaviours();
          boolean _isEmpty_1 = ((List<Behaviour>)Conversions.doWrapArray(_behaviours_1)).isEmpty();
          boolean _operator_not_12 = BooleanExtensions.operator_not(_isEmpty_1);
          if (_operator_not_12) {
            _builder.append("\t\t\t            ");
            _builder.append("if( is");
            String _visibleName_13 = GeneratorUtil.visibleName(metaClass_2);
            _builder.append(_visibleName_13, "			            ");
            _builder.append("(bo)  ){");
            _builder.newLineIfNotEmpty();
            _builder.append("return new ICustomFeature[]{ ");
            _builder.newLine();
            ArrayList<String> _arrayList_1 = new ArrayList<String>();
            List<String> allnames2 = _arrayList_1;
            _builder.newLineIfNotEmpty();
            {
              Behaviour[] _behaviours_2 = metaClass_2.getBehaviours();
              final Function1<Behaviour,Boolean> _function_15 = new Function1<Behaviour,Boolean>() {
                  public Boolean apply(final Behaviour b) {
                    BehaviourType _type_9 = b.getType();
                    boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_type_9, BehaviourType.CREATE_BEHAVIOUR);
                    return ((Boolean)_operator_notEquals_4);
                  }
                };
              Iterable<Behaviour> _filter_15 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(_behaviours_2)), _function_15);
              boolean hasAnyElements_4 = false;
              for(final Behaviour behaviour_1 : _filter_15) {
                if (!hasAnyElements_4) {
                  hasAnyElements_4 = true;
                } else {
                  _builder.appendImmediate(",", "");
                }
                {
                  String _name_84 = behaviour_1.getName();
                  boolean _contains_1 = allnames2.contains(_name_84);
                  boolean _operator_not_13 = BooleanExtensions.operator_not(_contains_1);
                  if (_operator_not_13) {
                    _builder.append("new ");
                    String _name_85 = diagram.getName();
                    _builder.append(_name_85, "");
                    _builder.append("Custom");
                    String _name_86 = behaviour_1.getName();
                    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_86);
                    _builder.append(_firstUpper_1, "");
                    _builder.append("Feature(this) // ");
                    String _name_87 = behaviour_1.getName();
                    boolean _add_1 = allnames2.add(_name_87);
                    _builder.append(_add_1, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("};");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("        ");
    _builder.append("return new ICustomFeature[]{ };");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      MetaClass[] _metaClasses_13 = diagram.getMetaClasses();
      for(final MetaClass metaClass_3 : _metaClasses_13) {
        StringConcatenation _isOfType = this.isOfType(metaClass_3);
        _builder.append(_isOfType, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation isOfType(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/** Check the type of the domain object \'object\'");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected boolean is");
    String _visibleName = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName, "");
    _builder.append("(Object object){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if ( (object instanceof ");
    String _name = this.e1.getName(metaClass);
    _builder.append(_name, "    ");
    _builder.append("Impl) && object.getClass().getSimpleName().equals(\"");
    String _name_1 = this.e1.getName(metaClass);
    _builder.append(_name_1, "    ");
    _builder.append("Impl\") ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}