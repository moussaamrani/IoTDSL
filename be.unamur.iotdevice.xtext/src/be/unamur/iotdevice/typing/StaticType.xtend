package be.unamur.iotdevice.typing

import IoTDevice.IoTDeviceFactory

class StaticType {
	public static val String  = IoTDeviceFactory::eINSTANCE.createStringType  => [name = "String"]
	public static val Integer = IoTDeviceFactory::eINSTANCE.createIntegerType => [name = "Integer"]
	public static val Real    = IoTDeviceFactory::eINSTANCE.createRealType    => [name = "Real"]
	public static val Boolean = IoTDeviceFactory::eINSTANCE.createBooleanType => [name = "Boolean"]
	public static val Void    = IoTDeviceFactory::eINSTANCE.createVoidType    => [name = "Void"]
}