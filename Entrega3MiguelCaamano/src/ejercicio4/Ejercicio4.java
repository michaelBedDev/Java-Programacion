package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char caracterUsuario = teclado.next().charAt(0);
	
		System.out.println("Escribe lo que quieras. <> para finalizar");
		String acumuladorCaracter = "";
		String linea;
		do {
			linea = teclado.nextLine();
			acumuladorCaracter += linea ;
			
		} while(!linea.contains("<>"));
		
		int contadorCaracter=0;
		for (int i = 0; i<acumuladorCaracter.length(); i++) {
			if (caracterUsuario == acumuladorCaracter.charAt(i)) 
				contadorCaracter++;
		}
		
		System.out.printf("Apariciones de '%c': %d", caracterUsuario, contadorCaracter);
	}

}
