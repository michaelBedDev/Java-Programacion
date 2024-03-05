package plantillas;

public abstract class Menu {

	public void seleccionarAccion() {
		boolean exit;
		do {
			exit = accionARealizarSwitch();
		} while (!exit);
	}

	protected abstract boolean accionARealizarSwitch();
	// Switch de las acciones en la clase hija

	protected abstract void imprimirOpciones();
	// Imprime aquí las opciones del menu
}
