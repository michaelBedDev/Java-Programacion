package apuntes2CreacionCoche;

class Cuenta{
	private String titular;
	private double saldo;
	public String getTitular(){
	return titular;
	}
	//No setTitular porque es inmutable
	public double getSaldo(){
	return saldo;
	}
}
	/* No setSaldo porque se modifica con ingresos
	y reintegros */
