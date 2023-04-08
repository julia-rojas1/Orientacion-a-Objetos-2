package ar.edu.unlp.info.oo2.oo2ejercicio8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursión {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	public int cupoMin;
	public int cupoMax;
	
	public List<Usuario> inscriptos;
	public Estrategia strategyCupo;
	
	
	public Excursión(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String punto, double costo, int min, int max) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = punto;
		this.costo = costo;
		this.cupoMin = min;
		this.cupoMax = max;
		
		inscriptos = new ArrayList<>();
		strategyCupo = new  CupoIncompleto();
	}
	
	public void setStrategy(Estrategia strategy) {
		this.strategyCupo = strategy;
	}
	
	public void agregarUsuario(Usuario unUsuario) {
		inscriptos.add(unUsuario);
	}
	
	public void inscribir(Usuario unUsuario) {
		this.strategyCupo.inscribir(unUsuario, this, cupoMin, cupoMax, inscriptos.size());
		
	}
	
	public String obtenerInformacion() {
		return this.strategyCupo.obtenerInfo(nombre,fechaInicio,fechaFin,puntoEncuentro,costo,cupoMin,cupoMax,inscriptos);
	}
	
}
