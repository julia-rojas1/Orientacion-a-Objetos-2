package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class topografiaTest {
	Topografia top1;
	Topografia top2;
	Topografia top3;
	Topografia top4;
	
	Topografia top5;
	
	@BeforeEach
	void setUp() throws Exception {
		top1 = new Leaf(1,0);
		top2 = new Leaf(0,1);
		top3 = new Composite (new Leaf(1,0),new Leaf(0,1),new Leaf(0,1),new Leaf(1,0));
		top4 = new Composite (top1,top2,top2,top3);
		
		top5 = new Composite (new Leaf(1,0),new Leaf(0,1),new Leaf(0,1),new Leaf(1,0));
	}
	
	@Test
	public void testCalcularAgua() {
		assertEquals(1,top1.calcularAgua());
		assertEquals(0,top2.calcularAgua());
		assertEquals(0.5,top3.calcularAgua());
		assertEquals(0.375,top4.calcularAgua());
	}
	
	/*@Test
	public void testEquals() {
		//Misma topografia
		assertTrue(top1.comparar(top1));
		assertTrue(top3.comparar(top3));
		assertTrue(top4.comparar(top4));
		
		assertTrue(top3.comparar(top5));
		
		//Distinta
		assertFalse(top1.comparar(top2));
		assertFalse(top1.comparar(top4));
		assertFalse(top4.comparar(top3));
	}*/
	
}
