package data;

import java.util.Objects;

public class Participante implements IUnique{

	private String id;
	private String nombre;
	private String apellidos;
	private char sexo;
	private int edad;
	private Categoria categoria;

	public Participante() {
		super();
		generateID();
	}


	public Participante(String nombre, String apellidos, char sexo, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		generateID();
		this.categoria = Categoria.getCategoria(edad);
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
		return "Participante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo
				+ ", edad=" + edad + ", categoria=" + categoria + "]";
	}

	@Override
	public void generateID() {
		this.id = "P" + (int)(Math.random()*1000);
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, categoria, edad, nombre, sexo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(apellidos, other.apellidos) && categoria == other.categoria && edad == other.edad
				&& Objects.equals(nombre, other.nombre) && sexo == other.sexo;
	}
	
	
}
