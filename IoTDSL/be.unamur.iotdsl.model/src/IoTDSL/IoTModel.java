/**
 */
package IoTDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link IoTDSL.IoTModel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see IoTDSL.IoTDSLPackage#getIoTModel()
 * @model
 * @generated
 */
public interface IoTModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link IoTDSL.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see IoTDSL.IoTDSLPackage#getIoTModel_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // IoTModel
