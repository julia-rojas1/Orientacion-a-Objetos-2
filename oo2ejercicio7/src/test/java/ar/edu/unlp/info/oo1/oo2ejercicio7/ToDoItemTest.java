package ar.edu.unlp.info.oo1.oo2ejercicio7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	ToDoItem tarea;
	
	@BeforeEach
	void setUp() throws Exception {
		tarea = new ToDoItem("tarea1");
	}
	
	@Test
	void testPending() {
		assertTrue(tarea.getState() instanceof Pending);
	}
	
	@Test
	void testStart() {
		tarea.start();
		assertTrue(tarea.getState() instanceof InProgress);
	}
	
	@Test
	void testTogglePause() {
		//tarea.togglePause();
		//si lo pauso en otro estado me salta la excepción
		
		tarea.start();
		
		tarea.togglePause();
		assertTrue(tarea.getState() instanceof Paused);
		
		tarea.togglePause();
		assertTrue(tarea.getState() instanceof InProgress);	
	}
	
	@Test
	void testFinished() {
		tarea.start();
		
		tarea.finish();
		assertTrue(tarea.getState() instanceof Finished);
	}
	
	
	@Test
	void testworkedTime() {
		//¿Hay alguna forma de testearlo sin tener que usar valores
		//predefinidos?
	}
	
	
	@Test
	void testComment() {
		tarea.addComment("Hola, ¿Qué tal?");
		assertTrue(tarea.contieneComentario("Hola, ¿Qué tal?"));
		
		tarea.start();
		tarea.finish();
		
		tarea.addComment("Terminado");
		assertFalse(tarea.contieneComentario("Terminado"));
	}
	
}
