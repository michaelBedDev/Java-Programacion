package herenciaEjercicio3;

public class Cuadrado extends Figura{

	private double lado;
	
	
	//Constructor
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	
	//Getters & Setters
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
