package ifExplicacion;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		/*EJERCICIO 1 Y 2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclea número X: ");
		int x = sc.nextInt();
		System.out.println("Teclea número Y: ");
		int y = sc.nextInt();
		if (x == 10) {
			System.out.println("X vale " + x);
			System.out.println("x+y vale " + (x+y));
		}else {
			System.out.println("x NO vale 10");
			System.out.println("x-y vale " + (x-y));
		}
		*/
		
		/*EJERCICIO 3
		int x, y; 
		x=10;
		if (x== 10){
			y = 20;
			System.out.println("x:" + x + " y: " + y);
			x = y * 2;
			y++;
		 }
		
		 System.out.println("x:" + x);
		 System.out.println("y:" + y); "Y" no está inicializada en caso de else
		 */

		/*EJERCICIO 5
		System.out.println("Teclea una vocal: ");
		Scanner teclado = new Scanner(System.in);
		char letra =  teclado.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){ 
				if (letra == 'a'){
					System.out.println("A de Alemania");	
				}else if (letra == 'e') {
					System.out.println("E de España");	
				}else if (letra == 'i') {
					System.out.println("I de Italia");		
				}else if (letra == 'o') {
					System.out.println("O de Omán");	
				}else if (letra == 'u') {
					System.out.println("U de Uzbekistán");	
				}
		}else {
			System.out.println("No es una vocal");
		}
		*/
		
		/*EJERCICIO 6
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = teclado.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
			
		}
		*/
		
		/*EJERCICIO 8
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tres números enteros por teclado");
		int entero1 = sc.nextInt();
		int entero2 = sc.nextInt();
		int entero3 = sc.nextInt();
		
		if (entero1 >= entero2) {
			if(entero1 >= entero3) {		
				System.out.println(entero1);
			}else if(entero3 >= entero1) {
				System.out.println(entero3);
			}
		}else if(entero2>= entero3) {
			if(entero2>=entero1) {
				System.out.println(entero2);
			}
		}else {
			System.out.println(entero3);
		}
		*/
		
		//EJERCICIO 10
	     /*Scanner teclado= new Scanner(System.in);
		 int a,b,s=5;
		 System.out.println("a: ");
		 a=teclado.nextInt();
		 System.out.println("b: ");
		 b=teclado.nextInt();

		 if((a!=0) || (b!=0)) {
			 s+=(a+b);
		 }else if(a!=0) {
			 s+=a;
		 }else if(b!=0) {
			 s+=b;
		 }else {}
		 System.out.println("s: "+s);
		 */
		
		/*EJERCICIO 11
		Scanner teclado= new Scanner(System.in);
		int a,b,s=5;
		System.out.println("a: ");
		a=teclado.nextInt();
		System.out.println("b: ");
		b=teclado.nextInt();

		if(a==0) {
			if(b!=0) {
				s=s+b;
			}else if (b==0) {
				s++;
			}
		}
		System.out.println("s: "+s);
		*/

						
	}
}
