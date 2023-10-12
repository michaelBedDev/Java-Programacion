package entrega;

public class Ejercicio5EntradaSalida {

	public static void main(String[] args) {
		
		
		System.out.printf("1.0/3.0 = %.3f %n", 1/3f);
		System.out.printf("1.0/3.0 = %.5f %n", 1/3f);
		System.out.printf("1.0/2.0 = %09.3f %n", 1/2f); 
		System.out.printf("1000/3.0 = %.1e  h %n", 1000/3.0f);
		System.out.printf("3.0/4567.0 = %.3e %n", 3.0/4567.0f);
		System.out.printf("-1.0/0.0 = %f %n", -1.0/0.0f);
		System.out.printf("0.0/0.0 = %f %n", 0.0/0.0f);
		System.out.printf("pi = %.3f, e = %.4f %n", Math.PI, Math.E);
		System.out.printf("C = 2 * %2$.5f * %1$.1f, A = %1$.1f * %1$.1f * %2$.5f ", 1.1d, Math.PI);
		
	}

}
