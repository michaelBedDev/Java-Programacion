package explicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Explicacion {

	public static void main(String[] args) {
		Persona p1 = new Persona("pedro", 20, "perez");
		Persona p2 = new Persona("juan", 25, "perez");
		Persona p3 = new Persona("ana", 30, "perez");
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

//	lista
//	    .stream()
//	    .map(a -> a.edad )
//	    .forEach(a -> System.out.println(a));
//	    
//	    Libro l = new Libro("El señor de los anillos", "fantasia", 1100);
//	    Libro l2 = new Libro("El Juego de Ender", "ciencia ficcion", 500);
//	    Libro l3 = new Libro("La fundacion", "ciencia ficcion", 500);
//	    Libro l4 = new Libro("Los pilares de la tierra", "historica", 1200);
//	    List <Libro> lista;
//	    lista.stream()
//	        .filter(libro -> libro.getPaginas() > 1000)
//	        .map(libro -> libro.getTitulo())
//	        .forEach(System.out::println);
//	    

		List<Car> cars = null;
		cars.stream().filter(x -> x.getColor().equals("White")).count();

		List<Car> result = cars.stream().filter(x -> x.getColor().equals("White")).collect(Collectors.toList());

//	    lista.stream()
//	    .sorted(Comparator.comparing( p -> p.getApellidos()))
//	    .forEach(System.out::println);
//	    

		List<Employee> empList = null;
		List<Employee> employees = empList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());

//	    List<String> ids = cars.stream()
//	    		.filter(x -> x.getColor().equals("White"))
//	    		.map(car -> car.getBrand())
//	    		.distinct().collect(Collectors.toList());

		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
		Integer var = list.stream().min(Integer::compare).get();

		List<Integer> list2 = Arrays.asList(-9, -18, 0, 25, 4);
		Optional<Integer> var2 = list2.stream().min(Comparator.reverseOrder());
		
		List<Integer> listaa = Arrays.asList(-9, -18, 0, 25, 4);
		Integer vara = listaa.stream().min(Integer::compare).get();

		List<Integer> listaaa = Arrays.asList(-9, -18, 0, 25, 4);
		Optional<Integer> varaa = listaaa.stream()
		                    .min(Comparator.reverseOrder());
	}

	public static boolean buenosLibros(Libro libro) {
		Predicate<Libro> p1 = (Libro l) -> l.getCategoria().equals("ciencia ficcion");
		Predicate<Libro> p2 = (Libro l) -> l.getCategoria().equals("fantasia");
		Predicate<Libro> p3 = (Libro l) -> l.getPaginas() > 1000;
		Predicate<Libro> ptotal = p1.or(p2).and(p3);
		return ptotal.test(libro);
	}

	public void createStream_whenFindFirstResultIsPresent_thenCorrect() {

		List<String> list = Arrays.asList("A", "B", "C", "D");

		Optional<String> resultFirst = list.stream().findFirst();

		if (resultFirst.isPresent()) {
			System.out.println(resultFirst.get());
		}

	}
	
	
}
