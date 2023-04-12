package ar.edu.unlp.info.oo1.oo2ejercicio10;

public class Etapa {
	public void aprobada(Proyecto proy, double precio) {
		
	}
	
	public void modificarMargen(Proyecto proy,int nuevoMargen) {
		
	}
	
	public void cancelar(Proyecto proy) {
		proy.cancelado();
		proy.setEtapa(new Cancelado());
	}

}
