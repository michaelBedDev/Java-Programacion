package supermercado;

import plantillas.Menu;

public class MenuSupermercado extends Menu {

	private UsuarioEntradaDeDatos user;
	private Cajero cajero;

	public MenuSupermercado(UsuarioEntradaDeDatos user, Cajero cajero) {
		super();
		this.user = user;
		this.cajero = cajero;
	}

	@Override
	protected void imprimirOpciones() {
		System.out.println("----VALORES POR DEFECTO----");
		System.out.println("PRODUCTOS A-0000 hasta A-003");
		System.out.println("USUARIOS U1 U2 U3 U4\n");
		System.out.println("*****MENU*****");
		System.out.println("[1] Pagar Cesta");
		System.out.println("[2] Aplicar Descuento");
		System.out.println("[3] Ordenar Lista de la Compra");
		System.out.println("[4] Visualizar cola del cajero");
		System.out.println("[5] Alta del producto en una Cesta");
		System.out.println("[6] Alta de proucto por fichero");
		System.out.println("[99] Salir");
	}

	public void seleccionarAccion(Cajero cajero) {
		super.seleccionarAccion();
	}

	protected boolean accionARealizarSwitch() {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		boolean exit = false;
		
		int seleccion = 0;
		try {
			seleccion = user.inputSeleccionar();
			
			switch (seleccion) {
				case 1:
					cajero.pagarCesta();
					break;
				case 2:
					cajero.aplicarDescuento(user.pedirIdentificadorUsuario());
					break;
				case 3:
					cajero.ordenarListaCompra(user.pedirIdentificadorUsuario());
					break;
				case 4:
					cajero.mostrarCestasEsperando();
					break;
				case 5:
					cajero.altaProductoEnCesta(user.pedirIdentificadorProducto(), user.pedirIdentificadorUsuario());
					break;
				case 6:
					cajero.altaProductosPorFichero();
					break;
				
				case 99:
					exit = true;
					cajero.mostrarComprasDia();
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
