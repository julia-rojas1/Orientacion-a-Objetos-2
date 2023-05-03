package ar.edu.unlp.info.oo1.oo2ejercicio18;

public class BuilderVegano extends BuilderSanguche {
	public void agregarPan() {
		this.precioFinal += this.precioPan.getIntegral();
	}
	
	public void agregarAderezo() {
		this.precioFinal +=	this.precioAderezo.getSalsaCriolla();
	}
	
	public void agregarPrincipal() {
		this.precioFinal += this.precioPrincipal.getMilaDeGirgolas();
	}
	
	public void agregarAdicional() {	
	}

}
