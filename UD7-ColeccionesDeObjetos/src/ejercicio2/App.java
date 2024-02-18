package ejercicio2;

import java.util.Arrays;
import java.util.List;

public class App {

//	Escribe un método denominado swapPairs que intercambie los valores de un ArrayList de Strings por parejas. Es decir, intercambiará el primer elemento con el segundo, el tercero con el cuarto,…
//	En caso de que el número de elementos sea impar, el último elemento no se intercambiará.

	public static void main(String[] args) {

		String[] lista = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		List<String> list = Arrays.asList(lista);
		
		swapPairs(list);
		
		list.forEach(z -> System.out.print(z));
	}

	public static List<String> swapPairs(List<String> list) {
		
		String s;
		for (int i = 0; i < list.size()-1; i += 2) {
			s = list.get(i);
			list.set(i, list.get(i + 1));  //aqui está el truco
			list.set(i + 1, s);
		}
		return list;
	}
}
