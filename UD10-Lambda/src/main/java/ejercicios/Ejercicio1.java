package ejercicios;

import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio1 {

	public static String getSmaller(String[] lista) {
		Optional<String> listaStream = Stream.of(lista).min((s, s2) -> 
		Integer.compare(s.length(), s2.length()));
		
		if (listaStream.isPresent()){
			return listaStream.get();
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Ejercicio1.getSmaller(new String [] {"a","asdf","asdfhghjk","añskjdfgh"}));
	}
	
}
