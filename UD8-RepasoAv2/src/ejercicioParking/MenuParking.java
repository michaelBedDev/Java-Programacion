package ejercicioParking;

import plantillas.Menu;

public class MenuParking extends Menu {
	private UsuarioParking user;
	private Parking parking;

	public MenuParking(UsuarioParking user, Parking parking) {
		super();
		this.user = user;
		this.parking = parking;
	}

	@Override
	protected void imprimirOpciones() {
		System.out.println("----VALORES POR DEFECTO: ALUMNOS 00000000A & 00000000B. ASIGNATURA: A-111----");
		System.out.println("[99] Salir");

	}

	public void seleccionarAccion(Parking centroAcademico) {
		super.seleccionarAccion();
	}

	protected boolean accionARealizarSwitch() {
		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = 0;

		try {
			seleccion = user.inputSeleccionar();

			switch (seleccion) {
			case 1:
				parking.addVehiculoParking(user.escogerTipoCoche(), user.pedirMatricula(),
						user.pedirString("Introduce el color del coche"),
						user.pedirString("Introduce la hora de entrada en el parking"));
				break;
			case 2:
				parking.removeVehiculoParking(user.pedirMatricula(),
						user.pedirString("Introduce la hora de salida del parking"));
				break;
			case 99:
				exit = true;
				System.out.println("Gracias! Hasta luego");
			}

			if ((seleccion < 1 || seleccion > 10) && seleccion != 99) {
				System.out.println("Por favor, introduce una de las opciones");
				System.out.println();
			}

		} catch (NumberFormatException e) {

			System.out.println("Introduce un formato de número válido\n");
		}

		return exit;
	}

}
