package tareasEjerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*SOLICITAMOS NOTAS*/
		System.out.println("Nota del primer trimestre: ");
		float notaPrimerTrimestre = sc.nextFloat();
		System.out.println("Nota del segundo trimestre: ");
		float notaSegundoTrimestre = sc.nextFloat();
		System.out.println("Nota del tercer trimestre: ");
		float notaTercerTrimestre = sc.nextFloat();
		
		sc.close();
		
		/*CALCULAMOS Y MOSTRAMOS LA MEDIA*/
		float notaMedia =(notaPrimerTrimestre+notaSegundoTrimestre+notaTercerTrimestre)/3;
		
		System.out.println("La nota media es: "+ Math.round(notaMedia * 100.0) / 100.0);
		System.out.println("La nota final es: "+ Math.round(notaMedia));
		
		System.out.println(notaMedia >= 5 ? "Aprobado" : "Suspendido");
	}

}
