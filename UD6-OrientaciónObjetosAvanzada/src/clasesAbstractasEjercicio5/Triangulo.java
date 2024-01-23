package clasesAbstractasEjercicio5;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	protected double area() {
		
		return (base*altura)/2;
	}
	

}
