package ejercicios;

public class Ejercicio1 {

	public int lastIndexOf(int[] lista, int n) {

		int posicion = -1;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == n) {
				posicion = i;
			}

		}
		return posicion;
	}
}
