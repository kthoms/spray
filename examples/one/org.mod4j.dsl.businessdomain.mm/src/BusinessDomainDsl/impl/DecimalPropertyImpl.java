/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.DecimalProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.DecimalPropertyImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.DecimalPropertyImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.DecimalPropertyImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.DecimalPropertyImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.DecimalPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalPropertyImpl extends PropertyImpl implements DecimalProperty {
	/**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
	protected static final float MIN_VALUE_EDEFAULT = -2.14748365E9F;

	/**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
	protected static final float MAX_VALUE_EDEFAULT = -2.14748365E9F;

	/**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMinInclusive()
     * @generated
     * @ordered
     */
	protected static final boolean MIN_INCLUSIVE_EDEFAULT = true;

	/**
     * The cached value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMinInclusive()
     * @generated
     * @ordered
     */
	protected boolean minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
     * The default value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMaxInclusive()
     * @generated
     * @ordered
     */
	protected static final boolean MAX_INCLUSIVE_EDEFAULT = true;

	/**
     * The cached value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isMaxInclusive()
     * @generated
     * @ordered
     */
	protected boolean maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected static final float DEFAULT_VALUE_EDEFAULT = 0.0F;

	/**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected float defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DecimalPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.DECIMAL_PROPERTY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public float getMinValue() {
        return minValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinValue(float newMinValue) {
        float oldMinValue = minValue;
        minValue = newMinValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_VALUE, oldMinValue, minValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public float getMaxValue() {
        return maxValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxValue(float newMaxValue) {
        float oldMaxValue = maxValue;
        maxValue = newMaxValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_VALUE, oldMaxValue, maxValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isMinInclusive() {
        return minInclusive;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinInclusive(boolean newMinInclusive) {
        boolean oldMinInclusive = minInclusive;
        minInclusive = newMinInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isMaxInclusive() {
        return maxInclusive;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxInclusive(boolean newMaxInclusive) {
        boolean oldMaxInclusive = maxInclusive;
        maxInclusive = newMaxInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public float getDefaultValue() {
        return defaultValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultValue(float newDefaultValue) {
        float oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.DECIMAL_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_VALUE:
                return getMinValue();
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_VALUE:
                return getMaxValue();
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_INCLUSIVE:
                return isMinInclusive();
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_INCLUSIVE:
                return isMaxInclusive();
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__DEFAULT_VALUE:
                return getDefaultValue();
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
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_VALUE:
                setMinValue((Float)newValue);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_VALUE:
                setMaxValue((Float)newValue);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_INCLUSIVE:
                setMinInclusive((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_INCLUSIVE:
                setMaxInclusive((Boolean)newValue);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__DEFAULT_VALUE:
                setDefaultValue((Float)newValue);
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
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_VALUE:
                setMinValue(MIN_VALUE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_VALUE:
                setMaxValue(MAX_VALUE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_INCLUSIVE:
                setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_INCLUSIVE:
                setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_VALUE:
                return minValue != MIN_VALUE_EDEFAULT;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_VALUE:
                return maxValue != MAX_VALUE_EDEFAULT;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MIN_INCLUSIVE:
                return minInclusive != MIN_INCLUSIVE_EDEFAULT;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__MAX_INCLUSIVE:
                return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
            case BusinessDomainDslPackage.DECIMAL_PROPERTY__DEFAULT_VALUE:
                return defaultValue != DEFAULT_VALUE_EDEFAULT;
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
        result.append(" (minValue: ");
        result.append(minValue);
        result.append(", maxValue: ");
        result.append(maxValue);
        result.append(", minInclusive: ");
        result.append(minInclusive);
        result.append(", maxInclusive: ");
        result.append(maxInclusive);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(')');
        return result.toString();
    }

} //DecimalPropertyImpl
