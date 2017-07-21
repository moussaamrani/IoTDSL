/**
 */
package be.unamur.iot.iotdsl.impl;

import be.unamur.iot.iotdsl.Expression;
import be.unamur.iot.iotdsl.IotdslPackage;
import be.unamur.iot.iotdsl.TimingExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.impl.TimingExpressionImpl#getFollowing <em>Following</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.impl.TimingExpressionImpl#getPreceding <em>Preceding</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimingExpressionImpl extends ExpressionImpl implements TimingExpression {
	/**
	 * The cached value of the '{@link #getFollowing() <em>Following</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing()
	 * @generated
	 * @ordered
	 */
	protected Expression following;

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
	protected TimingExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotdslPackage.Literals.TIMING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFollowing() {
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowing(Expression newFollowing, NotificationChain msgs) {
		Expression oldFollowing = following;
		following = newFollowing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.TIMING_EXPRESSION__FOLLOWING, oldFollowing, newFollowing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowing(Expression newFollowing) {
		if (newFollowing != following) {
			NotificationChain msgs = null;
			if (following != null)
				msgs = ((InternalEObject)following).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.TIMING_EXPRESSION__FOLLOWING, null, msgs);
			if (newFollowing != null)
				msgs = ((InternalEObject)newFollowing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.TIMING_EXPRESSION__FOLLOWING, null, msgs);
			msgs = basicSetFollowing(newFollowing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.TIMING_EXPRESSION__FOLLOWING, newFollowing, newFollowing));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.TIMING_EXPRESSION__PRECEDING, oldPreceding, newPreceding);
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
				msgs = ((InternalEObject)preceding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.TIMING_EXPRESSION__PRECEDING, null, msgs);
			if (newPreceding != null)
				msgs = ((InternalEObject)newPreceding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.TIMING_EXPRESSION__PRECEDING, null, msgs);
			msgs = basicSetPreceding(newPreceding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.TIMING_EXPRESSION__PRECEDING, newPreceding, newPreceding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotdslPackage.TIMING_EXPRESSION__FOLLOWING:
				return basicSetFollowing(null, msgs);
			case IotdslPackage.TIMING_EXPRESSION__PRECEDING:
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
			case IotdslPackage.TIMING_EXPRESSION__FOLLOWING:
				return getFollowing();
			case IotdslPackage.TIMING_EXPRESSION__PRECEDING:
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
			case IotdslPackage.TIMING_EXPRESSION__FOLLOWING:
				setFollowing((Expression)newValue);
				return;
			case IotdslPackage.TIMING_EXPRESSION__PRECEDING:
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
			case IotdslPackage.TIMING_EXPRESSION__FOLLOWING:
				setFollowing((Expression)null);
				return;
			case IotdslPackage.TIMING_EXPRESSION__PRECEDING:
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
			case IotdslPackage.TIMING_EXPRESSION__FOLLOWING:
				return following != null;
			case IotdslPackage.TIMING_EXPRESSION__PRECEDING:
				return preceding != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingExpressionImpl
