package tareasEjerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del primer lado: ");
		float primerLado = sc.nextFloat();
		
		System.out.println("Introduce la longitud del segundo lado: ");
		float segundoLado = sc.nextFloat();
		
		sc.close();
		float perimetro = 2*primerLado + 2*segundoLado;
		float area = primerLado*segundoLado;
		/*MOSTRAMOS POR PANTALLA*/
		System.out.println("Longitud del primer lado: " + primerLado);
		System.out.println("Longitud del segundo lado: " + segundoLado);
		System.out.println("================================");
		System.out.println("Perímetro: " + perimetro + " Área: " + area);
		System.out.println("================================");
	}
}
