package ejercicios;

public class Ejercicio4 {

	public boolean isSorted(double[] lista) {
		double numAnterior = lista[0];
		boolean control = true;

		for (int i = 1; i < lista.length; i++) {
			if (lista[i] < numAnterior) {
				numAnterior = lista[i];
				control = false;
			} else {
				numAnterior = lista[i];
			}
		}
		return control;
	}
}
