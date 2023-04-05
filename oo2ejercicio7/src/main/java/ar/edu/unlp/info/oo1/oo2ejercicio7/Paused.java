package ar.edu.unlp.info.oo1.oo2ejercicio7;

public class Paused extends Estado {
	public Estado start() {
		return this;
	}
	
	public Estado togglePause() {
		return new InProgress();
	}
	
	public Estado finish() {
		return new Finished();
	}
}
