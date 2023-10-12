package entrega;

import java.util.Scanner;

public class EjercicioBasico5 {

	public static void main(String[] args) {
		
		/*PROGRAMA IMC*/
		Scanner sc = new Scanner(System.in);
		
		/*RECOGEMOS LOS DATOS POR TECLADO*/
		System.out.println("Introduce los siguientes datos: Altura en m (Usa la coma)");
		float altura = sc.nextFloat();
		System.out.println("Peso en kg");
		float peso = sc.nextFloat();
		
		sc.close();
		
		/*FORMULA IMC*/
		float imc = peso/(altura*altura);
		
		/*MOSTRAMOS LOS DATOS POR TECLADO*/
		System.out.println("peso: "+peso+"kg");
		System.out.println("altura: "+altura+"m");
		System.out.println("IMC: "+imc);
		System.out.println();
		System.out.println("TABLA IMC");
		System.out.println("Delgado: <18.5");
		System.out.println("Normal: entre 18.5 y 24.9");
		System.out.println("Sobrepeso: entre 25 y 29.9");
		System.out.println("Obeso: 30 o más");
	}

}
