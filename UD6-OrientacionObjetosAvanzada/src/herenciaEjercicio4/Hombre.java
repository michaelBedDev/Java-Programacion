package herenciaEjercicio4;

public class Hombre extends Persona {

	private boolean hizoMili;

	// Constructor
	public Hombre(int edad, boolean hizoMili) {
		super(edad);
		this.hizoMili = hizoMili;
	}

	// Getters & Setters
	public boolean isHizoMili() {
		return hizoMili;
	}

	public void setHizoMili(boolean hizoMili) {
		this.hizoMili = hizoMili;
	}

}
