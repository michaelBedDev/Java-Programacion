package centroCultural;

import java.util.Scanner;

public class Usuario {

	protected Scanner sc;

	// Seleccionar en menu
	public int inputSeleccionar() {
		this.sc = new Scanner(System.in);
		int seleccion = sc.nextInt();
		return seleccion;
	}
	
}
