package com.example.Taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private static final Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Paul";
		String apellido = "Arias";
		//prueba 1 telefono invalido
		
		//String telefono = "123";
		
		//prueba 2 telefono valido
		String telefono = "1234567890";
		
		try {
			ValidarContacto.validarTelefono(telefono);
			
			GuardarContacto.guardarContacto(nombre, apellido, telefono);
			
			LeerContacto.leerContacto();
			
			log.info("ejecutado correctamente");
		}catch(IllegalArgumentException e) {
			log.error("telefono invalido : "+ e.getMessage());
		}
		
		

	}

}
