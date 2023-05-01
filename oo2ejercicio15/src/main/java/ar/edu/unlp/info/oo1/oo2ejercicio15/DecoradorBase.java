package ar.edu.unlp.info.oo1.oo2ejercicio15;

import java.util.List;

public class DecoradorBase implements Estacion{
	private Estacion wrappee; 
	
	public DecoradorBase(Estacion wrappee) {
		this.wrappee = wrappee;
	}

	public double getTemperaturaFahrenheit() {
		return wrappee.getTemperaturaFahrenheit();
	}
	public double getPresion() {
		return wrappee.getPresion();
	}
	public double getRadiacionSolar() {
		return wrappee.getRadiacionSolar();
	}
	public List<Double> getTemperaturasFahrenheit() {
		return wrappee.getTemperaturasFahrenheit();
	}
	public double getTemperaturaCelsius() {
		return wrappee.getTemperaturaCelsius();
	}
	public double promedioTemperaturasFahrenheit() {
		return wrappee.promedioTemperaturasFahrenheit();
	}
	
	public String displayData() {
		return wrappee.displayData();
	}
}
