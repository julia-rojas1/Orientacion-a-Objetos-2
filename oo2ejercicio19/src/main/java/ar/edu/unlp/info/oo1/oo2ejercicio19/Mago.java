package ar.edu.unlp.info.oo1.oo2ejercicio19;

import java.util.ArrayList;

public class Mago extends ProductoPersonaje {
	public Mago(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
		this.armadura = new ArmaduraCuero();
		this.arma = new ArmaBaston();
		this.habilidades = new ArrayList<>();
		habilidades.add(new HabilidadMagia());
		habilidades.add(new HabilidadCombDistancia());
	}
}
