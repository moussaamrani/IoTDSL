/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.cep.cep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cep.cep.Model#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cep.cep.CepPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.cep.cep.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see org.xtext.example.cep.cep.CepPackage#getModel_Rule()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRule();

} // Model
