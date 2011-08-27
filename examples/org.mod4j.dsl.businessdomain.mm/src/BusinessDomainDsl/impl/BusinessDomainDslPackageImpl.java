/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AbstractBusinessClass;
import BusinessDomainDsl.AbstractBusinessRule;
import BusinessDomainDsl.AbstractType;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BlobBinaryProperty;
import BusinessDomainDsl.BlobTextProperty;
import BusinessDomainDsl.BoolProperty;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessClassReference;
import BusinessDomainDsl.BusinessDomainDslFactory;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.BusinessDomainModel;
import BusinessDomainDsl.BusinessRule;
import BusinessDomainDsl.DateTimeAccuracy;
import BusinessDomainDsl.DateTimeProperty;
import BusinessDomainDsl.DecimalProperty;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationLiteral;
import BusinessDomainDsl.EnumerationProperty;
import BusinessDomainDsl.IntegerProperty;
import BusinessDomainDsl.ModelElement;
import BusinessDomainDsl.Multiplicity;
import BusinessDomainDsl.PersistencyMode;
import BusinessDomainDsl.Property;
import BusinessDomainDsl.StringProperty;
import BusinessDomainDsl.UniqueRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainDslPackageImpl extends EPackageImpl implements BusinessDomainDslPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass modelElementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass businessDomainModelEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass businessClassEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass propertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass enumerationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass enumerationLiteralEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractBusinessRuleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass boolPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dateTimePropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass enumerationPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass integerPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass stringPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass blobBinaryPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass blobTextPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass associationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass decimalPropertyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass abstractBusinessClassEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass businessClassReferenceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass uniqueRuleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass businessRuleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum multiplicityEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum dateTimeAccuracyEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum persistencyModeEEnum = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see BusinessDomainDsl.BusinessDomainDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private BusinessDomainDslPackageImpl() {
        super(eNS_URI, BusinessDomainDslFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link BusinessDomainDslPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static BusinessDomainDslPackage init() {
        if (isInited) return (BusinessDomainDslPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessDomainDslPackage.eNS_URI);

        // Obtain or create and register package
        BusinessDomainDslPackageImpl theBusinessDomainDslPackage = (BusinessDomainDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessDomainDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessDomainDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theBusinessDomainDslPackage.createPackageContents();

        // Initialize created meta-data
        theBusinessDomainDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theBusinessDomainDslPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eNS_URI, theBusinessDomainDslPackage);
        return theBusinessDomainDslPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getModelElement() {
        return modelElementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getModelElement_Name() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getModelElement_Description() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBusinessDomainModel() {
        return businessDomainModelEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessDomainModel_Enumerations() {
        return (EReference)businessDomainModelEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessDomainModel_Types() {
        return (EReference)businessDomainModelEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessDomainModel_Associations() {
        return (EReference)businessDomainModelEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBusinessClass() {
        return businessClassEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessClass_BusinessRules() {
        return (EReference)businessClassEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessClass_Superclass() {
        return (EReference)businessClassEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBusinessClass_AssociationsTo() {
        return (EReference)businessClassEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getProperty() {
        return propertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_DataType() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Nullable() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Derived() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Writable() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_Persistency() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getProperty_HasDefault() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getProperty_OwningType() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEnumeration() {
        return enumerationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEnumeration_EnumerationLiterals() {
        return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEnumeration_Model() {
        return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEnumerationLiteral() {
        return enumerationLiteralEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnumerationLiteral_PersistedValue() {
        return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEnumerationLiteral_Enumeration() {
        return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractBusinessRule() {
        return abstractBusinessRuleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstractBusinessRule_BusinessClass() {
        return (EReference)abstractBusinessRuleEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBoolProperty() {
        return boolPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBoolProperty_DefaultValue() {
        return (EAttribute)boolPropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDateTimeProperty() {
        return dateTimePropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDateTimeProperty_Accuracy() {
        return (EAttribute)dateTimePropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDateTimeProperty_DefaultValue() {
        return (EAttribute)dateTimePropertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEnumerationProperty() {
        return enumerationPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEnumerationProperty_Type() {
        return (EReference)enumerationPropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getEnumerationProperty_DefaultValueAsString() {
        return (EAttribute)enumerationPropertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIntegerProperty() {
        return integerPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntegerProperty_MinValue() {
        return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntegerProperty_MaxValue() {
        return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getIntegerProperty_DefaultValue() {
        return (EAttribute)integerPropertyEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getStringProperty() {
        return stringPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStringProperty_RegularExpression() {
        return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStringProperty_MinLength() {
        return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStringProperty_MaxLength() {
        return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getStringProperty_DefaultValue() {
        return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractType() {
        return abstractTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstractType_Properties() {
        return (EReference)abstractTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstractType_Model() {
        return (EReference)abstractTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBlobBinaryProperty() {
        return blobBinaryPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBlobTextProperty() {
        return blobTextPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAssociation() {
        return associationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAssociation_Source() {
        return (EReference)associationEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAssociation_Target() {
        return (EReference)associationEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_SourceRoleName() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_SourceMultiplicity() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_TargetRoleName() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_TargetMultiplicity() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_Composite() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_Bidirectional() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAssociation_Ordered() {
        return (EAttribute)associationEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAssociation_Model() {
        return (EReference)associationEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDecimalProperty() {
        return decimalPropertyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDecimalProperty_MinValue() {
        return (EAttribute)decimalPropertyEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDecimalProperty_MaxValue() {
        return (EAttribute)decimalPropertyEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDecimalProperty_MinInclusive() {
        return (EAttribute)decimalPropertyEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDecimalProperty_MaxInclusive() {
        return (EAttribute)decimalPropertyEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getDecimalProperty_DefaultValue() {
        return (EAttribute)decimalPropertyEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAbstractBusinessClass() {
        return abstractBusinessClassEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAbstractBusinessClass_AssociationsFrom() {
        return (EReference)abstractBusinessClassEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBusinessClassReference() {
        return businessClassReferenceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBusinessClassReference_ReferredModel() {
        return (EAttribute)businessClassReferenceEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUniqueRule() {
        return uniqueRuleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUniqueRule_Properties() {
        return (EReference)uniqueRuleEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getBusinessRule() {
        return businessRuleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getMultiplicity() {
        return multiplicityEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getDateTimeAccuracy() {
        return dateTimeAccuracyEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getPersistencyMode() {
        return persistencyModeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BusinessDomainDslFactory getBusinessDomainDslFactory() {
        return (BusinessDomainDslFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        businessDomainModelEClass = createEClass(BUSINESS_DOMAIN_MODEL);
        createEReference(businessDomainModelEClass, BUSINESS_DOMAIN_MODEL__ENUMERATIONS);
        createEReference(businessDomainModelEClass, BUSINESS_DOMAIN_MODEL__TYPES);
        createEReference(businessDomainModelEClass, BUSINESS_DOMAIN_MODEL__ASSOCIATIONS);

        businessClassEClass = createEClass(BUSINESS_CLASS);
        createEReference(businessClassEClass, BUSINESS_CLASS__BUSINESS_RULES);
        createEReference(businessClassEClass, BUSINESS_CLASS__SUPERCLASS);
        createEReference(businessClassEClass, BUSINESS_CLASS__ASSOCIATIONS_TO);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__DATA_TYPE);
        createEAttribute(propertyEClass, PROPERTY__NULLABLE);
        createEAttribute(propertyEClass, PROPERTY__DERIVED);
        createEAttribute(propertyEClass, PROPERTY__WRITABLE);
        createEAttribute(propertyEClass, PROPERTY__PERSISTENCY);
        createEAttribute(propertyEClass, PROPERTY__HAS_DEFAULT);
        createEReference(propertyEClass, PROPERTY__OWNING_TYPE);

        enumerationEClass = createEClass(ENUMERATION);
        createEReference(enumerationEClass, ENUMERATION__ENUMERATION_LITERALS);
        createEReference(enumerationEClass, ENUMERATION__MODEL);

        enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
        createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__PERSISTED_VALUE);
        createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

        abstractBusinessRuleEClass = createEClass(ABSTRACT_BUSINESS_RULE);
        createEReference(abstractBusinessRuleEClass, ABSTRACT_BUSINESS_RULE__BUSINESS_CLASS);

        boolPropertyEClass = createEClass(BOOL_PROPERTY);
        createEAttribute(boolPropertyEClass, BOOL_PROPERTY__DEFAULT_VALUE);

        dateTimePropertyEClass = createEClass(DATE_TIME_PROPERTY);
        createEAttribute(dateTimePropertyEClass, DATE_TIME_PROPERTY__ACCURACY);
        createEAttribute(dateTimePropertyEClass, DATE_TIME_PROPERTY__DEFAULT_VALUE);

        enumerationPropertyEClass = createEClass(ENUMERATION_PROPERTY);
        createEReference(enumerationPropertyEClass, ENUMERATION_PROPERTY__TYPE);
        createEAttribute(enumerationPropertyEClass, ENUMERATION_PROPERTY__DEFAULT_VALUE_AS_STRING);

        integerPropertyEClass = createEClass(INTEGER_PROPERTY);
        createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__MIN_VALUE);
        createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__MAX_VALUE);
        createEAttribute(integerPropertyEClass, INTEGER_PROPERTY__DEFAULT_VALUE);

        stringPropertyEClass = createEClass(STRING_PROPERTY);
        createEAttribute(stringPropertyEClass, STRING_PROPERTY__REGULAR_EXPRESSION);
        createEAttribute(stringPropertyEClass, STRING_PROPERTY__MIN_LENGTH);
        createEAttribute(stringPropertyEClass, STRING_PROPERTY__MAX_LENGTH);
        createEAttribute(stringPropertyEClass, STRING_PROPERTY__DEFAULT_VALUE);

        abstractTypeEClass = createEClass(ABSTRACT_TYPE);
        createEReference(abstractTypeEClass, ABSTRACT_TYPE__PROPERTIES);
        createEReference(abstractTypeEClass, ABSTRACT_TYPE__MODEL);

        blobBinaryPropertyEClass = createEClass(BLOB_BINARY_PROPERTY);

        blobTextPropertyEClass = createEClass(BLOB_TEXT_PROPERTY);

        associationEClass = createEClass(ASSOCIATION);
        createEReference(associationEClass, ASSOCIATION__SOURCE);
        createEReference(associationEClass, ASSOCIATION__TARGET);
        createEAttribute(associationEClass, ASSOCIATION__SOURCE_ROLE_NAME);
        createEAttribute(associationEClass, ASSOCIATION__SOURCE_MULTIPLICITY);
        createEAttribute(associationEClass, ASSOCIATION__TARGET_ROLE_NAME);
        createEAttribute(associationEClass, ASSOCIATION__TARGET_MULTIPLICITY);
        createEAttribute(associationEClass, ASSOCIATION__COMPOSITE);
        createEAttribute(associationEClass, ASSOCIATION__BIDIRECTIONAL);
        createEAttribute(associationEClass, ASSOCIATION__ORDERED);
        createEReference(associationEClass, ASSOCIATION__MODEL);

        decimalPropertyEClass = createEClass(DECIMAL_PROPERTY);
        createEAttribute(decimalPropertyEClass, DECIMAL_PROPERTY__MIN_VALUE);
        createEAttribute(decimalPropertyEClass, DECIMAL_PROPERTY__MAX_VALUE);
        createEAttribute(decimalPropertyEClass, DECIMAL_PROPERTY__MIN_INCLUSIVE);
        createEAttribute(decimalPropertyEClass, DECIMAL_PROPERTY__MAX_INCLUSIVE);
        createEAttribute(decimalPropertyEClass, DECIMAL_PROPERTY__DEFAULT_VALUE);

        abstractBusinessClassEClass = createEClass(ABSTRACT_BUSINESS_CLASS);
        createEReference(abstractBusinessClassEClass, ABSTRACT_BUSINESS_CLASS__ASSOCIATIONS_FROM);

        businessClassReferenceEClass = createEClass(BUSINESS_CLASS_REFERENCE);
        createEAttribute(businessClassReferenceEClass, BUSINESS_CLASS_REFERENCE__REFERRED_MODEL);

        uniqueRuleEClass = createEClass(UNIQUE_RULE);
        createEReference(uniqueRuleEClass, UNIQUE_RULE__PROPERTIES);

        businessRuleEClass = createEClass(BUSINESS_RULE);

        // Create enums
        multiplicityEEnum = createEEnum(MULTIPLICITY);
        dateTimeAccuracyEEnum = createEEnum(DATE_TIME_ACCURACY);
        persistencyModeEEnum = createEEnum(PERSISTENCY_MODE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        businessDomainModelEClass.getESuperTypes().add(this.getModelElement());
        businessClassEClass.getESuperTypes().add(this.getAbstractBusinessClass());
        propertyEClass.getESuperTypes().add(this.getModelElement());
        enumerationEClass.getESuperTypes().add(this.getModelElement());
        enumerationLiteralEClass.getESuperTypes().add(this.getModelElement());
        abstractBusinessRuleEClass.getESuperTypes().add(this.getModelElement());
        boolPropertyEClass.getESuperTypes().add(this.getProperty());
        dateTimePropertyEClass.getESuperTypes().add(this.getProperty());
        enumerationPropertyEClass.getESuperTypes().add(this.getProperty());
        integerPropertyEClass.getESuperTypes().add(this.getProperty());
        stringPropertyEClass.getESuperTypes().add(this.getProperty());
        abstractTypeEClass.getESuperTypes().add(this.getModelElement());
        blobBinaryPropertyEClass.getESuperTypes().add(this.getProperty());
        blobTextPropertyEClass.getESuperTypes().add(this.getProperty());
        associationEClass.getESuperTypes().add(this.getModelElement());
        decimalPropertyEClass.getESuperTypes().add(this.getProperty());
        abstractBusinessClassEClass.getESuperTypes().add(this.getAbstractType());
        businessClassReferenceEClass.getESuperTypes().add(this.getAbstractBusinessClass());
        uniqueRuleEClass.getESuperTypes().add(this.getAbstractBusinessRule());
        businessRuleEClass.getESuperTypes().add(this.getAbstractBusinessRule());

        // Initialize classes and features; add operations and parameters
        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", "", 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", "", 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessDomainModelEClass, BusinessDomainModel.class, "BusinessDomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessDomainModel_Enumerations(), this.getEnumeration(), this.getEnumeration_Model(), "enumerations", null, 0, -1, BusinessDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessDomainModel_Types(), this.getAbstractType(), this.getAbstractType_Model(), "types", null, 0, -1, BusinessDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessDomainModel_Associations(), this.getAssociation(), this.getAssociation_Model(), "associations", null, 0, -1, BusinessDomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(businessClassEClass, BusinessClass.class, "BusinessClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBusinessClass_BusinessRules(), this.getAbstractBusinessRule(), this.getAbstractBusinessRule_BusinessClass(), "businessRules", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClass_Superclass(), this.getBusinessClass(), null, "superclass", null, 0, 1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBusinessClass_AssociationsTo(), this.getAssociation(), this.getAssociation_Source(), "associationsTo", null, 0, -1, BusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Derived(), ecorePackage.getEBoolean(), "derived", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Writable(), ecorePackage.getEBoolean(), "writable", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Persistency(), this.getPersistencyMode(), "persistency", "ReadWrite", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_OwningType(), this.getAbstractType(), this.getAbstractType_Properties(), "owningType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumeration_EnumerationLiterals(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "enumerationLiterals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumeration_Model(), this.getBusinessDomainModel(), this.getBusinessDomainModel_Enumerations(), "model", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEnumerationLiteral_PersistedValue(), ecorePackage.getEInt(), "persistedValue", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_EnumerationLiterals(), "enumeration", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractBusinessRuleEClass, AbstractBusinessRule.class, "AbstractBusinessRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractBusinessRule_BusinessClass(), this.getBusinessClass(), this.getBusinessClass_BusinessRules(), "businessClass", null, 0, 1, AbstractBusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boolPropertyEClass, BoolProperty.class, "BoolProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoolProperty_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", "false", 0, 1, BoolProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dateTimePropertyEClass, DateTimeProperty.class, "DateTimeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDateTimeProperty_Accuracy(), this.getDateTimeAccuracy(), "accuracy", "", 0, 1, DateTimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDateTimeProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", "", 0, 1, DateTimeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumerationPropertyEClass, EnumerationProperty.class, "EnumerationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumerationProperty_Type(), this.getEnumeration(), null, "type", null, 1, 1, EnumerationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEnumerationProperty_DefaultValueAsString(), ecorePackage.getEString(), "defaultValueAsString", null, 0, 1, EnumerationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(integerPropertyEClass, IntegerProperty.class, "IntegerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntegerProperty_MinValue(), ecorePackage.getEInt(), "minValue", "-2147483648", 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIntegerProperty_MaxValue(), ecorePackage.getEInt(), "maxValue", "2147483647", 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIntegerProperty_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1, IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringProperty_RegularExpression(), ecorePackage.getEString(), "regularExpression", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringProperty_MinLength(), ecorePackage.getEInt(), "minLength", "-1", 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringProperty_MaxLength(), ecorePackage.getEInt(), "maxLength", "-1", 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractType_Properties(), this.getProperty(), this.getProperty_OwningType(), "properties", null, 0, -1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractType_Model(), this.getBusinessDomainModel(), this.getBusinessDomainModel_Types(), "model", null, 0, 1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(blobBinaryPropertyEClass, BlobBinaryProperty.class, "BlobBinaryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(blobTextPropertyEClass, BlobTextProperty.class, "BlobTextProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssociation_Source(), this.getBusinessClass(), this.getBusinessClass_AssociationsTo(), "source", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociation_Target(), this.getAbstractBusinessClass(), this.getAbstractBusinessClass_AssociationsFrom(), "target", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_SourceRoleName(), ecorePackage.getEString(), "sourceRoleName", "sourceRoleName", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_SourceMultiplicity(), this.getMultiplicity(), "sourceMultiplicity", "One", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_TargetRoleName(), ecorePackage.getEString(), "targetRoleName", "targetRoleName", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_TargetMultiplicity(), this.getMultiplicity(), "targetMultiplicity", "1", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_Composite(), ecorePackage.getEBoolean(), "composite", "false", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssociation_Ordered(), ecorePackage.getEBoolean(), "ordered", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssociation_Model(), this.getBusinessDomainModel(), this.getBusinessDomainModel_Associations(), "model", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decimalPropertyEClass, DecimalProperty.class, "DecimalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDecimalProperty_MinValue(), ecorePackage.getEFloat(), "minValue", "-2147483648", 0, 1, DecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDecimalProperty_MaxValue(), ecorePackage.getEFloat(), "maxValue", "-2147483648", 0, 1, DecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDecimalProperty_MinInclusive(), ecorePackage.getEBoolean(), "minInclusive", "true", 0, 1, DecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDecimalProperty_MaxInclusive(), ecorePackage.getEBoolean(), "maxInclusive", "true", 0, 1, DecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDecimalProperty_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", "0", 0, 1, DecimalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractBusinessClassEClass, AbstractBusinessClass.class, "AbstractBusinessClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractBusinessClass_AssociationsFrom(), this.getAssociation(), this.getAssociation_Target(), "associationsFrom", null, 0, -1, AbstractBusinessClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessClassReferenceEClass, BusinessClassReference.class, "BusinessClassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBusinessClassReference_ReferredModel(), ecorePackage.getEString(), "referredModel", null, 0, 1, BusinessClassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(uniqueRuleEClass, UniqueRule.class, "UniqueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUniqueRule_Properties(), this.getProperty(), null, "properties", null, 0, -1, UniqueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
        addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_MANY);
        addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
        addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_ONE);
        addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_MANY);

        initEEnum(dateTimeAccuracyEEnum, DateTimeAccuracy.class, "DateTimeAccuracy");
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MILLISECOND);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.SECOND);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MINUTE);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.HOUR);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.DAY);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.MONTH);
        addEEnumLiteral(dateTimeAccuracyEEnum, DateTimeAccuracy.YEAR);

        initEEnum(persistencyModeEEnum, PersistencyMode.class, "PersistencyMode");
        addEEnumLiteral(persistencyModeEEnum, PersistencyMode.READ_WRITE);
        addEEnumLiteral(persistencyModeEEnum, PersistencyMode.READ);
        addEEnumLiteral(persistencyModeEEnum, PersistencyMode.NONE);

        // Create resource
        createResource(eNS_URI);
    }

} //BusinessDomainDslPackageImpl
