package ar.edu.unlp.info.oo1.oo2ejercicio19;

public class ArmaduraHierro extends Armadura{
	public int proteger(Arma arma) {
		return arma.dañarHierro();
	}
}
