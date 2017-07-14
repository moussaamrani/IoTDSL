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
 *   <li>{@link iotdsl.Event#getKind <em>Kind</em>}</li>
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
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"SENSING"</code>.
	 * The literals are from the enumeration {@link iotdsl.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see iotdsl.EventType
	 * @see #setKind(EventType)
	 * @see iotdsl.IoTDSLPackage#getEvent_Kind()
	 * @model default="SENSING" required="true"
	 * @generated
	 */
	EventType getKind();

	/**
	 * Sets the value of the '{@link iotdsl.Event#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see iotdsl.EventType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EventType value);

} // Event
