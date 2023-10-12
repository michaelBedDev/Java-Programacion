package tareasEjerciciosBásicos;

import java.util.Scanner;

public class EjercicioBasico1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		double A;
		char C;
		
		/*Introducimos las variables por pantalla*/
		System.out.println("Introduce por favor los valores de las siguientes variables: "
		+ "numero entero");
		N = sc.nextInt();
		System.out.println("numero decimal dividido por coma");
		A = sc.nextDouble();
		System.out.println("un caracter");
		C = sc.next().charAt(0);
		
		sc.close();
		
		/*Mostramos los datos*/
		System.out.println("Variable N: "+N);
		System.out.println("Variable A: "+A);
		System.out.println("Variable C: "+C);
		
		System.out.println((double)N + " + " + A + " = " + (N+A));
		System.out.println(A + " - " + (double)N + " = " + (A-N));
		System.out.println("Valor numérico del carácter a = "+ (int) C);
	}

}
