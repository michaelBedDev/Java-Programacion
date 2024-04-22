package db_tarea_ud9;

public class Autor {

	private int idAutor;
	private String dni;
	private String apellidos;
	private String nombre;
	
	
	
	
	
	
	
	
	
	
	
	public Autor() {
		super();
	}
	
	public Autor(int idAutor, String dni, String apellidos, String nombre) {
		super();
		this.idAutor = idAutor;
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", dni=" + dni + ", apellidos=" + apellidos + ", nombre=" + nombre + "]";
	}
}
