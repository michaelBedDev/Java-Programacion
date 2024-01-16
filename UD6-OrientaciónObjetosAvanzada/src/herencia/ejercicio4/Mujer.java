package herencia.ejercicio4;

public class Mujer extends Persona {

	private boolean fueMadre;

	// Constructor
	public Mujer(int edad, boolean fueMadre) {
		super(edad);
		this.fueMadre = fueMadre;
	}

	// Getters & Setters
	public boolean isFueMadre() {
		return fueMadre;
	}

	public void setFueMadre(boolean fueMadre) {
		this.fueMadre = fueMadre;
	}

}
