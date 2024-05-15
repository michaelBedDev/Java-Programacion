package data;

import java.util.Date;
import java.util.Objects;

public class Contacto {

	private String nombre;
	private double telefono;
	private Date fechaNacimiento;
	private String email;
	private Direccion direccion;
	
	
	
	
	
	
	
	
	
	
	
	
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
