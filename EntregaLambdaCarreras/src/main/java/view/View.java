package view;

import java.util.Scanner;

public class View {

	private Scanner sc;
	
	public View() {
		sc = new Scanner(System.in);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public String askForString(String message) {
		String output;
		
		do {
			showMessage(message);
			output = sc.nextLine();
		} while (output.isBlank() || output.isEmpty());
		
		return output;
	}
	
	public int askForInt(String message) {
		int output = -1;

		do {
			try {
				showMessage(message);
				output = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				showMessage("Número no válido");
			}
		} while (output < 0);

		return output;
	}
	
	public char askForChar(String message) {
		String output;
		
		do {
			showMessage(message);
			output = sc.nextLine();
		} while (output.isBlank() || output.isEmpty() || output.length() > 2);
		
		return output.charAt(0);
	}
}
