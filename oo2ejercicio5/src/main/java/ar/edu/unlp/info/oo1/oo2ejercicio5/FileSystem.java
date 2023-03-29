package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaCreacion = fecha;
	}
	
	public abstract int tamanoTotalOcupado();
}
