package ar.edu.unlp.info.oo1.oo2ejercicio19;

public class CreadorMago extends CreadorPersonaje {
	public ProductoPersonaje crearPersonaje(String nombre) {
		return new Mago(nombre);
	}

}
