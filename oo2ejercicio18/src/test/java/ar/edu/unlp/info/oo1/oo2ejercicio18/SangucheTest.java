package ar.edu.unlp.info.oo1.oo2ejercicio18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SangucheTest {
	private Director director;
	
	@BeforeEach
	void setUp() throws Exception {
		director = new Director(new BuilderClasico());
	}
	
	@Test
	void testPrecios() {
		assertEquals(500,director.precioSanguche());
		
		director.cambiarBuilder(new BuilderVegano());
		assertEquals(620,director.precioSanguche());
		
		director.cambiarBuilder(new BuilderSinTACC());
		assertEquals(618,director.precioSanguche());
	}
}
