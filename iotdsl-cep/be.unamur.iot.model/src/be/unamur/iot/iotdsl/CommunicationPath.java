/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.CommunicationPath#getSource <em>Source</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.CommunicationPath#getTaget <em>Taget</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.CommunicationPath#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getCommunicationPath()
 * @model
 * @generated
 */
public interface CommunicationPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeInstance)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getCommunicationPath_Source()
	 * @model required="true"
	 * @generated
	 */
	NodeInstance getSource();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.CommunicationPath#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Taget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taget</em>' reference.
	 * @see #setTaget(NodeInstance)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getCommunicationPath_Taget()
	 * @model required="true"
	 * @generated
	 */
	NodeInstance getTaget();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.CommunicationPath#getTaget <em>Taget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taget</em>' reference.
	 * @see #getTaget()
	 * @generated
	 */
	void setTaget(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link be.unamur.iot.iotdsl.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Protocol
	 * @see #setProtocol(Protocol)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getCommunicationPath_Protocol()
	 * @model required="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.CommunicationPath#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // CommunicationPath
