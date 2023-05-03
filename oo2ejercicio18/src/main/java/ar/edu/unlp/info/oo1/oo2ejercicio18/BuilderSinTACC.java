package ar.edu.unlp.info.oo1.oo2ejercicio18;

public class BuilderSinTACC extends BuilderSanguche{
	public void agregarPan() {
		this.precioFinal += this.precioPan.getDeChipá();
	}
	
	public void agregarAderezo() {
		this.precioFinal +=	this.precioAderezo.getSalsaTartara();
	}
	
	public void agregarPrincipal() {
		this.precioFinal += this.precioPrincipal.getPollo();
	}
	
	public void agregarAdicional() {
		this.precioFinal += this.precioAdicional.getVerdurasGrilladas();	
	}

}
