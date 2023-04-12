package ar.edu.unlp.info.oo1.oo2ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	private Servicio servicio;
	
	@BeforeEach
	void setUp() throws Exception {
		servicio = new Servicio();
		
		servicio.crearProyecto("Vacas de Invierno", LocalDate.of(2023, 7, 1), LocalDate.of(2023, 8, 1), "Salir con amigos", 3, 100);
	}
	
	@Test
	public void aprobarTest() {
		servicio.aprobarEtapa();
		assertTrue(servicio.getProyecto().getEtapa() instanceof EnEvaluacion);
		
		servicio.aprobarEtapa();
		assertTrue(servicio.getProyecto().getEtapa() instanceof Confirmada);
		
		servicio.aprobarEtapa(); //No hace nada
		assertTrue(servicio.getProyecto().getEtapa() instanceof Confirmada);
	}
	
	@Test
	public void costoTest() {
		assertEquals(9300,servicio.costoDelProyecto());
	}
	
	@Test
	public void precioTest() {
		assertEquals(9951,servicio.precioDelProyecto());
	}
	
	@Test
	public void modificacionMARGENTest() {
		servicio.modificarMargen(9);
		assertEquals(10137,servicio.precioDelProyecto());
		
		servicio.modificarMargen(4); //No hace nada
		assertEquals(10137,servicio.precioDelProyecto());	
	}
}
