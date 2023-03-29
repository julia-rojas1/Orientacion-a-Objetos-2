package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter sistema;
	
	Usuario u1;
	Usuario u2;
	Usuario u3;
	
	Tweet t1;
	Tweet t2;
	Tweet t3;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Twitter();
		
		u1 = new Usuario("juan");
		u2 = new Usuario("juan");
		u3 = new Usuario("pedro");
		
		
		t2 = new Tweet("111111111",null);
		t3 = new Tweet("111",t1);

	}
	
    @Test
    public void testAgregarUsuario() {
    	assertTrue(sistema.agregarUsuario(u1));
    	assertFalse(sistema.agregarUsuario(u2));
    	assertTrue(sistema.agregarUsuario(u3));
    }
    
    @Test
    public void testAgregarTweet() {
    	t1 = u1.crearTweet("111", null);
    	assertEquals("111",t1.getTexto());
    	
    	t2 = u1.crearTweet("111111111111", null);
    	assertNull(t2);
    	
    	t3 = u1.crearTweet("222", t1);
    	assertEquals("222",t3.getTexto());
    	
    }
    
    
    @Test
    public void testEliminarUsuario() {
    	assertTrue(sistema.agregarUsuario(u1));
    	t1 = u1.crearTweet("111", null);
    
    	assertTrue(sistema.eliminarUsuario(u1));
    	
    	
    	
    	assertFalse(sistema.eliminarUsuario(u2));
    }
    
}
