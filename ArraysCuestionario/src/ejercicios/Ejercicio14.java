package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public class WordLengthCounter {

		public static void wordLengths(Scanner sc) {

			int longitudMaxima = 50;
			int[] contadorPalabras = new int[longitudMaxima + 1];

			while (sc.hasNext()) {
				String input = sc.next();

				String[] listaPalabras = input.split(" ");

				for (String p : listaPalabras) {

					int longitudPalabra = p.length();

					if (longitudPalabra <= longitudMaxima && longitudPalabra > 0) {
						contadorPalabras[longitudPalabra]++;
					}
				}
			}

			for (int i = 1; i <= longitudMaxima; i++) {
				int contador = contadorPalabras[i];
				// Solo mostramos las longitudes con al menos una palabra
				if (contador > 0) {
					System.out.print(i + ": " + contador + "\t" + "*".repeat(contador));
					System.out.println();
				}
			}
		}

	}

}
