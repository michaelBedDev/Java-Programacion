package userAndMenu;

import db_tarea_ud9.ModifyDB;

public class Menu {

	public void seleccionarAccion(ModifyDB task, Usuario user) {
		boolean exit;
		do {
			exit = accionARealizarSwitch(task, user);
		} while (!exit);
	}

	protected void imprimirOpciones() {
		System.out.println("\n" + "-".repeat(20) + "MENU" + "-".repeat(20));
		System.out.println("[1] Agregar nuevo Podcast");
		System.out.println("[2] Alta nuevo Género");
		System.out.println("[3] Actualizar Géneros de un Podcast");
		System.out.println("[4] Eliminar Podcast");
		System.out.println("[5] Ver todos los Podcast almacenados");
		System.out.println("[6] Navegar entre los Podcast");
		System.out.println("[7] Mostrar los autores almacenados");
		System.out.println("[8] Mostrar los géneros almacenados");
		System.out.println("[99] Salir");
	}

	protected boolean accionARealizarSwitch(ModifyDB task, Usuario user) {

		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
		case 1:
			task.insertPodcast(user.askForPodcast());
			break;
		case 2:
			task.newGenPodcast(user.askForGen());
			break;
		case 3:
			task.updatePodcast(null);
			break;
		case 4:
			task.deletePodcast(task.findByIdPodcast(user.pedirNumero("Introduce el ID del podcast a eliminar:")));
			break;
		case 5:
			task.imprimirPodcast(task.viewAllPodcast());
			break;
		case 6:
			task.findByIdPodcast(seleccion);
			break;
		case 7:
			task.showAuthors();
			break;
		case 8:
			task.showDBGenders();
			break;
		case 99:
			exit = true;
			System.out.println("Gracias! Hasta luego");
		}
		if ((seleccion < 1 || seleccion > 10) && seleccion != 99) {
			System.out.println("Por favor, introduce una de las opciones");
			System.out.println();
		}
		return exit;
	}

}
