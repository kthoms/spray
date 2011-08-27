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
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.AbstractType#getProperties <em>Properties</em>}</li>
 *   <li>{@link BusinessDomainDsl.AbstractType#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractType extends ModelElement {
	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link BusinessDomainDsl.Property}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.Property#getOwningType <em>Owning Type</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractType_Properties()
     * @see BusinessDomainDsl.Property#getOwningType
     * @model opposite="owningType" containment="true"
     * @generated
     */
	EList<Property> getProperties();

	/**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.BusinessDomainModel#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(BusinessDomainModel)
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractType_Model()
     * @see BusinessDomainDsl.BusinessDomainModel#getTypes
     * @model opposite="types" transient="false"
     * @generated
     */
	BusinessDomainModel getModel();

	/**
     * Sets the value of the '{@link BusinessDomainDsl.AbstractType#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
	void setModel(BusinessDomainModel value);

} // AbstractType
