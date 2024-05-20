package view;

import java.util.Scanner;

public class View {

	private Scanner sc;
	private Menu menu;

	public View() {
		sc = new Scanner(System.in);
		setMenu(new Menu());
	}

	/* Show methods */
	public void showMessage(String message) {
		System.out.println(message);
	}

	/* Ask For */
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
				showMessage("Núúmero no válido");
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

	
	/* Getters & Setters */
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
