package ejercicio5;

import java.util.Random;

public class CadenaTest {

	public static void main(String[] args) {

		
		String cadena = " esto es un ejemplo de una cadena de ejemplo ";
		System.out.println(cadena);
		System.out.println("El total de caracteres del ejemplo es: " + cadena.length());
		cadena = cadena.trim();
		System.out.println("El total de caracteres sin espacios es de: " + cadena.length());
		String cola = cadena.substring( 26,cadena.length());
		cola = cola.replace("ejemplo", "muestra");
		String principio = cadena.substring(0,26);
		String frase = principio + cola;
		System.out.println(frase);
		
		Random aleatorio = new Random();
		int charAleatorio = aleatorio.nextInt(frase.length());
		System.out.println("La posición del caracter aleatorio es: " + charAleatorio);
		System.out.println("El caracter aleatorio es la letra: " + frase.charAt(charAleatorio));
		
		char mayuscula = frase.toUpperCase().charAt(0);
		frase = frase.substring(1);
		System.out.println(mayuscula + frase);
	}

}
