package ar.edu.unlp.info.oo1.oo2ejercicio10;

public class EnEvaluacion extends Etapa {
	public void aprobada(Proyecto proy, double precio) {
		proy.setEtapa(new Confirmada());
	}
	
	public void modificarMargen(Proyecto proy, int nuevoMargen) {
		if ((nuevoMargen>=11)&&(nuevoMargen<=15)) {
			proy.actualizarMargen(nuevoMargen);
		}
	}
}
