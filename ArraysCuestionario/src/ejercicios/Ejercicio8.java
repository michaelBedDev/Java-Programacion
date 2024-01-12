package ejercicios;

public class Ejercicio8 {

	public static double percentEven(int[] lista) {

		double contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				contador++;
			}
		}
		return (contador / lista.length) * 100;
	}
	
	
	public static void main(String[] args) {
		percentEven(new int[]{6, 2, 9, 11, 3});
	}
}
