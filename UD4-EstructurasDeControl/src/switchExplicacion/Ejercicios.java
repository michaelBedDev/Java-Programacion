package switchExplicacion;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		/*
		System.out.println("Teclea un número de mes (1-12)");
		Scanner teclado = new Scanner(System.in);
		String mesElegido;
		int mes = teclado.nextInt();
		
		switch(mes) {
			case 1:
				mesElegido = "Enero"; 
				break;
			case 2:
				mesElegido = "Febrero";
				break;
			case 3:
				mesElegido = "Marzo";
				break;
			case 4:
				mesElegido = "Abril";
				break;
			case 5:
				mesElegido = "Mayo";
				break;
			case 6:
				mesElegido = "Junio";
				break;
			case 7:
				mesElegido = "Julio";
				break;
			case 8:
				mesElegido = "Agosto";
				break;
			case 9:
				mesElegido = "Septiembre";
				break;
			case 10:
				mesElegido = "Octubre";
				break;
			case 11:
				mesElegido = "Noviembre";
				break;
			case 12:
				mesElegido = "Diciembre";
				break;
			default:
				mesElegido = "Error Entrada";
				System.out.println("Escoge un número entre 1 y 12");
				break;
		}
		
		System.out.println(mes);
		System.out.println("mes en String: " + mesElegido);
		*/
		
		
		//EJERCICIO 2
		/*
		System.out.println("Teclea un mes: ");
		Scanner teclado = new Scanner(System.in);
		String mes = teclado.nextLine();
		int numMes;
		
		switch (mes) {
			case "Enero":
				numMes = 1;
				break;
			case "Febrero":
				numMes = 2;
				break;
			case "Marzo":
				numMes = 3;
				break;
			case "Abril":
				numMes = 4;
				break;
			case "Mayo":
				numMes = 5;
				break;
			case "Junio":
				numMes = 6;
				break;
			case "Julio":
				numMes = 7;
				break;
			case "Agosto":
				numMes = 8;
				break;
			case "Septiembre":
				numMes = 9;
				break;
			case "Octubre":
				numMes = 10;
				break;
			case "Noviembre":
				numMes = 11;
				break;
			case "Diciembre":
				numMes = 12;
				break;
			default:
				numMes = 0;
				System.out.println("Introduce un mes correctamente");
				break;
		}
		
		System.out.println(mes + " es el número " + numMes);
		*/
		
		
		//EJERCICIO 3
		
		/*System.out.println("Teclea una letra del abecedario");
		Scanner sc = new Scanner(System.in);
		char letra = sc.next().charAt(0);
		
		switch (letra) {
			case 'a':
			case 'A':
				System.out.println("A de Alemania"); break;
			case 'e':
			case 'E':
				System.out.println("E de España");	break;
			case 'i':
			case 'I':
				System.out.println("I de Italia"); break;
			case 'o':
			case 'O':
				System.out.println("O de Omán"); break;
			case 'u':
			case 'U':
				System.out.println("U de Uzbekistán"); break;
			default:
				System.out.println("No es una vocal");
		}
		*/
		
		
		//EJERCICIO 4
		/*
		int x = 20;

		 if (x == 5){
			 System.out.println(5);
		 }else if (x == 4) {
			 System.out.println(4);
		 }else if (x == 3) {
			 System.out.println(3);
		 }else if (x == 2) {
			 System.out.println(2);
		 }else if (x == 1) {
			 System.out.println(1);
		 }else {
			 System.out.println("el número inicial no está entre uno y cinco" );
		 }
		 */
		
		//EJERCICIO 5
		
		 int month = 2;//cambiamos month para probar switch
		 int year = 2000;
		 int numDays = 0;
		 switch (month) {
			 case 1:
				 numDays = 31; break;
			 case 2:
				 if (year%400==0) {
					 numDays = 29;
				 }else if (year%100==0 & year%400!=0) {
					 numDays = 29;
				 }else if (year%4==0 && year%100!=0) {
					 numDays = 28;
				 }else if(year%4!=0) {
					 numDays = 28;
				 }
				 break;
			 case 3:
				 numDays = 31; break;
			 case 4:
				 numDays = 30; break;
			 case 5:
				 numDays = 31; break;
			 case 6:
				 numDays = 30; break;
			 case 7:
				 numDays = 31; break;
			 case 8:
				 numDays = 31; break;
			 case 9:
				 numDays = 30; break;
			 case 10:
				 numDays = 31; break;
			 case 11:
				 numDays = 30; break;
			 case 12:
				 numDays = 31; break;
		 }
		 System.out.println("Number of Days = " + numDays);
		
			
	
		 

	}
	

}
