package ar.edu.unlp.info.oo2.oo2ejercicio14again;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {

		private FileManager file;
		
		@BeforeEach
		void setUp() throws Exception {
			file = new FileManager();
			
			file.agregarArchivo(new Archivo("Nombre","Extensión",2));
			file.agregarArchivo(new Archivo("Nombre2","Extensión2",4));
		}
		
		@Test
		void testPrintNombre() {
			file.mostrarArchivos();
		}
}

