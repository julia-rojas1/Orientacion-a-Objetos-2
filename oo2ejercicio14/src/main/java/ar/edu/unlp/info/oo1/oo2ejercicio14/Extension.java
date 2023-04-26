package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class Extension extends BaseDecorator{
	public Extension(IArchivo wrappee,Archivo archivo) {
		super(wrappee,archivo);
	}
	
	public String prettyPrint() {
		
		return (archivo.getExtensión() + " " + super.prettyPrint());
	}
}
