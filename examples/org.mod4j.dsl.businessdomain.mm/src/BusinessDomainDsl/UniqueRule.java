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
 * A representation of the model object '<em><b>Unique Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.UniqueRule#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getUniqueRule()
 * @model
 * @generated
 */
public interface UniqueRule extends AbstractBusinessRule {
	/**
     * Returns the value of the '<em><b>Properties</b></em>' reference list.
     * The list contents are of type {@link BusinessDomainDsl.Property}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getUniqueRule_Properties()
     * @model
     * @generated
     */
	EList<Property> getProperties();

} // UniqueRule
