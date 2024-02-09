package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class App {
//	Escribe un método denominado filterRange que reciba tres parámetros: 
//	un ArrayList de enteros, un valor min y un valor max. 
//	El método debe eliminar de la lista todos los elementos cuyo valor se encuentren en el rango [min, max]. 
//	Por ejemplo: Test: List lista = new ArrayList<>(Arrays.asList(new Integer[]{4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7})); 
//	filterRange(lista, 5, 7); Resultado: [4, 9, 2, 3, 1, 8]

	public static ArrayList<Integer> filterRange(ArrayList<Integer> lista, int min, int max) {

		for (ListIterator<Integer> iterator = lista.listIterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();

			if (integer >= min && integer <= max) {
				iterator.remove();
			}
		}
		return lista;
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(
				Arrays.asList(new Integer[] { 4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7 }));
		System.out.println(lista);
		filterRange(lista, 5, 7);
		System.out.println(lista);
	}
}
