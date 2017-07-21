/**
 */
package iotdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotdsl.TypeReference#getDtype <em>Dtype</em>}</li>
 *   <li>{@link iotdsl.TypeReference#getPtype <em>Ptype</em>}</li>
 * </ul>
 *
 * @see iotdsl.IoTDSLPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' reference.
	 * @see #setDtype(DeclaredType)
	 * @see iotdsl.IoTDSLPackage#getTypeReference_Dtype()
	 * @model
	 * @generated
	 */
	DeclaredType getDtype();

	/**
	 * Sets the value of the '{@link iotdsl.TypeReference#getDtype <em>Dtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' reference.
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(DeclaredType value);

	/**
	 * Returns the value of the '<em><b>Ptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptype</em>' containment reference.
	 * @see #setPtype(PrimitiveType)
	 * @see iotdsl.IoTDSLPackage#getTypeReference_Ptype()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveType getPtype();

	/**
	 * Sets the value of the '{@link iotdsl.TypeReference#getPtype <em>Ptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ptype</em>' containment reference.
	 * @see #getPtype()
	 * @generated
	 */
	void setPtype(PrimitiveType value);

} // TypeReference
