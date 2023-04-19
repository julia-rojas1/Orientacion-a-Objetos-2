package ar.edu.unlp.info.oo1.oo2ejercicio11;

public class Dispositivo {
	private CRC_Calculator crcCalculator;
	private Connection connection;
	private Display display;
	private Ringer ringer;
	
	public Dispositivo(CRC_Calculator crc, Connection conn, Display dis, Ringer ringer) {
		this.crcCalculator = crc;
		this.connection = conn;
		this.display = dis;
		this.ringer = ringer;
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
	
	public void conectarCon (Connection conn) {
		connection = conn;
		System.out.println(connection.pict());
		System.out.println(ringer.ring() + "\n");
	}
	
	public void configurarCRC(CRC_Calculator crc) {
		crcCalculator = crc;
	}
}
