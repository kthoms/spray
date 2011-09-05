/**
 * (c) Copyright spray.org
 */
package org.xspray.mm.xspray.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.xspray.mm.xspray.Color;
import org.xspray.mm.xspray.Layout;
import org.xspray.mm.xspray.XsprayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#isRounded <em>Rounded</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getCornerHeight <em>Corner Height</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getCornerWidth <em>Corner Width</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.xspray.mm.xspray.impl.LayoutImpl#isItalic <em>Italic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends EObjectImpl implements Layout {
	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color LINE_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected Color lineColor = LINE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color FILL_COLOR_EDEFAULT = Color.NULL_COLOR;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected Color fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color TEXT_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected Color textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isRounded() <em>Rounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRounded() <em>Rounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRounded()
	 * @generated
	 * @ordered
	 */
	protected boolean rounded = ROUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int CORNER_HEIGHT_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getCornerHeight() <em>Corner Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerHeight()
	 * @generated
	 * @ordered
	 */
	protected int cornerHeight = CORNER_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int CORNER_WIDTH_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getCornerWidth() <em>Corner Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerWidth()
	 * @generated
	 * @ordered
	 */
	protected int cornerWidth = CORNER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigure() <em>Figure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected static final String FIGURE_EDEFAULT = "Rectangle";

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected String figure = FIGURE_EDEFAULT;

	/**
	 * This is true if the Figure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean figureESet;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsprayPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(Color newLineColor) {
		Color oldLineColor = lineColor;
		lineColor = newLineColor == null ? LINE_COLOR_EDEFAULT : newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__LINE_COLOR, oldLineColor, lineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(Color newFillColor) {
		Color oldFillColor = fillColor;
		fillColor = newFillColor == null ? FILL_COLOR_EDEFAULT : newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__FILL_COLOR, oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(Color newTextColor) {
		Color oldTextColor = textColor;
		textColor = newTextColor == null ? TEXT_COLOR_EDEFAULT : newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRounded() {
		return rounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRounded(boolean newRounded) {
		boolean oldRounded = rounded;
		rounded = newRounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__ROUNDED, oldRounded, rounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCornerHeight() {
		return cornerHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerHeight(int newCornerHeight) {
		int oldCornerHeight = cornerHeight;
		cornerHeight = newCornerHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__CORNER_HEIGHT, oldCornerHeight, cornerHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCornerWidth() {
		return cornerWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerWidth(int newCornerWidth) {
		int oldCornerWidth = cornerWidth;
		cornerWidth = newCornerWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__CORNER_WIDTH, oldCornerWidth, cornerWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(String newFigure) {
		String oldFigure = figure;
		figure = newFigure;
		boolean oldFigureESet = figureESet;
		figureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__FIGURE, oldFigure, figure, !oldFigureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFigure() {
		String oldFigure = figure;
		boolean oldFigureESet = figureESet;
		figure = FIGURE_EDEFAULT;
		figureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsprayPackage.LAYOUT__FIGURE, oldFigure, FIGURE_EDEFAULT, oldFigureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFigure() {
		return figureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsprayPackage.LAYOUT__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsprayPackage.LAYOUT__LINE_WIDTH:
				return getLineWidth();
			case XsprayPackage.LAYOUT__LINE_COLOR:
				return getLineColor();
			case XsprayPackage.LAYOUT__FILL_COLOR:
				return getFillColor();
			case XsprayPackage.LAYOUT__TEXT_COLOR:
				return getTextColor();
			case XsprayPackage.LAYOUT__ROUNDED:
				return isRounded();
			case XsprayPackage.LAYOUT__CORNER_HEIGHT:
				return getCornerHeight();
			case XsprayPackage.LAYOUT__CORNER_WIDTH:
				return getCornerWidth();
			case XsprayPackage.LAYOUT__FIGURE:
				return getFigure();
			case XsprayPackage.LAYOUT__BOLD:
				return isBold();
			case XsprayPackage.LAYOUT__ITALIC:
				return isItalic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XsprayPackage.LAYOUT__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case XsprayPackage.LAYOUT__LINE_COLOR:
				setLineColor((Color)newValue);
				return;
			case XsprayPackage.LAYOUT__FILL_COLOR:
				setFillColor((Color)newValue);
				return;
			case XsprayPackage.LAYOUT__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case XsprayPackage.LAYOUT__ROUNDED:
				setRounded((Boolean)newValue);
				return;
			case XsprayPackage.LAYOUT__CORNER_HEIGHT:
				setCornerHeight((Integer)newValue);
				return;
			case XsprayPackage.LAYOUT__CORNER_WIDTH:
				setCornerWidth((Integer)newValue);
				return;
			case XsprayPackage.LAYOUT__FIGURE:
				setFigure((String)newValue);
				return;
			case XsprayPackage.LAYOUT__BOLD:
				setBold((Boolean)newValue);
				return;
			case XsprayPackage.LAYOUT__ITALIC:
				setItalic((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XsprayPackage.LAYOUT__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__ROUNDED:
				setRounded(ROUNDED_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__CORNER_HEIGHT:
				setCornerHeight(CORNER_HEIGHT_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__CORNER_WIDTH:
				setCornerWidth(CORNER_WIDTH_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__FIGURE:
				unsetFigure();
				return;
			case XsprayPackage.LAYOUT__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case XsprayPackage.LAYOUT__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XsprayPackage.LAYOUT__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case XsprayPackage.LAYOUT__LINE_COLOR:
				return lineColor != LINE_COLOR_EDEFAULT;
			case XsprayPackage.LAYOUT__FILL_COLOR:
				return fillColor != FILL_COLOR_EDEFAULT;
			case XsprayPackage.LAYOUT__TEXT_COLOR:
				return textColor != TEXT_COLOR_EDEFAULT;
			case XsprayPackage.LAYOUT__ROUNDED:
				return rounded != ROUNDED_EDEFAULT;
			case XsprayPackage.LAYOUT__CORNER_HEIGHT:
				return cornerHeight != CORNER_HEIGHT_EDEFAULT;
			case XsprayPackage.LAYOUT__CORNER_WIDTH:
				return cornerWidth != CORNER_WIDTH_EDEFAULT;
			case XsprayPackage.LAYOUT__FIGURE:
				return isSetFigure();
			case XsprayPackage.LAYOUT__BOLD:
				return bold != BOLD_EDEFAULT;
			case XsprayPackage.LAYOUT__ITALIC:
				return italic != ITALIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", rounded: ");
		result.append(rounded);
		result.append(", cornerHeight: ");
		result.append(cornerHeight);
		result.append(", cornerWidth: ");
		result.append(cornerWidth);
		result.append(", figure: ");
		if (figureESet) result.append(figure); else result.append("<unset>");
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
