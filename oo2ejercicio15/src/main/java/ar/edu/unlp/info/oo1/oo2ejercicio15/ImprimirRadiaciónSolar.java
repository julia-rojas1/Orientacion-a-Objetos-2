package ar.edu.unlp.info.oo1.oo2ejercicio15;

public class ImprimirRadiaciónSolar extends DecoradorBase{
	
	public ImprimirRadiaciónSolar(Estacion wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return super.displayData() + " Radiación solar: " + this.getRadiacionSolar();
	}
}
