/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl.impl;

import BusinessDomainDsl.BusinessDomainDslPackage;
import BusinessDomainDsl.IntegerProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BusinessDomainDsl.impl.IntegerPropertyImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.IntegerPropertyImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.impl.IntegerPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerPropertyImpl extends PropertyImpl implements IntegerProperty {
	/**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
	protected static final int MIN_VALUE_EDEFAULT = -2147483648;

	/**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
	protected static final int MAX_VALUE_EDEFAULT = 2147483647;

	/**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected static final int DEFAULT_VALUE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
	protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IntegerPropertyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return BusinessDomainDslPackage.Literals.INTEGER_PROPERTY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMinValue() {
        return minValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinValue(int newMinValue) {
        int oldMinValue = minValue;
        minValue = newMinValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.INTEGER_PROPERTY__MIN_VALUE, oldMinValue, minValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMaxValue() {
        return maxValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxValue(int newMaxValue) {
        int oldMaxValue = maxValue;
        maxValue = newMaxValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.INTEGER_PROPERTY__MAX_VALUE, oldMaxValue, maxValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getDefaultValue() {
        return defaultValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultValue(int newDefaultValue) {
        int oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BusinessDomainDslPackage.INTEGER_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MIN_VALUE:
                return getMinValue();
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MAX_VALUE:
                return getMaxValue();
            case BusinessDomainDslPackage.INTEGER_PROPERTY__DEFAULT_VALUE:
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
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MIN_VALUE:
                setMinValue((Integer)newValue);
                return;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MAX_VALUE:
                setMaxValue((Integer)newValue);
                return;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__DEFAULT_VALUE:
                setDefaultValue((Integer)newValue);
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
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MIN_VALUE:
                setMinValue(MIN_VALUE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MAX_VALUE:
                setMaxValue(MAX_VALUE_EDEFAULT);
                return;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__DEFAULT_VALUE:
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
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MIN_VALUE:
                return minValue != MIN_VALUE_EDEFAULT;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__MAX_VALUE:
                return maxValue != MAX_VALUE_EDEFAULT;
            case BusinessDomainDslPackage.INTEGER_PROPERTY__DEFAULT_VALUE:
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
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(')');
        return result.toString();
    }

} //IntegerPropertyImpl
