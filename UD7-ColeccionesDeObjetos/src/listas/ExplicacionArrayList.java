package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExplicacionArrayList {

	public static void main(String[] args) {
		List<String> listCadenas = new ArrayList<String>();
		listCadenas.add("One");
		listCadenas.add("Two");
		listCadenas.add("Three");
		listCadenas.add("Four");
		System.out.println(listCadenas);

		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

		// Creacion de una lista a través el volcado objetos de una lista en otra
		List<Integer> listNumberOne = new ArrayList<Integer>(); // existing collection
		List<Integer> listNumberTwo = new ArrayList<>(listNumberOne);

		// Agregar objetos
		List<String> listStrings = new ArrayList<>();

		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add(1, "Four");
		System.out.println(listStrings);

		// Add All
		listStrings.addAll(listCadenas);
		listStrings.addAll(2, listCadenas);
		System.out.println(listStrings);

		// Obtener objeto
		String element = listStrings.get(1);
		System.out.println(element);

		// Actualizar objeto
		listStrings.set(2, "Hi");

		// Remove
		listStrings.remove(2);
		listStrings.size(); //Devuelve el tamaño de la coleccion de objetos
		listStrings.clear(); //Borra todos los elementos de la coleccion
		//listStrings. ver todos los metodos

		// Buscar objeto en la lista metodos contains ->boolean,  indexOf-> posicion
		List<String> lista = new ArrayList<>();
		String s = "bye";
		lista.add("hi");
		lista.add(s);
		System.out.println("hello está en la lista? " + lista.contains("hello"));
		System.out.println("bye está en la lista? " + lista.contains("bye"));
		System.out.println(s + " está en la lista? " + lista.contains(s));
		System.out.println("posición de " + s + " en la lista? " + lista.indexOf(s));
		
		//Recorrer la lista de inicio a fin
		for (String e : listStrings) {
			  System.out.println(e);
			  }
		
		//Iterator
		Libro libro1 = new Libro("0345404475", "Do Androids Dream of Electric Sheep?", "Philip K.Dick");
		Libro libro2 = new Libro("0451457998", "2001: A Space Odissey", "Arthur C. Clarke");
		List<Libro> biblio = new ArrayList<>();
		biblio.add(libro1);
		biblio.add(libro2);
		Iterator<Libro> it = biblio.iterator(); // Iterator que apuntará al inicio de la colección
		while(it.hasNext()) { // mientras haya "siguiente" elemento...
		    Libro libro = it.next(); // leemos el "siguiente" elemento   (cogemos el que está y salta después al siguiente elemento)
		    System.out.println("Título: " + libro);
		}
		
		//ListIterator: métodos a parte de los de recorrido que podéis probar: add(), remove() y set() [enlace a javadoc].
		
		//For each con lambda
		listStrings.forEach(z -> System.out.println(z));
		
		
		//Añadir equals y hash code a la clase si se puede (util para ordenar) (dependiendo del tipo de coleccion)
		
		
		
		//Forma 1
		ArrayList<Integer> listaEspecial = new ArrayList<>(List.of(1,2,3,4,5,6));
		//Forma 2
		String[] lista2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; //or
		
		List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		
	}
}
