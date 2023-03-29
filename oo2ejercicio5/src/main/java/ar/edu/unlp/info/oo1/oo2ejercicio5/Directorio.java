package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
	private List<FileSystem> contenido;
	
	public Directorio(String nombre, LocalDate fecha) {
		super (nombre,fecha);
		contenido = new ArrayList<>();
	}
	
	public int tamanoTotalOcupado() {
		return contenido.stream()
				.mapToInt(a -> a.tamanoTotalOcupado)
				.sum();
	}
}
