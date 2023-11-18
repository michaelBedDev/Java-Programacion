package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void diamante(int n, char c) {
		
		if (n%2!=0 && (n>=1 && n<34)) {
			
			//Parte de arriba
			for(int j=1;j<=n;j+=2){ //i iteración vertical
				for(int i=n;i>j;i-=2) { 
					System.out.print(" "); //iteración espacio
				}
				for(int i=1; i<=j; i++) {
					System.out.print(c);   //iteración caracter
				}
				for(int i=n;i>j;i-=2) {
					System.out.print(" "); //iteración espacio
				}
				
				System.out.println();
			}
			
			//Parte de abajo, iteración contraria a la de arriba
			n-=2;
			for(int j=n;j>0;j-=2) {
				for(int i=n;i>=j;i-=2) { 
					System.out.print(" ");
				}
				for(int i=1;i<=j;i++) {
					System.out.print(c);
				}
				for(int i=n;i>=j;i-=2) {
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}else
			System.out.println("Altura del diamante no válida");
	}
	
	//Metodo main
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el caracter a imprimir");
		char caracter = scan.next().charAt(0);
	    System.out.println("Introduce la altura del diamante, en número");
	    int altura = scan.nextInt();
	   
		diamante(altura,caracter);
	}
}

