package be.unamur.iot.naming

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

import org.eclipse.emf.ecore.EObject
import be.unamur.iot.iotdsl.Actuating
import be.unamur.iot.iotdsl.Sensing

class IotDSLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	override getFullyQualifiedName(EObject obj) {
		switch (obj) {
			Actuating: return QualifiedName.create(obj.name)
			Sensing: return QualifiedName.create(obj.name)
			default: return super.getFullyQualifiedName(obj)
		}
	}
	
}