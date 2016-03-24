package be.unamur.iotdevice.typing

import IoTDevice.AdditiveExpression
import IoTDevice.AndExpression
import IoTDevice.BooleanLiteral
import IoTDevice.CapabilitySelection
import IoTDevice.ComparativeExpression
import IoTDevice.Device
import IoTDevice.EnumLiteral
import IoTDevice.EqualityExpression
import IoTDevice.Expression
import IoTDevice.IntegerLiteral
import IoTDevice.MultiplicativeExpression
import IoTDevice.NodeInstance
import IoTDevice.OrExpression
import IoTDevice.PrimitiveType
import IoTDevice.RealLiteral
import IoTDevice.RelationalExpression
import IoTDevice.StringLiteral
import IoTDevice.Target
import IoTDevice.Type
import IoTDevice.UnaryExpression

import static extension be.unamur.iotdevice.util.IoTDeviceUtil.*

class IoTDeviceTypeProvider {
	
	def Type typeFor(Expression e){
		switch(e){
			BooleanLiteral:      return StaticType.Boolean
			IntegerLiteral:      return StaticType.Integer
			RealLiteral:         return StaticType.Real
			StringLiteral:       return StaticType.String
			EnumLiteral:         return e.enumeration
			OrExpression,
			AndExpression,
			EqualityExpression,
			RelationalExpression,
			ComparativeExpression:
				return StaticType.Boolean
			AdditiveExpression,
			MultiplicativeExpression:
				return StaticType.Integer
			UnaryExpression:
				if (e.isBooleanOperator) {
					return StaticType.Boolean
				} else {
					return StaticType.Integer
				}
			CapabilitySelection:
				return StaticType.Void
			Target:{
				val reference = e.ref
				switch(reference){
					NodeInstance: return reference.type
					Device:       return reference	
				}	
			}		
		}
	}
	
	def isPrimitiveType(Type type) {
		type instanceof PrimitiveType && (type as PrimitiveType).eResource == null
	}
	
}