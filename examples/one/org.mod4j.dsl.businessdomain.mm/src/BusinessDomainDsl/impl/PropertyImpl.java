/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.AbstractType;
import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.PersistencyMode;
import BusinessDomainDsl.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isWritable <em>Writable</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.PropertyImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PropertyImpl extends ModelElementImpl implements Property {
	/**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
     * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDerived()
     * @generated
     * @ordered
     */
    protected static final boolean DERIVED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDerived()
     * @generated
     * @ordered
     */
    protected boolean derived = DERIVED_EDEFAULT;

    /**
     * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isWritable()
     * @generated
     * @ordered
     */
	protected static final boolean WRITABLE_EDEFAULT = false;

				/**
     * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isWritable()
     * @generated
     * @ordered
     */
	protected boolean writable = WRITABLE_EDEFAULT;

				/**
     * The default value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersistency()
     * @generated
     * @ordered
     */
	protected static final PersistencyMode PERSISTENCY_EDEFAULT = PersistencyMode.READ_WRITE;

	/**
     * The cached value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPersistency()
     * @generated
     * @ordered
     */
	protected PersistencyMode persistency = PERSISTENCY_EDEFAULT;

	/**
     * The default value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
	protected static final boolean HAS_DEFAULT_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isHasDefault()
     * @generated
     * @ordered
     */
	protected boolean hasDefault = HAS_DEFAULT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.PROPERTY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDataType() {
        return dataType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDataType(String newDataType) {
        String oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isNullable() {
        return nullable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNullable(boolean newNullable) {
        boolean oldNullable = nullable;
        nullable = newNullable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__NULLABLE, oldNullable, nullable));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDerived() {
        return derived;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDerived(boolean newDerived) {
        boolean oldDerived = derived;
        derived = newDerived;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__DERIVED, oldDerived, derived));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isWritable() {
        return writable;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWritable(boolean newWritable) {
        boolean oldWritable = writable;
        writable = newWritable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__WRITABLE, oldWritable, writable));
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PersistencyMode getPersistency() {
        return persistency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPersistency(PersistencyMode newPersistency) {
        PersistencyMode oldPersistency = persistency;
        persistency = newPersistency == null ? PERSISTENCY_EDEFAULT : newPersistency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__PERSISTENCY, oldPersistency, persistency));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isHasDefault() {
        return hasDefault;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHasDefault(boolean newHasDefault) {
        boolean oldHasDefault = hasDefault;
        hasDefault = newHasDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT, oldHasDefault, hasDefault));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AbstractType getOwningType() {
        if (eContainerFeatureID() != BusinessDomainDslPackage.PROPERTY__OWNING_TYPE) return null;
        return (AbstractType)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetOwningType(AbstractType newOwningType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningType, BusinessDomainDslPackage.PROPERTY__OWNING_TYPE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOwningType(AbstractType newOwningType) {
        if (newOwningType != eInternalContainer() || (eContainerFeatureID() != BusinessDomainDslPackage.PROPERTY__OWNING_TYPE && newOwningType != null)) {
            if (EcoreUtil.isAncestor(this, newOwningType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningType != null)
                msgs = ((InternalEObject)newOwningType).eInverseAdd(this, BusinessDomainDslPackage.ABSTRACT_TYPE__PROPERTIES, AbstractType.class, msgs);
            msgs = basicSetOwningType(newOwningType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.PROPERTY__OWNING_TYPE, newOwningType, newOwningType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningType((AbstractType)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                return basicSetOwningType(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                return eInternalContainer().eInverseRemove(this, BusinessDomainDslPackage.ABSTRACT_TYPE__PROPERTIES, AbstractType.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                return getDataType();
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                return isNullable();
            case BusinessDomainDslPackage.PROPERTY__DERIVED:
                return isDerived();
            case BusinessDomainDslPackage.PROPERTY__WRITABLE:
                return isWritable();
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                return getPersistency();
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                return isHasDefault();
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                return getOwningType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                setDataType((String)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                setNullable((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__DERIVED:
                setDerived((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__WRITABLE:
                setWritable((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                setPersistency((PersistencyMode)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                setHasDefault((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                setOwningType((AbstractType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                setDataType(DATA_TYPE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                setNullable(NULLABLE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__DERIVED:
                setDerived(DERIVED_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__WRITABLE:
                setWritable(WRITABLE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                setPersistency(PERSISTENCY_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                setHasDefault(HAS_DEFAULT_EDEFAULT);
                return;
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                setOwningType((AbstractType)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BusinessDomainDslPackage.PROPERTY__DATA_TYPE:
                return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
            case BusinessDomainDslPackage.PROPERTY__NULLABLE:
                return nullable != NULLABLE_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__DERIVED:
                return derived != DERIVED_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__WRITABLE:
                return writable != WRITABLE_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__PERSISTENCY:
                return persistency != PERSISTENCY_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__HAS_DEFAULT:
                return hasDefault != HAS_DEFAULT_EDEFAULT;
            case BusinessDomainDslPackage.PROPERTY__OWNING_TYPE:
                return getOwningType() != null;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (dataType: ");
        result.append(dataType);
        result.append(", nullable: ");
        result.append(nullable);
        result.append(", derived: ");
        result.append(derived);
        result.append(", writable: ");
        result.append(writable);
        result.append(", persistency: ");
        result.append(persistency);
        result.append(", hasDefault: ");
        result.append(hasDefault);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
