package ar.edu.unlp.info.oo1.oo2ejercicio15;

public class ImprimirPresionAtmosférica extends DecoradorBase {

	public ImprimirPresionAtmosférica(Estacion wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + " Presión atmosférica: " + this.getPresion();
	}

}
