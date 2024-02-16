package setsConjuntos;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

//	A:[5, 7, 9, 19] 
//	B:[10, 20, 5, 7] 
//			A union B: [19, 20, 5, 7, 9, 10] 
//			A diferencia B: [19, 9] 
//			A intersección B: [5, 7]
	
	public static void main(String[] args) {		
		Set<Integer> set1 = new TreeSet<>();
		set1.addAll(Arrays.asList(5, 7, 9, 19));
		
		Set<Integer> set2 = new TreeSet<>();
		set2.addAll(Arrays.asList(10,20,5,7));
		
		//union
		set1.addAll(set2);
		System.out.println(set1);
		
		//diferencia
		set1.removeAll(set2);
		System.out.println(set1);
		
		//interseccion
		set1.addAll(Arrays.asList(5,7));
		set1.retainAll(set2);
		System.out.println(set1);
		
	}
	
	
}
