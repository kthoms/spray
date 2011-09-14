/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.StringProperty#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link BusinessDomainDsl.StringProperty#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.StringProperty#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link BusinessDomainDsl.StringProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringProperty()
 * @model
 * @generated
 */
public interface StringProperty extends Property {
	/**
     * Returns the value of the '<em><b>Regular Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Regular Expression</em>' attribute.
     * @see #setRegularExpression(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringProperty_RegularExpression()
     * @model
     * @generated
     */
	String getRegularExpression();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.StringProperty#getRegularExpression <em>Regular Expression</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regular Expression</em>' attribute.
     * @see #getRegularExpression()
     * @generated
     */
	void setRegularExpression(String value);

	/**
     * Returns the value of the '<em><b>Min Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length</em>' attribute.
     * @see #setMinLength(int)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringProperty_MinLength()
     * @model default="-1"
     * @generated
     */
	int getMinLength();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.StringProperty#getMinLength <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length</em>' attribute.
     * @see #getMinLength()
     * @generated
     */
	void setMinLength(int value);

	/**
     * Returns the value of the '<em><b>Max Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length</em>' attribute.
     * @see #setMaxLength(int)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringProperty_MaxLength()
     * @model default="-1"
     * @generated
     */
	int getMaxLength();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.StringProperty#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
	void setMaxLength(int value);

	/**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getStringProperty_DefaultValue()
     * @model
     * @generated
     */
	String getDefaultValue();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.StringProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
	void setDefaultValue(String value);

} // StringProperty
