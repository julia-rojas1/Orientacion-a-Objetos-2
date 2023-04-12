package ar.edu.unlp.info.oo1.oo2ejercicio7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String nombre;
	private List<String> comentarios;
	private Estado state;
	
	public ToDoItem(String name) {
		this.nombre = name;
		this.comentarios = new ArrayList<>();
		this.state = new Pending(this);
	}
	
	public Estado getState() {
		return state;
	}
	
	public void setState(Estado s) {
		this.state = s;
	}

	
	 public void start() {
		 state.start();
	 }
	 
	 public void togglePause() {
		 state.togglePause();
	 }
	 
	 public void finish() {
		 state.finish();
	 }

     public Duration workedTime() {
    	 return state.workedTime();
     }

     public void addComment(String comment) {
    	 if (state instanceof Finished){ // .-.
    		 //No se por qué no me deja negar la condición de arriba
    	 }
    	 else comentarios.add(comment);
     }
     
     public boolean contieneComentario(String comment) {
    	 return (comentarios.contains(comment));
     }
	
}
