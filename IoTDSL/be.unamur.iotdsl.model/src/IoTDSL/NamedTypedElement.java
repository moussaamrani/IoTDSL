/**
 */
package iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotdsl.NamedTypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see iotdsl.IoTDSLPackage#getNamedTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedTypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeReference)
	 * @see iotdsl.IoTDSLPackage#getNamedTypedElement_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getType();

	/**
	 * Sets the value of the '{@link iotdsl.NamedTypedElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeReference value);

} // NamedTypedElement
