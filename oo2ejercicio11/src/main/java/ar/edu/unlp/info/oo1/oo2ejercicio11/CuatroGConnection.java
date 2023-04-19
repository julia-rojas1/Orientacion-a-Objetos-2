package ar.edu.unlp.info.oo1.oo2ejercicio11;

public class CuatroGConnection {
	private String symb = "Conectado a 4G";
			
	public String transmit(String data, long crc) {
		return "Se enviaron los datos";
	}
	
	public String getSymb() {
		return symb;
	}
}
