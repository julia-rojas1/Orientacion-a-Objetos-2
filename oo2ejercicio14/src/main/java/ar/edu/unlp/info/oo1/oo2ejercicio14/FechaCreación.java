package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class FechaCreación extends BaseDecorator {
	public FechaCreación(IArchivo wrappee,Archivo archivo) {
		super(wrappee,archivo);
	}
	
	public String prettyPrint() {
		return archivo.getFechaCreación() + " " + super.prettyPrint();
	}
}
