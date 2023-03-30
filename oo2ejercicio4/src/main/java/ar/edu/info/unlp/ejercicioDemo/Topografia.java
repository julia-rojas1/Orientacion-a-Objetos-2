package ar.edu.info.unlp.ejercicioDemo;

public abstract class Topografia {
	public abstract double calcularAgua();
	public abstract double calcularTierra();
	
	public abstract Topografia getParte(int n);
	
	public abstract boolean equals(Topografia topo);
	
	public boolean equals(Object o) {
		if (o instanceof Topografia) {
			return this.equals((Topografia) o);
		}
		return false;
	}
	
	
}
