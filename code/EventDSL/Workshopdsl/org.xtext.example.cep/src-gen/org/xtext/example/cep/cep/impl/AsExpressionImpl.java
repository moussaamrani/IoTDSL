/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.cep.cep.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.cep.cep.AsExpression;
import org.xtext.example.cep.cep.CepPackage;
import org.xtext.example.cep.cep.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cep.cep.impl.AsExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtext.example.cep.cep.impl.AsExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.cep.cep.impl.AsExpressionImpl#getNameofas <em>Nameofas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsExpressionImpl extends ExpressionImpl implements AsExpression
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Expression lhs;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getNameofas() <em>Nameofas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofas()
   * @generated
   * @ordered
   */
  protected static final String NAMEOFAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameofas() <em>Nameofas</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameofas()
   * @generated
   * @ordered
   */
  protected String nameofas = NAMEOFAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AsExpressionImpl()
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
    return CepPackage.Literals.AS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Expression newLhs, NotificationChain msgs)
  {
    Expression oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CepPackage.AS_EXPRESSION__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Expression newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CepPackage.AS_EXPRESSION__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CepPackage.AS_EXPRESSION__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CepPackage.AS_EXPRESSION__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CepPackage.AS_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameofas()
  {
    return nameofas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameofas(String newNameofas)
  {
    String oldNameofas = nameofas;
    nameofas = newNameofas;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CepPackage.AS_EXPRESSION__NAMEOFAS, oldNameofas, nameofas));
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
      case CepPackage.AS_EXPRESSION__LHS:
        return basicSetLhs(null, msgs);
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
      case CepPackage.AS_EXPRESSION__LHS:
        return getLhs();
      case CepPackage.AS_EXPRESSION__OP:
        return getOp();
      case CepPackage.AS_EXPRESSION__NAMEOFAS:
        return getNameofas();
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
      case CepPackage.AS_EXPRESSION__LHS:
        setLhs((Expression)newValue);
        return;
      case CepPackage.AS_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case CepPackage.AS_EXPRESSION__NAMEOFAS:
        setNameofas((String)newValue);
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
      case CepPackage.AS_EXPRESSION__LHS:
        setLhs((Expression)null);
        return;
      case CepPackage.AS_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case CepPackage.AS_EXPRESSION__NAMEOFAS:
        setNameofas(NAMEOFAS_EDEFAULT);
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
      case CepPackage.AS_EXPRESSION__LHS:
        return lhs != null;
      case CepPackage.AS_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case CepPackage.AS_EXPRESSION__NAMEOFAS:
        return NAMEOFAS_EDEFAULT == null ? nameofas != null : !NAMEOFAS_EDEFAULT.equals(nameofas);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(", nameofas: ");
    result.append(nameofas);
    result.append(')');
    return result.toString();
  }

} //AsExpressionImpl
