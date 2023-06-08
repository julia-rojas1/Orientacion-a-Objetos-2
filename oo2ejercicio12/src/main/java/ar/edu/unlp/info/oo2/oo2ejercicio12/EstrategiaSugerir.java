package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EstrategiaSugerir {
	private static int LIMITE = 3;
	
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> pelisReproducidas){
		//TEMPLATE METHOD
		List<Pelicula> listaFiltrada = this.filtrarPelis(peliculas, pelisReproducidas);		
		List<Pelicula> listaOrdenada = this.ordenar(listaFiltrada);
		return listaOrdenada.stream()
				.limit(LIMITE)
				.collect(Collectors.toList());
	} 
	
	protected List<Pelicula> filtrarPelis (List<Pelicula> peliculas, List<Pelicula> pelisReproducidas) {
		return peliculas.stream()
				.filter(p -> !pelisReproducidas.contains(p))
				.collect(Collectors.toList());
	}
	
	
	protected List<Pelicula> ordenar (List<Pelicula> peliculas) {
		return peliculas.stream()
				.sorted((p1,p2) -> p2.getAñoDeEstreno().compareTo(p1.getAñoDeEstreno()))
				.collect(Collectors.toList());
	}
	

}
