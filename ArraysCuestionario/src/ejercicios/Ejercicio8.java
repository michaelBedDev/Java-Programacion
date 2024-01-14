package ejercicios;

public class Ejercicio8 {

	public static double percentEven(int[] lista) {

		double contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				contador++;
			}
		}
		if (contador != 0) {
			return contador * 100 / lista.length;
		}

		return 0;
	}
}
