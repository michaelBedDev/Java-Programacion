package centroCultural;

import plantillas.IClasePrincipal;
import plantillas.Menu;
import plantillas.Usuario;

public class MenuCentroCultural extends Menu {

	@Override
	protected void imprimirOpciones() {
		System.out.println("[1] Alta Cliente");
		System.out.println("[2] Alta Material");
		System.out.println("[3] Realizar Préstamo");
		System.out.println("[4] Consultar Préstamo");
		System.out.println("[5] Comparar Libros");
		System.out.println("[6] Mostrar dónde se guarda el material");
		System.out.println("[99] Salir");

	}

	protected boolean accionARealizarSwitch(IClasePrincipal centroCultural, Usuario user) {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				((CentroCultural) centroCultural).altaCliente((UsuarioCentroCultural) user);
				break;
			case 2:
				((CentroCultural) centroCultural).altaMaterial((UsuarioCentroCultural) user);

				break;
			case 3:
				((CentroCultural) centroCultural).prestarMaterial((UsuarioCentroCultural) user);
				break;
			case 4:

				break;
			case 5:
				((CentroCultural) centroCultural).compararLibros((UsuarioCentroCultural) user);
				break;

			case 6:
				((CentroCultural) centroCultural).verLocalizacionMaterial((UsuarioCentroCultural) user);
				;
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

	public void seleccionarAccion(CentroCultural centroCultural) {
		UsuarioCentroCultural user = new UsuarioCentroCultural();
		super.seleccionarAccion(centroCultural, user);
	}

}
