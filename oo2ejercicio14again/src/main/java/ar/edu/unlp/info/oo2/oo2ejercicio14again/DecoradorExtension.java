package ar.edu.unlp.info.oo2.oo2ejercicio14again;

public class DecoradorExtension extends DecoradorBase{
	public DecoradorExtension(ArchivoInterface wrappee) {
		super(wrappee);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " Extensión: " + this.getExtension();
	}
}
