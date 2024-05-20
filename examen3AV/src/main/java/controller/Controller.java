package controller;

import java.sql.SQLException;

import data.DB;
import view.View;

public class Controller {

	private DB db;
	private View view;

	public Controller() throws SQLException {
		db = new DB();
		view = new View();
	}

	public void start() {
		int option = 0;
		do {
			view.getMenu().showMenu();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				menuExtra();
				break;
			case 8:
				view.showMessage("Hasta luego");
				break;
			default:
				view.showMessage("Introduce alguna de las opciones");
				break;
			}
		} while (option != 8);
	}


	private void menuExtra() {
		int option = 0;
		do {
			view.getMenu().showMenuExtra();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
				
				break;
			case 2:
			
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
			
				break;
			case 6:
			
				break;
			default:
				view.showMessage("Introduce alguna de las opciones");
				break;
			}
		} while(option != 7);
	}
}
