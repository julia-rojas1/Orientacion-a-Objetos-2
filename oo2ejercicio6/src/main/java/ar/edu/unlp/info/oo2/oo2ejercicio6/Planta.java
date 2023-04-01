package ar.edu.unlp.info.oo2.oo2ejercicio6;

public class Planta extends Empleado {
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	public Planta(boolean casado, int hijos, int antig) {
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antig;
	}
	
	public int sueldoBasico() {
		return super.sueldoBasico() + 30000;
	}
	
	public int sueldoAdicional() {
		int valor = 0;
		if (casado) {
			valor = 5000;
		}
		return valor + 2000*hijos + 2000*antiguedad;
	}
}
