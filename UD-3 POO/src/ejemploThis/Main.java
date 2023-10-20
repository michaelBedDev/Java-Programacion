package ejemploThis;

public class Main {

	public static void main(String[] args) {
		
		Circulo a = new Circulo(1,2,3);
		Circulo b = new Circulo(4,5,6);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println("El circulo mas grande es: " + a.elMayor(b));

	}

}
