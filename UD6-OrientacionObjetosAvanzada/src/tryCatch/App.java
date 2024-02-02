package tryCatch;

public class App {
	public static void main(String[] args) {
		int pesoPaquete = 10;
		int divisor = 0;
		try {
			System.out.println("antes de que se genere la excepción");
			pesoPaquete = pesoPaquete / divisor;
			pesoPaquete = Integer.parseInt("10.5");
			System.out.println("esto jamás se imprime");
		} catch (ArithmeticException | NumberFormatException miExcepcion) {
			System.out.println("mi código es excepcional....");
		}
		System.out.println("el programa sigue su ejecución se recupero de la excepción ...");
	}
}
