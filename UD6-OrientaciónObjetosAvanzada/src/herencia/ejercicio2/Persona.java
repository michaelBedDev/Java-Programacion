package herencia.ejercicio2;

public class Persona {

	protected String DNI;
	protected String nombre;
	protected String dirección;
	
	public Persona(String DNI, String nombre, String dirección) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.dirección = dirección;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + nombre + ", Dirección=" + dirección + "]";
	}
	
	
	
	
	
}
