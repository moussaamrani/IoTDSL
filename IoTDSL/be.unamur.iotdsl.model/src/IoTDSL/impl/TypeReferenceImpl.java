/**
 */
package IoTDSL.impl;

import IoTDSL.DeclaredType;
import IoTDSL.IoTDSLPackage;
import IoTDSL.PrimitiveType;
import IoTDSL.TypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link IoTDSL.impl.TypeReferenceImpl#getDtype <em>Dtype</em>}</li>
 *   <li>{@link IoTDSL.impl.TypeReferenceImpl#getPtype <em>Ptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference {
	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected DeclaredType dtype;

	/**
	 * The cached value of the '{@link #getPtype() <em>Ptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtype()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType ptype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoTDSLPackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDtype(DeclaredType newDtype, NotificationChain msgs) {
		DeclaredType oldDtype = dtype;
		dtype = newDtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTDSLPackage.TYPE_REFERENCE__DTYPE, oldDtype, newDtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(DeclaredType newDtype) {
		if (newDtype != dtype) {
			NotificationChain msgs = null;
			if (dtype != null)
				msgs = ((InternalEObject)dtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTDSLPackage.TYPE_REFERENCE__DTYPE, null, msgs);
			if (newDtype != null)
				msgs = ((InternalEObject)newDtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTDSLPackage.TYPE_REFERENCE__DTYPE, null, msgs);
			msgs = basicSetDtype(newDtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoTDSLPackage.TYPE_REFERENCE__DTYPE, newDtype, newDtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getPtype() {
		return ptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPtype(PrimitiveType newPtype, NotificationChain msgs) {
		PrimitiveType oldPtype = ptype;
		ptype = newPtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoTDSLPackage.TYPE_REFERENCE__PTYPE, oldPtype, newPtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPtype(PrimitiveType newPtype) {
		if (newPtype != ptype) {
			NotificationChain msgs = null;
			if (ptype != null)
				msgs = ((InternalEObject)ptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoTDSLPackage.TYPE_REFERENCE__PTYPE, null, msgs);
			if (newPtype != null)
				msgs = ((InternalEObject)newPtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoTDSLPackage.TYPE_REFERENCE__PTYPE, null, msgs);
			msgs = basicSetPtype(newPtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoTDSLPackage.TYPE_REFERENCE__PTYPE, newPtype, newPtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoTDSLPackage.TYPE_REFERENCE__DTYPE:
				return basicSetDtype(null, msgs);
			case IoTDSLPackage.TYPE_REFERENCE__PTYPE:
				return basicSetPtype(null, msgs);
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
			case IoTDSLPackage.TYPE_REFERENCE__DTYPE:
				return getDtype();
			case IoTDSLPackage.TYPE_REFERENCE__PTYPE:
				return getPtype();
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
			case IoTDSLPackage.TYPE_REFERENCE__DTYPE:
				setDtype((DeclaredType)newValue);
				return;
			case IoTDSLPackage.TYPE_REFERENCE__PTYPE:
				setPtype((PrimitiveType)newValue);
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
			case IoTDSLPackage.TYPE_REFERENCE__DTYPE:
				setDtype((DeclaredType)null);
				return;
			case IoTDSLPackage.TYPE_REFERENCE__PTYPE:
				setPtype((PrimitiveType)null);
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
			case IoTDSLPackage.TYPE_REFERENCE__DTYPE:
				return dtype != null;
			case IoTDSLPackage.TYPE_REFERENCE__PTYPE:
				return ptype != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeReferenceImpl
