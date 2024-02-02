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
		System.out.println("[2] Alta Disco");
		System.out.println("[3] Alta Libro");
		System.out.println("[4] Realizar Préstamo");
		System.out.println("[5] Consultar Préstamo");
		System.out.println("[6] Comparar Libros");
		System.out.println("[7] Mostrar dónde se guarda el material");
		System.out.println("[99] Salir");

	}
	
	
	public void seleccionarAccion(CentroCultural centroCultural) {
		super.seleccionarAccion();
	}

	protected boolean accionARealizarSwitch() {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				centroCultural.altaCliente();
				break;
			case 2:
				centroCultural.altaDisco();
				break;
			case 3:
				centroCultural.altaLibro();
				break;
			case 4:
				centroCultural.prestarMaterial();
				break;
			case 5:
				centroCultural.consultarPrestamo();
				break;
			case 6:
				centroCultural.introducirLibrosToComparar();
				break;
			case 7:
				centroCultural.mostrarMateriales();
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
