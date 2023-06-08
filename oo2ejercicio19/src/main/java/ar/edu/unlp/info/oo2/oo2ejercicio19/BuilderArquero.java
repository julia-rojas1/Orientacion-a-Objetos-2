package ar.edu.unlp.info.oo2.oo2ejercicio19;

public class BuilderArquero implements BuilderPersonajes{
	private Arquero arquero;
	
	public BuilderArquero() {
		this.iniciar();
	}
	
	public void iniciar() {
		arquero = new Arquero();
	}
	
	public void setArmadura() {
		arquero.setArmadura("Cuero");
		
	}
}
