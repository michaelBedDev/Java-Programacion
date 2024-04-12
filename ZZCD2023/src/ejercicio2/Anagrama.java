package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	private static String pedirStringsPorTeclado(String textoPeticion) {
		Scanner input = new Scanner(System.in);
			System.out.print(textoPeticion);
			String str1 = input.nextLine();
			return str1;
		
	}
	
	public boolean comprobarAnagrama(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
    }
	
	public boolean run() {
		String str1 = pedirStringsPorTeclado("Introduce la primera cadena: ");
		String str2 = pedirStringsPorTeclado("Introduce la segunda cadena: ");
		return comprobarAnagrama(str1, str2);
	}
	
	public static void main(String[] args) {
		Anagrama anagrama = new Anagrama();
		System.out.println(anagrama.run() ? "Son anagramas" : "No son anagramas");
	}
}
