package sobrecargaSobreescritura;

public class Rectangulo extends Figura {

	
	
	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
		//TODO Auto-generated constructor stub
	}

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return dim1*dim2;
	}


		
	
		
	

	
}
