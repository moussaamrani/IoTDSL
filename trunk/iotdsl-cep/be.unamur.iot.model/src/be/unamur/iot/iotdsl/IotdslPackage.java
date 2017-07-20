/**
 */
package be.unamur.iot.iotdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.unamur.iot.iotdsl.IotdslFactory
 * @model kind="package"
 * @generated
 */
public interface IotdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.unamur.be/iot/IoTDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iotdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotdslPackage eINSTANCE = be.unamur.iot.iotdsl.impl.IotdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.IotModelImpl <em>Iot Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.IotModelImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getIotModel()
	 * @generated
	 */
	int IOT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_MODEL__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Iot Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Iot Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ImportImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ContentImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.TypeImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.PrimitiveTypeImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.DeclaredTypeImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getDeclaredType()
	 * @generated
	 */
	int DECLARED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declared Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.EnumerationImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DECLARED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = DECLARED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DECLARED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = DECLARED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.EnumLiteralImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.NodeImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = DECLARED_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DECLARED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = DECLARED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.DeviceImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FEATURES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.GatewayImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.FeatureImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.PropertyImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.CapabilityImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__PARAMETERS = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ActuatingImpl <em>Actuating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ActuatingImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getActuating()
	 * @generated
	 */
	int ACTUATING = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING__PARAMETERS = CAPABILITY__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Actuating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.SensingImpl <em>Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.SensingImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getSensing()
	 * @generated
	 */
	int SENSING = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING__PARAMETERS = CAPABILITY__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ParameterImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ConfigurationImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Confname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFNAME = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NODES = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PATHS = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.NodeInstanceImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNodeInstance()
	 * @generated
	 */
	int NODE_INSTANCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.CommunicationPathImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getCommunicationPath()
	 * @generated
	 */
	int COMMUNICATION_PATH = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Taget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__TAGET = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>Communication Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Communication Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.RuleImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRIGGERS = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REACTIONS = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ExpressionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 21;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.TimeFrameImpl <em>Time Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.TimeFrameImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getTimeFrame()
	 * @generated
	 */
	int TIME_FRAME = 22;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FRAME__TIME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FRAME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FRAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.NotExpressionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__EVENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.EventOccurrenceImpl <em>Event Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.EventOccurrenceImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEventOccurrence()
	 * @generated
	 */
	int EVENT_OCCURRENCE = 24;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE__INSTANCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE__CAPABILITY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE__ATTRIBUTES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE__OPERATOR = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE__VALUE = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Event Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OCCURRENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ValueImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 25;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.ReactionImpl <em>Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.ReactionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getReaction()
	 * @generated
	 */
	int REACTION = 26;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.AttributeImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.AndExpressionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.WithinExpressionImpl <em>Within Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.WithinExpressionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getWithinExpression()
	 * @generated
	 */
	int WITHIN_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_EXPRESSION__FRAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_EXPRESSION__PRECEDING = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Within Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Within Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.AfterExpressionImpl <em>After Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.AfterExpressionImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAfterExpression()
	 * @generated
	 */
	int AFTER_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_EXPRESSION__PRECEDING = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>After Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>After Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.StringConstantImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.IntConstantImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.impl.BoolConstantImpl
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.Protocol
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 34;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.Operator
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 35;

	/**
	 * The meta object id for the '{@link be.unamur.iot.iotdsl.Unit <em>Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.unamur.iot.iotdsl.Unit
	 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 36;


	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.IotModel <em>Iot Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iot Model</em>'.
	 * @see be.unamur.iot.iotdsl.IotModel
	 * @generated
	 */
	EClass getIotModel();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.IotModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see be.unamur.iot.iotdsl.IotModel#getImports()
	 * @see #getIotModel()
	 * @generated
	 */
	EReference getIotModel_Imports();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.IotModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.IotModel#getName()
	 * @see #getIotModel()
	 * @generated
	 */
	EAttribute getIotModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.IotModel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see be.unamur.iot.iotdsl.IotModel#getContent()
	 * @see #getIotModel()
	 * @generated
	 */
	EReference getIotModel_Content();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see be.unamur.iot.iotdsl.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see be.unamur.iot.iotdsl.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see be.unamur.iot.iotdsl.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see be.unamur.iot.iotdsl.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see be.unamur.iot.iotdsl.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Type</em>'.
	 * @see be.unamur.iot.iotdsl.DeclaredType
	 * @generated
	 */
	EClass getDeclaredType();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see be.unamur.iot.iotdsl.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see be.unamur.iot.iotdsl.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see be.unamur.iot.iotdsl.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see be.unamur.iot.iotdsl.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see be.unamur.iot.iotdsl.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Device#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see be.unamur.iot.iotdsl.Device#getFeatures()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Features();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see be.unamur.iot.iotdsl.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see be.unamur.iot.iotdsl.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see be.unamur.iot.iotdsl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see be.unamur.iot.iotdsl.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Capability#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see be.unamur.iot.iotdsl.Capability#getParameters()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Parameters();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Actuating <em>Actuating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuating</em>'.
	 * @see be.unamur.iot.iotdsl.Actuating
	 * @generated
	 */
	EClass getActuating();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Sensing <em>Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing</em>'.
	 * @see be.unamur.iot.iotdsl.Sensing
	 * @generated
	 */
	EClass getSensing();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see be.unamur.iot.iotdsl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see be.unamur.iot.iotdsl.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see be.unamur.iot.iotdsl.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Configuration#getConfname <em>Confname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confname</em>'.
	 * @see be.unamur.iot.iotdsl.Configuration#getConfname()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Confname();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Configuration#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see be.unamur.iot.iotdsl.Configuration#getNodes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Configuration#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see be.unamur.iot.iotdsl.Configuration#getPaths()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Paths();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.NodeInstance <em>Node Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Instance</em>'.
	 * @see be.unamur.iot.iotdsl.NodeInstance
	 * @generated
	 */
	EClass getNodeInstance();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.NodeInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.NodeInstance#getName()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EAttribute getNodeInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.NodeInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see be.unamur.iot.iotdsl.NodeInstance#getType()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EReference getNodeInstance_Type();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Path</em>'.
	 * @see be.unamur.iot.iotdsl.CommunicationPath
	 * @generated
	 */
	EClass getCommunicationPath();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.CommunicationPath#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see be.unamur.iot.iotdsl.CommunicationPath#getSource()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_Source();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.CommunicationPath#getTaget <em>Taget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taget</em>'.
	 * @see be.unamur.iot.iotdsl.CommunicationPath#getTaget()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EReference getCommunicationPath_Taget();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.CommunicationPath#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see be.unamur.iot.iotdsl.CommunicationPath#getProtocol()
	 * @see #getCommunicationPath()
	 * @generated
	 */
	EAttribute getCommunicationPath_Protocol();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see be.unamur.iot.iotdsl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.Rule#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Triggers</em>'.
	 * @see be.unamur.iot.iotdsl.Rule#getTriggers()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Rule#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactions</em>'.
	 * @see be.unamur.iot.iotdsl.Rule#getReactions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Reactions();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see be.unamur.iot.iotdsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.TimeFrame <em>Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Frame</em>'.
	 * @see be.unamur.iot.iotdsl.TimeFrame
	 * @generated
	 */
	EClass getTimeFrame();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.TimeFrame#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see be.unamur.iot.iotdsl.TimeFrame#getTime()
	 * @see #getTimeFrame()
	 * @generated
	 */
	EAttribute getTimeFrame_Time();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.TimeFrame#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see be.unamur.iot.iotdsl.TimeFrame#getUnit()
	 * @see #getTimeFrame()
	 * @generated
	 */
	EAttribute getTimeFrame_Unit();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see be.unamur.iot.iotdsl.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.NotExpression#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see be.unamur.iot.iotdsl.NotExpression#getEvent()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Event();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.EventOccurrence <em>Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Occurrence</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence
	 * @generated
	 */
	EClass getEventOccurrence();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.EventOccurrence#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence#getInstance()
	 * @see #getEventOccurrence()
	 * @generated
	 */
	EReference getEventOccurrence_Instance();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.EventOccurrence#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence#getCapability()
	 * @see #getEventOccurrence()
	 * @generated
	 */
	EReference getEventOccurrence_Capability();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.EventOccurrence#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence#getAttributes()
	 * @see #getEventOccurrence()
	 * @generated
	 */
	EReference getEventOccurrence_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.EventOccurrence#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence#getOperator()
	 * @see #getEventOccurrence()
	 * @generated
	 */
	EAttribute getEventOccurrence_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.EventOccurrence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.EventOccurrence#getValue()
	 * @see #getEventOccurrence()
	 * @generated
	 */
	EReference getEventOccurrence_Value();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Reaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction</em>'.
	 * @see be.unamur.iot.iotdsl.Reaction
	 * @generated
	 */
	EClass getReaction();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.Reaction#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see be.unamur.iot.iotdsl.Reaction#getInstance()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Instance();

	/**
	 * Returns the meta object for the reference '{@link be.unamur.iot.iotdsl.Reaction#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see be.unamur.iot.iotdsl.Reaction#getCapability()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Capability();

	/**
	 * Returns the meta object for the containment reference list '{@link be.unamur.iot.iotdsl.Reaction#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see be.unamur.iot.iotdsl.Reaction#getAttributes()
	 * @see #getReaction()
	 * @generated
	 */
	EReference getReaction_Attributes();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see be.unamur.iot.iotdsl.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see be.unamur.iot.iotdsl.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see be.unamur.iot.iotdsl.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.AndExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see be.unamur.iot.iotdsl.AndExpression#getLeft()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.AndExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see be.unamur.iot.iotdsl.AndExpression#getRight()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Right();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.WithinExpression <em>Within Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Expression</em>'.
	 * @see be.unamur.iot.iotdsl.WithinExpression
	 * @generated
	 */
	EClass getWithinExpression();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.WithinExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see be.unamur.iot.iotdsl.WithinExpression#getLeft()
	 * @see #getWithinExpression()
	 * @generated
	 */
	EReference getWithinExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.WithinExpression#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see be.unamur.iot.iotdsl.WithinExpression#getFrame()
	 * @see #getWithinExpression()
	 * @generated
	 */
	EReference getWithinExpression_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.WithinExpression#getPreceding <em>Preceding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding</em>'.
	 * @see be.unamur.iot.iotdsl.WithinExpression#getPreceding()
	 * @see #getWithinExpression()
	 * @generated
	 */
	EReference getWithinExpression_Preceding();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.AfterExpression <em>After Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Expression</em>'.
	 * @see be.unamur.iot.iotdsl.AfterExpression
	 * @generated
	 */
	EClass getAfterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.AfterExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see be.unamur.iot.iotdsl.AfterExpression#getLeft()
	 * @see #getAfterExpression()
	 * @generated
	 */
	EReference getAfterExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link be.unamur.iot.iotdsl.AfterExpression#getPreceding <em>Preceding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding</em>'.
	 * @see be.unamur.iot.iotdsl.AfterExpression#getPreceding()
	 * @see #getAfterExpression()
	 * @generated
	 */
	EReference getAfterExpression_Preceding();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see be.unamur.iot.iotdsl.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see be.unamur.iot.iotdsl.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link be.unamur.iot.iotdsl.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see be.unamur.iot.iotdsl.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link be.unamur.iot.iotdsl.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see be.unamur.iot.iotdsl.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for enum '{@link be.unamur.iot.iotdsl.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see be.unamur.iot.iotdsl.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link be.unamur.iot.iotdsl.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see be.unamur.iot.iotdsl.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link be.unamur.iot.iotdsl.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit</em>'.
	 * @see be.unamur.iot.iotdsl.Unit
	 * @generated
	 */
	EEnum getUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotdslFactory getIotdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.IotModelImpl <em>Iot Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.IotModelImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getIotModel()
		 * @generated
		 */
		EClass IOT_MODEL = eINSTANCE.getIotModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_MODEL__IMPORTS = eINSTANCE.getIotModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOT_MODEL__NAME = eINSTANCE.getIotModel_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IOT_MODEL__CONTENT = eINSTANCE.getIotModel_Content();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ImportImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ContentImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.TypeImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.PrimitiveTypeImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.DeclaredTypeImpl <em>Declared Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.DeclaredTypeImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getDeclaredType()
		 * @generated
		 */
		EClass DECLARED_TYPE = eINSTANCE.getDeclaredType();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.EnumerationImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.EnumLiteralImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.NodeImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.DeviceImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__FEATURES = eINSTANCE.getDevice_Features();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.GatewayImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.FeatureImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.PropertyImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.CapabilityImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__PARAMETERS = eINSTANCE.getCapability_Parameters();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ActuatingImpl <em>Actuating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ActuatingImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getActuating()
		 * @generated
		 */
		EClass ACTUATING = eINSTANCE.getActuating();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.SensingImpl <em>Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.SensingImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getSensing()
		 * @generated
		 */
		EClass SENSING = eINSTANCE.getSensing();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ParameterImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ConfigurationImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Confname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CONFNAME = eINSTANCE.getConfiguration_Confname();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__NODES = eINSTANCE.getConfiguration_Nodes();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PATHS = eINSTANCE.getConfiguration_Paths();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.NodeInstanceImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNodeInstance()
		 * @generated
		 */
		EClass NODE_INSTANCE = eINSTANCE.getNodeInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_INSTANCE__NAME = eINSTANCE.getNodeInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_INSTANCE__TYPE = eINSTANCE.getNodeInstance_Type();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.CommunicationPathImpl <em>Communication Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.CommunicationPathImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getCommunicationPath()
		 * @generated
		 */
		EClass COMMUNICATION_PATH = eINSTANCE.getCommunicationPath();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__SOURCE = eINSTANCE.getCommunicationPath_Source();

		/**
		 * The meta object literal for the '<em><b>Taget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PATH__TAGET = eINSTANCE.getCommunicationPath_Taget();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PATH__PROTOCOL = eINSTANCE.getCommunicationPath_Protocol();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.RuleImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRIGGERS = eINSTANCE.getRule_Triggers();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__REACTIONS = eINSTANCE.getRule_Reactions();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ExpressionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.TimeFrameImpl <em>Time Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.TimeFrameImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getTimeFrame()
		 * @generated
		 */
		EClass TIME_FRAME = eINSTANCE.getTimeFrame();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_FRAME__TIME = eINSTANCE.getTimeFrame_Time();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_FRAME__UNIT = eINSTANCE.getTimeFrame_Unit();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.NotExpressionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__EVENT = eINSTANCE.getNotExpression_Event();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.EventOccurrenceImpl <em>Event Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.EventOccurrenceImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getEventOccurrence()
		 * @generated
		 */
		EClass EVENT_OCCURRENCE = eINSTANCE.getEventOccurrence();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OCCURRENCE__INSTANCE = eINSTANCE.getEventOccurrence_Instance();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OCCURRENCE__CAPABILITY = eINSTANCE.getEventOccurrence_Capability();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OCCURRENCE__ATTRIBUTES = eINSTANCE.getEventOccurrence_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_OCCURRENCE__OPERATOR = eINSTANCE.getEventOccurrence_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OCCURRENCE__VALUE = eINSTANCE.getEventOccurrence_Value();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ValueImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.ReactionImpl <em>Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.ReactionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getReaction()
		 * @generated
		 */
		EClass REACTION = eINSTANCE.getReaction();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__INSTANCE = eINSTANCE.getReaction_Instance();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__CAPABILITY = eINSTANCE.getReaction_Capability();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION__ATTRIBUTES = eINSTANCE.getReaction_Attributes();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.AttributeImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.AndExpressionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.WithinExpressionImpl <em>Within Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.WithinExpressionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getWithinExpression()
		 * @generated
		 */
		EClass WITHIN_EXPRESSION = eINSTANCE.getWithinExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITHIN_EXPRESSION__LEFT = eINSTANCE.getWithinExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITHIN_EXPRESSION__FRAME = eINSTANCE.getWithinExpression_Frame();

		/**
		 * The meta object literal for the '<em><b>Preceding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITHIN_EXPRESSION__PRECEDING = eINSTANCE.getWithinExpression_Preceding();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.AfterExpressionImpl <em>After Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.AfterExpressionImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getAfterExpression()
		 * @generated
		 */
		EClass AFTER_EXPRESSION = eINSTANCE.getAfterExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_EXPRESSION__LEFT = eINSTANCE.getAfterExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Preceding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_EXPRESSION__PRECEDING = eINSTANCE.getAfterExpression_Preceding();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.StringConstantImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.IntConstantImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.impl.BoolConstantImpl
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.Protocol
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.Operator
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link be.unamur.iot.iotdsl.Unit <em>Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.unamur.iot.iotdsl.Unit
		 * @see be.unamur.iot.iotdsl.impl.IotdslPackageImpl#getUnit()
		 * @generated
		 */
		EEnum UNIT = eINSTANCE.getUnit();

	}

} //IotdslPackage
