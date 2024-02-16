package setsConjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio1 {

	public int maxLength(HashSet<String> hset) {

		int longitud = 0;

		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			if (it.next().length() > longitud)
				longitud = it.next().length();
		}
		return longitud;
	}

	public boolean hasOdd(Set<Integer> intSet) {
		Iterator<Integer> it = intSet.iterator();
		while (it.hasNext()) {
			if (it.next() % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public void removeEvenLength(Set<String> stringSet) {
		Iterator<String> it = stringSet.iterator();
		while (it.hasNext()) {
			if (it.next().length() % 2 == 0) {
				it.remove();
			}
		}
	}
}
