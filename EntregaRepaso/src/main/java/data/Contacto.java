package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Contacto {

	private String id;
	private String nombre;
	private int telefono;
	private Date fechaNacimiento;
	private String email;
	private ArrayList<Direccion> direccion;

	public Contacto() {
		super();
		direccion = new ArrayList<>();
	}

	public Contacto(String nombre, int telefono, Date fechaNacimiento, String email, ArrayList<Direccion> direccion) {
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

	public void setTelefono(int telefono) {
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

	public ArrayList<Direccion> getDireccion() {
		return direccion;
	}

	public void setDireccion(ArrayList<Direccion> direccion) {
		this.direccion = direccion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addDireccionToContacto(Direccion d) {
		this.direccion.add(d);
	}

	public void addDireccionesToContacto(ArrayList<Direccion> listaDirecciones) {
		for (Direccion d : listaDirecciones) {
			addDireccionToContacto(d);
		}
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
