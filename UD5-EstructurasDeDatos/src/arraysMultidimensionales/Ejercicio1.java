package arraysMultidimensionales;

public class Ejercicio1 {

	
	
	
	//HACER 
	public static void main(String[] args) {

		int[][] arrayDosD = new int[3][];

		arrayDosD[0] = new int[4];
		arrayDosD[1] = new int[2];
		arrayDosD[2] = new int[3];
		
		//int [][] arrayDosD ={{0,2,4,6},{1,4},{2,6,10}} resultado

		System.out.println("cargamos e imprimimos arrayDosD[0]. Observa que su  tamaño es 4");

		for (int j = 0; j < 4; j++) { // utilizamos la variable j pero podría ser i, z, ....

			arrayDosD[0][j] = 0 * j + 0 + j * 2; // cargamos la matriz

			System.out.println("arrayDosD[0][" + j + "]=" + arrayDosD[0][j]);

		}

		System.out.println("\ncargamos e imprimimos arrayDosD[1]. Observa que su  tamaño es 2");

		for (int j = 0; j < 2; j++) {

			arrayDosD[1][j] = 1 * j + 1 + j * 2; // cargamos la matriz

			System.out.println("arrayDosD[1][" + j + "]=" + arrayDosD[1][j]);

		}

		System.out.println("\ncargamos e imprimimos arrayDosD[2]. Observa que su  tamaño es 3");

		// para ahondar en el concepto de referencia a array hago la ultima impresión
		// con paso intermedio

		int[] x = arrayDosD[2];

		for (int j = 0; j < 3; j++) {

			x[j] = 2 * j + 2 + j * 2; // cargamos la matriz

			System.out.println("arrayDosD[2][" + j + "]=" + x[j]);

		}

	}

}
