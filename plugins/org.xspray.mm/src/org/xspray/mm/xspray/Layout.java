/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.Layout#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#isRounded <em>Rounded</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getCornerHeight <em>Corner Height</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#isBold <em>Bold</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.Layout#isItalic <em>Italic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xspray.mm.xspray.XsprayPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
     * Returns the value of the '<em><b>Line Width</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Line Width</em>' attribute.
     * @see #setLineWidth(int)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_LineWidth()
     * @model default="1"
     * @generated
     */
	int getLineWidth();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getLineWidth <em>Line Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Width</em>' attribute.
     * @see #getLineWidth()
     * @generated
     */
	void setLineWidth(int value);

	/**
     * Returns the value of the '<em><b>Line Color</b></em>' attribute.
     * The default value is <code>"BLACK"</code>.
     * The literals are from the enumeration {@link org.xspray.mm.xspray.Color}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Line Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #setLineColor(Color)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_LineColor()
     * @model default="BLACK"
     * @generated
     */
	Color getLineColor();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getLineColor <em>Line Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #getLineColor()
     * @generated
     */
	void setLineColor(Color value);

	/**
     * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
     * The default value is <code>"NULL_COLOR"</code>.
     * The literals are from the enumeration {@link org.xspray.mm.xspray.Color}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fill Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #setFillColor(Color)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_FillColor()
     * @model default="NULL_COLOR"
     * @generated
     */
	Color getFillColor();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getFillColor <em>Fill Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fill Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #getFillColor()
     * @generated
     */
	void setFillColor(Color value);

	/**
     * Returns the value of the '<em><b>Text Color</b></em>' attribute.
     * The default value is <code>"BLACK"</code>.
     * The literals are from the enumeration {@link org.xspray.mm.xspray.Color}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Text Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #setTextColor(Color)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_TextColor()
     * @model default="BLACK"
     * @generated
     */
	Color getTextColor();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getTextColor <em>Text Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Color</em>' attribute.
     * @see org.xspray.mm.xspray.Color
     * @see #getTextColor()
     * @generated
     */
	void setTextColor(Color value);

	/**
     * Returns the value of the '<em><b>Rounded</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rounded</em>' attribute.
     * @see #setRounded(boolean)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_Rounded()
     * @model default="false"
     * @generated
     */
	boolean isRounded();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#isRounded <em>Rounded</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rounded</em>' attribute.
     * @see #isRounded()
     * @generated
     */
	void setRounded(boolean value);

	/**
     * Returns the value of the '<em><b>Corner Height</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Corner Height</em>' attribute.
     * @see #setCornerHeight(int)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_CornerHeight()
     * @model default="10"
     * @generated
     */
	int getCornerHeight();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getCornerHeight <em>Corner Height</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corner Height</em>' attribute.
     * @see #getCornerHeight()
     * @generated
     */
	void setCornerHeight(int value);

	/**
     * Returns the value of the '<em><b>Corner Width</b></em>' attribute.
     * The default value is <code>"10"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Corner Width</em>' attribute.
     * @see #setCornerWidth(int)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_CornerWidth()
     * @model default="10"
     * @generated
     */
	int getCornerWidth();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getCornerWidth <em>Corner Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Corner Width</em>' attribute.
     * @see #getCornerWidth()
     * @generated
     */
	void setCornerWidth(int value);

	/**
     * Returns the value of the '<em><b>Figure</b></em>' attribute.
     * The default value is <code>"Rectangle"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Figure</em>' attribute.
     * @see #isSetFigure()
     * @see #unsetFigure()
     * @see #setFigure(String)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_Figure()
     * @model default="Rectangle" unsettable="true"
     * @generated
     */
	String getFigure();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#getFigure <em>Figure</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Figure</em>' attribute.
     * @see #isSetFigure()
     * @see #unsetFigure()
     * @see #getFigure()
     * @generated
     */
	void setFigure(String value);

	/**
     * Unsets the value of the '{@link org.xspray.mm.xspray.Layout#getFigure <em>Figure</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetFigure()
     * @see #getFigure()
     * @see #setFigure(String)
     * @generated
     */
	void unsetFigure();

	/**
     * Returns whether the value of the '{@link org.xspray.mm.xspray.Layout#getFigure <em>Figure</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Figure</em>' attribute is set.
     * @see #unsetFigure()
     * @see #getFigure()
     * @see #setFigure(String)
     * @generated
     */
	boolean isSetFigure();

	/**
     * Returns the value of the '<em><b>Bold</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bold</em>' attribute.
     * @see #setBold(boolean)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_Bold()
     * @model default="false"
     * @generated
     */
	boolean isBold();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#isBold <em>Bold</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bold</em>' attribute.
     * @see #isBold()
     * @generated
     */
	void setBold(boolean value);

	/**
     * Returns the value of the '<em><b>Italic</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Italic</em>' attribute.
     * @see #setItalic(boolean)
     * @see org.xspray.mm.xspray.XsprayPackage#getLayout_Italic()
     * @model default="false"
     * @generated
     */
	boolean isItalic();

	/**
     * Sets the value of the '{@link org.xspray.mm.xspray.Layout#isItalic <em>Italic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Italic</em>' attribute.
     * @see #isItalic()
     * @generated
     */
	void setItalic(boolean value);

} // Layout
