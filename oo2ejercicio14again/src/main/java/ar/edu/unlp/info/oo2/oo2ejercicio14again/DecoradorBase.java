package ar.edu.unlp.info.oo2.oo2ejercicio14again;

public class DecoradorBase implements ArchivoInterface{
	private ArchivoInterface wrappee;
	
	public DecoradorBase(ArchivoInterface wrappee) {
		this.wrappee = wrappee;
	}
	
	public String getNombre() {
		return wrappee.getNombre();
	}

	public String getExtension() {
		return wrappee.getExtension();
	}

	public int getTamaño() {
		return wrappee.getTamaño();
	}
	
	public String prettyPrint() {
		return wrappee.prettyPrint();
	}
}
