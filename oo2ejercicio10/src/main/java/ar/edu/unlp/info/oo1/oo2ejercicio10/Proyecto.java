package ar.edu.unlp.info.oo1.oo2ejercicio10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int nroIntegrantes;
	private double montoIntegrante;
	private double margenGanancia;
	
	private Etapa etapa;
	
	public Proyecto (String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int integrantes, double montoInt, double margen) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.nroIntegrantes = integrantes;
		this.montoIntegrante = montoInt;
		this.margenGanancia = margen;
		
		this.etapa = new EnConstruccion();
	}
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	public Etapa getEtapa() {
		return etapa;
	}
	
	public long getDias() {
		return ChronoUnit.DAYS.between(fechaInicio,fechaFin);
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobada(this,this.precioTotal());
	}
	
	public double costoTotal() {
		return nroIntegrantes*montoIntegrante*getDias();
	}
	
	public double precioTotal() {
		return this.costoTotal() + margenGanancia*this.costoTotal()/100;
	}
	
	public void actualizarMargen(int nuevoMargen) {
		this.margenGanancia = nuevoMargen;
	}
	
	public void modificarMargen(int nuevoMargen) {
		this.etapa.modificarMargen(this,nuevoMargen);
	}
	
	public void cancelado() {
		this.objetivo = "(Cancelado)";
	}
	
	public void cancelar() {
		this.etapa.cancelar(this);
	}
}
