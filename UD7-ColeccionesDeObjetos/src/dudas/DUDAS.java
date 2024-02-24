package dudas;

import java.util.Arrays;
import java.util.List;

public class DUDAS {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

		var aux = lista.stream().map(e -> e + 1);
		lista.stream().forEach(System.out::println);
		lista.forEach(e -> System.out.println(e));

		String[] listaS = lista.toArray(new String[lista.size()]); //muy interesante
	}

//	list.stream().map(e -> e + 1); // Can apply a transformation function for e
//	

//	que es programación funcional
//	

/
//	que es last index of y sublist

//			
/	
//	
//	Para colocar el iterador en la primera posición de la lista,
//	puedes usar el método listIterator(0) de la lista. 
//	ListIterator iterator = lista.listIterator(0);
//	private ListIterator<Pasajero> it = listaPasajeros.listIterator();

//	 // Usando stream con map (mapear cada elemento), el Collectors lo transforma en una lista
//    System.out.print(
//        ts.stream()
//            .map(i -> String.valueOf(i)) .collect(Collectors.toList())
//            );
}
