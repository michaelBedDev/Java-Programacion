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
		} while (output == null);
		
		return sc.nextLine();
	}
	
	public int askForInt(String message) {
		int output;

		do {
			showMessage(message);
			output = sc.nextInt();
		} while (output < 0);

		return output;
	}
}
