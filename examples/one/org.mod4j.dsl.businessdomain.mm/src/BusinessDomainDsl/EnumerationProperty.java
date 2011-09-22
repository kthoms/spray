/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.EnumerationProperty#getType <em>Type</em>}</li>
 *   <li>{@link BusinessDomainDsl.EnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty()
 * @model
 * @generated
 */
public interface EnumerationProperty extends Property {
	/**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Enumeration)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty_Type()
     * @model required="true"
     * @generated
     */
	Enumeration getType();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.EnumerationProperty#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
	void setType(Enumeration value);

	/**
     * Returns the value of the '<em><b>Default Value As String</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value As String</em>' attribute.
     * @see #setDefaultValueAsString(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumerationProperty_DefaultValueAsString()
     * @model
     * @generated
     */
	String getDefaultValueAsString();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.EnumerationProperty#getDefaultValueAsString <em>Default Value As String</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value As String</em>' attribute.
     * @see #getDefaultValueAsString()
     * @generated
     */
	void setDefaultValueAsString(String value);

} // EnumerationProperty
