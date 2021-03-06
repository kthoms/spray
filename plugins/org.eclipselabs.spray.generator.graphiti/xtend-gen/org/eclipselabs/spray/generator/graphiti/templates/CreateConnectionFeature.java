package org.eclipselabs.spray.generator.graphiti.templates;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.extensions.SprayExtensions;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class CreateConnectionFeature extends FileGenerator {
  @Inject
  private SprayExtensions e1;
  
  @Inject
  private NamingExtensions naming;
  
  @Inject
  private GenModelHelper genModelHelper;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((MetaClass) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((MetaClass) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    Shape _representedBy = metaClass.getRepresentedBy();
    final Connection connection = ((Connection) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    EReference _to = connection.getTo();
    EClassifier _eType_1 = _to.getEType();
    final EClass to = ((EClass) _eType_1);
    _builder.newLineIfNotEmpty();
    Diagram _diagram = metaClass.getDiagram();
    final Diagram diagram = _diagram;
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.core.runtime.CoreException;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICreateConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Anchor;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".SampleUtil;");
    _builder.newLineIfNotEmpty();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCreateConnectionFeature {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// provide name and description for the UI, e.g. the palette");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"");
    String _visibleName = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName, "        ");
    _builder.append("\", \"Create ");
    String _visibleName_1 = GeneratorUtil.visibleName(metaClass);
    _builder.append(_visibleName_1, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canCreate(ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return true if both anchors belong to an EClass");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// and those EClasses are not identical");
    _builder.newLine();
    _builder.append("        ");
    String _javaInterfaceName = this.genModelHelper.getJavaInterfaceName(from);
    String _shortName = this.shortName(_javaInterfaceName);
    _builder.append(_shortName, "        ");
    _builder.append(" source = get");
    String _name = from.getName();
    _builder.append(_name, "        ");
    _builder.append("(context.getSourceAnchor());");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _javaInterfaceName_1 = this.genModelHelper.getJavaInterfaceName(to);
    String _shortName_1 = this.shortName(_javaInterfaceName_1);
    _builder.append(_shortName_1, "        ");
    _builder.append(" target = get");
    String _name_1 = to.getName();
    _builder.append(_name_1, "        ");
    _builder.append("(context.getTargetAnchor());");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("if ( (source != null) && (target != null) && (source != target) ) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canStartConnection(ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// return true if start anchor belongs to a EClass");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (get");
    String _name_2 = from.getName();
    _builder.append(_name_2, "        ");
    _builder.append("(context.getSourceAnchor()) != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Connection create(ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Connection newConnection = null;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// get EClasses which should be connected");
    _builder.newLine();
    _builder.append("        ");
    String _name_3 = from.getName();
    _builder.append(_name_3, "        ");
    _builder.append(" source = get");
    String _name_4 = from.getName();
    _builder.append(_name_4, "        ");
    _builder.append("(context.getSourceAnchor());");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    String _name_5 = to.getName();
    _builder.append(_name_5, "        ");
    _builder.append(" target = get");
    String _name_6 = to.getName();
    _builder.append(_name_6, "        ");
    _builder.append("(context.getTargetAnchor());");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (source != null && target != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// create new business object");
    _builder.newLine();
    _builder.append("            ");
    String _javaInterfaceName_2 = this.naming.getJavaInterfaceName(metaClass);
    String _shortName_2 = this.shortName(_javaInterfaceName_2);
    _builder.append(_shortName_2, "            ");
    _builder.append(" eReference = create");
    String _name_7 = this.e1.getName(metaClass);
    _builder.append(_name_7, "            ");
    _builder.append("(source, target);");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("// add connection for business object");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("AddConnectionContext addContext = new AddConnectionContext(");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("context.getSourceAnchor(), context.getTargetAnchor());");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("addContext.setNewObject(eReference);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return newConnection;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Returns the ");
    String _name_8 = from.getName();
    _builder.append(_name_8, "     ");
    _builder.append(" belonging to the anchor, or null if not available.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ");
    String _name_9 = from.getName();
    _builder.append(_name_9, "    ");
    _builder.append(" get");
    String _name_10 = from.getName();
    _builder.append(_name_10, "    ");
    _builder.append("(Anchor anchor) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("if (anchor != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Object object = getBusinessObjectForPictogramElement(anchor.getParent());");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (object instanceof ");
    String _name_11 = from.getName();
    _builder.append(_name_11, "            ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("return (");
    String _name_12 = from.getName();
    _builder.append(_name_12, "                ");
    _builder.append(") object;");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    {
      String _name_13 = from.getName();
      String _name_14 = to.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name_13, _name_14);
      if (_operator_notEquals) {
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* Returns the ");
        String _name_15 = to.getName();
        _builder.append(_name_15, "     ");
        _builder.append(" belonging to the anchor, or null if not available.");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("private ");
        String _name_16 = to.getName();
        _builder.append(_name_16, "    ");
        _builder.append(" get");
        String _name_17 = to.getName();
        _builder.append(_name_17, "    ");
        _builder.append("(Anchor anchor) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if (anchor != null) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("Object object = getBusinessObjectForPictogramElement(anchor.getParent());");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("if (object instanceof ");
        String _name_18 = to.getName();
        _builder.append(_name_18, "            ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("return (");
        String _name_19 = to.getName();
        _builder.append(_name_19, "                ");
        _builder.append(") object;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Creates a EReference between two EClasses.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _name_20 = this.e1.getName(metaClass);
    _builder.append(_name_20, "    ");
    _builder.append(" create");
    String _name_21 = this.e1.getName(metaClass);
    _builder.append(_name_21, "    ");
    _builder.append("(");
    String _name_22 = from.getName();
    _builder.append(_name_22, "    ");
    _builder.append(" source, ");
    String _name_23 = to.getName();
    _builder.append(_name_23, "    ");
    _builder.append(" target) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// TODO: Domain Object");
    _builder.newLine();
    _builder.append("        ");
    String _name_24 = this.e1.getName(metaClass);
    _builder.append(_name_24, "        ");
    _builder.append(" domainObject = ");
    String _eFactoryInterfaceName = this.naming.getEFactoryInterfaceName(metaClass);
    String _shortName_3 = this.shortName(_eFactoryInterfaceName);
    _builder.append(_shortName_3, "        ");
    _builder.append(".eINSTANCE.create");
    String _name_25 = this.e1.getName(metaClass);
    _builder.append(_name_25, "        ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      EClass _type = metaClass.getType();
      EList<EAttribute> _eAttributes = _type.getEAttributes();
      final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
          public Boolean apply(final EAttribute att) {
            String _name = att.getName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_name, "name");
            return ((Boolean)_operator_equals);
          }
        };
      boolean _exists = IterableExtensions.<EAttribute>exists(_eAttributes, _function);
      if (_exists) {
        _builder.append("        ");
        _builder.append("domainObject.setName(\"new ");
        String _visibleName_2 = GeneratorUtil.visibleName(metaClass);
        _builder.append(_visibleName_2, "        ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("domainObject.set");
    EReference _from_1 = connection.getFrom();
    String _name_26 = _from_1.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_26);
    _builder.append(_firstUpper, "        ");
    _builder.append("(source);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("domainObject.set");
    EReference _to_1 = connection.getTo();
    String _name_27 = _to_1.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_27);
    _builder.append(_firstUpper_1, "        ");
    _builder.append("(target);");
    _builder.newLineIfNotEmpty();
    _builder.append("//        getDiagram().eResource().getContents().add(domainObject);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("SampleUtil.saveToModelFile(domainObject, getDiagram(), \"");
    EClass _type_1 = metaClass.getType();
    String _fileExtension = this.genModelHelper.getFileExtension(_type_1);
    _builder.append(_fileExtension, "            ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("} catch (CoreException e) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// TODO Auto-generated catch block");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return domainObject;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      boolean _operator_and = false;
      String _icon = metaClass.getIcon();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_icon, null);
      if (!_operator_notEquals_1) {
        _operator_and = false;
      } else {
        String _icon_1 = metaClass.getIcon();
        boolean _equalsIgnoreCase = _icon_1.equalsIgnoreCase("");
        boolean _operator_not = BooleanExtensions.operator_not(_equalsIgnoreCase);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals_1, _operator_not);
      }
      if (_operator_and) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public String getCreateImageId() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        Diagram _diagram_1 = metaClass.getDiagram();
        String _imageProviderClassName = this.naming.getImageProviderClassName(_diagram_1);
        String _shortName_4 = this.shortName(_imageProviderClassName);
        _builder.append(_shortName_4, "        ");
        _builder.append(".");
        String _icon_2 = metaClass.getIcon();
        String _imageIdentifier = this.naming.getImageIdentifier(diagram, _icon_2);
        _builder.append(_imageIdentifier, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean hasDoneChanges() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean canUndo(IContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
