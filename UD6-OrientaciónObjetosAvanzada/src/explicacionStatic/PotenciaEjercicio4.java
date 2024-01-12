package explicacionStatic;

public class PotenciaEjercicio4 {

	static int pot(int base, int exponente) {
		int resultado = 1;
		for (; exponente > 0; exponente--) {
			resultado = resultado * base;
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(PotenciaEjercicio4.pot(2, 1));
		System.out.println(pot(5, 3));
		System.out.println(new PotenciaEjercicio4().pot(9, 0));
	}

}
