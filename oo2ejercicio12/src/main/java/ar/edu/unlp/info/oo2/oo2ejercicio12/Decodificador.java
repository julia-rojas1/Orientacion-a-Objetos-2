package ar.edu.unlp.info.oo2.oo2ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> peliculas; 
	private List<Pelicula> peliculasReproducidas;
	private EstrategiaSugerir sugerencia;
	
	public Decodificador(List<Pelicula> peliculas, EstrategiaSugerir sugerencia) {
		this.peliculas = peliculas;
		this.peliculasReproducidas = new ArrayList<>();
		this.sugerencia = sugerencia;
	}
	
	public void agregarPeliculaReproducida(Pelicula pelicula) {
		peliculasReproducidas.add(pelicula);
		peliculasReproducidas = peliculasReproducidas.stream().distinct().collect(Collectors.toList());
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
		peliculas = peliculas.stream().distinct().collect(Collectors.toList());
	}
	
	public void mostrarPeliculas() {
		System.out.println(peliculas.stream().map(p -> p.toString()));
	}
	
	public List<Pelicula> sugerirPeliculas() {
		return sugerencia.sugerir(peliculas,peliculasReproducidas);
	}
	
	
	

}
