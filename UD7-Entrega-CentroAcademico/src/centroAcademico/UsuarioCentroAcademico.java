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
	
	
	//pedir expediente
	public  String pedirNumExpediente() {
		return super.pedirString("Introduce el número de Expediente del alumno");
	}
	
	public String pedirNombreAlumno() {
		return super.pedirString("Introduce el nombre del alumno")	;	
	}
	
	public String pedirCodigoAsignatura() {
		return super.pedirString("Introduce el codigo de la asignatura");
	}
	
	public String pedirNombreAsignatura() {
		return super.pedirString("Introduce el nombre de la asignatura");
	}
	
	public String pedirCreditosAsignatura() {
		return super.pedirString("Introduce el numero de creditos de la asignatura");
	}
	
	public double pedirCalificacionAlumno() {
		double nota;
		
		do {
			nota = super.pedirNumeroD("Introduce la nota del alumno");
		} while (nota < 1 || nota > 10);
		
		return nota;
	}
}
