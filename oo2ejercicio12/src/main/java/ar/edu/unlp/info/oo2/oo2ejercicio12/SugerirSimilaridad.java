package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerirSimilaridad extends EstrategiaSugerir{
	
	public  List<Pelicula> sugerir(Decodificador decodificador) {
		return decodificador.peliculasMayorPuntajeOrdenadasFecha().stream()
				.limit(3)
				.collect(Collectors.toList());
	}
}
