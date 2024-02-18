package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

//	Escribe un método denominado minToFront que reciba un ArrayList de enteros y mueva el mínimo de ellos al comienzo de la lista, manteniendo el orden del resto de números
//	Puedes asumir que la lista tendrá, al menos, un elemento. Por ejemplo: Test: 3, 8, 92, 4, 2, 17, 9 Resultado: [2, 3, 8, 92, 4, 17, 9]

	public static ArrayList<Integer> minToFront(ArrayList<Integer> lista) {


		Integer x = lista.get(0); // x = primer numero de la lista
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			if (i < x) {
				x = i;
			}
		}
		lista.remove(x);
		lista.add(0, x);
		
		return lista;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(List.of(3, 8, 92, 4, 2, 17, 9));
		
		System.out.println(lista);
		
		minToFront(lista);
		
		System.out.println(lista);
	}
}
