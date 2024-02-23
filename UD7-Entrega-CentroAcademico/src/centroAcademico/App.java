package centroAcademico;

public class App {

	public static void main(String[] args) {
		
		App app = new App();
		CentroAcademico cole = new CentroAcademico();
		UsuarioCentroAcademico user = new UsuarioCentroAcademico();
		MenuCentroAcademico menu = new MenuCentroAcademico(user, cole);
		menu.seleccionarAccion(cole);

	}
}
