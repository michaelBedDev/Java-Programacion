package plantillas;

public abstract class Menu {

	public void seleccionarAccion() {
		//nuevo objeto usuario de la clase hija USER** user = new USER**();
		boolean exit;
		do {
			exit = accionARealizarSwitch();
		} while (!exit);
	}

	protected abstract boolean accionARealizarSwitch();
//EJEMPLO DE SWITCH CLASE HIJA
//
//		//Switch para seleccionar acción
//		this.imprimirOpciones();
//
//		boolean exit = false;
//		int seleccion = user.inputSeleccionar();
//		switch (seleccion) {
//			case 1:
//				break;
//			case 99:
//				exit = true;
//				System.out.println("Gracias! Hasta luego");
//		}
//		if ((seleccion < 1 || seleccion > 4) && seleccion != 99) {
//			System.out.println("Por favor, introduce una de las opciones");
//			System.out.println();
//		}
//		return exit;
//	

	protected abstract void imprimirOpciones();
		//Imprime aquí las opciones del menu

}
