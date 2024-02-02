package tryCatch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		
		boolean numberValid = true;
		
		do {
			System.out.println("Introduce un número entero: ");
			try {
				n = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Introduce un número entero de forma correcta");
				numberValid = false;
			} 
		} while (!numberValid);
		
		int factorial = n;
		String salida = n + "! = " + n;
		for (int i = n - 1; i > 0; i--) {
			salida += "*" + i;
			factorial *= i;
		}
		salida += " = " + factorial;
		System.out.println(salida);
	}
}
