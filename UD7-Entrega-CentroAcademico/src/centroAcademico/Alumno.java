package centroAcademico;


import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class Alumno {
	
	private String numExp;
	private String nombre;

	private TreeSet<Asignatura> listaAsignaturas; //Sorted
	private HashMap <String,Double> mapaCalificaciones; //Asignatura.codigo , calificacion

	
	
	protected Alumno() {
		super();

		listaAsignaturas = new TreeSet<>(new SortByAlphabetical());
		mapaCalificaciones = new HashMap<>();
	}
	
	protected Alumno(String numExp, String nombre, TreeSet<Asignatura> listaAsignaturas,
			HashMap<String, Double> mapaCalificaciones) {
		super();
		listaAsignaturas = new TreeSet<>();
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
	
	@Override 
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
	public TreeSet<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}
	public void setListaAsignaturas(TreeSet<Asignatura> listaAsignaturas) {
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
