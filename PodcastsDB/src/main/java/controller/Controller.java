package controller;

import data.ModifyDB;
import view.View;

public class Controller {

	private ModifyDB task;
	private View view;

	public Controller(ModifyDB task, View view) {
		this.task = task;
		this.view = view;
	}

	public void seleccionarAccion() {
		boolean exit = false;
		do {
			exit = accionARealizarSwitch();
		} while (!exit); /* Repite el bucle mientras no quieras salir */
	}

	public boolean accionARealizarSwitch() {
		view.getMenu().imprimirOpciones();
		int input = view.askForInt("Introduce una opción: ");

		switch (input) {
		case 1 -> task.insertPodcast(view.askForPodcast());
		case 2 -> task.newGenPodcast(view.askForGen());
		case 3 -> {
			try {
				task.updatePodcast(task.selectPodcast());
			} catch (Exception e) {
				view.showMessage(e.getMessage());
			}
		}
		case 4 -> {
			try {
				task.deletePodcast(task.selectPodcast());
			} catch (Exception e) {
				view.showMessage(e.getMessage());
			}
		}
		case 5 -> view.showCollection(task.getDBPodcast());
		case 6 -> {
			view.showCollection(task.getDBPodcast());
			task.findByIdPodcast(view.askForInt("Introduce el ID del podcast a buscar: "));
		}
		case 7 -> view.showCollection(task.getDBAuthors());
		case 8 -> view.showCollection(task.getDBGenders());
		case 99 -> {
			view.showMessage("Gracias! Hasta luego");
			return true;
		}
		default -> {
			view.showMessage("Por favor, introduce una de las opciones\n");
		}
		}
		return false;
	}
}
