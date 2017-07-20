/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.iot.iotdsl.TimeFrame#getTime <em>Time</em>}</li>
 *   <li>{@link be.unamur.iot.iotdsl.TimeFrame#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimeFrame()
 * @model
 * @generated
 */
public interface TimeFrame extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimeFrame_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.TimeFrame#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link be.unamur.iot.iotdsl.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Unit
	 * @see #setUnit(Unit)
	 * @see be.unamur.iot.iotdsl.IotdslPackage#getTimeFrame_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link be.unamur.iot.iotdsl.TimeFrame#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see be.unamur.iot.iotdsl.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // TimeFrame
