package herenciaEjercicio3;

public class Circulo extends Figura{

	private double radio;

	

	//Constructor
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}




	//Getters & Setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
