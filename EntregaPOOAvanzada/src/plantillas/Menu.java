package plantillas;

import centroCultural.CentroCultural;


public class Menu {

	public void seleccionarAccion(CentroCultural centroCultural) {

		Usuario user = new Usuario();

		int seleccion;
		do {
			seleccion = accionARealizarSwitch(centroCultural, user);
		} while (seleccion != 99);
	}

	protected int accionARealizarSwitch(CentroCultural centroCultural, Usuario user) {
		//Switch para seleccionar acción
		this.imprimirOpciones();

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				break;
			case 99:
				System.out.println("Gracias! Hasta luego");
		}
		if ((seleccion < 1 || seleccion > 4) && seleccion != 99) {
			System.out.println("Por favor, introduce una de las opciones");
			System.out.println();
		}
		return seleccion;
	}

	protected void imprimirOpciones() {
		//Imprime aquí las opciones del menu
	}
}
