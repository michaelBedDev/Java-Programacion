package centroAcademico;

import plantillas.Usuario;
import validaciones.ValidarDNI;

public class UsuarioCentroAcademico extends Usuario {

	private static final UsuarioCentroAcademico INSTANCIA = new UsuarioCentroAcademico();

	public static UsuarioCentroAcademico getInstance() {
		return INSTANCIA;
	}

	private UsuarioCentroAcademico() {
		super();
	}

	public String pedirNumExpediente() {
		String input;

		do {
			input = super.pedirString("Introduce el número de Expediente del alumno. Este se corresponderá con su DNI")
					.trim();

			if (!input.matches("/^[a-z]{3}[0-9]{6}[a-z]?$/i")) {
				System.out.println("Por favor, introduce el formato de DNI correctamente");
			}
		} while (!input.matches("/^[a-z]{3}[0-9]{6}[a-z]?$/i"));

		return input;

	}

	public String pedirNombreAlumno() {
		return super.pedirString("Introduce el nombre del alumno").trim();
	}

	public String pedirCodigoAsignatura() {

		String input;

		do {
			input = super.pedirString("Introduce el codigo de la asignatura. Ejemplo: A-111").trim();

			if (!input.matches("/[A-Z]-\\d{3}/gm")) {
				System.out.println("Por favor, introduce el formato de la Asignatura correctamente");
			}
		} while (!input.matches("/[A-Z]-\\d{3}/gm"));

		return input;
	}

	public String pedirNombreAsignatura() {
		return super.pedirString("Introduce el nombre de la asignatura").trim();
	}

	public String pedirCreditosAsignatura() {

		int creditos = 0;
		boolean esNumero = false;

		do {
			String input = super.pedirString("Introduce el numero de creditos de la asignatura").trim();

			try {
				creditos = Integer.parseInt(input);
				esNumero = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes introducir un número válido.");
			}

		} while (!esNumero || creditos < 1);

		return String.valueOf(creditos);
	}

	public double pedirCalificacionAlumno() {

		double nota = 0.0;
		boolean esNumero = false;

		do {

			String input = super.pedirString("Introduce la nota del alumno: ").trim();

			try {
				nota = Double.parseDouble(input);
				esNumero = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes introducir un número válido.");
			}

		} while (!esNumero || nota < 1 || nota > 10);

		return nota;
	}
}
