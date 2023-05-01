package ar.edu.unlp.info.oo1.oo2ejercicio15;

public class ImprimirPromedioTemperaturas extends DecoradorBase{

	public ImprimirPromedioTemperaturas(Estacion wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}

	public String displayData() {
		return super.displayData() + " Promedio de temperaturas: " + this.promedioTemperaturasFahrenheit();
	}
}
