package ejercicios;

public class Ejercicio10 {

	public static boolean contains(int[] lista1, int[] lista2) {

		boolean contiene = false;
		if (lista1.length >= lista2.length) {
			contiene = probarSiContiene(lista1, lista2, contiene);
		}
		return contiene;
	}

	private static boolean probarSiContiene(int[] lista1, int[] lista2, boolean contiene) {
		for (int i = 0; i < lista1.length; i++) {
			if (lista1[i] == lista2[0]) {

				for (int j = 0; j < lista2.length; j++) {
					if (lista1[i + j] == lista2[j]) {
						contiene = true;
					} else {
						contiene = false;
						break;
					}
				}
				if (contiene == true) {
					return contiene;
				}
			}
			
			if ((lista1.length-i)<lista2.length) {
				return contiene;
			}
		}
		return contiene;
	}

	public static void main(String[] args) {
		System.out.println(contains(new int[]{8, 8, 8, 8, 4, 8, 8, 8, 8, 2, 8}, new int[]{8, 8, 8, 8, 8}));
	}
}
