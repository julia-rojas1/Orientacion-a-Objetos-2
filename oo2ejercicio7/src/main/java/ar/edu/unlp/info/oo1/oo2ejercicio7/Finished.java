package ar.edu.unlp.info.oo1.oo2ejercicio7;

public class Finished extends Estado {
	public Estado start() {
		return this;
	}
	
	public Estado togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	public Estado finish() {
		return this;
	}
}
