/**
 */
package be.unamur.iot.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.NotExpression#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getNotExpression()
 * @model
 * @generated
 */
public interface NotExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventOccurrence)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getNotExpression_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventOccurrence getEvent();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.NotExpression#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventOccurrence value);

} // NotExpression
