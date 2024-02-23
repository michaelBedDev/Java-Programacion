package centroAcademico;

import plantillas.Usuario;
import validaciones.ValidarDNI;

public class UsuarioCentroAcademico extends Usuario {

	private static final UsuarioCentroAcademico INSTANCIA = new UsuarioCentroAcademico();

	public static UsuarioCentroAcademico getInstance() {
		return INSTANCIA;
	}

	public UsuarioCentroAcademico() {
		super();
	}
}
