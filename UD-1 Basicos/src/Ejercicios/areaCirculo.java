package Ejercicios;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el radio del círculo en cm:");
		float radioCirculo = sc.nextFloat();
	
		
		double areaCirculo = radioCirculo * radioCirculo * Math.PI;
		System.out.println("El área de tu círculo es de " +areaCirculo +"cm2");
		
		sc.close();
		
		

	}

}
