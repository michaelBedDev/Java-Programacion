package explicacion;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interesante {

	public static void main(String[] args) {
		
		List<Employee> empList = null;
		List<Employee> employees = empList.stream()
			      .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
			      .collect(Collectors.toList());
		
		List<Employee> lista = null;
		  lista.stream()
		    .sorted(Comparator.comparing( p -> p.getApellidos()))
		    .forEach(System.out::println);
		  
		  
		  List<Car> cars = null;
		  List<String> ids = cars.stream()
				  .filter(x -> x.getColor().equals("White"))
				  .map(Car::getBrand)
				  .distinct().collect(Collectors.toList());
		  
		  cars.stream().map( car -> car.toString()).distinct().collect(Collectors.toList());
	}
}
