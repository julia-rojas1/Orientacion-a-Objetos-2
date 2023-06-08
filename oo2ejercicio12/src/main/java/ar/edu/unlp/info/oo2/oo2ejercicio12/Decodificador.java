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
		return sugerencia.sugerir(this);
	}
	
	public List<Pelicula> peliculasSinReproducirOrdenadasFecha() {
		return peliculas.stream()
				.filter(p -> !peliculasReproducidas.contains(p))
				.sorted((p1,p2) -> p2.getAñoDeEstreno().compareTo(p1.getAñoDeEstreno()))
				.collect(Collectors.toList());
	}
	
	public List<Pelicula> peliculasSimilaresAReproducidasOrdenadasFecha() {
		return peliculasReproducidas.stream()
				.map(p -> p.getSimiliares())
				.flatMap(lista -> lista.stream()) //para tener una única lista
				.distinct() //para eliminar los repetidos
				.filter(p -> !peliculasReproducidas.contains(p))
				.sorted((p1,p2) -> p2.getAñoDeEstreno().compareTo(p1.getAñoDeEstreno()))
				.collect(Collectors.toList());
		
	}
	
	public List<Pelicula> peliculasMayorPuntajeOrdenadasFecha() {
		return peliculas.stream()
				.filter(p -> !peliculasReproducidas.contains(p))
				.sorted((p1,p2) -> p2.getAñoDeEstreno().compareTo(p1.getAñoDeEstreno()))
				.sorted((p1,p2) -> Double.compare(p1.getPuntaje(), p2.getPuntaje()))
				.collect(Collectors.toList());
	}
	
	

}
