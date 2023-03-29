package ar.edu.info.unlp.ejercicioDemo;

public class Composite extends Topografia {
	private Topografia partes[];
	
	public Composite (Topografia uno, Topografia dos, Topografia tres, Topografia cua) {
		partes = new Topografia [4];
		partes[0] = uno;
		partes[1] = dos;
		partes[2] = tres;
		partes[3] = cua;
	}
	
	public double calcularAgua() {
		return (partes[0].calcularAgua() + partes[1].calcularAgua() + partes[2].calcularAgua() + partes[3].calcularAgua()) / 4;
	}
	
	public double calcularTierra() {
		return (partes[0].calcularTierra() + partes[1].calcularTierra() + partes[2].calcularTierra() + partes[3].calcularTierra()) / 4;
	}
	
	public Topografia getParte(int n) {
		return partes[n];
	}
	
	
	public boolean comparar (Topografia topo) {
		//it iterates over both lists, comparing corresponding pairs of elements
		for (int i=0; i<4; i++) {
			if (!partes[i].comparar(topo.getParte(i))) {
				return false;
			}
		}
		return true;			
		
		//Me falto chequear: if the specified object is also a list (composite).
	}
	
	
}
