package ar.edu.unlp.info.oo1.oo2ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstacionTest {
	private Aplicacion app;
	
	@BeforeEach
	void setUp() throws Exception {
		app = new Aplicacion();
	}
	
	@Test
	void ejemplo1Test () {
		//assertEquals("Texto devuelve Ejemplo1",app.Ejemplo1); ¿Importa el formato? (\n, espacios, etc)
		System.out.println(app.Ejemplo1());
	}
	
	@Test
	void ejemplo2Test () {
		System.out.println(app.Ejemplo2());
	}
	
	@Test
	void ejemplo3Test () {
		System.out.println(app.Ejemplo3());
	}

	
}
