package ejercicios;

public class Ejercicio11 {

	public static int[] collapse(int[] lista) {

		int[] listaColapsada;
		if (lista.length % 2 == 0) {
			listaColapsada = new int[lista.length / 2];
		} else {
			listaColapsada = new int[lista.length / 2 + 1];
			listaColapsada[listaColapsada.length - 1] = lista[lista.length - 1];
		}

		for (int i = 0; i < lista.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < listaColapsada.length; j++) {
					if (listaColapsada[j] == 0) {
						listaColapsada[j] = lista[i] + lista[i + 1];
						break;
					}
				}
			}
		}
		return listaColapsada;
	}

	public static void imprimir(int[] listaColapsada) {
		for (int n : listaColapsada) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		imprimir(collapse(new int[] { 1, 2, 3, 4, 5 }));
	}
}
