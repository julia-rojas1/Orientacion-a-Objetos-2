package ar.edu.info.unlp.ejercicioDemo;

public class Leaf extends Topografia {
	private double porcionAgua;
	private double porcionTierra;
	
	public Leaf(double pAgua, double pTierra) {
		porcionAgua = pAgua;
		porcionTierra = pTierra;
	}
	
	public double calcularAgua() {
		return porcionAgua;
	}
	
	public double calcularTierra() {
		return porcionTierra;
	}
	
	public Topografia getParte(int n) {
		return this;
	}
	
	public boolean comparar (Topografia topo) {
		if ((this.calcularAgua() == topo.calcularAgua())&&(this.calcularTierra() == topo.calcularTierra())) {
			return true;
		}
		return false;
	}
}
