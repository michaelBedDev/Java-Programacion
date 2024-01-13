package ejercicios;

public class Ejercicio7 {

	public static double median(double[] lista) {

		// ORDENAR
		java.util.Arrays.sort(lista);

		if (lista.length % 2 == 0) {

			double a = lista[lista.length / 2 - 1];
			double b = lista[(lista.length / 2)];
			return ((a + b) / 2);
		}

		return ((lista[Math.round(lista.length / 2)]));
	}

	public static void main(String[] args) {
		median(new double[] { 1.0, 2.0, 3.0, 4.0 });
	}
}
