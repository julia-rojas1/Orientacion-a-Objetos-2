package ar.edu.info.unlp.ejercicioDemo;

public class Tweet {
	private String texto;
	private Tweet origen;
	
	public Tweet(String texto,Tweet origen) {
		this.texto = texto;
		this.origen = origen;
	}
	
	public void informarTexto() {
		System.out.println(texto);
	}
	
	public String getTexto() {
		return texto;
	}
}
