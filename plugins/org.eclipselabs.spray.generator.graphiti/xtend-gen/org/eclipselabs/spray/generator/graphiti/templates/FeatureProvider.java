package org.eclipselabs.spray.generator.graphiti.templates;

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
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Behaviour;
import org.eclipselabs.spray.mm.spray.BehaviourType;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;

@SuppressWarnings("all")
public class FeatureProvider extends FileGenerator {
  
  @Inject
  private ImportUtil importUtil;
  
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private NamingExtensions e2;
  
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
    String _feature_package = GeneratorUtil.feature_package();
    this.importUtil.initImports(_feature_package);
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package_1 = GeneratorUtil.feature_package();
    _builder.append(_feature_package_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    StringConcatenation _mainFileBody = this.mainFileBody(diagram, className);
    final StringConcatenation body = _mainFileBody;
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
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("\t\t");
        _builder.append("if ( is");
        String _visibleName = GeneratorUtil.visibleName(cls);
        _builder.append(_visibleName, "		");
        _builder.append("(object) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t            ");
        _builder.append("if ( reference == null ){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return new ");
        String _addFeatureClassName = this.e2.getAddFeatureClassName(cls);
        String _shortName = this.importUtil.shortName(_addFeatureClassName);
        _builder.append(_shortName, "				");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        {
          MetaReference[] _references = cls.getReferences();
          final Function1<MetaReference,Boolean> _function = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref) {
                Connection _representedBy = ref.getRepresentedBy();
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_representedBy, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function);
          for(final MetaReference reference : _filter) {
            _builder.append("\t\t\t            ");
            _builder.append("} else if( reference.equals(\"");
            String _name = this.e1.getName(reference);
            _builder.append(_name, "			            ");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t            ");
            _builder.append("    ");
            _builder.append("return new ");
            String _addReferenceAsConnectionFeatureClassName = this.e2.getAddReferenceAsConnectionFeatureClassName(reference);
            String _shortName_1 = this.importUtil.shortName(_addReferenceAsConnectionFeatureClassName);
            _builder.append(_shortName_1, "			                ");
            _builder.append("(this);");
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
          Shape _representedBy_1 = cls.getRepresentedBy();
          if ((_representedBy_1 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_2 = cls.getRepresentedBy();
            Container container = ((Container) _representedBy_2);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_1 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_1 : _filter_1) {
                String _name_1 = this.e1.getName(reference_1);
                final String referenceName = _name_1;
                _builder.newLineIfNotEmpty();
                EClass _type = cls.getType();
                EList<EReference> _eAllReferences = _type.getEAllReferences();
                final Function1<EReference,Boolean> _function_1 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e) {
                      String _name_2 = e.getName();
                      boolean _operator_equals = ObjectExtensions.operator_equals(_name_2, referenceName);
                      return ((Boolean)_operator_equals);
                    }
                  };
                EReference _findFirst = IterableExtensions.<EReference>findFirst(_eAllReferences, _function_1);
                EReference target = _findFirst;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("if( object instanceof ");
                EClass _eReferenceType = target.getEReferenceType();
                String _name_3 = _eReferenceType.getName();
                _builder.append(_name_3, "");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return new ");
                String _addReferenceAsListFeatureClassName = this.e2.getAddReferenceAsListFeatureClassName(reference_1);
                String _shortName_2 = this.importUtil.shortName(_addReferenceAsListFeatureClassName);
                _builder.append(_shortName_2, "	");
                _builder.append("(this);");
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
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_2 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_1) {
            Shape _representedBy_3 = e_1.getRepresentedBy();
            boolean _operator_not = BooleanExtensions.operator_not((_representedBy_3 instanceof org.eclipselabs.spray.mm.spray.Connection));
            return ((Boolean)_operator_not);
          }
        };
      Iterable<MetaClass> _filter_2 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_2);
      boolean hasAnyElements = false;
      for(final MetaClass cls_1 : _filter_2) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        _builder.append("new ");
        String _createFeatureClassName = this.e2.getCreateFeatureClassName(cls_1);
        String _shortName_3 = this.importUtil.shortName(_createFeatureClassName);
        _builder.append(_shortName_3, "		");
        _builder.append("(this) ");
        _builder.newLineIfNotEmpty();
        {
          Shape _representedBy_4 = cls_1.getRepresentedBy();
          if ((_representedBy_4 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_5 = cls_1.getRepresentedBy();
            Container container_1 = ((Container) _representedBy_5);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_1 = container_1.getParts();
              Iterable<MetaReference> _filter_3 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_1)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_2 : _filter_3) {
                String _name_4 = this.e1.getName(reference_2);
                final String referenceName_1 = _name_4;
                _builder.newLineIfNotEmpty();
                EClass _type_1 = cls_1.getType();
                EList<EReference> _eAllReferences_1 = _type_1.getEAllReferences();
                final Function1<EReference,Boolean> _function_3 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_2) {
                      String _name_5 = e_2.getName();
                      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_name_5, referenceName_1);
                      return ((Boolean)_operator_equals_1);
                    }
                  };
                EReference _findFirst_1 = IterableExtensions.<EReference>findFirst(_eAllReferences_1, _function_3);
                EReference target_1 = _findFirst_1;
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType_1 = target_1.getEReferenceType();
                  boolean _isAbstract = _eReferenceType_1.isAbstract();
                  boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract);
                  if (_operator_not_1) {
                    _builder.append(", new ");
                    String _createFeatureClassName_1 = this.e2.getCreateFeatureClassName(reference_2);
                    String _shortName_4 = this.importUtil.shortName(_createFeatureClassName_1);
                    _builder.append(_shortName_4, "");
                    _builder.append("(this)");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EClass _eReferenceType_2 = target_1.getEReferenceType();
                  List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_2);
                  for(final EClass subclass : _subclasses) {
                    {
                      boolean _isAbstract_1 = subclass.isAbstract();
                      boolean _operator_not_2 = BooleanExtensions.operator_not(_isAbstract_1);
                      if (_operator_not_2) {
                        _builder.append(", new ");
                        String _createReferenceAsListFeatureClassName = this.e2.getCreateReferenceAsListFeatureClassName(reference_2, subclass);
                        String _shortName_5 = this.importUtil.shortName(_createReferenceAsListFeatureClassName);
                        _builder.append(_shortName_5, "");
                        _builder.append("(this)");
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
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      for(final MetaClass cls_2 : _metaClasses_2) {
        {
          Shape _representedBy_6 = cls_2.getRepresentedBy();
          boolean _operator_not_3 = BooleanExtensions.operator_not((_representedBy_6 instanceof org.eclipselabs.spray.mm.spray.Connection));
          if (_operator_not_3) {
            _builder.append("if ( is");
            String _visibleName_1 = GeneratorUtil.visibleName(cls_2);
            _builder.append(_visibleName_1, "");
            _builder.append("(bo) ) { // 11");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("return new ");
            String _updateFeatureClassName = this.e2.getUpdateFeatureClassName(cls_2);
            String _shortName_6 = this.importUtil.shortName(_updateFeatureClassName);
            _builder.append(_shortName_6, "						");
            _builder.append("(this); ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          Shape _representedBy_7 = cls_2.getRepresentedBy();
          if ((_representedBy_7 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_8 = cls_2.getRepresentedBy();
            Container container_2 = ((Container) _representedBy_8);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_2 = container_2.getParts();
              Iterable<MetaReference> _filter_4 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_2)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_3 : _filter_4) {
                String _name_6 = this.e1.getName(reference_3);
                final String referenceName_2 = _name_6;
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t\t    \t\t");
                EClass _type_2 = cls_2.getType();
                EList<EReference> _eAllReferences_2 = _type_2.getEAllReferences();
                final Function1<EReference,Boolean> _function_4 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_3) {
                      String _name_7 = e_3.getName();
                      boolean _operator_equals_2 = ObjectExtensions.operator_equals(_name_7, referenceName_2);
                      return ((Boolean)_operator_equals_2);
                    }
                  };
                EReference _findFirst_2 = IterableExtensions.<EReference>findFirst(_eAllReferences_2, _function_4);
                EClass _eReferenceType_3 = _findFirst_2.getEReferenceType();
                EClass eClass = _eReferenceType_3;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isAbstract_2 = eClass.isAbstract();
                  if (_isAbstract_2) {
                    _builder.append("if (bo instanceof ");
                    String _name_8 = eClass.getName();
                    _builder.append(_name_8, "");
                    _builder.append(") { // 22");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("return new ");
                    String _updateReferenceAsListFeatureClassName = this.e2.getUpdateReferenceAsListFeatureClassName(reference_3);
                    String _shortName_7 = this.importUtil.shortName(_updateReferenceAsListFeatureClassName);
                    _builder.append(_shortName_7, "	");
                    _builder.append("(this); ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }} else {
            Shape _representedBy_9 = cls_2.getRepresentedBy();
            if ((_representedBy_9 instanceof org.eclipselabs.spray.mm.spray.Connection)) {
              _builder.append("\t\t\t\t        ");
              Shape _representedBy_10 = cls_2.getRepresentedBy();
              Connection connection = ((Connection) _representedBy_10);
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              EClass _type_3 = cls_2.getType();
              EClass eClass_1 = _type_3;
              _builder.append(" ");
              _builder.newLineIfNotEmpty();
              {
                boolean _isAbstract_3 = eClass_1.isAbstract();
                boolean _operator_not_4 = BooleanExtensions.operator_not(_isAbstract_3);
                if (_operator_not_4) {
                  _builder.append("if (bo instanceof ");
                  String _name_9 = eClass_1.getName();
                  _builder.append(_name_9, "");
                  _builder.append(") { // 33");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return new ");
                  String _updateFeatureClassName_1 = this.e2.getUpdateFeatureClassName(cls_2);
                  String _shortName_8 = this.importUtil.shortName(_updateFeatureClassName_1);
                  _builder.append(_shortName_8, "	");
                  _builder.append("(this); ");
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
      MetaClass[] _metaClasses_3 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_5 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy_11 = m.getRepresentedBy();
            boolean _operator_not_5 = BooleanExtensions.operator_not((_representedBy_11 instanceof org.eclipselabs.spray.mm.spray.Connection));
            return ((Boolean)_operator_not_5);
          }
        };
      Iterable<MetaClass> _filter_5 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_3)), _function_5);
      for(final MetaClass cls_3 : _filter_5) {
        _builder.append("if ( is");
        String _visibleName_2 = GeneratorUtil.visibleName(cls_3);
        _builder.append(_visibleName_2, "");
        _builder.append("(bo) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("return new ");
        String _layoutFeatureClassName = this.e2.getLayoutFeatureClassName(cls_3);
        String _shortName_9 = this.importUtil.shortName(_layoutFeatureClassName);
        _builder.append(_shortName_9, "					");
        _builder.append("(this);");
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
      MetaClass[] _metaClasses_4 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_6 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_4) {
            Shape _representedBy_12 = e_4.getRepresentedBy();
            return ((Boolean)(_representedBy_12 instanceof org.eclipselabs.spray.mm.spray.Connection));
          }
        };
      Iterable<MetaClass> _filter_6 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_4)), _function_6);
      boolean hasAnyElements_1 = false;
      for(final MetaClass cls_4 : _filter_6) {
        if (!hasAnyElements_1) {
          hasAnyElements_1 = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        _builder.append("new ");
        String _createFeatureClassName_2 = this.e2.getCreateFeatureClassName(cls_4);
        String _shortName_10 = this.importUtil.shortName(_createFeatureClassName_2);
        _builder.append(_shortName_10, "		");
        _builder.append("(this) ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MetaClass[] _metaClasses_5 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_7 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e_5) {
            Shape _representedBy_13 = e_5.getRepresentedBy();
            return ((Boolean)(_representedBy_13 instanceof org.eclipselabs.spray.mm.spray.Connection));
          }
        };
      Iterable<MetaClass> _filter_7 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_5)), _function_7);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter_7);
      boolean _operator_not_6 = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not_6) {
        _builder.append("\t\t");
        _builder.append(",");
        _builder.newLine();
      }
    }
    {
      MetaClass[] _metaClasses_6 = diagram.getMetaClasses();
      boolean hasAnyElements_2 = false;
      for(final MetaClass metaClass : _metaClasses_6) {
        if (!hasAnyElements_2) {
          hasAnyElements_2 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        {
          MetaReference[] _references_1 = metaClass.getReferences();
          final Function1<MetaReference,Boolean> _function_8 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref_1) {
                Connection _representedBy_14 = ref_1.getRepresentedBy();
                boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_representedBy_14, null);
                return ((Boolean)_operator_notEquals_1);
              }
            };
          Iterable<MetaReference> _filter_8 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_1)), _function_8);
          boolean hasAnyElements_3 = false;
          for(final MetaReference reference_4 : _filter_8) {
            if (!hasAnyElements_3) {
              hasAnyElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("new ");
            String _createReferenceAsConnectionFeatureClassName = this.e2.getCreateReferenceAsConnectionFeatureClassName(reference_4);
            String _shortName_11 = this.importUtil.shortName(_createReferenceAsConnectionFeatureClassName);
            _builder.append(_shortName_11, "");
            _builder.append("(this) ");
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
      MetaClass[] _metaClasses_7 = diagram.getMetaClasses();
      for(final MetaClass cls_5 : _metaClasses_7) {
        _builder.append("\t\t        ");
        _builder.append("if ( is");
        String _visibleName_3 = GeneratorUtil.visibleName(cls_5);
        _builder.append(_visibleName_3, "		        ");
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
          MetaReference[] _references_2 = cls_5.getReferences();
          final Function1<MetaReference,Boolean> _function_9 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref_2) {
                Connection _representedBy_15 = ref_2.getRepresentedBy();
                boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_representedBy_15, null);
                return ((Boolean)_operator_notEquals_2);
              }
            };
          Iterable<MetaReference> _filter_9 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references_2)), _function_9);
          for(final MetaReference reference_5 : _filter_9) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("} else if( reference.equals(\"");
            String _name_10 = this.e1.getName(reference_5);
            _builder.append(_name_10, "			");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("return new ");
            String _deleteReferenceFeatureClassName = this.e2.getDeleteReferenceFeatureClassName(reference_5);
            String _shortName_12 = this.importUtil.shortName(_deleteReferenceFeatureClassName);
            _builder.append(_shortName_12, "				");
            _builder.append("(this);");
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
          Shape _representedBy_16 = cls_5.getRepresentedBy();
          if ((_representedBy_16 instanceof org.eclipselabs.spray.mm.spray.Container)) {
            _builder.append("\t\t\t\t        ");
            Shape _representedBy_17 = cls_5.getRepresentedBy();
            Container container_3 = ((Container) _representedBy_17);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts_3 = container_3.getParts();
              Iterable<MetaReference> _filter_10 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts_3)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_6 : _filter_10) {
                _builder.append("\t");
                String _name_11 = this.e1.getName(reference_6);
                final String referenceName_3 = _name_11;
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                EClass _type_4 = cls_5.getType();
                EList<EReference> _eAllReferences_3 = _type_4.getEAllReferences();
                final Function1<EReference,Boolean> _function_10 = new Function1<EReference,Boolean>() {
                    public Boolean apply(final EReference e_6) {
                      String _name_12 = e_6.getName();
                      boolean _operator_equals_3 = ObjectExtensions.operator_equals(_name_12, referenceName_3);
                      return ((Boolean)_operator_equals_3);
                    }
                  };
                EReference _findFirst_3 = IterableExtensions.<EReference>findFirst(_eAllReferences_3, _function_10);
                EReference target_2 = _findFirst_3;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("if( bo instanceof ");
                EClass _eReferenceType_4 = target_2.getEReferenceType();
                String _name_13 = _eReferenceType_4.getName();
                _builder.append(_name_13, "");
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
      MetaClass[] _metaClasses_8 = diagram.getMetaClasses();
      for(final MetaClass metaClass_1 : _metaClasses_8) {
        {
          Behaviour[] _behaviours = metaClass_1.getBehaviours();
          boolean _isEmpty_1 = ((List<Behaviour>)Conversions.doWrapArray(_behaviours)).isEmpty();
          boolean _operator_not_7 = BooleanExtensions.operator_not(_isEmpty_1);
          if (_operator_not_7) {
            _builder.append("\t\t\t            ");
            _builder.append("if( is");
            String _visibleName_4 = GeneratorUtil.visibleName(metaClass_1);
            _builder.append(_visibleName_4, "			            ");
            _builder.append("(bo)  ){");
            _builder.newLineIfNotEmpty();
            _builder.append("return new ICustomFeature[]{ ");
            _builder.newLine();
            ArrayList<String> _arrayList = new ArrayList<String>();
            List<String> allnames2 = _arrayList;
            _builder.newLineIfNotEmpty();
            {
              Behaviour[] _behaviours_1 = metaClass_1.getBehaviours();
              final Function1<Behaviour,Boolean> _function_11 = new Function1<Behaviour,Boolean>() {
                  public Boolean apply(final Behaviour b) {
                    BehaviourType _type_5 = b.getType();
                    boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_type_5, BehaviourType.CREATE_BEHAVIOUR);
                    return ((Boolean)_operator_notEquals_3);
                  }
                };
              Iterable<Behaviour> _filter_11 = IterableExtensions.<Behaviour>filter(((Iterable<Behaviour>)Conversions.doWrapArray(_behaviours_1)), _function_11);
              boolean hasAnyElements_4 = false;
              for(final Behaviour behaviour : _filter_11) {
                if (!hasAnyElements_4) {
                  hasAnyElements_4 = true;
                } else {
                  _builder.appendImmediate(",", "");
                }
                {
                  String _name_14 = behaviour.getName();
                  boolean _contains = allnames2.contains(_name_14);
                  boolean _operator_not_8 = BooleanExtensions.operator_not(_contains);
                  if (_operator_not_8) {
                    _builder.append("new ");
                    String _customFeatureClassName = this.e2.getCustomFeatureClassName(behaviour);
                    String _shortName_13 = this.importUtil.shortName(_customFeatureClassName);
                    _builder.append(_shortName_13, "");
                    _builder.append("(this) // ");
                    String _name_15 = behaviour.getName();
                    boolean _add = allnames2.add(_name_15);
                    _builder.append(_add, "");
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
      MetaClass[] _metaClasses_9 = diagram.getMetaClasses();
      for(final MetaClass metaClass_2 : _metaClasses_9) {
        StringConcatenation _isOfType = this.isOfType(metaClass_2);
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