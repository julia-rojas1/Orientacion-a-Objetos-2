package ar.edu.unlp.info.oo1.oo2ejercicio14;

import java.time.LocalDate;

public class Archivo implements IArchivo{
	private String nombre;
	private String extensión;
	private int tamaño;
	private LocalDate fechaCreación;
	private LocalDate fechaModicificación;
	private String permisos;
	
	public String getNombre() {
		return nombre;
	}

	public String getExtensión() {
		return extensión;
	}

	public int getTamaño() {
		return tamaño;
	}

	public LocalDate getFechaCreación() {
		return fechaCreación;
	}

	public LocalDate getFechaModicificación() {
		return fechaModicificación;
	}

	public String getPermisos() {
		return permisos;
	}

	public Archivo (String nombre,String extensión,int tamaño,LocalDate fechaCrea,LocalDate fechaMod,String permisos){
		this.nombre = nombre;
		this.extensión = extensión;
		this.tamaño = tamaño;
		this.fechaCreación = fechaCrea;
		this.fechaModicificación = fechaMod;
		this.permisos = permisos;
	}
	
	public String prettyPrint(){
		return "";
	}
	
}
