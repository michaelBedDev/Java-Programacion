package sobrecargaSobreescritura.ejercicio3;

public class Menu {

	public void seleccionarAccion(Hotel hotel) {

		Usuario user = new Usuario();

		int seleccion;
		do {
			seleccion = accionARealizarSwitch(hotel, user);
		} while (seleccion != 99);
	}

	private int accionARealizarSwitch(Hotel hotel, Usuario user) {
		this.imprimirOpciones();

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
		case 1:
			hotel.mostrarPerros();
			break;
		case 2:
			Perro perroCreado = new Perro();
			hotel.registrarPerro(user.adoptarPerro(perroCreado));
			break;
		case 3:
			hotel.alimentarPerros();
			break;
		case 4:
			hotel.sacarPatio();
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

	private void imprimirOpciones() {
		System.out.println("[1] Mostrar Perros");
		System.out.println("[2] \"Adoptar\" Perro");
		System.out.println("[3] Alimentar a los perros del hotel");
		System.out.println("[4] Sacar a los perros a pasear");
		System.out.println("[99] Salir");
	}
}
