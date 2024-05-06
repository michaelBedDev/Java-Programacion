package data;

public class Participante {

	private String nombre;
	private String apellidos;
	private char sexo;
	private int edad;
	private Categoria categoria;
	
	
	
	
	
	public Participante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participante(String nombre, String apellidos, char sexo, int edad, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.categoria = categoria;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", edad=" + edad
				+ ", categoria=" + categoria + "]";
	}
}
