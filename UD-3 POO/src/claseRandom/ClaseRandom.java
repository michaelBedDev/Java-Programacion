package claseRandom;

import java.util.Random;
import java.util.Scanner;

public class ClaseRandom {
	public enum Moneda {CARA, CRUZ}
	
	public static void main(String[] args){
		Random numeroAleatorio= new Random();
		int aleatorio1= numeroAleatorio.nextInt();
		int aleatorio2=numeroAleatorio.nextInt();
		int aleatorio3=numeroAleatorio.nextInt();
		System.out.println("aleatorio1: "+aleatorio1);
		System.out.println("aleatorio2: "+aleatorio2);
		System.out.println("aleatorio3: "+aleatorio3);
		
		//EJERCICIO 1
		int tiradaDado = numeroAleatorio.nextInt(6);
		int tiradaDado2 = numeroAleatorio.nextInt(6);
		
		System.out.println(tiradaDado+1);
		System.out.println(tiradaDado2+1);
		
		//EJERCICIO 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De qué lado caerá la moneda?");
		System.out.println("0---Cara");
		System.out.println("1---Cruz");
		int inputDecision = sc.nextInt();
		
		Moneda decisionJugador = inputDecision == 0 ? Moneda.CARA : Moneda.CRUZ;
		
		int tiradaMoneda = numeroAleatorio.nextInt(2);
		System.out.println(tiradaMoneda == 0 ? Moneda.CARA : Moneda.CRUZ);
		System.out.println(tiradaMoneda == inputDecision ? "Has Ganado": "Has Perdido");
		
		
		
		}
	
}
