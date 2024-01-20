package sobrecargaSobreescritura.ejercicio3;

public class PerroEspecial extends Perro {

	private tipoPerro tipo;
	
	
	
	
	//Constructores
	public PerroEspecial(tipoPerro tipo) {
		super();
		this.setTipo(tipo);
	}

	public PerroEspecial(String nombre, double peso, String color, tipoPerro tipo) {
		super(nombre, peso, color);
		this.setTipo(tipo);
	}

	
	
	//Metodos
	private void alimentarEspecial(int comida) {
		this.peso += comida;
		//+ peso + comida - peso - comida alimentar todos nueva clase perro especial
		
	}

	
	
	
	
	
	
	//Getters & Setters
	public tipoPerro getTipo() {
		return tipo;
		
	}

	public void setTipo(tipoPerro tipo) {
		this.tipo = tipo;
		
	}
	
	
	
}

enum tipoPerro{
	Delgado, Gordo
}
