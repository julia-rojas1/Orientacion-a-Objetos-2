package ar.edu.unlp.info.oo2.oo2ejercicio22;

public class Purge {
	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(0)&&
				tank.mixerPower(0)&&
				tank.purge());

	}
}
