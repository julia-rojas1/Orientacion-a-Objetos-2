package ar.edu.unlp.info.oo2.oo2ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SueldoTest {
	Empleado tem;
	Empleado pas;
	Empleado plan;
	
	@BeforeEach
	void setUp() throws Exception {
		tem = new Temporario (2,true,4);
		pas = new Pasante (5);
		plan = new Planta (false,2,10);
	}
	
	@Test
	void testSueldo() {
		assertEquals(30272,tem.sueldo());
		assertEquals(26900,pas.sueldo());
		assertEquals(66300,plan.sueldo());
	}
}
