package controller;

import java.sql.Connection;
import java.sql.SQLException;

import view.Menu;
import view.View;

public class Controller {

	private final Connection connection;
	private View view;
	private Menu menu;

	public Controller() throws SQLException {
		connection = DB.getInstance();
		view = new View();
		menu = new Menu();
	}

	public void start() {
		int option = 0;
		do {
			menu.showMenu();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
//				altaEquipo();
				break;
			case 2:
//				altaParticipante();
				break;
			case 3:
//				deleteEquipofromRace();
				break;
			case 4:
//				darPremio();
				break;
			case 5:
//				mostrarEquipoFormat();
				break;
			case 6:
//				unirEquipos();
				break;
			case 7:
//				participanteMasJoven();
				break;
			case 8:
//				infoToBBDD();
				break;
			case 9:
				view.showMessage("Hasta luego");
				break;
			}
		} while (option != 9);
	}

	
}
