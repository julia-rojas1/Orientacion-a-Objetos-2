package ar.edu.unlp.info.oo1.oo2ejercicio19;

public class CreadorArquero extends CreadorPersonaje{
	public ProductoPersonaje crearPersonaje(String nombre) {
		return new Arquero(nombre);
	}

}
