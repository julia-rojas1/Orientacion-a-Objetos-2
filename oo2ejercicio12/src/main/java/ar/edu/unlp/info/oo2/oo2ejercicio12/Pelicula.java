package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class Pelicula {
	private String nombre;
	private LocalDate añoEstreno;
	private List<Pelicula> similares;
	private double puntaje;
	
	
	public Pelicula (String nombre, double puntaje, LocalDate estreno, List<Pelicula> similares) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.añoEstreno = estreno;
		this.similares = similares;
	}
	
	public LocalDate getAñoDeEstreno() {
		return añoEstreno;
	}
	public List<Pelicula> getSimiliares() {
		return similares;
	}
	public double getPuntaje() {
		return puntaje;
	}
	
	
}
