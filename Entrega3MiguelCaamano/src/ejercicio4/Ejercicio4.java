package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char caracterUsuario = teclado.next().charAt(0);
	
		System.out.println("Escribe lo que quieras. <> para finalizar");
		String finalizar = "<>";
		String acumuladorCaracter = "";
		String linea;
		do {
			linea = teclado.nextLine();
			acumuladorCaracter = acumuladorCaracter + " " + linea ;
			
		} while(linea.indexOf(caracterUsuario)!=0);
		
		int a = acumuladorCaracter.length();
		for(; a>0;a--) {
			
		}
	}

}
