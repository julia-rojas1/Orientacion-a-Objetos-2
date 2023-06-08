package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerirPuntaje extends EstrategiaSugerir {
	
	protected List<Pelicula> ordenar (List<Pelicula> peliculas) {
		return peliculas.stream()
			//.sorted((p1,p2) -> Double.compare(p1.getPuntaje(), p2.getPuntaje()).thenCompare(p2.getAñoDeEstreno().compareTo(p1.getAñoDeEstreno())))
			//Como hago para comparar por dos criterios
			.collect(Collectors.toList());
	}

}
