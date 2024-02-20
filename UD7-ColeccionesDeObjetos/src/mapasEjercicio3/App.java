package mapasEjercicio3;

import java.util.Collections;
import java.util.TreeMap;

public class App {
	
	public static void main(String[] args) {
		TreeMap <String,Double> mapaAlumnos= new TreeMap<>(new SortByAlphabetical());

		mapaAlumnos.put("Marcos", 8.33);
		mapaAlumnos.put("Alejandra", 5.67);
		mapaAlumnos.put("Pepe", 2.87);
		mapaAlumnos.put("Ana", 8.33);
		
		
		//Comprobamos que estén ordenados (?)
		
		mapaAlumnos.forEach((nombre, nota) -> System.out.println(nombre + " => " + nota));
		
		
		System.out.println();
		//Mapa ordenado al revés
		TreeMap <String,Double> mapaAlumnosReves = new TreeMap<>(Collections.reverseOrder(new SortByAlphabetical()));
		
		mapaAlumnosReves.putAll(mapaAlumnos);
		
		//Comprobamos que esté ordenado
		mapaAlumnosReves.forEach((nombre, nota) -> System.out.println(nombre + " => " + nota));
		
		
		System.out.println();
		//firstKey obtiene The first (lowest) key currently in this map.
		System.out.println(mapaAlumnosReves.firstKey() + " es la primera clave del mapa al revés");
		//lastKey obtiene 	lastKey() Returns the last (highest) key currently in this map.
		System.out.println(mapaAlumnosReves.lastKey() + " es la última clave del mapa al revés");
		System.out.println();
		//headMap devuelve el mapa a que es menos que x valor en la clave
		System.out.println("El mapa es: " + mapaAlumnos); //imprimo el map directamente
		System.out.println(mapaAlumnos.headMap("Marcos")); //devuelve los elementos antes que Marcos, exclusive
		
		
		
	}
	
	

}
