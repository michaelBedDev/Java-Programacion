package controller;

import java.util.List;

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
		case 3 -> task.updatePodcast(null);
		case 4 -> task.deletePodcast(task.findByIdPodcast(view.askForInt("Introduce el ID del podcast a eliminar:")));
		case 5 -> view.showCollection(task.viewAllPodcast());
		case 6 -> task.findByIdPodcast(input);
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
