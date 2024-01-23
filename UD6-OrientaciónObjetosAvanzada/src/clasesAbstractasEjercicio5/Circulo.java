package clasesAbstractasEjercicio5;

public class Circulo extends Figura{

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	protected double area() {
		
		return  Math.pow(Math.PI, 2)* radio;
	}
	
	
}
