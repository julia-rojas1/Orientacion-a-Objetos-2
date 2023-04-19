package ar.edu.unlp.info.oo1.oo2ejercicio11;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator {
	private CRC32 crc = new CRC32();
	
	public long crcFor(String data) {
		crc.update(data.getBytes());
		return crc.getValue();
	}

}
