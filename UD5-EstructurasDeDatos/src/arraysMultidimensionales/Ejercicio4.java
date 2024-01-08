package arraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

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
				System.out.print(cuadrado[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Matriz2
		for (int i = 0; i < tamaño; i++) {
			int temp = cuadrado[i][i];
			cuadrado[i][i] = cuadrado[i][tamaño - 1 - i];
			cuadrado[i][tamaño - 1 - i] = temp;
		}

		// Imprimir matriz2
		imprimirMatriz(cuadrado);

	}

	
	
	
	//Metodo imprimir Matriz
	private static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
