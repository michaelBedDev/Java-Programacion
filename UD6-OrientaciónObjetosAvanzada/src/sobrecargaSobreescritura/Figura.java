package sobrecargaSobreescritura;

public class Figura {
	protected double dim1;
	protected double dim2;
	
	
	public Figura(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}



	protected double area() {
		return 0;
	}
}
