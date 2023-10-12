package tareasEjerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*CONVERSOR DE CELSIUS A FARHENHEIT*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la temperatura en ºC: ");
		float celsius = sc.nextFloat();
		
		sc.close();
		System.out.println(celsius + "ºC son " + (celsius*1.8+32)+ " ºF");
	}

}
