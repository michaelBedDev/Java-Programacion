package forExplicacion;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		/*for(int a =0; a<4; a++){
			System.out.println(a);
		}
		for(int i=0, j=10; i<j;i++,j--) 
			 System.out.println("i y j valen:" + i + " y " + j);
*/
		/*EJERCICIOS 1, 2, 3
		 for(int i = 0; i<=100; i++) {
	
			System.out.println(i);
		}
		for(int j = 100; j>=0; j--) {
			System.out.println(j);
		}
		for(int sum = 0, suma=0; sum<=100; sum++) {
			suma += sum;
			System.out.println(suma);
		}
		*/
		
		/*EJERCICIOS 5 y 6
		for (int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
		for (int j=1, sumaImpares = 0; j<=100; j+=2) {
			sumaImpares+=1;
			System.out.println(j + " Numero de impares: " + sumaImpares);
		}
		*/
		
		/*EJERCICIO 7
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		for(int i = 1; i<num; i++) {
			System.out.println(i);
		}
		*/
		/*EJERCICIO 8
		System.out.println("Decimal\tBinario\tOctal\tHexadecimal");
		for(int i=0; i<=127;i++) {
			System.out.println(i + "\t" +Integer.toBinaryString(i) + "\t" + Integer.toOctalString(i) + "\t" + Integer.toHexString(i));
		}
		*/
		
		/*EJERCICIO 9
		int i = 50;
		while(i>=0) {
			System.out.print(i+" ");
			i-=2;
		}
		System.out.println();
		
		i=50;
		do {
			System.out.print(i+" ");
			i-=2;
		} while(i>=0);
		System.out.println();
		
		for(i=50;i>=0;i-=2) {
			System.out.print(i+" ");
		}
		*/
		
		/*EJERCICIO 10
		for(int i=1;i<=1024;i<<2) {
			System.out.print(i+" ");
			
		}
		*/
		
		/*EJERCICIO 11
		Random rand = new Random();
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(rand.nextInt(1,7) + " ");
			}
			System.out.println();
		}
		*/
		
		/*EJERCICIO 12
		Random rand = new Random();
		int acumular1=0,acumular2=0,acumular3=0,acumular4=0,acumular5=0,acumular6=0;
		for (int i=0; i<=6000000;i++) {
			
			switch (rand.nextInt(1, 7)){
			
				case 1: 
					acumular1++;
					break;
				case 2: 
					acumular2++;
					break;
				case 3: 
					acumular3++;
					break;
				case 4: 
					acumular4++;
					break;
				case 5: 
					acumular5++;
					break;
				case 6: 
					acumular6++;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + rand.nextInt(1, 7));
			}
		}
		System.out.println(acumular1);
		System.out.println(acumular2);
		System.out.println(acumular3);
		System.out.println(acumular4);
		System.out.println(acumular5);
		System.out.println(acumular6);
		*/
		
		/*EJERCICIO 13
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int seleccion;
		do {
			System.out.println("Qué cara escoges? [1]Cara o [2]Cruz. \n[0] para Salir");
			do {
				seleccion = Integer.parseInt(sc.nextLine()); //Revisable para Strings
			} while(seleccion>-1 && seleccion <-4);
			
			switch (seleccion) {
				case 1:
					System.out.println("Has escogido cara");
					System.out.println((rand.nextInt(1, 3)==seleccion) ? "Has Ganado":"Has Perdido");
					break;
				
				case 2:
					System.out.println("Has escogido cruz");
					System.out.println((rand.nextInt(1, 3)==seleccion) ? "Has Ganado":"Has Perdido");
					break;
			}
			System.out.println();
		} while (seleccion!=0);
		sc.close();
		*/
		
		/*EJERCICIO 14
		for(int i=10; i<=35; i+=10) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+j);
			}
		}
		*/
		
		/*EJERCICIO 15
		for(int j=2; j<=4;j++) {
			for(int i=1;i<=10;i++) {
				System.out.print(j*i + " ");
			}
			System.out.println();
		}
		*/
		
		
		/*EJERCICIO 17
		Potencia.elevarPotencia(2, 10);
		*/
		
		
		/*EJERCICIO 20
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*EJERCICIO 21 BASTANTE DIFICIL necesario ENTENDER
		for(int i=10;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=10;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}
}


