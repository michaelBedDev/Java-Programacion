package ejercicios;

public class Ejercicio3 {

	public int countInRange(int[] lista, int minimo, int maximo) {
		int contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] >= minimo && lista[i] <= maximo) {
				contador++;
			}
		}
		return contador;
	}
}
