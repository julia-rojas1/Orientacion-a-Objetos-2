package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;

public class Archivo extends FileSystem {
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre,fecha,tamano);
	}
	
	public int tamanoTotalOcupado() {
		return getBytes();
	}
	
	public int tamanoOcupado() {
		return getBytes();
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
}
