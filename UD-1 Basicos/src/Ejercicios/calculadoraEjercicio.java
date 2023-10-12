package Ejercicios;

import java.util.Scanner;



public class calculadoraEjercicio {

public enum operaciones {multiplicar, sumar, restar, dividir};

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca su primer número: ");
		float primerDato = sc.nextFloat();
		
		System.out.println("Introduzca el segundo número");
		float segundoDato = sc.nextFloat();
		
		System.out.println("Qué operación desea realizar? Pulse S/M/R/D");
		char operacionToRealizar = sc.next().charAt(0);
		
		if (operacionToRealizar == 'm') {
			float operacionResultante = primerDato * segundoDato;
			System.out.println("El resultado de tu operación es " +operacionResultante);
		}	
		else if (operacionToRealizar == 's') {
			float operacionResultante = primerDato + segundoDato;
			System.out.println("El resultado de tu operación es " +operacionResultante);
		}	
		else if (operacionToRealizar == 'r') {
			float operacionResultante = primerDato - segundoDato;
			System.out.println("El resultado de tu operación es " +operacionResultante);
		}	
		else if (operacionToRealizar == 'd') {
			float operacionResultante = primerDato / segundoDato;
			System.out.println("El resultado de tu operación es " +operacionResultante);
		}
		else 
			System.out.println("La operación a realizar no ha sido introducida correctamente. Por favor, vuelva a inicializar el programa.");
		
		sc.close();
	}

	//Este ejercicio ha sido realizado sin usar el public enum. Es necesario cambiarlo
	//También es necesario cambiar el código y hacerlo con switch en vez de if
	
	
}
