package ar.edu.unlp.info.oo2.oo2ejercicio14again;

public class Archivo implements ArchivoInterface {
	private String nombre;
	private String extension;
	private int tamaño;
	
	public Archivo(String nombre, String extension, int tamaño) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public int getTamaño() {
		return tamaño;
	}
	
	public String prettyPrint() {
		return "";
	}
	
}
