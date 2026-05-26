package com.example.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {
	
	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);
	
	public static void leerContacto() {
		
		BufferedReader lector = null;
		
		try {
			FileReader archivo = new FileReader("contactos.txt");
			lector = new BufferedReader(archivo);
			
			for (String linea = lector.readLine(); linea != null; linea= lector.readLine()){
				
				System.out.println(linea);
			}
			log.info("Archivo leido ");		
		}catch(FileNotFoundException e) {
			log.error("Archivo no encontrado"+ e.getMessage());
		}catch(IOException e) {
			log.error("Error al leer archivo"+ e.getMessage());
		}finally {
			
			try {
				if(lector != null) {
					lector.close();
				}
			}catch(IOException e) {
				log.error("Error al cerrar BufferedReader: " + e.getMessage());
			}
			
		}
	}
}
