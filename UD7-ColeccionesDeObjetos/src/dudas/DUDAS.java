package dudas;

import java.util.Arrays;
import java.util.List;

public class DUDAS {

	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		
		var aux = lista.stream().map(e -> e+1);
	lista.stream().forEach(System.out::println);
	}
	
//	list.stream().map(e -> e + 1); // Can apply a transformation function for e
//	
	
	
	
//	si no es bueno recorrer de inicio a fin conjuntos, por eso se usa while en el iterator en vez de el for?
//			
//	que es programación funcional
//	
//	Object[] toArray() por que en una lista de strings devuelve object  y no String
//	
//	Diferencia entre iterator y list iterator
//	
//	que es last index of y sublist
//	
//	
//	list.size() devuelve length?
//			
//			
//	en que se diferencian array list y linkedList ademas de getFirst() y getLast().
//	Si puedes acceder a la posición 0 y -1 del arrayList
//	
//	
//	
//	
//	
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
