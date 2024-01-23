package sobrecargaSobreescritura.ejercicio3;

public class PerroEspecial extends Perro {

	private tipoPerro tipo;

	// Constructores
	public PerroEspecial(tipoPerro tipo) {
		super();
		this.setTipo(tipo);
	}

	public PerroEspecial(String nombre, double peso, String color, tipoPerro tipo) {
		super(nombre, peso, color);
		this.setTipo(tipo);
	}

	// Metodos

	// Getters & Setters
	public tipoPerro getTipo() {
		return tipo;

	}

	public void setTipo(tipoPerro tipo) {
		this.tipo = tipo;

	}

}

enum tipoPerro {
	Delgado, Gordo
}
