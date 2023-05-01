package ar.edu.unlp.info.oo1.oo2ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	public double getTemperaturaFahrenheit() {
		return 64.4;
	}
	
	public double getPresion() {
		return 1008;
	}
	
	public double getRadiacionSolar() {
		return 500;
	}
	
	public List<Double> getTemperaturasFahrenheit(){
		List<Double> lista = new ArrayList<>();
		lista.add(64.4);
		lista.add(68.0);
		lista.add(69.5);
		return lista;
	}


}
