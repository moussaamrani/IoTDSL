/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.cep.cep.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cep.cep.CepPackage;
import org.xtext.example.cep.cep.PrimitiveType;
import org.xtext.example.cep.cep.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cep.cep.impl.TypeReferenceImpl#getPtype <em>Ptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference
{
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
  protected TypeReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CepPackage.Literals.TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType getPtype()
  {
    return ptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPtype(PrimitiveType newPtype, NotificationChain msgs)
  {
    PrimitiveType oldPtype = ptype;
    ptype = newPtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CepPackage.TYPE_REFERENCE__PTYPE, oldPtype, newPtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPtype(PrimitiveType newPtype)
  {
    if (newPtype != ptype)
    {
      NotificationChain msgs = null;
      if (ptype != null)
        msgs = ((InternalEObject)ptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CepPackage.TYPE_REFERENCE__PTYPE, null, msgs);
      if (newPtype != null)
        msgs = ((InternalEObject)newPtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CepPackage.TYPE_REFERENCE__PTYPE, null, msgs);
      msgs = basicSetPtype(newPtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CepPackage.TYPE_REFERENCE__PTYPE, newPtype, newPtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CepPackage.TYPE_REFERENCE__PTYPE:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CepPackage.TYPE_REFERENCE__PTYPE:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CepPackage.TYPE_REFERENCE__PTYPE:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CepPackage.TYPE_REFERENCE__PTYPE:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CepPackage.TYPE_REFERENCE__PTYPE:
        return ptype != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeReferenceImpl