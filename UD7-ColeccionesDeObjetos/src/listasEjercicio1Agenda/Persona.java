package listasEjercicio1Agenda;

public class Persona {

	
	
	private int telefono;
	private String nombre;
	

	protected Persona() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	protected Persona(int telefono, String nombre) {
		super();
		this.telefono = telefono;
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Persona [telefono=" + telefono + ", nombre=" + nombre + "]";
	}
	
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
