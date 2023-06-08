package ar.edu.unlp.info.oo1.oo2ejercicio19;

public class CreadorGuerrero extends CreadorPersonaje{
	public ProductoPersonaje crearPersonaje(String nombre) {
		return new Guerrero(nombre);
	}

}
