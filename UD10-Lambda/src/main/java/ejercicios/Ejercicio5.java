package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio5 {

	
	public static void main(String[] args) {
		
		List<String> listaNombres = Arrays.asList(new String[] {"Asalkdhfghsadf","ABasldhfgsahdf","ABC","ABCD"});
		
		listaNombres.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
