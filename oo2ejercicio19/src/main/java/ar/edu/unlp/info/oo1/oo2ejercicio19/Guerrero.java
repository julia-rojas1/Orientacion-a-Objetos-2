package ar.edu.unlp.info.oo1.oo2ejercicio19;

import java.util.ArrayList;

public class Guerrero extends ProductoPersonaje{
	public Guerrero(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
		this.armadura = new ArmaduraAcero();
		this.arma = new ArmaEspada();
		this.habilidades = new ArrayList<>();
		habilidades.add(new HabilidadCombCuerpo());
	}
}
