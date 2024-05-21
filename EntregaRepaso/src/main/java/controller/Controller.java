package controller;

import java.sql.SQLException;

import data.Contacto;
import data.Direccion;
import data.Grupo;
import data.ModifyDB;
import exceptions.ObjectNotFoundException;
import view.View;

public class Controller {

	private ModifyDB db;
	private View view;

	public Controller() throws SQLException {
		db = new ModifyDB();
		view = new View();
	}

	public void start() {
		int option = 0;
		do {
			view.getMenu().showMenu();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
				showAllData();
				break;
			case 2:
				db.crearGrupo(view.askForChar("Introduce la letra para filtrar el nombre de los contactos"));
				break;
			case 3:
				db.contactosToFichero();
				break;
			case 4:
				db.ficheroToContactos();
				break;
			case 5:
				try {
					view.showMessage(db.compararContacto(
							db.getContacto(view.askForString("Introduce el ID del primer contacto a comparar")),
							db.getContacto(view.askForString("Introduce el ID del segundo contacto a comparar"))));
				} catch (ObjectNotFoundException e) {
					e.getMessage();
				}
				break;
			case 6:
				db.mostrarContactosOrdenadosTlf();
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

	private void showAllData() {
		for (Contacto c : db.getContactos()) {
			view.showContacto(c);
		}
		for (Direccion d : db.getdirecciones()) {
			view.showDireccion(d);
		}
	}

	private void showGrupos() {
		for (Grupo g : db.getListaGrupos()) {
			view.showGrupo(g);
		}
	}

	private void menuExtra() {
		int option = 0;
		do {
			view.getMenu().showMenuExtra();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
				db.navegarContactos(); // añadir actualizar nombre si se desea
				break;
			case 2:
				db.contarContactosGrupo();
				break;
			case 3:
//				direccionesFromContactoToFichero();
				break;
			case 4:
				showGrupos();
				try {
					db.usuarioMasJoven(db.getGrupo(view.askForString("Introduce el ID del Grupo a buscar")));
				} catch (ObjectNotFoundException e) {
					e.getMessage();
				}
				break;
			case 5:
				// modificarTelefonoContacto();
				break;
			case 6:
				// hacerCopiaSeguridad();
				break;
			default:
				view.showMessage("Introduce alguna de las opciones");
				break;
			}
		} while (option != 7);
	}
}
