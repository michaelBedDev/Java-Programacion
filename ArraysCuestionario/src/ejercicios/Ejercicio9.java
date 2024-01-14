package ejercicios;

public class Ejercicio9 {

	public boolean isUnique(int[] lista) {

		boolean unique = true;

		java.util.Arrays.sort(lista);
		

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				if (lista[i] == lista[j] && i != j) {
					unique = false;
				}
			}
		}

		return unique;
	}
}
