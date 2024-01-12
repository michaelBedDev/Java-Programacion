package explicacionStatic;

public class RacionalEjercicio3 {

	int numerador;
	int denominador;

	RacionalEjercicio3(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	static RacionalEjercicio3 multiplicar(RacionalEjercicio3 r1, RacionalEjercicio3 r2) {

		RacionalEjercicio3 r3 = new RacionalEjercicio3(0, 0);
		r3.numerador = r1.numerador * r2.numerador;
		r3.denominador = r1.denominador * r2.denominador;

		return r3;
	}

	public static void main(String[] args) {
		RacionalEjercicio3 r1 = new RacionalEjercicio3(3, 4);
		RacionalEjercicio3 r2 = new RacionalEjercicio3(1, 2);
		RacionalEjercicio3 r3 = new RacionalEjercicio3(1, 1);
		r3 = RacionalEjercicio3.multiplicar(r1, r2);
		System.out.println("MUTIPLICACIÓN DE NÚMEROS RACIONALES");
		System.out.println("r1 vale: " + r1.numerador + "/" + r1.denominador);
		System.out.println("r2 vale: " + r2.numerador + "/" + r2.denominador);
		System.out.println("r3 vale: " + r3.numerador + "/" + r3.denominador);
	}

}
