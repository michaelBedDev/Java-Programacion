package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Carrera {

	private String nombre;
	private LocalDate fecha;
	private double kms;
	private int[] premios;
	private ArrayList<Equipo> equipos;
	
	
	public Carrera() {
		super();
	}
	
	public Carrera(String nombre, LocalDate fecha, double kms, int[] premios, ArrayList<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.kms = kms;
		this.premios = premios;
		this.equipos = equipos;
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public int[] getPremios() {
		return premios;
	}

	public void setPremios(int[] premios) {
		this.premios = premios;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", fecha=" + fecha + ", kms=" + kms + ", premios="
				+ Arrays.toString(premios) + ", equipos=" + equipos + "]";
	}
}
