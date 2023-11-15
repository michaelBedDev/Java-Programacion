package ejercicio2;

public class ValidarDNITest {

	public static void main(String[] args) {
		
		ValidarDNI validador = new ValidarDNI();
		validador.comprobarLetraDNI("45956837P");
		
		if (validador.comprobarLetraDNI("45956837P")) {
			System.out.println("La letra TEST intoducida es correcta");
		}
	}

}
