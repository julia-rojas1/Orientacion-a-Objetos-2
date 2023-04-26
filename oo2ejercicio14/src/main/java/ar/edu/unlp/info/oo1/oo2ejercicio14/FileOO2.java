package ar.edu.unlp.info.oo1.oo2ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class FileOO2 {
	private List<Archivo> archivos;
	
	public FileOO2() {
		archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo a) {
		archivos.add(a);
	}
	
	public String mostrarArchivos(int i) {
		Archivo a = archivos.get(i);
		
		return a.prettyPrint();
	}

}
