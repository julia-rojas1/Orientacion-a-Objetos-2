package ar.edu.unlp.info.oo1.oo2ejercicio18;

public class BuilderVegetariano extends BuilderSanguche{
	public void agregarPan() {
		this.precioFinal += this.precioPan.getConSemillas();
	}
	
	public void agregarAderezo() {
	}
	
	public void agregarPrincipal() {
		this.precioFinal += this.precioPrincipal.getProvoleta();
	}
	
	public void agregarAdicional() {
		this.precioFinal += this.precioAdicional.getBerenjenasAlEscabeche();	
	}

}
