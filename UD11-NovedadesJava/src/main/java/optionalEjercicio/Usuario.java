package optionalEjercicio;

import java.util.Objects;

public class Usuario {

	private String nombre;
	private String apellido;
	private String correoE;
	
	
	
	
	
	public Usuario(String nombre, String apellido, String correoE) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoE = correoE;
	}
	public Usuario() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreoE() {
		return correoE;
	}
	public void setCorreoE(String correoE) {
		this.correoE = correoE;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, correoE, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(correoE, other.correoE)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
}
