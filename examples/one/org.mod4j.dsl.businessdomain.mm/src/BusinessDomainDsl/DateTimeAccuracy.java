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
 * A representation of the literals of the enumeration '<em><b>Date Time Accuracy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BusinessDomainDsl.BusinessDomainDslPackage#getDateTimeAccuracy()
 * @model
 * @generated
 */
public enum DateTimeAccuracy implements Enumerator {
	/**
     * The '<em><b>Millisecond</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MILLISECOND_VALUE
     * @generated
     * @ordered
     */
	MILLISECOND(1, "Millisecond", "Millisecond"),

	/**
     * The '<em><b>Second</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SECOND_VALUE
     * @generated
     * @ordered
     */
	SECOND(2, "Second", "Second"),

	/**
     * The '<em><b>Minute</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MINUTE_VALUE
     * @generated
     * @ordered
     */
	MINUTE(4, "Minute", "Minute"),

	/**
     * The '<em><b>Hour</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #HOUR_VALUE
     * @generated
     * @ordered
     */
	HOUR(8, "Hour", "Hour"),

	/**
     * The '<em><b>Day</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DAY_VALUE
     * @generated
     * @ordered
     */
	DAY(16, "Day", "Day"),

	/**
     * The '<em><b>Month</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MONTH_VALUE
     * @generated
     * @ordered
     */
	MONTH(32, "Month", "Month"),

	/**
     * The '<em><b>Year</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #YEAR_VALUE
     * @generated
     * @ordered
     */
	YEAR(64, "Year", "Year");

	/**
     * The '<em><b>Millisecond</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Millisecond</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #MILLISECOND
     * @model name="Millisecond"
     * @generated
     * @ordered
     */
	public static final int MILLISECOND_VALUE = 1;

	/**
     * The '<em><b>Second</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Second</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SECOND
     * @model name="Second"
     * @generated
     * @ordered
     */
	public static final int SECOND_VALUE = 2;

	/**
     * The '<em><b>Minute</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #MINUTE
     * @model name="Minute"
     * @generated
     * @ordered
     */
	public static final int MINUTE_VALUE = 4;

	/**
     * The '<em><b>Hour</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #HOUR
     * @model name="Hour"
     * @generated
     * @ordered
     */
	public static final int HOUR_VALUE = 8;

	/**
     * The '<em><b>Day</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DAY
     * @model name="Day"
     * @generated
     * @ordered
     */
	public static final int DAY_VALUE = 16;

	/**
     * The '<em><b>Month</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #MONTH
     * @model name="Month"
     * @generated
     * @ordered
     */
	public static final int MONTH_VALUE = 32;

	/**
     * The '<em><b>Year</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #YEAR
     * @model name="Year"
     * @generated
     * @ordered
     */
	public static final int YEAR_VALUE = 64;

	/**
     * An array of all the '<em><b>Date Time Accuracy</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final DateTimeAccuracy[] VALUES_ARRAY =
		new DateTimeAccuracy[] {
            MILLISECOND,
            SECOND,
            MINUTE,
            HOUR,
            DAY,
            MONTH,
            YEAR,
        };

	/**
     * A public read-only list of all the '<em><b>Date Time Accuracy</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<DateTimeAccuracy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Date Time Accuracy</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DateTimeAccuracy get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DateTimeAccuracy result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Date Time Accuracy</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DateTimeAccuracy getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DateTimeAccuracy result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Date Time Accuracy</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static DateTimeAccuracy get(int value) {
        switch (value) {
            case MILLISECOND_VALUE: return MILLISECOND;
            case SECOND_VALUE: return SECOND;
            case MINUTE_VALUE: return MINUTE;
            case HOUR_VALUE: return HOUR;
            case DAY_VALUE: return DAY;
            case MONTH_VALUE: return MONTH;
            case YEAR_VALUE: return YEAR;
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
	private DateTimeAccuracy(int value, String name, String literal) {
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
	
} //DateTimeAccuracy
