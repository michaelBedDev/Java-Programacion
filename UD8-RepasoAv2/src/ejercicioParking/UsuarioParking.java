package ejercicioParking;


import plantillas.Usuario;

public class UsuarioParking extends Usuario{

	private static final UsuarioParking INSTANCIA = new UsuarioParking();

	public static UsuarioParking getInstance() {
		return INSTANCIA;
	}

	private UsuarioParking() {
		super();
	}

	public String pedirMatricula() {
		String input;
		
		do {
			input = super.pedirString("Introduce el número de matrícula del coche").trim();
			if (!input.matches("[0-9]{4}[A-Z]{3}")) {
				System.out.println("Por favor, introduce el formato correctamente");
			}
		} while (!input.matches("[0-9]{4}[A-Z]{3}"));
		
		return input;
	}
	
	public char escogerTipoCoche() {
		char seleccion;
		
		do {
			seleccion = super.pedirString("Introduce el tipo de coche a registrar. [C] para coche)/[F] para furgoneta").toUpperCase().charAt(0);
			if (seleccion!='F' && seleccion !='C') {
				System.out.println("Por favor, introduce la letra correspondiente");
			}
		} while (seleccion!='F' && seleccion !='C');
		return seleccion;
	}
}
