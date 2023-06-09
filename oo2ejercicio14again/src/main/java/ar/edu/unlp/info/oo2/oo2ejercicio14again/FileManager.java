package ar.edu.unlp.info.oo2.oo2ejercicio14again;

import java.util.ArrayList;
import java.util.List;

public class FileManager {
	private List<ArchivoInterface> archivos;
	
	public FileManager() {
		archivos = new ArrayList<>();	
	}
	
	public void agregarArchivo(Archivo archivo) {
		archivos.add(archivo);
	}
	
	public void mostrarArchivos() {
		for (int i=0; i<archivos.size(); i++) {
			ArchivoInterface a = archivos.get(i);
			ArchivoInterface aNombre = new DecoradorNombre(a);
			ArchivoInterface aNomExtens = new DecoradorExtension(aNombre);
			ArchivoInterface aNomExtTam = new DecoradorTamaño(aNomExtens);
			
			System.out.println(aNomExtTam.prettyPrint());
		}
	}
}
