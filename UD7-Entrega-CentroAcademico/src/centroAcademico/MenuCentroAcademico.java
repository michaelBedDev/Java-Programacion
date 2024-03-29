package centroAcademico;

import plantillas.Menu;

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
		System.out.println("----VALORES POR DEFECTO: ALUMNOS 00000000A & 00000000B. ASIGNATURA: A-111----");
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

		int seleccion = 0;
		try {
			seleccion = user.inputSeleccionar();

			switch (seleccion) {
				case 1:
					centroAcademico.crearAlumno(user.pedirNumExpediente(), user.pedirNombreAlumno());
					break;
				case 2:
					centroAcademico.crearAsignatura(user.pedirCodigoAsignatura(), user.pedirNombreAsignatura(),
							user.pedirCreditosAsignatura());
					break;
				case 3:
					centroAcademico.matricular(user.pedirNumExpediente(), user.pedirCodigoAsignatura());
					break;
				case 4:
					centroAcademico.imprimirAlumno(user.pedirNumExpediente());
					break;
				case 5:
					centroAcademico.imprimirAlumnos();
					break;
				case 6:
					centroAcademico.imprimirAsignatura(user.pedirCodigoAsignatura());
					break;
				case 7:
					centroAcademico.agregarCalificacion(user.pedirNumExpediente(), user.pedirCodigoAsignatura(),
							user.pedirCalificacionAlumno());
					break;
				case 8:
					centroAcademico.compararAlumno(user.pedirNumExpediente(), user.pedirNumExpediente());
					break;
				case 99:
					exit = true;
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
