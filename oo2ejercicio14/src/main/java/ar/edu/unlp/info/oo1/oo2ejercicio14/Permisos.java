package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class Permisos extends BaseDecorator {
	public Permisos(IArchivo wrappee,Archivo archivo) {
		super(wrappee,archivo);
	}
	
	public String prettyPrint() {
		return archivo.getPermisos() + " " + super.prettyPrint();
	}
}
