package ar.edu.unlp.info.oo1.oo2ejercicio14;

public class BaseDecorator implements IArchivo{
	protected IArchivo wrappee; 
	protected Archivo archivo;
	
	public BaseDecorator(IArchivo wrappee, Archivo archivo) {
		this.wrappee = wrappee;
		this.archivo = archivo;
	}
	
	public String prettyPrint() {
		return wrappee.prettyPrint();
	}
}
