package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class Nombre extends BaseDecorator{
	public Nombre(IArchivo wrappee,Archivo archivo) {
		super(wrappee,archivo);
	}
	
	public String prettyPrint() {
		return archivo.getNombre() + " " + super.prettyPrint();
	}
}
