package plantillas;

public abstract class Menu {

	public void seleccionarAccion(IClasePrincipal clasePrincipal, Usuario user) {
		//nuevo objeto usuario de la clase hija USER** user = new USER**();
		boolean exit;
		do {
			exit = accionARealizarSwitch(clasePrincipal, user);
		} while (!exit);
	}

	protected abstract boolean accionARealizarSwitch(IClasePrincipal clasePrincipal, Usuario user);
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
