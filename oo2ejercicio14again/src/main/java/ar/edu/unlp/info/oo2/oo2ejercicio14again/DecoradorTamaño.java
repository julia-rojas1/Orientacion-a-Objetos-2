package ar.edu.unlp.info.oo2.oo2ejercicio14again;

public class DecoradorTamaño extends DecoradorBase{
	public DecoradorTamaño(ArchivoInterface wrappee) {
		super(wrappee);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " Tamaño: " + this.getTamaño();
	}
}
