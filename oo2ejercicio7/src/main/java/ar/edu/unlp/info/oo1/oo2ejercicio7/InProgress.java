package ar.edu.unlp.info.oo1.oo2ejercicio7;

import java.time.LocalTime;

public class InProgress extends Estado {
	
	public InProgress(ToDoItem tarea) {
		super(tarea);
	}
	
	public void togglePause() {
		tarea.setState(new Paused(tarea));
	}
	
	public void finish() {
		tarea.setState(new Finished(tarea));
		this.finish = LocalTime.now();
	}
}
