package ar.edu.unlp.info.oo1.oo2ejercicio18;

public class BuilderClasico extends BuilderSanguche {
	
	public void agregarPan() {
		this.precioFinal += this.precioPan.getBrioche();
	}
	
	public void agregarAderezo() {
		this.precioFinal +=	this.precioAderezo.getMayonesa();
	}
	
	public void agregarPrincipal() {
		this.precioFinal += this.precioPrincipal.getTernera();
	}
	
	public void agregarAdicional() {
		this.precioFinal += this.precioAdicional.getTomate();	
	}

}
