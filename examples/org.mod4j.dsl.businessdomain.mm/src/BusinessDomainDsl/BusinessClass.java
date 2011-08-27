/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getBusinessRules <em>Business Rules</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link BusinessDomainDsl.BusinessClass#getAssociationsTo <em>Associations To</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass()
 * @model
 * @generated
 */
public interface BusinessClass extends AbstractBusinessClass {
	/**
     * Returns the value of the '<em><b>Business Rules</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.AbstractBusinessRule}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.AbstractBusinessRule#getBusinessClass <em>Business Class</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Business Rules</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_BusinessRules()
     * @see BusinessDomainDsl.AbstractBusinessRule#getBusinessClass
     * @model opposite="businessClass" containment="true"
     * @generated
     */
	EList<AbstractBusinessRule> getBusinessRules();

	/**
     * Returns the value of the '<em><b>Superclass</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Superclass</em>' reference.
     * @see #setSuperclass(BusinessClass)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_Superclass()
     * @model
     * @generated
     */
	BusinessClass getSuperclass();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.BusinessClass#getSuperclass <em>Superclass</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Superclass</em>' reference.
     * @see #getSuperclass()
     * @generated
     */
	void setSuperclass(BusinessClass value);

	/**
     * Returns the value of the '<em><b>Associations To</b></em>' reference list.
     * The list contents are of type {@link BusinessDomainDsl.Association}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.Association#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Associations To</em>' reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getBusinessClass_AssociationsTo()
     * @see BusinessDomainDsl.Association#getSource
     * @model opposite="source"
     * @generated
     */
	EList<Association> getAssociationsTo();

} // BusinessClass
