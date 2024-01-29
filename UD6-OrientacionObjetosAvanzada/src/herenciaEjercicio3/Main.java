package herenciaEjercicio3;

class Main {
	public static void main(String[] args) {
		Cuadrado miCuadrado = new Cuadrado("azul", 2.5);
		System.out.println("Lado de miCuadrado: " + miCuadrado.getLado());
		Circulo miCirculo = new Circulo("blanco", 3.6);
		System.out.println("Color de miCirculo: " + miCirculo.getColor());
	}
}
