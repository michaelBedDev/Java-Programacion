package explicacion;

import java.util.Arrays;


public class Ejercicio2 {

	
	@FunctionalInterface
	interface Ejercicio{
		public String reverse(String s);
	}
	
	public static void main(String[] args) {
		Ejercicio ejemplo1 = s -> {
		
			
			String sReturn = "";
			for(int i = s.length()-1; i>=0; i--) {
				sReturn = sReturn + s.charAt(i);
			}
			return sReturn;
		};
		
		String s = "amor";
		
		System.out.println("La palabra "+ s + " al revés se escribe " + ejemplo1.reverse(s));
	}
	
	
}
