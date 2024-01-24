package centroCultural;

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
				
				break;
			case 2:
				
				
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
	
	

	
}
