package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerirSimilaridad extends EstrategiaSugerir{
	
	protected List<Pelicula> filtrarPelis (List<Pelicula> peliculas, List<Pelicula> pelisReproducidas) {
	
		List<Pelicula> listaPelis = pelisReproducidas.stream()
			.map(p -> p.getSimiliares())
			.flatMap(lista -> lista.stream()) //para tener una única lista
			.distinct() //para eliminar los repetidos
			.collect(Collectors.toList());
	
		return super.filtrarPelis(listaPelis,pelisReproducidas);
	}
}
