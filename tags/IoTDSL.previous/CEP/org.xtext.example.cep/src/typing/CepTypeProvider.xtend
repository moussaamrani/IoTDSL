package typing

import org.xtext.example.cep.cep.Atomic
import org.xtext.example.cep.cep.IntConstant

import org.xtext.example.cep.cep.StringConstant
import org.xtext.example.cep.cep.BoolConstant
import org.xtext.example.cep.cep.StringType
import org.xtext.example.cep.cep.BooleanType
import org.xtext.example.cep.cep.PrimitiveType
import org.xtext.example.cep.cep.IntegerType

class CepTypeProvider {
	
	def static  typeFor(Atomic atomic)
	{
		switch(atomic){
		
		IntConstant:"integer"
		StringConstant:"string"
		BoolConstant:"boolean"
		//FloatConstant:"real"
		
		
		
		
		
		}
	}
	
}