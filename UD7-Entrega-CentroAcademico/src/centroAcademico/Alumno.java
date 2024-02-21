package centroAcademico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Alumno {
	
	private String numExp;
	private String nombre;

	private ArrayList <Asignatura> listaAsignaturas; //Sorted
	private HashMap <String,Double> mapaCalificaciones; //Asignatura.codigo , calificacion

	
	
	protected Alumno() {
		super();
		//Arreglar
		listaAsignaturas = new ArrayList<Asignatura>(new SortByAlphabetical());
		mapaCalificaciones = new HashMap<>();
	}
	
	protected Alumno(String numExp, String nombre, LinkedList<Asignatura> listaAsignaturas,
			HashMap<String, Double> mapaCalificaciones) {
		super();
		listaAsignaturas = new LinkedList<>();
		mapaCalificaciones = new HashMap<>();
		this.numExp = numExp;
		this.nombre = nombre;
		this.listaAsignaturas = listaAsignaturas;
		this.mapaCalificaciones = mapaCalificaciones;
	}
	
	
	
	
	@Override 
	public int hashCode() {
		return Objects.hash(numExp);
	}
	
	@Override //Repasar
	public boolean equals(Object obj) {
		
		if (obj == this)
			return true;
		if(!(obj instanceof Alumno ))
			return false;
		Alumno alumno = (Alumno) obj;
		return this.getNumExp() == alumno.getNumExp();
	}
	
	
	
	
	
	
	
	
	
	
	
	//Getters & Setters
	public String getNumExp() {
		return numExp;
	}
	public void setNumExp(String numExp) {
		this.numExp = numExp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LinkedList<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}
	public void setListaAsignaturas(LinkedList<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}
	public HashMap<String, Double> getMapaCalificaciones() {
		return mapaCalificaciones;
	}
	public void setMapaCalificaciones(HashMap<String, Double> mapaCalificaciones) {
		this.mapaCalificaciones = mapaCalificaciones;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [numExp=" + numExp + ", nombre=" + nombre + ", mapaCalificaciones=" + mapaCalificaciones + "]";
	}
	
	
}
