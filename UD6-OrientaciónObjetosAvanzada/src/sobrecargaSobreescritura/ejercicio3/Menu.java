package sobrecargaSobreescritura.ejercicio3;

public class Menu {

	



	public void seleccionarAccion(Hotel hotel) {
		
		Usuario user = new Usuario();
		
		do {

			accionARealizarSwitch(hotel, user);
		} while (user.inputSeleccionar()!= 99);
	}




	private void accionARealizarSwitch(Hotel hotel, Usuario user) {
		this.imprimirOpciones();
		
		switch (user.inputSeleccionar()) {
		case 1:
			hotel.mostrarPerros();
			break;
		case 2:
			Perro perroCreado = new Perro();
			user.adoptarPerro(perroCreado);
			hotel.registrarPerro(perroCreado);
			break;
		case 3:
			//alimentar perro
		case 4:
			//sacar patio
		
			
			
		}
		
		if (user.inputSeleccionar() < 1 || user.inputSeleccionar() > 7) {
			System.out.println("Por favor, introduce una de las opciones");
			System.out.println();
		
		}
	}
	
	
	
	
	private void imprimirOpciones() {
		System.out.println("[1] Mostrar Perros");
		System.out.println("[2] \"Adoptar\" Perro");
		System.out.println("[3] Alimentar a los perros del hotel");
		System.out.println("[4] Sacar a los perros a pasear");
		System.out.println("[99] Salir");
	}
}
