package ar.edu.unlp.info.oo2.oo2ejercicio6;

public abstract class Empleado {
	
	public int sueldoBasico() {
		return 20000;
	}
	
	public abstract int sueldoAdicional();
	
	public int descuento() {
		int bas = 13 * this.sueldoBasico() / 100;
		int adi = 5 * this.sueldoAdicional() / 100;
		return bas + adi;
	}

	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
}
