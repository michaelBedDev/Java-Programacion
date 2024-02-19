package ordenacionEjercicio2;

import java.util.Collections;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList <String> listaNumeros = new LinkedList<>();
		listaNumeros.add("+34666666666");
		listaNumeros.add("981555555");
		listaNumeros.add("+34981565656");
		listaNumeros.add("666666666");
		
		Collections.sort(listaNumeros, new SortByNumber());
		
		listaNumeros.forEach(numero -> System.out.println(numero));
	}
	
	
}
