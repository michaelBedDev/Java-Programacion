package plantillas;

import java.util.Scanner;

public class Usuario {

	protected Scanner sc;

	protected Usuario() {
		super();
		this.sc = new Scanner(System.in);
	}

	// Seleccionar en menu
	public int inputSeleccionar() {
		int seleccion = Integer.parseInt(sc.nextLine());
		return seleccion;
	}

	public int pedirNumero(String textoPeticion) {
		int codigo;
		do {
			System.out.println(textoPeticion);
			codigo = Integer.parseInt(sc.nextLine());

		} while (codigo < 1 && codigo > 999);
		return codigo;
	}

	public String pedirString(String textoPeticion) {
		String output;
		do {
			System.out.println(textoPeticion);
			output = sc.nextLine();

		} while (output == "");
		return output;
	}
}
