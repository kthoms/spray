/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xspray.mm.xspray.XsprayFactory
 * @model kind="package"
 * @generated
 */
public interface XsprayPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xspray";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xspray.org/xspray";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.xspray";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XsprayPackage eINSTANCE = org.xspray.mm.xspray.impl.XsprayPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.SprayElementImpl <em>Spray Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.SprayElementImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getSprayElement()
	 * @generated
	 */
	int SPRAY_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRAY_ELEMENT__CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Spray Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRAY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.DiagramImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__META_CLASSES = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modelfile Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__MODELFILE_EXTENSION = SPRAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviour Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__BEHAVIOUR_GROUPS = SPRAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__IMPORTS = SPRAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.MetaClassImpl <em>Meta Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.MetaClassImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaClass()
	 * @generated
	 */
	int META_CLASS = 8;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.ShapeImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__REPRESENTS = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.LayoutImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LINE_WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LINE_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__FILL_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TEXT_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Rounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROUNDED = 4;

	/**
	 * The feature id for the '<em><b>Corner Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CORNER_HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Corner Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CORNER_WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__FIGURE = 7;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__BOLD = 8;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ITALIC = 9;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.RectangleImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CONTAINER = SHAPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__REPRESENTS = SHAPE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.ContainerImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER = SHAPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPRESENTS = SHAPE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARTS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LIST = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HORIZONTAL = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.TextImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTAINER = SHAPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__REPRESENTS = SHAPE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.ConnectionImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONTAINER = SHAPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REPRESENTS = SHAPE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM_LABEL = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO_LABEL = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_LABEL = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__NAME = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__REPRESENTED_BY = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__DIAGRAM = SPRAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__REFERENCES = SPRAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__ALIAS = SPRAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__ICON = SPRAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__BEHAVIOURS = SPRAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behaviour Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__BEHAVIOUR_GROUPS = SPRAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS__TYPE = SPRAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_CLASS_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.MetaReferenceImpl <em>Meta Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.MetaReferenceImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaReference()
	 * @generated
	 */
	int META_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE__REPRESENTED_BY = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE__META_CLASS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int META_REFERENCE__TEXT = SPRAY_ELEMENT_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE__REFERENCE = SPRAY_ELEMENT_FEATURE_COUNT + 3;

				/**
	 * The feature id for the '<em><b>Label Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE__LABEL_PROPERTY = SPRAY_ELEMENT_FEATURE_COUNT + 4;

				/**
	 * The number of structural features of the '<em>Meta Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_REFERENCE_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.MetaAttributeImpl <em>Meta Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.MetaAttributeImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaAttribute()
	 * @generated
	 */
	int META_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ATTRIBUTE__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ATTRIBUTE__ATTRIBUTE = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pathsegments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ATTRIBUTE__PATHSEGMENTS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ATTRIBUTE__PATH = SPRAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Meta Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_ATTRIBUTE_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.LineImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 11;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINER = SHAPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REPRESENTS = SHAPE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.VisibleElementImpl <em>Visible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.VisibleElementImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getVisibleElement()
	 * @generated
	 */
	int VISIBLE_ELEMENT = 12;

	/**
	 * The number of structural features of the '<em>Visible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.SprayString <em>Spray String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.SprayString
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getSprayString()
	 * @generated
	 */
	int SPRAY_STRING = 14;

	/**
	 * The number of structural features of the '<em>Spray String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRAY_STRING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.StringLiteralImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__CONTAINER = SPRAY_STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__NAME = SPRAY_STRING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = SPRAY_STRING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.BehaviourImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__META_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__PALETTE_COMPARTMENT = 4;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.StandardBehaviourImpl <em>Standard Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.StandardBehaviourImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getStandardBehaviour()
	 * @generated
	 */
	int STANDARD_BEHAVIOUR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR__NAME = BEHAVIOUR__NAME;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR__META_CLASS = BEHAVIOUR__META_CLASS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR__LABEL = BEHAVIOUR__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR__TYPE = BEHAVIOUR__TYPE;

	/**
	 * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR__PALETTE_COMPARTMENT = BEHAVIOUR__PALETTE_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Standard Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.CustomBehaviourImpl <em>Custom Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.CustomBehaviourImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getCustomBehaviour()
	 * @generated
	 */
	int CUSTOM_BEHAVIOUR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__NAME = BEHAVIOUR__NAME;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__META_CLASS = BEHAVIOUR__META_CLASS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__LABEL = BEHAVIOUR__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__TYPE = BEHAVIOUR__TYPE;

	/**
	 * The feature id for the '<em><b>Palette Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR__PALETTE_COMPARTMENT = BEHAVIOUR__PALETTE_COMPARTMENT;

	/**
	 * The number of structural features of the '<em>Custom Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.BehaviourGroupImpl <em>Behaviour Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.BehaviourGroupImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviourGroup()
	 * @generated
	 */
	int BEHAVIOUR_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_GROUP__CONTAINER = SPRAY_ELEMENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_GROUP__NAME = SPRAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_GROUP__BEHAVIOURS = SPRAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behaviour Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_GROUP_FEATURE_COUNT = SPRAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.impl.ImportImpl
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 19;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.NamedElement
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.Color
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 21;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.Figure <em>Figure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.Figure
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 22;

	/**
	 * The meta object id for the '{@link org.xspray.mm.xspray.BehaviourType <em>Behaviour Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xspray.mm.xspray.BehaviourType
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviourType()
	 * @generated
	 */
	int BEHAVIOUR_TYPE = 23;

	/**
	 * The meta object id for the '<em>Qualified Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 24;


	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.xspray.mm.xspray.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.Diagram#getMetaClassesList <em>Meta Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Classes</em>'.
	 * @see org.xspray.mm.xspray.Diagram#getMetaClassesList()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_MetaClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Diagram#getModelfileExtension <em>Modelfile Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelfile Extension</em>'.
	 * @see org.xspray.mm.xspray.Diagram#getModelfileExtension()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_ModelfileExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.Diagram#getBehaviourGroupsList <em>Behaviour Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviour Groups</em>'.
	 * @see org.xspray.mm.xspray.Diagram#getBehaviourGroupsList()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_BehaviourGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.Diagram#getImportsList <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.xspray.mm.xspray.Diagram#getImportsList()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Imports();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.MetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Class</em>'.
	 * @see org.xspray.mm.xspray.MetaClass
	 * @generated
	 */
	EClass getMetaClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.MetaClass#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented By</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getRepresentedBy()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_RepresentedBy();

	/**
	 * Returns the meta object for the container reference '{@link org.xspray.mm.xspray.MetaClass#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getDiagram()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.MetaClass#getReferencesList <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getReferencesList()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_References();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.MetaClass#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getAlias()
	 * @see #getMetaClass()
	 * @generated
	 */
	EAttribute getMetaClass_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.MetaClass#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getIcon()
	 * @see #getMetaClass()
	 * @generated
	 */
	EAttribute getMetaClass_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.MetaClass#getBehavioursList <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getBehavioursList()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_Behaviours();

	/**
	 * Returns the meta object for the reference list '{@link org.xspray.mm.xspray.MetaClass#getBehaviourGroupsList <em>Behaviour Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviour Groups</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getBehaviourGroupsList()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_BehaviourGroups();

	/**
	 * Returns the meta object for the reference '{@link org.xspray.mm.xspray.MetaClass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xspray.mm.xspray.MetaClass#getType()
	 * @see #getMetaClass()
	 * @generated
	 */
	EReference getMetaClass_Type();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.xspray.mm.xspray.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the container reference '{@link org.xspray.mm.xspray.Shape#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Represents</em>'.
	 * @see org.xspray.mm.xspray.Shape#getRepresents()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Represents();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.Shape#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.xspray.mm.xspray.Shape#getLayout()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Layout();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.xspray.mm.xspray.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.xspray.mm.xspray.Layout#getLineWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.xspray.mm.xspray.Layout#getLineColor()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.xspray.mm.xspray.Layout#getFillColor()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see org.xspray.mm.xspray.Layout#getTextColor()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#isRounded <em>Rounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounded</em>'.
	 * @see org.xspray.mm.xspray.Layout#isRounded()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Rounded();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getCornerHeight <em>Corner Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Height</em>'.
	 * @see org.xspray.mm.xspray.Layout#getCornerHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_CornerHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getCornerWidth <em>Corner Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Width</em>'.
	 * @see org.xspray.mm.xspray.Layout#getCornerWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_CornerWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure</em>'.
	 * @see org.xspray.mm.xspray.Layout#getFigure()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Figure();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.xspray.mm.xspray.Layout#isBold()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Layout#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.xspray.mm.xspray.Layout#isItalic()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Italic();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.xspray.mm.xspray.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.xspray.mm.xspray.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.Container#getPartsList <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.xspray.mm.xspray.Container#getPartsList()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Parts();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Container#isList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List</em>'.
	 * @see org.xspray.mm.xspray.Container#isList()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_List();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Container#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see org.xspray.mm.xspray.Container#isHorizontal()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Horizontal();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.xspray.mm.xspray.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.Text#getValueList <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.xspray.mm.xspray.Text#getValueList()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Value();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.SprayElement <em>Spray Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spray Element</em>'.
	 * @see org.xspray.mm.xspray.SprayElement
	 * @generated
	 */
	EClass getSprayElement();

	/**
	 * Returns the meta object for the container reference '{@link org.xspray.mm.xspray.SprayElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.xspray.mm.xspray.SprayElement#getContainer()
	 * @see #getSprayElement()
	 * @generated
	 */
	EReference getSprayElement_Container();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.xspray.mm.xspray.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.xspray.mm.xspray.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_From();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.xspray.mm.xspray.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.Connection#getFromLabel <em>From Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Label</em>'.
	 * @see org.xspray.mm.xspray.Connection#getFromLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FromLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.Connection#getToLabel <em>To Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Label</em>'.
	 * @see org.xspray.mm.xspray.Connection#getToLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ToLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.Connection#getConnectionLabel <em>Connection Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Label</em>'.
	 * @see org.xspray.mm.xspray.Connection#getConnectionLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionLabel();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.MetaReference <em>Meta Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Reference</em>'.
	 * @see org.xspray.mm.xspray.MetaReference
	 * @generated
	 */
	EClass getMetaReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.xspray.mm.xspray.MetaReference#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented By</em>'.
	 * @see org.xspray.mm.xspray.MetaReference#getRepresentedBy()
	 * @see #getMetaReference()
	 * @generated
	 */
	EReference getMetaReference_RepresentedBy();

	/**
	 * Returns the meta object for the container reference '{@link org.xspray.mm.xspray.MetaReference#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meta Class</em>'.
	 * @see org.xspray.mm.xspray.MetaReference#getMetaClass()
	 * @see #getMetaReference()
	 * @generated
	 */
	EReference getMetaReference_MetaClass();

	/**
	 * Returns the meta object for the reference '{@link org.xspray.mm.xspray.MetaReference#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.xspray.mm.xspray.MetaReference#getText()
	 * @see #getMetaReference()
	 * @generated
	 */
    EReference getMetaReference_Text();

    /**
	 * Returns the meta object for the reference '{@link org.xspray.mm.xspray.MetaReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.xspray.mm.xspray.MetaReference#getReference()
	 * @see #getMetaReference()
	 * @generated
	 */
	EReference getMetaReference_Reference();

				/**
	 * Returns the meta object for the reference '{@link org.xspray.mm.xspray.MetaReference#getLabelProperty <em>Label Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Property</em>'.
	 * @see org.xspray.mm.xspray.MetaReference#getLabelProperty()
	 * @see #getMetaReference()
	 * @generated
	 */
	EReference getMetaReference_LabelProperty();

				/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.MetaAttribute <em>Meta Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Attribute</em>'.
	 * @see org.xspray.mm.xspray.MetaAttribute
	 * @generated
	 */
	EClass getMetaAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.xspray.mm.xspray.MetaAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.xspray.mm.xspray.MetaAttribute#getAttribute()
	 * @see #getMetaAttribute()
	 * @generated
	 */
	EReference getMetaAttribute_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link org.xspray.mm.xspray.MetaAttribute#getPathsegmentsList <em>Pathsegments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pathsegments</em>'.
	 * @see org.xspray.mm.xspray.MetaAttribute#getPathsegmentsList()
	 * @see #getMetaAttribute()
	 * @generated
	 */
	EReference getMetaAttribute_Pathsegments();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.MetaAttribute#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.xspray.mm.xspray.MetaAttribute#getPath()
	 * @see #getMetaAttribute()
	 * @generated
	 */
	EAttribute getMetaAttribute_Path();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.xspray.mm.xspray.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.VisibleElement <em>Visible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Element</em>'.
	 * @see org.xspray.mm.xspray.VisibleElement
	 * @generated
	 */
	EClass getVisibleElement();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.xspray.mm.xspray.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.SprayString <em>Spray String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spray String</em>'.
	 * @see org.xspray.mm.xspray.SprayString
	 * @generated
	 */
	EClass getSprayString();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see org.xspray.mm.xspray.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Behaviour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xspray.mm.xspray.Behaviour#getName()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xspray.mm.xspray.Behaviour#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meta Class</em>'.
	 * @see org.xspray.mm.xspray.Behaviour#getMetaClass()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_MetaClass();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Behaviour#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.xspray.mm.xspray.Behaviour#getLabel()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Behaviour#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xspray.mm.xspray.Behaviour#getType()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Behaviour#getPaletteCompartment <em>Palette Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Compartment</em>'.
	 * @see org.xspray.mm.xspray.Behaviour#getPaletteCompartment()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_PaletteCompartment();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.StandardBehaviour <em>Standard Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Behaviour</em>'.
	 * @see org.xspray.mm.xspray.StandardBehaviour
	 * @generated
	 */
	EClass getStandardBehaviour();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.CustomBehaviour <em>Custom Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Behaviour</em>'.
	 * @see org.xspray.mm.xspray.CustomBehaviour
	 * @generated
	 */
	EClass getCustomBehaviour();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.BehaviourGroup <em>Behaviour Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Group</em>'.
	 * @see org.xspray.mm.xspray.BehaviourGroup
	 * @generated
	 */
	EClass getBehaviourGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xspray.mm.xspray.BehaviourGroup#getBehavioursList <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviours</em>'.
	 * @see org.xspray.mm.xspray.BehaviourGroup#getBehavioursList()
	 * @see #getBehaviourGroup()
	 * @generated
	 */
	EReference getBehaviourGroup_Behaviours();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.xspray.mm.xspray.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.xspray.mm.xspray.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.xspray.mm.xspray.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.xspray.mm.xspray.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.xspray.mm.xspray.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xspray.mm.xspray.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link org.xspray.mm.xspray.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see org.xspray.mm.xspray.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link org.xspray.mm.xspray.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Figure</em>'.
	 * @see org.xspray.mm.xspray.Figure
	 * @generated
	 */
	EEnum getFigure();

	/**
	 * Returns the meta object for enum '{@link org.xspray.mm.xspray.BehaviourType <em>Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behaviour Type</em>'.
	 * @see org.xspray.mm.xspray.BehaviourType
	 * @generated
	 */
	EEnum getBehaviourType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualified Name</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getQualifiedName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XsprayFactory getXsprayFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.DiagramImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Meta Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__META_CLASSES = eINSTANCE.getDiagram_MetaClasses();

		/**
		 * The meta object literal for the '<em><b>Modelfile Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__MODELFILE_EXTENSION = eINSTANCE.getDiagram_ModelfileExtension();

		/**
		 * The meta object literal for the '<em><b>Behaviour Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__BEHAVIOUR_GROUPS = eINSTANCE.getDiagram_BehaviourGroups();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__IMPORTS = eINSTANCE.getDiagram_Imports();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.MetaClassImpl <em>Meta Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.MetaClassImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaClass()
		 * @generated
		 */
		EClass META_CLASS = eINSTANCE.getMetaClass();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__REPRESENTED_BY = eINSTANCE.getMetaClass_RepresentedBy();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__DIAGRAM = eINSTANCE.getMetaClass_Diagram();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__REFERENCES = eINSTANCE.getMetaClass_References();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_CLASS__ALIAS = eINSTANCE.getMetaClass_Alias();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_CLASS__ICON = eINSTANCE.getMetaClass_Icon();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__BEHAVIOURS = eINSTANCE.getMetaClass_Behaviours();

		/**
		 * The meta object literal for the '<em><b>Behaviour Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__BEHAVIOUR_GROUPS = eINSTANCE.getMetaClass_BehaviourGroups();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_CLASS__TYPE = eINSTANCE.getMetaClass_Type();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.ShapeImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__REPRESENTS = eINSTANCE.getShape_Represents();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__LAYOUT = eINSTANCE.getShape_Layout();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.LayoutImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__LINE_WIDTH = eINSTANCE.getLayout_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__LINE_COLOR = eINSTANCE.getLayout_LineColor();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__FILL_COLOR = eINSTANCE.getLayout_FillColor();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__TEXT_COLOR = eINSTANCE.getLayout_TextColor();

		/**
		 * The meta object literal for the '<em><b>Rounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ROUNDED = eINSTANCE.getLayout_Rounded();

		/**
		 * The meta object literal for the '<em><b>Corner Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CORNER_HEIGHT = eINSTANCE.getLayout_CornerHeight();

		/**
		 * The meta object literal for the '<em><b>Corner Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CORNER_WIDTH = eINSTANCE.getLayout_CornerWidth();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__FIGURE = eINSTANCE.getLayout_Figure();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__BOLD = eINSTANCE.getLayout_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ITALIC = eINSTANCE.getLayout_Italic();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.RectangleImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.ContainerImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PARTS = eINSTANCE.getContainer_Parts();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__LIST = eINSTANCE.getContainer_List();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__HORIZONTAL = eINSTANCE.getContainer_Horizontal();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.TextImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.SprayElementImpl <em>Spray Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.SprayElementImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getSprayElement()
		 * @generated
		 */
		EClass SPRAY_ELEMENT = eINSTANCE.getSprayElement();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRAY_ELEMENT__CONTAINER = eINSTANCE.getSprayElement_Container();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.ConnectionImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>From Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM_LABEL = eINSTANCE.getConnection_FromLabel();

		/**
		 * The meta object literal for the '<em><b>To Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO_LABEL = eINSTANCE.getConnection_ToLabel();

		/**
		 * The meta object literal for the '<em><b>Connection Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_LABEL = eINSTANCE.getConnection_ConnectionLabel();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.MetaReferenceImpl <em>Meta Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.MetaReferenceImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaReference()
		 * @generated
		 */
		EClass META_REFERENCE = eINSTANCE.getMetaReference();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_REFERENCE__REPRESENTED_BY = eINSTANCE.getMetaReference_RepresentedBy();

		/**
		 * The meta object literal for the '<em><b>Meta Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_REFERENCE__META_CLASS = eINSTANCE.getMetaReference_MetaClass();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference META_REFERENCE__TEXT = eINSTANCE.getMetaReference_Text();

        /**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_REFERENCE__REFERENCE = eINSTANCE.getMetaReference_Reference();

								/**
		 * The meta object literal for the '<em><b>Label Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_REFERENCE__LABEL_PROPERTY = eINSTANCE.getMetaReference_LabelProperty();

								/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.MetaAttributeImpl <em>Meta Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.MetaAttributeImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getMetaAttribute()
		 * @generated
		 */
		EClass META_ATTRIBUTE = eINSTANCE.getMetaAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getMetaAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Pathsegments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_ATTRIBUTE__PATHSEGMENTS = eINSTANCE.getMetaAttribute_Pathsegments();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_ATTRIBUTE__PATH = eINSTANCE.getMetaAttribute_Path();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.LineImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.VisibleElementImpl <em>Visible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.VisibleElementImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getVisibleElement()
		 * @generated
		 */
		EClass VISIBLE_ELEMENT = eINSTANCE.getVisibleElement();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.StringLiteralImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.SprayString <em>Spray String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.SprayString
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getSprayString()
		 * @generated
		 */
		EClass SPRAY_STRING = eINSTANCE.getSprayString();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.BehaviourImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__NAME = eINSTANCE.getBehaviour_Name();

		/**
		 * The meta object literal for the '<em><b>Meta Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__META_CLASS = eINSTANCE.getBehaviour_MetaClass();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__LABEL = eINSTANCE.getBehaviour_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__TYPE = eINSTANCE.getBehaviour_Type();

		/**
		 * The meta object literal for the '<em><b>Palette Compartment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__PALETTE_COMPARTMENT = eINSTANCE.getBehaviour_PaletteCompartment();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.StandardBehaviourImpl <em>Standard Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.StandardBehaviourImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getStandardBehaviour()
		 * @generated
		 */
		EClass STANDARD_BEHAVIOUR = eINSTANCE.getStandardBehaviour();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.CustomBehaviourImpl <em>Custom Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.CustomBehaviourImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getCustomBehaviour()
		 * @generated
		 */
		EClass CUSTOM_BEHAVIOUR = eINSTANCE.getCustomBehaviour();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.BehaviourGroupImpl <em>Behaviour Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.BehaviourGroupImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviourGroup()
		 * @generated
		 */
		EClass BEHAVIOUR_GROUP = eINSTANCE.getBehaviourGroup();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_GROUP__BEHAVIOURS = eINSTANCE.getBehaviourGroup_Behaviours();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.impl.ImportImpl
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.NamedElement
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.Color
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.Figure <em>Figure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.Figure
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getFigure()
		 * @generated
		 */
		EEnum FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '{@link org.xspray.mm.xspray.BehaviourType <em>Behaviour Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xspray.mm.xspray.BehaviourType
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getBehaviourType()
		 * @generated
		 */
		EEnum BEHAVIOUR_TYPE = eINSTANCE.getBehaviourType();

		/**
		 * The meta object literal for the '<em>Qualified Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.xspray.mm.xspray.impl.XsprayPackageImpl#getQualifiedName()
		 * @generated
		 */
		EDataType QUALIFIED_NAME = eINSTANCE.getQualifiedName();

	}

} //XsprayPackage
