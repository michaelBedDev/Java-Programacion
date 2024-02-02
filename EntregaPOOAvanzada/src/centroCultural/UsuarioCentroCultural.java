package centroCultural;

import plantillas.Usuario;
import validaciones.ValidarDNI;

public class UsuarioCentroCultural extends Usuario {

	private static final UsuarioCentroCultural INSTANCIA = new UsuarioCentroCultural();

	public static UsuarioCentroCultural getInstance() {
		return INSTANCIA;
	}

	public UsuarioCentroCultural() {
		super();
	}

	public String introducirDNI() {
		// Comprobación DNI 8 números y letra
		String inputDNI;

		do {
			System.out.println("DNI: (8 Números y una letra)");
			inputDNI = sc.nextLine();
		} while (!ValidarDNI.validarDNI(inputDNI));
		return inputDNI;
	}
}
