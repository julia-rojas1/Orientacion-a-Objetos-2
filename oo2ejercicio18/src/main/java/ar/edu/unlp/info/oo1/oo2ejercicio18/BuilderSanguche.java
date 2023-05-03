package ar.edu.unlp.info.oo1.oo2ejercicio18;

public abstract class BuilderSanguche {
	protected double precioFinal;
	
	protected PrecioPan precioPan;
	protected PrecioAderezo precioAderezo;
	protected PrecioPrincipal precioPrincipal;
	protected PrecioAdicional precioAdicional;
	
	public BuilderSanguche() {
		this.precioFinal = 0;
		
		this.precioPan = new PrecioPan();
		this.precioAderezo = new PrecioAderezo();
		this.precioPrincipal = new PrecioPrincipal();
		this.precioAdicional = new PrecioAdicional();
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	
	public double getPrecio() {
		return precioFinal;
	}
}
