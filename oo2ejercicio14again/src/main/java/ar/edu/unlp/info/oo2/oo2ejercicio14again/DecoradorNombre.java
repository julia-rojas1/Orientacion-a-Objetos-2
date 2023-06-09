package ar.edu.unlp.info.oo2.oo2ejercicio14again;

public class DecoradorNombre extends DecoradorBase{
	
	public DecoradorNombre(ArchivoInterface wrappee) {
		super(wrappee);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " Nombre: " + this.getNombre();
	}

}
