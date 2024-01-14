package ejercicios;

public class Ejercicio13 {

	public static int[] cuentaVocales(String cadena) {
		int[] contadorVocales = new int[5];
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		cadena = cadena.toLowerCase();
		char[] cadenaChar = copiarStringToArray(cadena);

		for (int i = 0; i < cadenaChar.length; i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (cadenaChar[i] == vocales[j]) {
					contadorVocales[j]++;
				}
			}
		}

		return contadorVocales;
	}

	// Metodo pasar de String a Array
	// La cadena y el array deben de ser de la misma longitud
	public static char[] copiarStringToArray(String cadena) {

		char[] miLista = new char[cadena.length()];
		for (int i = 0; i < cadena.length(); i++) {
			miLista[i] = cadena.charAt(i);
		}

		return miLista;
	}

	public static void main(String[] args) {
		cuentaVocales("Pienso, luego existo");
	}
}
