package supermercado;

import plantillas.Usuario;

public class UsuarioEntradaDeDatos extends Usuario {

	private static final UsuarioEntradaDeDatos INSTANCIA = new UsuarioEntradaDeDatos();

	public static UsuarioEntradaDeDatos getInstance() {
		return INSTANCIA;
	}

	private UsuarioEntradaDeDatos() {
		super();
	}

	public String pedirIdentificadorUsuario() {
		String input = super.pedirString("Introduce el identificador del Cliente. Ejemplo: U1 (Valor por defecto)").trim();
		return input;
	}
	
	public String pedirIdentificadorProducto() {

		String input;

		do {
			input = super.pedirString("Introduce el identificador del Producto. Ejemplo: A-0001").trim();

			if (!input.matches("[A-Z]-[0-9]{4}")) {
				System.out.println("Por favor, introduce el formato del identificador correctamente");
			}
		} while (!input.matches("[A-Z]-[0-9]{4}"));

		return input;
	}

}
