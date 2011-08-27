/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.BusinessClassReference#getReferredModel <em>Referred Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassReference()
 * @model
 * @generated
 */
public interface BusinessClassReference extends AbstractBusinessClass {
	/**
     * Returns the value of the '<em><b>Referred Model</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Model</em>' attribute.
     * @see #setReferredModel(String)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClassReference_ReferredModel()
     * @model
     * @generated
     */
	String getReferredModel();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.BusinessClassReference#getReferredModel <em>Referred Model</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Model</em>' attribute.
     * @see #getReferredModel()
     * @generated
     */
	void setReferredModel(String value);

} // BusinessClassReference
