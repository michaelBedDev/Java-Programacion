package centroCultural;



import plantillas.Menu;
import plantillas.Usuario;

public class MenuCentroCultural extends Menu {

	private UsuarioCentroCultural user;
	private CentroCultural centroCultural;
	
	
	
	public MenuCentroCultural(UsuarioCentroCultural user, CentroCultural centroCultural) {
		super();
		this.user = user;
		this.centroCultural = centroCultural;
	}



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
	
	

	protected boolean accionARealizarSwitch() {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				centroCultural.altaCliente(user);
				break;
			case 2:
				centroCultural.altaDisco(user);

				break;
			case 3:
				
				break;
			case 4:
				((CentroCultural) centroCultural).prestarMaterial((UsuarioCentroCultural) user);

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
		super.seleccionarAccion();
	}
}
