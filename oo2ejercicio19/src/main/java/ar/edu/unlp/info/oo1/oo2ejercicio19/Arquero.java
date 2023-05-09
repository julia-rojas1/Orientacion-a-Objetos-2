package ar.edu.unlp.info.oo1.oo2ejercicio19;

import java.util.ArrayList;

public class Arquero extends ProductoPersonaje {
	public Arquero(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
		this.armadura = new ArmaduraCuero();
		this.arma = new ArmaArco();
		this.habilidades = new ArrayList<>();
		habilidades.add(new HabilidadCombDistancia());
	}
}
