package Ejercicios;

import java.util.Scanner;

public class areaCuadradoDinamico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Longitud del lado del cuadrado en cm: ");
		float ladoCuadrado = sc.nextInt();
		
		float areaCuadrado = ladoCuadrado*ladoCuadrado;
		System.out.println("El área del cuadrado es: " + areaCuadrado + " cm");
		
		sc.close();
	}

}
