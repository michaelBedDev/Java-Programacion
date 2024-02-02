package centroCultural;

public class App {

	public static void main(String[] args) {
		CentroCultural libreria = new CentroCultural();
		UsuarioCentroCultural user = new UsuarioCentroCultural();
		MenuCentroCultural menu = new MenuCentroCultural(user, libreria);
		menu.seleccionarAccion(libreria);
	}
}
