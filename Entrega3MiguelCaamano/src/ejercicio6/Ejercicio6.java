package ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int cuadrado;
		for(int i=1; i<100; i++) {
			
			cuadrado=i*i;
			System.out.printf("%04d  ",cuadrado);
			
			if (i%9==0)
				System.out.println();	
		}
		
	}

}
