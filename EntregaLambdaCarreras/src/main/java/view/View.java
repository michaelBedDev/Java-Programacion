package view;

import java.util.ArrayList;
import java.util.Scanner;

import data.Equipo;

public class View {

	private Scanner sc;
	
	public View() {
		sc = new Scanner(System.in);
	}
	
	
	public void mostrarEquipos(ArrayList<Equipo> equipos) {
		for (Equipo e : equipos) {
			showMessage(e.toString());
		}
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
}
