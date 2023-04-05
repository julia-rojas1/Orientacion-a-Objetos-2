package ar.edu.unlp.info.oo1.oo2ejercicio7;

public class InProgress extends Estado {
	public Estado start() {
		return this;
	}
	
	public Estado togglePause() {
		return new Paused();
	}
	
	public Estado finish() {
		return new Finished();
	}
}
