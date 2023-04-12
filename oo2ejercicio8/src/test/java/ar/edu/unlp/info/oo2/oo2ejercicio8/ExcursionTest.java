package ar.edu.unlp.info.oo2.oo2ejercicio8;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ExcursionTest {
	Excursión e1;
	
	@BeforeEach
	void setUp() throws Exception {
		e1 = new Excursión("kayak",LocalDate.of(2023, 7, 6),LocalDate.of(2023, 7, 16), "Catedral",200,1,3);
	}
	
	@Test
	void testCeroPersonas() {
		//Lo controlé manualmente porque me dio fiaca escribir todo en el assertEquals
		System.out.println("Cero personas");
		System.out.println(e1.obtenerInformacion() + "\n");
	}
	
	@Test
	void test2Personas() {
		System.out.println("Dos personas");
		e1.inscribir(new Usuario("Juan","juan@gmail.com"));
		e1.inscribir(new Usuario("Pedro","pedro@gmail.com"));
		System.out.println(e1.obtenerInformacion() + "\n");
	}
	
	@Test
	void test3Personas() {
		System.out.println("Tres personas");
		e1.inscribir(new Usuario("Juan","juan@gmail.com"));
		e1.inscribir(new Usuario("Pedro","pedro@gmail.com"));
		e1.inscribir(new Usuario("Emilia","emilia@gmail.com"));
		System.out.println(e1.obtenerInformacion() + "\n");
	}
	
}
