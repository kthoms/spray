/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.AbstractBusinessRule#getBusinessClass <em>Business Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractBusinessRule()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBusinessRule extends ModelElement {
	/**
     * Returns the value of the '<em><b>Business Class</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.BusinessClass#getBusinessRules <em>Business Rules</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Business Class</em>' container reference.
     * @see #setBusinessClass(BusinessClass)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractBusinessRule_BusinessClass()
     * @see BusinessDomainDsl.BusinessClass#getBusinessRules
     * @model opposite="businessRules" transient="false"
     * @generated
     */
	BusinessClass getBusinessClass();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.AbstractBusinessRule#getBusinessClass <em>Business Class</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Class</em>' container reference.
     * @see #getBusinessClass()
     * @generated
     */
	void setBusinessClass(BusinessClass value);

} // AbstractBusinessRule
