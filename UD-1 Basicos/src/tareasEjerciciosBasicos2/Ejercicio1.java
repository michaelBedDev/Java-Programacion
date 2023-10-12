package tareasEjerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el número de días deseado: ");
	int dias = sc.nextInt();
	
	System.out.println("Introduce el número de horas deseado: ");
	int horas = sc.nextInt();
	
	System.out.println("Introduce el número de minutos deseado: ");
	int minutos = sc.nextInt();
	
	System.out.println("Introduce el número de segundos deseado: ");
	int segundos = sc.nextInt();
	
	sc.close();
	
	int segundos_totales = dias*24*60*60 + horas*60*60 + minutos*60 + segundos;
	System.out.println(dias + " dias, "+ horas + " horas," + 
	minutos + " minutos y " + segundos + " segundos son " + segundos_totales + " segundos");

	}

}
