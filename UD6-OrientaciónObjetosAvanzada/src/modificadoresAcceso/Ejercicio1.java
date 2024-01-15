package modificadoresAcceso;

public class Ejercicio1 {

	private int numerador;
	private int denominador;

	Ejercicio1(int numerador, int denominador) {
		this.setNumerador(numerador);
		this.setDenominador(denominador);
	}

	static Ejercicio1 multiplicar(Ejercicio1 r1, Ejercicio1 r2) {
		Ejercicio1 resultado = new Ejercicio1(1, 1);
		resultado.setNumerador(r1.getNumerador() * r2.getNumerador());
		resultado.setDenominador(r1.getDenominador() * r2.getDenominador());
		return resultado;
	}

	public int getNumerador() {
		return numerador;

	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;

	}

	public int getDenominador() {
		return denominador;

	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;

	}
}

class Unidad4 {
	public static void main(String[] args) {
		Ejercicio1 r1 = new Ejercicio1(3, 4);
		Ejercicio1 r2 = new Ejercicio1(1, 2);
		Ejercicio1 r3 = new Ejercicio1(1, 1);
		r3 = Ejercicio1.multiplicar(r1, r2);
		System.out.println("MUTIPLICACIÓN DE NÚMEROS RACIONALES");
		System.out.println("r1 vale: " + r1.getNumerador() + "/" + r1.getDenominador());
		System.out.println("r2 vale: " + r2.getNumerador() + "/" + r2.getDenominador());
		System.out.println("r3 vale: " + r3.getNumerador() + "/" + r3.getDenominador());
	}
}
