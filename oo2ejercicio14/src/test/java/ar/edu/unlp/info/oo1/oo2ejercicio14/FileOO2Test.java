package ar.edu.unlp.info.oo1.oo2ejercicio14;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	private FileOO2 file;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new FileOO2();
		
		file.agregarArchivo(new Archivo("Nombre","Extensión",2,LocalDate.of(2023, 4, 12),LocalDate.of(2023, 4, 12),"Permisos"));
	}
	
	@Test
	void testPrintNombre() {
		System.out.println(file.mostrarArchivos(0));
	}
}
