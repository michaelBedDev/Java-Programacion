package optionalEjercicio;

import java.util.Scanner;

public class View {

	private Scanner sc;
	
	
	
	public View() {
		super();
		sc = new Scanner(System.in);
	}



	public void askMenuOption() {
		int input;
		do {
			System.out.println("introduce el número a seleccionar");
			input = sc.nextInt();
		} while ((input < 0) || (input > 5));
	}
	
	public String askString(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
	
	public void sendMessage(String message) {
		System.out.println(message);
	}



	public String askNombreCompleto() {
		String nombre = askString("Introduce el nombre del usuario a añadir:");
		String apellido = askString("Introduce el apellido");
		return nombre+apellido;
	}
}
