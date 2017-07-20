/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.Device#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Node {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link be.unamur.iot.iotdsl.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getDevice_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Device
