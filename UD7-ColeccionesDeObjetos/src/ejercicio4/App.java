package ejercicio4;

import java.util.ArrayList;
import java.util.ListIterator;

public class App {
//	Escribe un método denominado markLength4 que reciba un ArrayList de Strings como argumento e inserta la cadena “****” 
//	en frente de cada elemento que tenga 4 caracteres. Por ejemplo: Test: “this”, “is”, “lots”, “of”, “fun”, “for”, “every”, “Java”, “programmer” 
//	Resultado: **** , this, is, **** , lots, of, fun, for, every, ****, Java, programmer

	public ArrayList<String> markLength4(ArrayList<String> lista) {

		String cadena = "****";

		ListIterator<String> iterator = lista.listIterator();

		while (iterator.hasNext()) {
			String s = (String) iterator.next();

			if (s.length() == 4) {
				iterator.set(s);
			}
		}
		return lista;
	}
}
