/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Configuration#getConfname <em>Confname</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Configuration#getNodes <em>Nodes</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Configuration#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Content {
	/**
	 * Returns the value of the '<em><b>Confname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confname</em>' attribute.
	 * @see #setConfname(String)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getConfiguration_Confname()
	 * @model
	 * @generated
	 */
	String getConfname();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.Configuration#getConfname <em>Confname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confname</em>' attribute.
	 * @see #getConfname()
	 * @generated
	 */
	void setConfname(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.NodeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getConfiguration_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeInstance> getNodes();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.CommunicationPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getConfiguration_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationPath> getPaths();

} // Configuration
