package ar.edu.unlp.info.oo1.oo2ejercicio7;

import java.time.Duration;
import java.time.LocalTime;

public class Pending extends Estado{
	
	public Pending(ToDoItem tarea) {
		super(tarea);
	}
	
	public void start() {
		tarea.setState(new InProgress(tarea));
		this.start = LocalTime.now();
	}
	
    public Duration workedTime() {
    	throw new RuntimeException("El objeto ToDoItem no ha iniciado");
    }

	
}
