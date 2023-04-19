package ar.edu.unlp.info.oo1.oo2ejercicio11;

public class CuatroGAdapter implements Connection {
	CuatroGConnection cuatro;
	
	public CuatroGAdapter() {
		cuatro = new CuatroGConnection();
	}
	
	public String sendData(String data, long crc) {
		return cuatro.transmit(data, crc);
	}
	
	public String pict() {
		return cuatro.getSymb();
	}
}
