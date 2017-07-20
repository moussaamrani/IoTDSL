/**
 */
package be.unamur.iot.iotdsl.impl;

import be.unamur.iot.iotdsl.CommunicationPath;
import be.unamur.iot.iotdsl.Configuration;
import be.unamur.iot.iotdsl.IotdslPackage;
import be.unamur.iot.iotdsl.NodeInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.impl.ConfigurationImpl#getConfname <em>Confname</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.impl.ConfigurationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.impl.ConfigurationImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ContentImpl implements Configuration {
	/**
	 * The default value of the '{@link #getConfname() <em>Confname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfname()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfname() <em>Confname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfname()
	 * @generated
	 * @ordered
	 */
	protected String confname = CONFNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeInstance> nodes;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationPath> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotdslPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfname() {
		return confname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfname(String newConfname) {
		String oldConfname = confname;
		confname = newConfname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.CONFIGURATION__CONFNAME, oldConfname, confname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeInstance> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NodeInstance>(NodeInstance.class, this, IotdslPackage.CONFIGURATION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationPath> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<CommunicationPath>(CommunicationPath.class, this, IotdslPackage.CONFIGURATION__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotdslPackage.CONFIGURATION__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case IotdslPackage.CONFIGURATION__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
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
			case IotdslPackage.CONFIGURATION__CONFNAME:
				return getConfname();
			case IotdslPackage.CONFIGURATION__NODES:
				return getNodes();
			case IotdslPackage.CONFIGURATION__PATHS:
				return getPaths();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotdslPackage.CONFIGURATION__CONFNAME:
				setConfname((String)newValue);
				return;
			case IotdslPackage.CONFIGURATION__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeInstance>)newValue);
				return;
			case IotdslPackage.CONFIGURATION__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends CommunicationPath>)newValue);
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
			case IotdslPackage.CONFIGURATION__CONFNAME:
				setConfname(CONFNAME_EDEFAULT);
				return;
			case IotdslPackage.CONFIGURATION__NODES:
				getNodes().clear();
				return;
			case IotdslPackage.CONFIGURATION__PATHS:
				getPaths().clear();
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
			case IotdslPackage.CONFIGURATION__CONFNAME:
				return CONFNAME_EDEFAULT == null ? confname != null : !CONFNAME_EDEFAULT.equals(confname);
			case IotdslPackage.CONFIGURATION__NODES:
				return nodes != null && !nodes.isEmpty();
			case IotdslPackage.CONFIGURATION__PATHS:
				return paths != null && !paths.isEmpty();
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
		result.append(" (confname: ");
		result.append(confname);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
