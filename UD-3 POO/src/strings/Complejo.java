package strings;

public class Complejo {

	private double real;
	private double imag;
	
	Complejo() {
		this.setReal(0);
		this.setImag(0);
	}
	Complejo(double real, double imag) {
		this.setReal(real);
		this.setImag(imag);
	}
	
	//SUMAR
	public void sumar(Complejo b) {
		this.real = this.real + b.real;
		this.imag = this.imag + b.imag;
	}
	public String convertirAString() {
		String numeroReal = String.valueOf(this.real);
		String numeroImag = String.valueOf(this.imag);
		String numero = numeroReal + "," + numeroImag;
		return numero;
	}
	
	
	//GETTERS & SETTERS
	public double getImag() {
		return imag;
		
	}
	public void setImag(double imag) {
		this.imag = imag;
		
	}
	public double getReal() {
		return real;
		
	}
	public void setReal(double real) {
		this.real = real;
		
	}
}
