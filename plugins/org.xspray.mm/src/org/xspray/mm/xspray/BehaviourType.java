/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behaviour Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xspray.mm.xspray.XsprayPackage#getBehaviourType()
 * @model
 * @generated
 */
public enum BehaviourType implements Enumerator {
	/**
     * The '<em><b>EMPTY BEHAVIOUR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #EMPTY_BEHAVIOUR_VALUE
     * @generated
     * @ordered
     */
	EMPTY_BEHAVIOUR(0, "EMPTY_BEHAVIOUR", "EMPTY_BEHAVIOUR"),

	/**
     * The '<em><b>CREATE BEHAVIOUR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CREATE_BEHAVIOUR_VALUE
     * @generated
     * @ordered
     */
	CREATE_BEHAVIOUR(1, "CREATE_BEHAVIOUR", "CREATE_BEHAVIOUR"),

	/**
     * The '<em><b>CUSTOM BEHAVIOUR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CUSTOM_BEHAVIOUR_VALUE
     * @generated
     * @ordered
     */
	CUSTOM_BEHAVIOUR(2, "CUSTOM_BEHAVIOUR", "CUSTOM_BEHAVIOUR");

	/**
     * The '<em><b>EMPTY BEHAVIOUR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMPTY BEHAVIOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #EMPTY_BEHAVIOUR
     * @model
     * @generated
     * @ordered
     */
	public static final int EMPTY_BEHAVIOUR_VALUE = 0;

	/**
     * The '<em><b>CREATE BEHAVIOUR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE BEHAVIOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CREATE_BEHAVIOUR
     * @model
     * @generated
     * @ordered
     */
	public static final int CREATE_BEHAVIOUR_VALUE = 1;

	/**
     * The '<em><b>CUSTOM BEHAVIOUR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM BEHAVIOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CUSTOM_BEHAVIOUR
     * @model
     * @generated
     * @ordered
     */
	public static final int CUSTOM_BEHAVIOUR_VALUE = 2;

	/**
     * An array of all the '<em><b>Behaviour Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final BehaviourType[] VALUES_ARRAY =
		new BehaviourType[] {
            EMPTY_BEHAVIOUR,
            CREATE_BEHAVIOUR,
            CUSTOM_BEHAVIOUR,
        };

	/**
     * A public read-only list of all the '<em><b>Behaviour Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<BehaviourType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Behaviour Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BehaviourType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BehaviourType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Behaviour Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BehaviourType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BehaviourType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Behaviour Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static BehaviourType get(int value) {
        switch (value) {
            case EMPTY_BEHAVIOUR_VALUE: return EMPTY_BEHAVIOUR;
            case CREATE_BEHAVIOUR_VALUE: return CREATE_BEHAVIOUR;
            case CUSTOM_BEHAVIOUR_VALUE: return CUSTOM_BEHAVIOUR;
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
	private BehaviourType(int value, String name, String literal) {
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
	
} //BehaviourType
