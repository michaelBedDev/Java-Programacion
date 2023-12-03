package tareaRepasoCientificos;

public enum Experiencia { 
	ALTA(50), MEDIA(25), BAJA(10);

	private final int cuantaExperiencia;
	
	//Constructores
	Experiencia(int cuantaExperiencia) {
		this.cuantaExperiencia = cuantaExperiencia;
	}

	//Getters & Setters
	public int getCuantaExperiencia() {
		return cuantaExperiencia;
	}
}
