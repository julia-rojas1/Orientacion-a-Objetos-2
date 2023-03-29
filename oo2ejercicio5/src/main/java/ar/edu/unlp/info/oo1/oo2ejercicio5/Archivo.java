package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;

public class Archivo extends FileSystem {
	private int bytes;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		super(nombre,fecha);
		this.bytes = tamano;
	}
	
	public int tamanoTotalOcupado() {
		return bytes;
	}
}
