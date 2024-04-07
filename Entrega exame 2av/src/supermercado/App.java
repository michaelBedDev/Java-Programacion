package supermercado;



public class App {

	public static void main(String[] args) {

		Cajero gadis = new Cajero();
		UsuarioEntradaDeDatos user = UsuarioEntradaDeDatos.getInstance();
		MenuSupermercado menu = new MenuSupermercado(user, gadis);
		
		System.out.println("----CESTAS POR DEFECTO----");
		gadis.mostrarProductosYCestas();
		menu.seleccionarAccion(gadis);

	}
}
