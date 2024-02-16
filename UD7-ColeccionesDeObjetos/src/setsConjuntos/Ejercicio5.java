package setsConjuntos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio5 {
//	Crea un método que muestre
//	el ultimo elemento de un TreeSet de enteros y lo elimine.
	
	public static void showRemoveTreeSet(TreeSet <Integer> ts) {
		
		Iterator <Integer> it = ts.iterator(); 
		System.out.println(ts);
		System.out.println(ts.last());
		while (it.hasNext()){
			if(it.next()==ts.last()) {
				it.remove();
			}
		}
		
		System.out.println(ts);
		
	}
	
	public static void main(String[] args) {
		
		TreeSet <Integer> ts = new TreeSet<>();
		ts.addAll(Arrays.asList(1,2,5,6,7));
		showRemoveTreeSet(ts);
	}
}
