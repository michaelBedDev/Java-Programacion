package centroAcademico;

import java.util.Objects;

public class Asignatura {

	private String codigo;
	private String nombre;
	private String creditos;

	protected Asignatura() {
		super();
	}

	protected Asignatura(String codigo, String nombre, String creditos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Asignatura))
			return false;
		Asignatura subject = (Asignatura) obj;
		return this.getCodigo() == subject.getCodigo();
	}

	// Getters & Setters
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
}
