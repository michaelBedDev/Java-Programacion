package ejercicios;

public class Ejercicio2 {

	public static int range(int[] lista) {
		int mayor = lista[0];
		int menor = lista[0];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > mayor) {
				mayor = lista[i];
			}
			if (lista[i] < menor) {
				menor = lista[i];
			}
		}
		return (mayor - menor) + 1;
	}

	public static void main(String[] args) {
		System.out.println(range(new int[] { 8, 3, 5, 7, 2, 4 }));
	}
}
