package strings;

import java.io.Console;

public class Ejercicio3Complejo {

	public static void main(String[] args) {
		
		Console teclado = System.console();
		String parteReal;
		String parteImaginaria;
		//creamos número a
		System.out.println("Número a");
		parteReal=teclado.readLine("\tparte real:");
		parteImaginaria=teclado.readLine("\tparte imaginaria:");
		Complejo a= new Complejo(Double.parseDouble(parteReal),Double.parseDouble(parteImaginaria));
		//creamos número b
		System.out.println("Número b");
		parteReal=teclado.readLine("\tparte real:");
		parteImaginaria=teclado.readLine("\tparte imaginaria:");
		Complejo b= new Complejo(Double.parseDouble(parteReal),Double.parseDouble(parteImaginaria));
		//probar suma a y b
		a.sumar(b);
		String suma=a.convertirAString();
		System.out.println("\nsuma de a y b: "+ suma);
		

	}

}
