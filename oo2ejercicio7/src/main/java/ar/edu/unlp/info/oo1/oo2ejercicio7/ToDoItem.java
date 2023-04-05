package ar.edu.unlp.info.oo1.oo2ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String nombre;
	private List<String> comentarios;
	private Estado state;
	
	public ToDoItem(String name) {
		this.nombre = name;
		this.comentarios = new ArrayList<>();
		this.state = new Pending();
	}
	
	
}
