package forExplicacion;

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
		
		
		for (int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
		for (int j=1, sumaImpares = 0; j<=100; j+=2) {
			sumaImpares+=1;
			System.out.println(j + " Numero de impares: " + sumaImpares);
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		for(int i = 1; i<num; i++) {
			System.out.println(i);
		}
	}

}
