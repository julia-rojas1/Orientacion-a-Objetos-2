package ar.edu.unlp.info.oo1.oo2ejercicio18;

public class Director {
	private BuilderSanguche builder;
	
	public Director(BuilderSanguche builder) {
		this.builder = builder;
	}
	
	public void cambiarBuilder(BuilderSanguche builder) {
		this.builder = builder;
	}

	public double precioSanguche() {
		builder.agregarPan();
		builder.agregarAderezo();
		builder.agregarPrincipal();
		builder.agregarAdicional();
		
		return builder.getPrecio();
	}
}
