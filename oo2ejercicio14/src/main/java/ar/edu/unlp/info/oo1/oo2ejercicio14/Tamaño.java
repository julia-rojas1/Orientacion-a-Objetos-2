package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class Tamaño extends BaseDecorator{
	public Tamaño(IArchivo wrappee,Archivo archivo) {
		super(wrappee,archivo);
	}
	
	public String prettyPrint() {
		return archivo.getTamaño() + " " + super.prettyPrint();
	}
}
