/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Rule#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.Rule#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Content {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference.
	 * @see #setTriggers(Expression)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getRule_Triggers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTriggers();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.Rule#getTriggers <em>Triggers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' containment reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Expression value);

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.Reaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getRule_Reactions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reaction> getReactions();

} // Rule
