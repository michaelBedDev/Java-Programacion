package strings;

import java.util.Scanner;

public class Ejercicio2SubString {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número con una parte entera, coma y dos decimales ej. -2,7");
		String numero = teclado.nextLine();
		System.out.println(numero);
		System.out.println("Parte entera: " + numero.substring(0,numero.length()-3) + " Parte decimal: " + numero.substring(numero.length()-2, numero.length()));


		teclado.close();


	}

}
