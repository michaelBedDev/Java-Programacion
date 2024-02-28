package tiposGenericosEjercicio1;

public class Persona {

	private String nombre;

	public Persona(String string) {
		super();
		this.nombre = string;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}
