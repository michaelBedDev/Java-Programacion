package arraysMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	// Acabar
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Introduce un mes del año [1-12]");

		int month;
		do {
			month = sc.nextInt();
		} while (month < 0 || month > 13);

		int numDays = 0;
		numDays = escogerMes(month);

		int[][][] garaje = new int[12][][];
	

		// Llenar matriz
		for (int i = 0; i < garaje.length; i++) {
			for (int j = 0; j < garaje[i].length; j++) {
				for (int k = 0; k < 24; k++) {
					garaje[i][j][k] = rand.nextInt(0, 999);
				}
			}
		}

		// Imprimir mes a mes los valores de la matriz

		for (int i = 0; i < garaje.length; i++) {
			for (int j = 0; j < garaje[i].length; j++) {
				for (int k = 0; k < garaje[i][j].length; k++) {
					System.out.print("Hora " + k + ": " + garaje[i][j][k] + " coches. ");
				}
				System.out.println("Dia: " + (j + 1));
			}

			System.out.println("Mes Num: " + i);

		}
		
		
		
		for (int i = 0; i < garaje.length; i++) {
			for (int j = 0; j < garaje[i].length; j++) {
				for (int k = 0; k < garaje[i][j].length; k++) {
					
				}
			}
		}

	}
	
	
	
	
	
	
	
	//Mostrar el dia con mas coches

	// Metodo escoger mes
	private static int escogerMes(int month) {
		int numDays = 0;

		switch (month) {
			case 1:
				numDays = 31;
				break;
			case 2:
				numDays = 28;
				break;
			case 3:
				numDays = 31;
				break;
			case 4:
				numDays = 30;
				break;
			case 5:
				numDays = 31;
				break;
			case 6:
				numDays = 30;
				break;
			case 7:
				numDays = 31;
				break;
			case 8:
				numDays = 31;
				break;
			case 9:
				numDays = 30;
				break;
			case 10:
				numDays = 31;
				break;
			case 11:
				numDays = 30;
				break;
			case 12:
				numDays = 31;
				break;
		}
		return numDays;
	}

}
