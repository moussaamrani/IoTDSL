/**
 */
package be.unamur.iot.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Within Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.WithinExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.WithinExpression#getFrame <em>Frame</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.WithinExpression#getPreceding <em>Preceding</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getWithinExpression()
 * @model
 * @generated
 */
public interface WithinExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getWithinExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.WithinExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(TimeFrame)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getWithinExpression_Frame()
	 * @model containment="true"
	 * @generated
	 */
	TimeFrame getFrame();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.WithinExpression#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(TimeFrame value);

	/**
	 * Returns the value of the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding</em>' containment reference.
	 * @see #setPreceding(Expression)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getWithinExpression_Preceding()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPreceding();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.WithinExpression#getPreceding <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding</em>' containment reference.
	 * @see #getPreceding()
	 * @generated
	 */
	void setPreceding(Expression value);

} // WithinExpression
