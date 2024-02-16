package setsConjuntos;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ExplicacionTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(4);
		ts.add(-1);
		ts.add(0);
		ts.add(2);
		ts.add(7);
		ts.add(5);
		ts.add(3);
		ts.add(3);
		ts.add(3); // Sólo almacenará uno
		System.out.println("ts: " + ts); // Estarán ordenados de menor a mayor
		System.out.println("Mayor: " + ts.last() + ", Menor: " + ts.first());
		System.out.println("Primer elemento mayor que 0: " + ts.higher(0));
		System.out.println("Primer elemento menor o igual que 6: " + ts.floor(6));
		NavigableSet<Integer> range = ts.subSet(-5, true, 3, false);
		System.out.println("Elementos en el rango [-5, 3): " + range);
	}
}
