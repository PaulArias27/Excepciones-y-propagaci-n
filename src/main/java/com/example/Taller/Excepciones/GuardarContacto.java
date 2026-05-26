package com.example.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void guardarContacto(String nombre,String apellido, String telefono) {
		
		FileWriter escritor = null;
		
		try {
			escritor = new FileWriter("contactos.txt", true);
			
			escritor.write("Nombre: " + nombre + "\n");
            escritor.write("Apellido: " + apellido + "\n");
            escritor.write("Telefono: " + telefono + "\n");
            escritor.write("------------------------\n");
            
            log.info("Contacto guardado");
		}catch(IOException e) {
			log.error("Error al guardar contacto"+ e.getMessage());
		
		}finally{
			try {
				if (escritor != null) {
					escritor.close();
				}
			}catch(IOException e) {
				log.error("error al cerrar el archivo: " + e.getMessage());
			}
		}
	}

}
