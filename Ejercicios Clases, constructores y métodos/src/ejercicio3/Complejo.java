package ejercicio3;

public class Complejo {

	private double real;
	private double imag;
	
	
	
	//CONSTRUCTORES
	public Complejo() {}
	public Complejo(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	//toString + cast to in Imag
	public String toString() {
		return "El número complejo es " + real + "+" + (int)imag + "i";
	}
	
	//Suma parte real + parte real e imag + imag
	public void sumar(Complejo b) {
		setReal(this.real+b.real);
		setImag(this.imag+b.imag);
	}
	
	
	//GETTERS & SETTERS
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}

}
