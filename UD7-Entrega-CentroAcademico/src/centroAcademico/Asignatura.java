package centroAcademico;

import java.util.LinkedList;
import java.util.Objects;

public class Asignatura implements Comparable{

	private String codigo;
	private String nombre;
	private String creditos;
	
	LinkedList <Alumno> listaAlumnosMatriculados;
	
	protected Asignatura() {
		super();
		listaAlumnosMatriculados = new LinkedList<>();
	}

	protected Asignatura(String codigo, String nombre, String creditos, LinkedList<Alumno> listaAlumnosMatriculados) {
		super();
		listaAlumnosMatriculados = new LinkedList<>();
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.listaAlumnosMatriculados = listaAlumnosMatriculados;
	}

	
	
	
	
	@Override 
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	@Override //Repasar
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if(!(obj instanceof Asignatura ))
			return false;
		Asignatura subject = (Asignatura) obj;
		return this.getCodigo() == subject.getCodigo();
	}
	
	
	//Getters & Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	public LinkedList<Alumno> getListaAlumnosMatriculados() {
		return listaAlumnosMatriculados;
	}

	public void setListaAlumnosMatriculados(LinkedList<Alumno> listaAlumnosMatriculados) {
		this.listaAlumnosMatriculados = listaAlumnosMatriculados;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
