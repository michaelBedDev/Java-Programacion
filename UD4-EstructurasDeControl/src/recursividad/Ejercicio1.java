package recursividad;

import java.util.Scanner;

public class Ejercicio1 {

	/*Si n = 0 entonces
0! = 1
si n>0 entonces
n! = n * (n–1) * (n–2) * ... * 3 * 2 * 1
Tu programa tendrá el siguiente aspecto

Teclea num entero para calcular factorial
4
Su factorial es: 24
*/
	
	public static void main(String[] args) {
		
		System.out.println("Escribe un número para calcular factorial:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		Ejercicio1 obj = new Ejercicio1();

		System.out.println(obj.calcularFactorial(x));

	}
	
	public int calcularFactorial(int x) {
		if (x==0) {
			return 1;
		}else {	
			int variable = x*calcularFactorial(x-1);
			return variable;
		
		}
	}

}
