package ar.edu.unlp.info.oo1.oo2ejercicio15;

public class ImprimirTempCelsius extends DecoradorBase{

	public ImprimirTempCelsius(Estacion wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + " Temperatura C: " + this.getTemperaturaCelsius();
	}

}
