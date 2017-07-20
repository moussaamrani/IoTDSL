/**
 */
package be.unamur.iot.iotdsl.impl;

import be.unamur.iot.iotdsl.Expression;
import be.unamur.iot.iotdsl.IotdslPackage;
import be.unamur.iot.iotdsl.TimeFrame;
import be.unamur.iot.iotdsl.WithinExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Within Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.impl.WithinExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.impl.WithinExpressionImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.impl.WithinExpressionImpl#getPreceding <em>Preceding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithinExpressionImpl extends ExpressionImpl implements WithinExpression {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected TimeFrame frame;

	/**
	 * The cached value of the '{@link #getPreceding() <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreceding()
	 * @generated
	 * @ordered
	 */
	protected Expression preceding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithinExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotdslPackage.Literals.WITHIN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFrame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(TimeFrame newFrame, NotificationChain msgs) {
		TimeFrame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__FRAME, oldFrame, newFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(TimeFrame newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPreceding() {
		return preceding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreceding(Expression newPreceding, NotificationChain msgs) {
		Expression oldPreceding = preceding;
		preceding = newPreceding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__PRECEDING, oldPreceding, newPreceding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreceding(Expression newPreceding) {
		if (newPreceding != preceding) {
			NotificationChain msgs = null;
			if (preceding != null)
				msgs = ((InternalEObject)preceding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__PRECEDING, null, msgs);
			if (newPreceding != null)
				msgs = ((InternalEObject)newPreceding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.WITHIN_EXPRESSION__PRECEDING, null, msgs);
			msgs = basicSetPreceding(newPreceding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.WITHIN_EXPRESSION__PRECEDING, newPreceding, newPreceding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotdslPackage.WITHIN_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case IotdslPackage.WITHIN_EXPRESSION__FRAME:
				return basicSetFrame(null, msgs);
			case IotdslPackage.WITHIN_EXPRESSION__PRECEDING:
				return basicSetPreceding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotdslPackage.WITHIN_EXPRESSION__LEFT:
				return getLeft();
			case IotdslPackage.WITHIN_EXPRESSION__FRAME:
				return getFrame();
			case IotdslPackage.WITHIN_EXPRESSION__PRECEDING:
				return getPreceding();
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
			case IotdslPackage.WITHIN_EXPRESSION__LEFT:
				setLeft((Expression)newValue);
				return;
			case IotdslPackage.WITHIN_EXPRESSION__FRAME:
				setFrame((TimeFrame)newValue);
				return;
			case IotdslPackage.WITHIN_EXPRESSION__PRECEDING:
				setPreceding((Expression)newValue);
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
			case IotdslPackage.WITHIN_EXPRESSION__LEFT:
				setLeft((Expression)null);
				return;
			case IotdslPackage.WITHIN_EXPRESSION__FRAME:
				setFrame((TimeFrame)null);
				return;
			case IotdslPackage.WITHIN_EXPRESSION__PRECEDING:
				setPreceding((Expression)null);
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
			case IotdslPackage.WITHIN_EXPRESSION__LEFT:
				return left != null;
			case IotdslPackage.WITHIN_EXPRESSION__FRAME:
				return frame != null;
			case IotdslPackage.WITHIN_EXPRESSION__PRECEDING:
				return preceding != null;
		}
		return super.eIsSet(featureID);
	}

} //WithinExpressionImpl
