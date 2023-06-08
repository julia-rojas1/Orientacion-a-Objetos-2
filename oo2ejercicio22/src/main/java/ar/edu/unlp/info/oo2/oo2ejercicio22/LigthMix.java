package ar.edu.unlp.info.oo2.oo2ejercicio22;

public class LigthMix extends ProcessStep {
	public boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(20)&&(tank.mixerPower(5)));
	}
}
