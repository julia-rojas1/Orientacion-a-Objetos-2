package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerirNovedad extends EstrategiaSugerir{
	
	public  List<Pelicula> sugerir(Decodificador decodificador) {
		return decodificador.peliculasSinReproducirOrdenadasFecha().stream()
				.limit(3)
				.collect(Collectors.toList());
	}
}
