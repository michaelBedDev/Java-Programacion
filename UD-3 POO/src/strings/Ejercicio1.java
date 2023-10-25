package strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número con una parte entera, coma y parte decimal ej. -2,7");
		String numero = teclado.nextLine();
		System.out.println(numero);
		Scanner sc = new Scanner(numero);
		sc.useDelimiter(",");
		System.out.println("Parte entera: " + sc.next() + " 7Parte decimal: " + sc.next());

		teclado.close();
		sc.close();

	}

}
