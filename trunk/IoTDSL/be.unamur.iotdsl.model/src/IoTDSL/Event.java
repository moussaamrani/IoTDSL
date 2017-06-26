/**
 */
package iotdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotdsl.Event#getParameters <em>Parameters</em>}</li>
 *   <li>{@link iotdsl.Event#isIsSensing <em>Is Sensing</em>}</li>
 * </ul>
 *
 * @see iotdsl.IoTDSLPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Feature, NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link iotdsl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see iotdsl.IoTDSLPackage#getEvent_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Is Sensing</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sensing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sensing</em>' attribute.
	 * @see #setIsSensing(boolean)
	 * @see iotdsl.IoTDSLPackage#getEvent_IsSensing()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsSensing();

	/**
	 * Sets the value of the '{@link iotdsl.Event#isIsSensing <em>Is Sensing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sensing</em>' attribute.
	 * @see #isIsSensing()
	 * @generated
	 */
	void setIsSensing(boolean value);

} // Event
