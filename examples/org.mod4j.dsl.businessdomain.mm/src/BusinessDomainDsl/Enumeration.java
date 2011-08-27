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
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link BusinessDomainDsl.Enumeration#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends ModelElement {
	/**
     * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.EnumerationLiteral}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration_EnumerationLiterals()
     * @see BusinessDomainDsl.EnumerationLiteral#getEnumeration
     * @model opposite="enumeration" containment="true"
     * @generated
     */
	EList<EnumerationLiteral> getEnumerationLiterals();

	/**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.BusinessDomainModel#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(BusinessDomainModel)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getEnumeration_Model()
     * @see BusinessDomainDsl.BusinessDomainModel#getEnumerations
     * @model opposite="enumerations" transient="false"
     * @generated
     */
	BusinessDomainModel getModel();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.Enumeration#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
	void setModel(BusinessDomainModel value);

} // Enumeration
