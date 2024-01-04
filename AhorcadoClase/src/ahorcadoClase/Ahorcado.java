package ahorcadoClase;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	private static Random random = new Random();
	private static String[] listaPalabras = {"aaaaaaa","bbbbbb","ccasdfagh","ddasdahohgsadñiu","eereiugtwehr"};
	public static String palabra = listaPalabras [random.nextInt(0, listaPalabras.length - 1)];
	public static char letrasJugadas [] = new char [27];
	public static String palabraAsteriscos =  new String (new char[palabra.length()]).replace("/0","*");
	private static int contador = 0;
	private static Scanner sc;
	
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("JUEGO AHORCADO");
		System.out.println();
		
		jugarLetra();
	
		
	}
	
	
	private static void jugarLetra() {
		
		boolean letraRepetida; char letraEscogida;
		
		do {
			do {
				System.out.println("Jugar la letra");
				letraEscogida = sc.next().charAt(0);
				letraRepetida = false;
				
				for(char c : letrasJugadas) {
					
					if (c == '\0') {
						c = letraEscogida;
						break;
					}
					
					if (c == letraEscogida) {
						System.err.println("Letra Repetida");
						System.out.println("Por favor, introduce una nueva letra");
						letraRepetida = true;
						break;
					}	
				}
			} while (letraRepetida);
			
			//Arreglar
			boolean letraEstá = false;
			for(int i = 0; i<palabra.length(); i++){
				if (letraEscogida == palabra.charAt(i)) {
					palabraAsteriscos.replace(palabraAsteriscos.charAt(i), letraEscogida);
					letraEstá = true;
				}
			}
			
			if (letraEstá == false) {
				contador++;
				imprimirDibujo(contador);
			}

			
			System.out.println(palabraAsteriscos);
			
	    } while (contador < 10 || !palabraAsteriscos.equals(palabra));
		
		
		System.out.println(palabraAsteriscos.equals(palabra) ? "Enhorabuena! Has Ganado." : "Oh no, perdiste. Inténtalo de nuevo");			
	}
	
	private static void imprimirDibujo(int contador) {
		switch (contador) {
		case 1:
			System.out.println("+------");
			break;
		case 2:
			System.out.println("+\n|\n|\n|\n|\n+------");
			break;
		case 3:
			System.out.println("+----+\n|\n|\n|\n|\n+------");
			break;
		case 4:
			System.out.println("+----+\n|    |\n|\n|\n|\n+------");
			break;
		case 5:
			System.out.println("+----+\n|    |\n|    ()\n|\n|\n+------");
			break;
		case 6: 
			System.out.println("+----+\n|    |\n|    ()\n|    []\n|\n+------");
			break;
		case 7:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\n|\n+------");
			break;
		case 8:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|\n+------");
			break;
		case 9:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|    /\n+------");
			break;
		case 10:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|    /\\\n+------");
			break;
		}
	}
	
	
}
