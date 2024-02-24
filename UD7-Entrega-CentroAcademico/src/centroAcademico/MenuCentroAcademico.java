package centroAcademico;

import plantillas.Menu;
import plantillas.Usuario;

public class MenuCentroAcademico extends Menu {

	private UsuarioCentroAcademico user;
	private CentroAcademico centroAcademico;

	public MenuCentroAcademico(UsuarioCentroAcademico user, CentroAcademico centroAcademico) {
		super();
		this.user = user;
		this.centroAcademico = centroAcademico;
	}

	@Override
	protected void imprimirOpciones() {
		System.out.println("[1] Crear Alumno");
		System.out.println("[2] Crear Asignatura");
		System.out.println("[3] Matricular");
		System.out.println("[4] Imprimir Alumno");
		System.out.println("[5] Imprimir Alumnos");
		System.out.println("[6] Imprimir Asignatura");
		System.out.println("[7] Agregar Calificacion");
		System.out.println("[8] Comparar Alumno");		
		System.out.println("[99] Salir");

	}

	public void seleccionarAccion(CentroAcademico centroAcademico) {
		super.seleccionarAccion();
	}

	protected boolean accionARealizarSwitch() {
		// TODO Auto-generated method stub
		this.imprimirOpciones();
		boolean exit = false;

		int seleccion = user.inputSeleccionar();
		switch (seleccion) {
			case 1:
				centroAcademico.crearAlumno(null, null);
				break;
			case 2:
				centroAcademico.crearAsignatura(null, null, null);
				break;
			case 3:
				centroAcademico.matricular(null, null);
				break;
			case 4:
				centroAcademico.imprimirAlumno(null);
				break;
			case 5:
				centroAcademico.imprimirAlumnos();
				break;
			case 6:
				centroAcademico.imprimirAsignatura(null);
				break;
			case 7:
				centroAcademico.agregarCalificacion(null, null, 0);
				break;
			case 8:
				centroAcademico.compararAlumno(null, null);
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
