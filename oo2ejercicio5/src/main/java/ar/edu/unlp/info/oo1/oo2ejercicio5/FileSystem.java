package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	private int bytes;
	
	public FileSystem(String nombre, LocalDate fecha, int bytes) {
		this.nombre = nombre;
		this.fechaCreacion = fecha;
		this.bytes = bytes;
	}
	
	public int getBytes() {
		return this.bytes;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fechaCreacion;
	}
	
	public abstract int tamanoTotalOcupado();
	
	public abstract Archivo archivoMasGrande();
	
	public abstract Archivo archivoMasNuevo();
}
