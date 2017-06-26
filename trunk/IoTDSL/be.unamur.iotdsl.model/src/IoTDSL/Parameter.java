/**
 */
package iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotdsl.Parameter#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see iotdsl.IoTDSLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedTypedElement {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link iotdsl.PARAMETER_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see iotdsl.PARAMETER_TYPE
	 * @see #setKind(PARAMETER_TYPE)
	 * @see iotdsl.IoTDSLPackage#getParameter_Kind()
	 * @model required="true"
	 * @generated
	 */
	PARAMETER_TYPE getKind();

	/**
	 * Sets the value of the '{@link iotdsl.Parameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see iotdsl.PARAMETER_TYPE
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PARAMETER_TYPE value);
} // Parameter
