package ejercicio5;

public class CadenaTest {

	public static void main(String[] args) {

		
		String cadena = " esto es un ejemplo de una cadena de ejemplo ";
		System.out.println("El total de caracteres del ejemplo es: " + cadena.length());
		cadena = cadena.trim();
		String cola = cadena.substring( 26,cadena.length());
		cola = cola.replace("ejemplo", "muestra");
		String principio = cadena.substring(0,26);
		String frase = principio + cola;
		System.out.println(frase);
		System.out.println(frase.toUpperCase());
		
	}

}
