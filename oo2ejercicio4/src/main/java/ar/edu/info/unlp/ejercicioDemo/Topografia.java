package ar.edu.info.unlp.ejercicioDemo;

public abstract class Topografia {
	public abstract double calcularAgua();
	public abstract double calcularTierra();
	
	public abstract Topografia getParte(int n);
	
	public abstract boolean comparar(Topografia topo);
	
}
