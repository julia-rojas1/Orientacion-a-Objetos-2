package ar.edu.unlp.info.oo2.oo2ejercicio22;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSuccess();
		}
		else this.setFailure();
	}
	
	public abstract boolean basicExecute(MixingTank tannk);
	
	public boolean isDone() {
		return result;
	}
	
	private void setSuccess() {
		result = true; 
	}
	
	private void setFailure() {
		result = false;
	}
}
