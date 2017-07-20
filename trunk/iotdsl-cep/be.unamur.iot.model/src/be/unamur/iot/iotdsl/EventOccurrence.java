/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.EventOccurrence#getInstance <em>Instance</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.EventOccurrence#getCapability <em>Capability</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.EventOccurrence#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.EventOccurrence#getOperator <em>Operator</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.EventOccurrence#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence()
 * @model
 * @generated
 */
public interface EventOccurrence extends Expression {
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
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence_Instance()
	 * @model required="true"
	 * @generated
	 */
	NodeInstance getInstance();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.EventOccurrence#getInstance <em>Instance</em>}' reference.
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
	 * @see #setCapability(Sensing)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence_Capability()
	 * @model required="true"
	 * @generated
	 */
	Sensing getCapability();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.EventOccurrence#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Sensing value);

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
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link be.unamur.iot.iotdsl.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Operator
	 * @see #setOperator(Operator)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.EventOccurrence#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEventOccurrence_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.EventOccurrence#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // EventOccurrence
