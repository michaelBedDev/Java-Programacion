package setsConjuntos;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RecorrerTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.addAll(Arrays.asList(10, 61, 87, 39));

		System.out.print("TreeSet:");

		// Usando forEach
		ts.forEach(i -> System.out.print(i + " "));
		System.out.println();

		System.out.print("TreeSet:");

		// Usando stream con map (mapear cada elemento), el Collectors lo transforma en
		// una lista
		System.out.print(ts.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()));
		System.out.println();
		
		
		//La forma más facil
		System.out.println("TreeSet:" + ts);
	}
}
