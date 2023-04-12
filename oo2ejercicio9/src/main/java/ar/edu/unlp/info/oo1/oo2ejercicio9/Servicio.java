package ar.edu.unlp.info.oo1.oo2ejercicio9;

import java.time.LocalDate;

public class Servicio {
	private Proyecto proyecto;
	
	public Proyecto getProyecto() { //Para los tests
		return proyecto;
	}
	
	public void crearProyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int integrantes, double montoInt) {
		proyecto = new Proyecto(nombre,fechaInicio,fechaFin,objetivo,integrantes,montoInt,7);
	}
	
	public void aprobarEtapa() {
		proyecto.aprobarEtapa();
	}
	
	public double costoDelProyecto() {
		return proyecto.costoTotal();
	}
	
	public double precioDelProyecto() {
		return proyecto.precioTotal();
	}
	
	public void modificarMargen(int nuevoMargen) {
		proyecto.modificarMargen(nuevoMargen);
	}
	
	public void cancelarProyecto()  {
		proyecto.cancelar();
	}
}
