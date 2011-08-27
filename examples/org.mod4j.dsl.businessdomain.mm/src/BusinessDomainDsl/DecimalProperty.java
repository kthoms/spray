/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.DecimalProperty#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.DecimalProperty#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link BusinessDomainDsl.DecimalProperty#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link BusinessDomainDsl.DecimalProperty#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link BusinessDomainDsl.DecimalProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty()
 * @model
 * @generated
 */
public interface DecimalProperty extends Property {
	/**
     * Returns the value of the '<em><b>Min Value</b></em>' attribute.
     * The default value is <code>"-2147483648"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Min Value</em>' attribute.
     * @see #setMinValue(float)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty_MinValue()
     * @model default="-2147483648"
     * @generated
     */
	float getMinValue();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DecimalProperty#getMinValue <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Value</em>' attribute.
     * @see #getMinValue()
     * @generated
     */
	void setMinValue(float value);

	/**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * The default value is <code>"-2147483648"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(float)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty_MaxValue()
     * @model default="-2147483648"
     * @generated
     */
	float getMaxValue();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DecimalProperty#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
	void setMaxValue(float value);

	/**
     * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Min Inclusive</em>' attribute.
     * @see #setMinInclusive(boolean)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty_MinInclusive()
     * @model default="true"
     * @generated
     */
	boolean isMinInclusive();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DecimalProperty#isMinInclusive <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Inclusive</em>' attribute.
     * @see #isMinInclusive()
     * @generated
     */
	void setMinInclusive(boolean value);

	/**
     * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Max Inclusive</em>' attribute.
     * @see #setMaxInclusive(boolean)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty_MaxInclusive()
     * @model default="true"
     * @generated
     */
	boolean isMaxInclusive();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DecimalProperty#isMaxInclusive <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Inclusive</em>' attribute.
     * @see #isMaxInclusive()
     * @generated
     */
	void setMaxInclusive(boolean value);

	/**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(float)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDecimalProperty_DefaultValue()
     * @model default="0"
     * @generated
     */
	float getDefaultValue();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DecimalProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
	void setDefaultValue(float value);

} // DecimalProperty
