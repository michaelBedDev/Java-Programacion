package data;

import java.util.Date;
import java.util.Objects;

public class Contacto {

	private String id;
	private String nombre;
	private double telefono;
	private Date fechaNacimiento;
	private String email;
	private Direccion direccion;
	
	
	
	
	
	
	
	
	
	
	
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contacto(String nombre, double telefono, Date fechaNacimiento, String email, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTelefono() {
		return telefono;
	}
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", email=" + email + ", direccion=" + direccion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nombre, telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(telefono) == Double.doubleToLongBits(other.telefono);
	}
}
