package ar.edu.unlp.info.oo2.oo2ejercicio19;

public class Personaje {
	private String nombre;
	private int vida;
	private String armadura;
	private String arma;
	private String habilidad;
	
	public Personaje() {
		this.vida = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getArmadura() {
		return armadura;
	}
	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
}
