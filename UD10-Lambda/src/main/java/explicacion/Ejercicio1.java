package explicacion;

import java.util.Random;

import java.util.function.Function;

public class Ejercicio1 {

	@FunctionalInterface
	interface Ejercicio {
		public double divisorMasGrande(int num);
	}

	public static void main(String[] args) {
		Ejercicio ejemplo = num -> {
			int numero = 1;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					numero = i;
				}
			}
			return numero;
		};

		System.out.println("El divisor más grande es " + ejemplo.divisorMasGrande(12));
	}

}
