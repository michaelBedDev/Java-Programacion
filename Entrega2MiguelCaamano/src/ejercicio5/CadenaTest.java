package ejercicio5;

import java.util.Random;

public class CadenaTest {

	public static void main(String[] args) {

		//Cadena de ejemplo sin alterar
		String cadena = " esto es un ejemplo de una cadena de ejemplo ";
		System.out.println(cadena);
		System.out.println();
		
		//Total de caracteres con y sin espacios
		System.out.println("El total de caracteres del ejemplo es de: " + cadena.length());
		cadena = cadena.trim(); //Quitamos espacios
		System.out.println("El total de caracteres sin espacios es de: " + cadena.length());
		System.out.println();
		
		//Guardamos "cadena de ejemplo" en String cola
		//Cambiamos "ejemplo" por "muestra"
		String cola = cadena.substring( 26,cadena.length()); 
		cola = cola.replace("ejemplo", "muestra");
		
		//Guardamos "esto es un ejemplo" en String principio
		String principio = cadena.substring(0,26);
		
		//Concatenamos principio + cola
		String frase = principio.concat(cola);
		System.out.println(frase);
		System.out.println();
		
		//Creamos el objeto aleatorio de clase Random
		Random aleatorio = new Random();
		
		//El rango del caracter aleatorio es la longitud de la String frase
		int charAleatorio = aleatorio.nextInt(frase.length());
		System.out.println("La posición del caracter aleatorio es: " + charAleatorio);
		System.out.println("El caracter aleatorio es la letra: " + frase.charAt(charAleatorio));
		System.out.println();
		
		//Modificamos la frase para que empiece con mayúscula
		char mayuscula = frase.toUpperCase().charAt(0);
		frase = frase.substring(1);
		System.out.println(mayuscula + frase);
	}

}
