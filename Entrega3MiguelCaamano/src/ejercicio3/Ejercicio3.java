package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String test = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
		System.out.println(test);
		for (;test.length()>0;) {
			test = test.substring(1);
			System.out.println(test);
		}
	}

}
