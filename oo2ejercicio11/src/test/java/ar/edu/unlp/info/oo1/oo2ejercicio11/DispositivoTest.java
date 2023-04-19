package ar.edu.unlp.info.oo1.oo2ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo disp;
	
	@BeforeEach
	void setUp() throws Exception {
		disp = new Dispositivo(new CRC16_Calculator(), new WifiConn(),new Display(), new Ringer());
	}
	
	@Test
	void testSend() {
		assertEquals("Se enviaron los datos", disp.send("hola hola hola"));
	}
	
	@Test
	void testConcectarCon() {
		System.out.println("Conectar con " + "\n");
		
		disp.conectarCon(new CuatroGAdapter());
		disp.conectarCon(new WifiConn());
	}
	
	@Test
	void testConfigurarCRC() {
		//¿?
	}

}
