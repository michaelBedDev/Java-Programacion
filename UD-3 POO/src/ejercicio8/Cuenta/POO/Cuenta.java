package ejercicio8.Cuenta.POO;

public class Cuenta {

	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	
	//CONSTRUTORES
	Cuenta() {}
	Cuenta (String numeroCuenta, String titular, double saldo) {
	this.numeroCuenta = numeroCuenta;
	this.titular = titular;
	this.saldo = saldo;
	}

	
	
	
	//GETTERS AND SETTERS
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
