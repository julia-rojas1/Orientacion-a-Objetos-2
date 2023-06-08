package ar.edu.unlp.info.oo1.oo2ejercicio19;

import java.util.List;

public abstract class ProductoPersonaje {
	protected String nombre;
	protected Armadura armadura;
	protected Arma arma;
	protected List<Habilidad> habilidades;
	protected int vida;
	
	public int getVida() {
		return this.vida;
	}
	
	public void combatirPersonaje(ProductoPersonaje pers) {
		if ((vida > 0)&&(pers.getVida()>0)) {
			this.atacarPersonaje(pers);
		}
	}
	
	public void atacarPersonaje(ProductoPersonaje pers) {
		pers.siendoAtacado(this.arma);
	}
	
	public void siendoAtacado(Arma arma) {
		vida = vida - this.armadura.proteger(arma);
	}
}
