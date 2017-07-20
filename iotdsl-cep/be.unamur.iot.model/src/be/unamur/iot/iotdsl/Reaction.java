/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Reaction#getInstance <em>Instance</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Reaction#getCapability <em>Capability</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Reaction#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getReaction()
 * @model abstract="true"
 * @generated
 */
public interface Reaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(NodeInstance)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getReaction_Instance()
	 * @model required="true"
	 * @generated
	 */
	NodeInstance getInstance();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.Reaction#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(Actuating)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getReaction_Capability()
	 * @model required="true"
	 * @generated
	 */
	Actuating getCapability();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.Reaction#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Actuating value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getReaction_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Reaction
