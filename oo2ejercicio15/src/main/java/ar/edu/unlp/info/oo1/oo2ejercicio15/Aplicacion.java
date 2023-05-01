package ar.edu.unlp.info.oo1.oo2ejercicio15;

public class Aplicacion {
	
	public String Ejemplo1() {
		HomeWeatherAdapter hws = new HomeWeatherAdapter();
		ImprimirPresionAtmosférica presion = new ImprimirPresionAtmosférica(hws);
		
		return presion.displayData();
	}
	
	public String Ejemplo2() {
		HomeWeatherAdapter hws = new HomeWeatherAdapter();
		ImprimirPresionAtmosférica presion = new ImprimirPresionAtmosférica(hws);
		ImprimirRadiaciónSolar radiacion = new ImprimirRadiaciónSolar(presion);
		
		return radiacion.displayData();
	}
	
	
	public String Ejemplo3() {
		HomeWeatherAdapter hws = new HomeWeatherAdapter();
		ImprimirRadiaciónSolar radiacion = new ImprimirRadiaciónSolar(hws);
		ImprimirTempCelsius tempC = new ImprimirTempCelsius(radiacion);
		ImprimirPromedioTemperaturas promedio = new ImprimirPromedioTemperaturas(tempC);
		
		return promedio.displayData();
	}
}
