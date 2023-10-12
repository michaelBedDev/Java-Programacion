package Ejercicios;

public class CastingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char prueba1 = 'a';
		char prueba2 = 'b';
		char prueba3 = 'c';
		char prueba4 = 'd';
		char prueba5 = 'e';
		char prueba6 = 'f';
		char prueba7 = 'g';
		
		boolean prueba1_1;  //cast de char a boolean no es posible
		byte prueba2_1 = (byte) prueba2;
		short prueba3_1 = (short) prueba3;
		int prueba4_1 = prueba4;
		long prueba5_1 = prueba5;
		float prueba6_1 = prueba6;
		double prueba7_1 = prueba7;
				
		System.out.println(prueba1);
		System.out.println(prueba2_1);
		System.out.println(prueba3_1);
		System.out.println(prueba4_1);
		System.out.println(prueba5_1);
		System.out.println(prueba6_1);
		System.out.println(prueba7_1);
		
	}

}
