package herenciaEjercicio4;

public class Persona {

	protected int edad;

	// Constructor
	public Persona(int edad) {

		this.edad = (edad >= 65) ? 65 : edad;
	}

	// Getters & Setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
