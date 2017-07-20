/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Capability#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends Feature {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getCapability_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Capability
