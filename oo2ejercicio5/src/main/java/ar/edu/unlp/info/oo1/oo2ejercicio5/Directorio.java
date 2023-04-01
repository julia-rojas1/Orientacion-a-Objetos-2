package ar.edu.unlp.info.oo1.oo2ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FileSystem {
	private List<FileSystem> contenido;
	
	public Directorio(String nombre, LocalDate fecha) {
		super (nombre,fecha,32);
		contenido = new ArrayList<>();
	}
	
	public void agregar (FileSystem content) {
		contenido.add(content);
	}
	
	
	
	public int tamanoTotalOcupado() {
		return getBytes() + contenido.stream()
				.mapToInt(a -> a.tamanoTotalOcupado())
				.sum();
	}
	
	
	
	/*
	public FileSystem archivoMasGrande(FileSystem a1, FileSystem a2) {
		FileSystem max;
		for (int i=0; i<contenido.size(); i++) {
			if (contenido.get(i).archivoMasGrande().esMasGrande(contenido.get(i).archivoMasGrande())) {
				max = a1;
			}
			else max = a2;
		}
		
		return max;
	}*/
	
	
	public Archivo archivoMasGrande() {
		return contenido.stream()
				.map(a -> a.archivoMasGrande())
				.max((a1,a2)-> Integer.compare(a1.getBytes(), a2.getBytes()))
				.orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return contenido.stream()
				.map(a -> a.archivoMasNuevo())
				.max((a1,a2)-> a1.getFecha().compareTo(a2.getFecha()))
				.get();
	}
	
	
}
