package whileExplicacion;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		/*
		//EJERCICIO 1
		int i = 0;
		while (i<=10) {
			System.out.print(i++);
		}
		System.out.println();
		
		
		//EJERCICIO 2
		int a=0;
		while (a<=10) {
			System.out.print(a+=2);
		}
		*/
		
		
		/*EJERCICIO 3
		int i=0;
		while (i<=10) {
			if(i%2==0) {
				System.out.println((i++)+" es par");
			}else {
				i++;
			}
		}
		*/
		
		
		/*EJERCICIO 4
		char a = 'a';
		while (a <= 122) {
			System.out.println(a++);
			
		}
		*/
		
		
		/*EJERCICIO 5
		int i=0;
		 while(++i<4){
			 System.out.println("iteración bucle exterior número " +i);
			 int j=0;
			 while(++j<3){
				 System.out.println("\titeración bucle interior número " +j);
			 }
		 }
		 */

		
		//EJERCICIO 6

		Scanner sc = new Scanner(System.in);
		String palabra;
		String ListaPalabras = "";
		palabra = "";
		
		while(!palabra.equals("fin")) {
			
			ListaPalabras += " " + palabra;
			System.out.println("Palabra: ");
			palabra = sc.next();
		}
		System.out.println(ListaPalabras);
		sc.close();
		
			
		
	}
}


