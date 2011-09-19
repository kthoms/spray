package org.eclipselabs.spray.xtext.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.graphiti.util.ProjectProperties;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.xtext.jvmmodel.EcoreJvmModelInferer;

@SuppressWarnings("all")
public class SprayJvmModelInferrer implements IJvmModelInferrer {
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator jvmModelAssociator;
  
  @Inject
  private EcoreJvmModelInferer ecoreJvmModelInferer;
  
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
      MetaClass[] _metaClasses_1 = model.getMetaClasses();
      final Function1<MetaClass,Iterable<JvmDeclaredType>> _function_1 = new Function1<MetaClass,Iterable<JvmDeclaredType>>() {
          public Iterable<JvmDeclaredType> apply(final MetaClass e_1) {
            EClass _type = e_1.getType();
            Iterable<JvmDeclaredType> _transform_1 = SprayJvmModelInferrer.this.ecoreJvmModelInferer.transform(_type);
            return _transform_1;
          }
        };
      List<Iterable<JvmDeclaredType>> _map_1 = ListExtensions.<MetaClass, Iterable<JvmDeclaredType>>map(((List<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_1);
      Iterable<JvmDeclaredType> _flatten_1 = IterableExtensions.<JvmDeclaredType>flatten(_map_1);
      final Iterable<JvmDeclaredType> types2 = _flatten_1;
      final Function1<JvmDeclaredType,String> _function_2 = new Function1<JvmDeclaredType,String>() {
          public String apply(final JvmDeclaredType t) {
            String _simpleName = t.getSimpleName();
            return _simpleName;
          }
        };
      Iterable<String> _map_2 = IterableExtensions.<JvmDeclaredType, String>map(types2, _function_2);
      String _operator_plus = StringExtensions.operator_plus("===> ", _map_2);
      System.out.println(_operator_plus);
      Iterable<JvmDeclaredType> _operator_plus_1 = IterableExtensions.<JvmDeclaredType>operator_plus(types1, types2);
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final MetaClass clazz) {
    ArrayList<JvmDeclaredType> _xblockexpression = null;
    {
      int i = 1;
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      final JvmGenericType jvmClass = _createJvmGenericType;
      EClass _type = clazz.getType();
      String _name = _type.getName();
      jvmClass.setSimpleName(_name);
      String _diagramPackage = ProjectProperties.getDiagramPackage();
      jvmClass.setPackageName(_diagramPackage);
      this.jvmModelAssociator.associatePrimary(clazz, jvmClass);
      jvmClass.setVisibility(JvmVisibility.PUBLIC);
      Shape _representedBy = clazz.getRepresentedBy();
      this.transform(_representedBy, jvmClass, ((Integer)i));
      ArrayList<JvmDeclaredType> _newArrayList = CollectionLiterals.<JvmDeclaredType>newArrayList(((JvmDeclaredType) jvmClass));
      _xblockexpression = (_newArrayList);
    }
    return _xblockexpression;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final SprayElement shape, final JvmGenericType containerType, final int i) {
    List<JvmDeclaredType> _emptyList = CollectionLiterals.<JvmDeclaredType>emptyList();
    return _emptyList;
  }
  
  protected Iterable<JvmDeclaredType> _transform(final Container shape, final JvmGenericType containerType, final int i) {
    ArrayList<JvmDeclaredType> _xblockexpression = null;
    {
      JvmGenericType _createJvmGenericType = this.typesFactory.createJvmGenericType();
      final JvmGenericType jvmClass = _createJvmGenericType;
      String _operator_plus = StringExtensions.operator_plus("Container", ((Integer)i));
      jvmClass.setSimpleName(_operator_plus);
      String _packageName = containerType.getPackageName();
      jvmClass.setPackageName(_packageName);
      jvmClass.setDeclaringType(containerType);
      this.jvmModelAssociator.associatePrimary(shape, jvmClass);
      SprayElement[] _parts = shape.getParts();
      for (final SprayElement part : _parts) {
        this.transform(part, jvmClass, ((Integer)i));
      }
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
  
  public Iterable<JvmDeclaredType> transform(final SprayElement shape, final JvmGenericType containerType, final Integer i) {
    if ((shape instanceof Container)
         && (containerType instanceof JvmGenericType)
         && (i instanceof Integer)) {
      return _transform((Container)shape, (JvmGenericType)containerType, (Integer)i);
    } else if ((shape instanceof SprayElement)
         && (containerType instanceof JvmGenericType)
         && (i instanceof Integer)) {
      return _transform((SprayElement)shape, (JvmGenericType)containerType, (Integer)i);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(shape, containerType, i).toString());
    }
  }
}