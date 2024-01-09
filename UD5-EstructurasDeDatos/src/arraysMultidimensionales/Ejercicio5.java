package arraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Tamaño de la matriz");
		int tamaño = sc.nextInt();
		System.out.println();

		// Matriz 1
		int[][] cuadrado = new int[tamaño][tamaño];
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				cuadrado[i][j] = rand.nextInt(10, 100);
			}
		}
		// Imprimir matriz ACABAR
		Ejercicio4.imprimirMatriz(cuadrado);
		
		for (int i =0; i < cuadrado.length; i++) {
			
				int temp = cuadrado[i][cuadrado.length-i-1];
				cuadrado[i][cuadrado.length-i-1] = cuadrado[cuadrado.length-i-1][i];
				cuadrado [cuadrado.length-i-1][i] = temp;
			
		}
		
		Ejercicio4.imprimirMatriz(cuadrado);

	}

}
