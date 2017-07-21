/**
 */
package be.unamur.iot.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.TimingExpression#getFollowing <em>Following</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.TimingExpression#getPreceding <em>Preceding</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimingExpression()
 * @model abstract="true"
 * @generated
 */
public interface TimingExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Following</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following</em>' containment reference.
	 * @see #setFollowing(Expression)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimingExpression_Following()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFollowing();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.TimingExpression#getFollowing <em>Following</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following</em>' containment reference.
	 * @see #getFollowing()
	 * @generated
	 */
	void setFollowing(Expression value);

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
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimingExpression_Preceding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPreceding();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.TimingExpression#getPreceding <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding</em>' containment reference.
	 * @see #getPreceding()
	 * @generated
	 */
	void setPreceding(Expression value);

} // TimingExpression
