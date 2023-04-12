package ar.edu.unlp.info.oo1.oo2ejercicio7;

<<<<<<< HEAD
public abstract class Estado {
	public abstract Estado start();
	public abstract Estado togglePause();
	public abstract Estado finish();
=======
import java.time.Duration;
import java.time.LocalTime;

public class Estado {
	protected ToDoItem tarea; // .-.
	protected LocalTime start;
	protected LocalTime finish;
	
	public Estado(ToDoItem tarea) {
		this.start = null;
		this.finish = null;
		this.tarea = tarea;
	}
	
	
	public void start() {
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish() {	
	}
	
	public Duration workedTime() {
		return Duration.between(start, LocalTime.now());
	}
	
>>>>>>> 82194db1251b491462b56be7be47acdd7d60dc6e
	
}
