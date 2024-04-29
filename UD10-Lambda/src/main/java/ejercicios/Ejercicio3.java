package ejercicios;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Ejercicio3 {

	public static void main(String[] args) {
		Random rand = new Random();
		Supplier<Integer> sup = () -> rand.nextInt(1, 11);
		
		Stream.generate(sup).limit(5).forEach(System.out::println);
	}
}
