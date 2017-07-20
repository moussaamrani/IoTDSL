/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DeclaredType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getEnumeration_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // Enumeration
