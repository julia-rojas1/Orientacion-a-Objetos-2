package ar.edu.unlp.info.oo2.oo2ejercicio8;

import java.time.LocalDate;
import java.util.List;

public class CupoIncompleto extends Estrategia {
	
	public void inscribir (Usuario usuario, Excursión excursion, int min, int max, int cant) {
		super.inscribir(usuario, excursion,min,max,cant);
		if (cant == min) {
			excursion.setStrategy(new CupoMinimoAlcanzado());
		}
	}
	
	public String obtenerInfo(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String punto, double costo, int min, int max, List<Usuario> inscriptos) {
		
		return super.obtenerInfo(nombre,fechaInicio,fechaFin,punto,costo,min,max,inscriptos) + "\n" +
				"Faltantes: " + (min - inscriptos.size());
	}
}
