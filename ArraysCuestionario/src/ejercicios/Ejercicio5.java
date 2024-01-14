package ejercicios;

public class Ejercicio5 {

	public int mode(int[] lista) {

		java.util.Arrays.sort(lista);

		double numAnterior = lista[0];
		int vecesQueSeRepite = 0;
		int vecesMaxRepetidas = 0;
		int moda = lista[0]; //En caso de que el array solo tenga un elemento
	

		for (int i = 1; i < lista.length; i++) {
			if (lista[i] == numAnterior) {
				numAnterior = lista[i];
				vecesQueSeRepite++;
			}
			
			if(lista[i] != numAnterior) {
				numAnterior = lista[i];
				vecesQueSeRepite = 0;
			}
			
			if(vecesQueSeRepite > vecesMaxRepetidas) {
				moda = lista[i];
				vecesMaxRepetidas = vecesQueSeRepite;
			}
		}
		return moda;
	}
}


