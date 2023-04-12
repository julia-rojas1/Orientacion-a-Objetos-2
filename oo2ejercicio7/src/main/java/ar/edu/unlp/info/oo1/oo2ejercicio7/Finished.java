package ar.edu.unlp.info.oo1.oo2ejercicio7;

import java.time.Duration;

public class Finished extends Estado {
	
	public Finished(ToDoItem tarea) {
		super(tarea);
	}
	
	public Duration workedTime() {
		return Duration.between(start, finish);
	}
}
