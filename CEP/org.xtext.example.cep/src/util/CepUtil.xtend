package util

import org.eclipse.emf.ecore.EObject
import org.xtext.example.cep.cep.Event
import org.xtext.example.cep.cep.Model

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.example.cep.cep.AttributEvent
import org.xtext.example.cep.cep.EventInstance
import org.xtext.example.cep.cep.AttributInstance

class CepUtil {
	
	
	def static containingAttributEvent(EObject e) {
        e.getContainerOfType(typeof(AttributEvent))
    }
	
	def static containingEvent(EObject e) {
        e.getContainerOfType(typeof(Event))
    }
	
	
	def static containingModel(EObject e) {
        e.getContainerOfType(typeof(Model))
    }
	
	
	
	def static containingEventInstance(EObject e) {
        e.getContainerOfType(typeof(EventInstance))
    }
	
	
	def static containingAttributEventInstance(EObject e) {
        e.getContainerOfType(typeof(AttributInstance))
    }
}