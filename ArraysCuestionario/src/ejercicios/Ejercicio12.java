package ejercicios;

public class Ejercicio12 {

	public int[] append(int[] lista1, int[] lista2) {

		int[] lista3 = new int[lista1.length + lista2.length];

		for (int i = 0; i < lista1.length; i++) {
			lista3[i] = lista1[i];
		}

		for (int i = 0; i < lista2.length; i++) {
			lista3[lista1.length + i] = lista2[i];
		}

		return lista3;

	}
}
