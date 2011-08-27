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
 * A representation of the model object '<em><b>Abstract Business Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BusinessDomainDsl.AbstractBusinessClass#getAssociationsFrom <em>Associations From</em>}</li>
 * </ul>
 * </p>
 *
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractBusinessClass()
 * @model abstract="true"
 * @generated
 */
public interface AbstractBusinessClass extends AbstractType {
	/**
     * Returns the value of the '<em><b>Associations From</b></em>' reference list.
     * The list contents are of type {@link BusinessDomainDsl.Association}.
     * It is bidirectional and its opposite is '{@link BusinessDomainDsl.Association#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Associations From</em>' reference list.
     * @see BusinessDomainDsl.BusinessDomainDslPackage#getAbstractBusinessClass_AssociationsFrom()
     * @see BusinessDomainDsl.Association#getTarget
     * @model opposite="target"
     * @generated
     */
	EList<Association> getAssociationsFrom();

} // AbstractBusinessClass
