package ar.edu.unlp.info.oo2.oo2ejercicio8;

import java.time.LocalDate;
import java.util.List;

public class Estrategia {
	
	public void inscribir (Usuario usuario, Excursión excursion, int min, int max, int cant) {
		excursion.agregarUsuario(usuario);
	}
	
	public String obtenerInfo(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String punto, double costo, int min, int max, List<Usuario> inscriptos) {
		
		return "Excursion: " + nombre + "\n" +
				"Costo: " + costo + "\n" +
				"Fechas: " + fechaInicio + " - " + fechaFin + "\n" +
				"Punto de Encuentro: " + punto;
	}
}
