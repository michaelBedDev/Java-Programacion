package ejerciciosEntradaSalida;

import java.util.Scanner;

public class Ejercicio3EntradaSalida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad inicial en €: ");
		float euros = sc.nextFloat();
		
		System.out.println("Introduce la tasa de interés: ");
		float interés = sc.nextFloat();
		
		System.out.println("Introduce la cantidad de años: ");
		int años = sc.nextInt();

		sc.close();
		
		/*FORMULA*/
		float capitalFinal = (float) (euros * Math.pow(1+(interés/100), años));
		
		/*MOSTRAMOS POR PANTALLA*/
		System.out.println();
		System.out.println("Capital inicial (€): " + euros);
		System.out.println("Interés anual (%): " + interés);
		System.out.println("Años (a): " + años);
		System.out.println("*".repeat(33));
		System.out.printf("* Capital inicial: %10.2f € *%n",euros);
		System.out.printf("* Interés anual: %14.2f *%n", interés);
		System.out.printf("* Periodo: %17d  a *%n", años);
		System.out.printf("* Capital final: %12.2f € *%n", capitalFinal);
		System.out.printf("* Rendimiento: %14.2f € *%n", capitalFinal - euros);
		System.out.println("*".repeat(33));
	}


}
