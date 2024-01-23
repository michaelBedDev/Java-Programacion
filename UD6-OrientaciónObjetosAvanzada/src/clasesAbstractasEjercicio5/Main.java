package clasesAbstractasEjercicio5;

public class Main {

	public static void main(String[] args) {

		Circulo circ = new Circulo(5);
		Triangulo trian = new Triangulo(5, 5);

		System.out.println("El area del triangulo es " + trian.area());
		System.out.println("El area del circulo es " + circ.area());
	}

}
