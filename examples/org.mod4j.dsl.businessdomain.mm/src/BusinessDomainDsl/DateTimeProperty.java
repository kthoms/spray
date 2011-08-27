/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.DateTimeProperty#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link BusinessDomainDsl.DateTimeProperty#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getDateTimeProperty()
 * @model
 * @generated
 */
public interface DateTimeProperty extends Property {
	/**
     * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link BusinessDomainDsl.DateTimeAccuracy}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Accuracy</em>' attribute.
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @see #setAccuracy(DateTimeAccuracy)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDateTimeProperty_Accuracy()
     * @model default=""
     * @generated
     */
	DateTimeAccuracy getAccuracy();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DateTimeProperty#getAccuracy <em>Accuracy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accuracy</em>' attribute.
     * @see BusinessDomainDsl.DateTimeAccuracy
     * @see #getAccuracy()
     * @generated
     */
	void setAccuracy(DateTimeAccuracy value);

	/**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getDateTimeProperty_DefaultValue()
     * @model default=""
     * @generated
     */
	String getDefaultValue();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.DateTimeProperty#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
	void setDefaultValue(String value);

} // DateTimeProperty
