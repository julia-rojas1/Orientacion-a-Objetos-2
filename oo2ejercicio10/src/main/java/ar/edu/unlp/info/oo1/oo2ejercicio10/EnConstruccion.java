package ar.edu.unlp.info.oo1.oo2ejercicio10;

public class EnConstruccion extends Etapa {
	public void aprobada(Proyecto proy, double precio) {
		if (precio != 0) {
			proy.setEtapa(new EnEvaluacion());
		}
		else {
			throw new RuntimeException("El proyecto no tiene precio");
		}
	}
	
	public void modificarMargen(Proyecto proy, int nuevoMargen) {
		if ((nuevoMargen>=8)&&(nuevoMargen<=10)) {
			proy.actualizarMargen(nuevoMargen);
		}
	}

}
