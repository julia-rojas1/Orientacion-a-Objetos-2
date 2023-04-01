package ar.edu.unlp.info.oo2.oo2ejercicio6;

public class Pasante extends Empleado {
	private int cantExamen;

	public Pasante(int cantExamen) {
		this.cantExamen = cantExamen;		
	}
	
	public int sueldoBasico() {
		return super.sueldoBasico();
	}
	
	public int sueldoAdicional() {
		return 2000 * cantExamen;
	}
}
