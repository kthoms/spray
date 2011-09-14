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
 * A representation of the literals of the enumeration '<em><b>Persistency Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getPersistencyMode()
 * @model
 * @generated
 */
public enum PersistencyMode implements Enumerator {
	/**
     * The '<em><b>Read Write</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #READ_WRITE_VALUE
     * @generated
     * @ordered
     */
	READ_WRITE(0, "ReadWrite", "ReadWrite"),

	/**
     * The '<em><b>Read</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #READ_VALUE
     * @generated
     * @ordered
     */
	READ(0, "Read", "Read"),

	/**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
	NONE(0, "None", "None");

	/**
     * The '<em><b>Read Write</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #READ_WRITE
     * @model name="ReadWrite"
     * @generated
     * @ordered
     */
	public static final int READ_WRITE_VALUE = 0;

	/**
     * The '<em><b>Read</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #READ
     * @model name="Read"
     * @generated
     * @ordered
     */
	public static final int READ_VALUE = 0;

	/**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NONE
     * @model name="None"
     * @generated
     * @ordered
     */
	public static final int NONE_VALUE = 0;

	/**
     * An array of all the '<em><b>Persistency Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final PersistencyMode[] VALUES_ARRAY =
		new PersistencyMode[] {
            READ_WRITE,
            READ,
            NONE,
        };

	/**
     * A public read-only list of all the '<em><b>Persistency Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<PersistencyMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Persistency Mode</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PersistencyMode get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PersistencyMode result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Persistency Mode</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PersistencyMode getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PersistencyMode result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Persistency Mode</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static PersistencyMode get(int value) {
        switch (value) {
            case READ_WRITE_VALUE: return READ_WRITE;
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
	private PersistencyMode(int value, String name, String literal) {
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
	
} //PersistencyMode
