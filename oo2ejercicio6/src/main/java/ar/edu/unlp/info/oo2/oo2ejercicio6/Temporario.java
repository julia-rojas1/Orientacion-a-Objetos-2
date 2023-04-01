package ar.edu.unlp.info.oo2.oo2ejercicio6;

public class Temporario extends Empleado {
	private int horasTrabajo;
	private boolean casado;
	private int hijos;
	
	public Temporario (int horasTrabajo, boolean casado, int hijos) {
		this.horasTrabajo = horasTrabajo;
		this.casado = casado;
		this.hijos = hijos;
	}
	
	public int sueldoBasico() {
		return super.sueldoBasico() + horasTrabajo * 300;
	}
	
	public int sueldoAdicional() {
		int valor = 0;
		if (casado) {
			valor = 5000;
		}
		return valor + 2000 * hijos;
	}
	
}
