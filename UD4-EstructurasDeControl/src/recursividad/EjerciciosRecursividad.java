package recursividad;

import java.util.Scanner;

public class EjerciciosRecursividad {

	public static void main(String[] args) {

		
		EjerciciosRecursividad suma = new EjerciciosRecursividad();
		
		//EJERCICIO 1
		/*System.out.println("La suma total es: " + suma.sumarTotal());*/
	
		//EJERCICIO 2
		/*int posicionFibo;
		do {
			System.out.println("Introduce el numero en la cadena Fibo:");
			Scanner sc = new Scanner(System.in);
			posicionFibo = sc.nextInt();
		} while (posicionFibo<=0);

		System.out.println("La suma final es " + suma.calcularFibonacci(posicionFibo));*/

		//EJERCICIO 3
		/*int base = 2;
		int exponente = 5;
		System.out.println(base + " elevado a la " + exponente + "= " + suma.calcularPotencia(base, exponente));
		*/
	}

	//METODO 1
	/*int sumarTotal() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el num: ");
		int x = sc.nextInt();

		
		if (x==0) {
			System.out.println("Se ingresó 0");
			System.out.println("Fin!");
			return x;	
		}
		
		int acumulador = x + sumarTotal();
		return acumulador;
			
	}*/
		
	//METODO 2 REVISAR
	 /*int calcularFibonacci(int posicionFibo) {
		 
		 if (posicionFibo <= 1) {
			 return posicionFibo;
		 }
		 int sumaFinal = calcularFibonacci(posicionFibo-1) + calcularFibonacci(posicionFibo-2);
		return sumaFinal;
	 }
	*/
	
		
	//METODO 3 ENTENDER
	/*public int calcularPotencia(int base, int exponente) {
		
		if (exponente == 0) {
			return 1;
		} else {
			return base * calcularPotencia(base, exponente -1);
		}
	}
	*/
}
	
		 
		


