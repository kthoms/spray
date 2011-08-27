/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BusinessDomainDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getMultiplicity()
 * @model
 * @generated
 */
public enum Multiplicity implements Enumerator {
	/**
     * The '<em><b>Zero Many</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ZERO_MANY_VALUE
     * @generated
     * @ordered
     */
	ZERO_MANY(0, "ZeroMany", "ZeroMany"),

	/**
     * The '<em><b>One</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ONE_VALUE
     * @generated
     * @ordered
     */
	ONE(1, "One", "One"),

	/**
     * The '<em><b>Zero One</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ZERO_ONE_VALUE
     * @generated
     * @ordered
     */
	ZERO_ONE(2, "ZeroOne", "ZeroOne"),

	/**
     * The '<em><b>One Many</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ONE_MANY_VALUE
     * @generated
     * @ordered
     */
	ONE_MANY(3, "OneMany", "OneMany");

	/**
     * The '<em><b>Zero Many</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ZERO_MANY
     * @model name="ZeroMany"
     * @generated
     * @ordered
     */
	public static final int ZERO_MANY_VALUE = 0;

	/**
     * The '<em><b>One</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ONE
     * @model name="One"
     * @generated
     * @ordered
     */
	public static final int ONE_VALUE = 1;

	/**
     * The '<em><b>Zero One</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ZERO_ONE
     * @model name="ZeroOne"
     * @generated
     * @ordered
     */
	public static final int ZERO_ONE_VALUE = 2;

	/**
     * The '<em><b>One Many</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ONE_MANY
     * @model name="OneMany"
     * @generated
     * @ordered
     */
	public static final int ONE_MANY_VALUE = 3;

	/**
     * An array of all the '<em><b>Multiplicity</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final Multiplicity[] VALUES_ARRAY =
		new Multiplicity[] {
            ZERO_MANY,
            ONE,
            ZERO_ONE,
            ONE_MANY,
        };

	/**
     * A public read-only list of all the '<em><b>Multiplicity</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<Multiplicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Multiplicity</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Multiplicity get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Multiplicity result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Multiplicity</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Multiplicity getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Multiplicity result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Multiplicity</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Multiplicity get(int value) {
        switch (value) {
            case ZERO_MANY_VALUE: return ZERO_MANY;
            case ONE_VALUE: return ONE;
            case ZERO_ONE_VALUE: return ZERO_ONE;
            case ONE_MANY_VALUE: return ONE_MANY;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private Multiplicity(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //Multiplicity
