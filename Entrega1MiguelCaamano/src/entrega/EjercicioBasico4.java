package entrega;

public class EjercicioBasico4 {

	public static void main(String[] args) {
		
		int A, B, C, D;
		A = 1; B = 2; C = 3; D = 4;
		
		System.out.println("Valores iniciales");
		System.out.println("A = " +A);
		System.out.println("B = " +B);
		System.out.println("C = " +C);
		System.out.println("D = " +D);
		
		int z; z=B; B=C; C=A; A=D; D=z;
		
		System.out.println("Valores finales");
		System.out.println("B toma el valor de C -> B = " +B);
		System.out.println("C toma el valor de A -> B = " +C);
		System.out.println("A toma el valor de D -> B = " +A);
		System.out.println("D toma el valor de B -> B = " +D);
		
		

	}

}
