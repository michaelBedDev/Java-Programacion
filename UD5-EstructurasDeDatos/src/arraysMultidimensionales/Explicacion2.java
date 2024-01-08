package arraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Explicacion2 {

	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.print("\n");
		int array3D[][][];
		int x = pedirNumeroEntero("Introduce la primera dimensión: ");
		int y = pedirNumeroEntero("Introduce la segunda dimensión: ");
		int z = pedirNumeroEntero("Introduce la tercera dimensión: ");
		array3D = new int[x][y][z];
		inicializarArray3D(array3D);
		visualizar(array3D);
	}

	static void inicializarArray3D(int[][][] pArray) {
		Random r = new Random();
		for (int i = 0; i < pArray.length; i++) {
			for (int j = 0; j < pArray[i].length; j++) {
				for (int k = 0; k < pArray[i][j].length; k++) {
					pArray[i][j][k] = r.nextInt(11);
				}
			}
		}
	}

	static void visualizar(int[][][] pArray) {
		int numElementos = 0, sumaElementos = 0;
		for (int i = 0; i < pArray.length; i++) {
			for (int j = 0; j < pArray[i].length; j++) {
				for (int k = 0; k < pArray[i][j].length; k++) {
					System.out.print("\t" + pArray[i][j][k]);
					numElementos++;
					sumaElementos += pArray[i][j][k];
				}
				System.out.print("\n");
			}
			System.out.print("\n\n");
		}
		System.out.printf("La media de los elementos es %.2f", (double) sumaElementos / numElementos);
	}

	static int pedirNumeroEntero(String s) {
		int num;
		entrada = new Scanner(System.in);
		do {
			System.out.print(s);
			num = entrada.nextInt();
			if (num <= 0) {
				System.out.println("La dimensión de la matriz debe ser mayor que 0.\n");
			}
		} while (num <= 0);
		return num;
	}
}
