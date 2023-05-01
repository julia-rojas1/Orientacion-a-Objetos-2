package ar.edu.unlp.info.oo1.oo2ejercicio15;

import java.util.List;

public class HomeWeatherAdapter implements Estacion{
	HomeWeatherStation estacion;
	
	public HomeWeatherAdapter() {
		this.estacion = new HomeWeatherStation();
	}
	
	public double getTemperaturaFahrenheit() {
		return estacion.getTemperaturaFahrenheit();
	}
	public double getPresion() {
		return estacion.getPresion();
	}
	public double getRadiacionSolar() {
		return estacion.getRadiacionSolar();
	}
	public List<Double> getTemperaturasFahrenheit() {
		return estacion.getTemperaturasFahrenheit();
	}
	public double getTemperaturaCelsius() {
		return (this.getTemperaturaFahrenheit()-32) / 1.8;
	}
	public double promedioTemperaturasFahrenheit() {
		return this.getTemperaturasFahrenheit().stream()
				.mapToDouble(a -> a)
				.average().orElse(0);
	}
	
	public String displayData() {
		return "";
	}
}
