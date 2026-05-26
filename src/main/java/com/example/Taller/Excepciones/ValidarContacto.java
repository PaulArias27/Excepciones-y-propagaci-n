package com.example.Taller.Excepciones;

public class ValidarContacto {
	
	public static void validarTelefono(String telefono)throws IllegalArgumentException{
		
		if (telefono == null || telefono.length() != 10) {
			
			throw new IllegalArgumentException("Debe tener 10 digitos");
		}
		
		for (int i = 0; i < telefono.length(); i++) {
			
			if(!Character.isDigit(telefono.charAt(i))) {
				
				throw new IllegalArgumentException("el telefono solo debe tener numeros");
			}
		}
	}

}
