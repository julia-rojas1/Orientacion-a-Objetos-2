package ar.edu.unlp.info.oo1.oo2ejercicio15;

import java.util.List;

public interface Estacion {
	public double getTemperaturaFahrenheit(); 
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturasFahrenheit();
	public double getTemperaturaCelsius();
	public double promedioTemperaturasFahrenheit();
	
	public String displayData();

}
