package ar.edu.unlp.info.oo1.oo2ejercicio11;

public class WifiConn implements Connection {
	private String pict = "Conectado a Wifi";
	
	public String sendData(String data, long crc) {
		return "Se enviaron los datos";
		
	}
	
	public String pict() {
		return pict;
	}
}
