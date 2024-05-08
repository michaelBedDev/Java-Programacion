package data;

public class Participante {

	/* No cuento a participantes que no tengan equipo */
	private String nombre;
	private String apellidos;
	private char sexo;
	private int edad;
	private Categoria categoria;
	
	
	
	
	
	public Participante() {
		super();
	}
	
	public Participante(String nombre, String apellidos, char sexo, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	
	
	private void asignarCategoria(int edad) {
		if (edad < 7) {
			this.categoria = Categoria.BENJAMIN;
		} else if (edad > 7 && edad <= 10){
			this.categoria = Categoria.ALEVIN;
		} else if (edad > 10 && edad <= 12){
			this.categoria = Categoria.INFANTIL;
		} else if (edad > 12 && edad <=14){
			this.categoria = Categoria.CADETE;
		} else if (edad > 14 && edad <=18){
			this.categoria = Categoria.JUVENIL;
		} else {
			this.categoria = Categoria.SENIOR;
		}
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
