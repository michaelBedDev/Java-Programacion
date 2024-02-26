package centroAcademico;

public class App {

	public static void main(String[] args) {

		CentroAcademico cole = new CentroAcademico();
		UsuarioCentroAcademico user = UsuarioCentroAcademico.getInstance();
		MenuCentroAcademico menu = new MenuCentroAcademico(user, cole);
		menu.seleccionarAccion(cole);

	}
}
