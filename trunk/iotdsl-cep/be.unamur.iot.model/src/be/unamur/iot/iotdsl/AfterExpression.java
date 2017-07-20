/**
 */
package be.unamur.iot.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.AfterExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.AfterExpression#getPreceding <em>Preceding</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getAfterExpression()
 * @model
 * @generated
 */
public interface AfterExpression extends Expression {
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
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getAfterExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.AfterExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

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
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getAfterExpression_Preceding()
	 * @model containment="true"
	 * @generated
	 */
	Expression getPreceding();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.AfterExpression#getPreceding <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding</em>' containment reference.
	 * @see #getPreceding()
	 * @generated
	 */
	void setPreceding(Expression value);

} // AfterExpression
