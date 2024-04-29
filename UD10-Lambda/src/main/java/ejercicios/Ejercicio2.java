package ejercicios;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		List<Persona> peopleList = List.of(new Persona(10), new Persona(15), new Persona(20));
		
		Optional<Integer> less = peopleList.stream().map(Persona::getEdad).min((p1, p2) -> Integer.compare(p1, p2));

		Optional<Persona> less2 = peopleList.stream().min(Comparator.comparing(Persona::getEdad));
			
			System.out.printf("La persona con menos edad tiene %d años", less.get());

	}
}
