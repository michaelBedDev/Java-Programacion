package centroCultural;

import plantillas.Menu;
import plantillas.Usuario;

public class MenuCentroCultural extends Menu{

	@Override
	protected void imprimirOpciones() {
		System.out.println("[1] Alta Cliente");
		System.out.println("[2] Alta Material");
		System.out.println("[3] Realizar Préstamo");
		System.out.println("[4] Consultar Préstamo");
		System.out.println("[5] Comparar Libros");
		System.out.println("[99] Salir");
		
	}

	@Override
	protected int accionARealizarSwitch(CentroCultural centroCultural, Usuario user) {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		
		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				centroCultural.altaCliente((UsuarioCentroCultural) user);
				break;
			case 2:
				centroCultural.altaMaterial((UsuarioCentroCultural) user);
				
				break;
			case 3:
				
				break;
			case 4:
				
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

	@Override
	public void seleccionarAccion(CentroCultural centroCultural) {
		// TODO Auto-generated method stub
		UsuarioCentroCultural user = new UsuarioCentroCultural();

		int seleccion;
		do {
			seleccion = accionARealizarSwitch(centroCultural, user);
		} while (seleccion != 99);
	}
	
	

	
}
