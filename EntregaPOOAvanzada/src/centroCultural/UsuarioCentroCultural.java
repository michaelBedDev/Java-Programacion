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

	


//	public void introducirNombre(Cliente c) {
//		do {
//			System.out.println("Introduzca su nombre: ");
//			c.setNombre(sc.nextLine());
//		} while (c.getNombre() == ""); // Se repetirá si es una cadena vacía
//	}

	public String introducirDNI() {
		// Comprobación DNI 8 números y letra
		String inputDNI; 
		
		do {
			System.out.println("DNI: (8 Números y una letra)");
			inputDNI = sc.nextLine();
		} while (!ValidarDNI.validarDNI(inputDNI));
		return inputDNI;
	}

	public int introducirCodigoMaterial() {
		int codigo;
		do {
			System.out.println("Introduce el numId del material");
			codigo = sc.nextInt();

		} while (codigo < 1 && codigo > 999);
		return codigo;
	}

	public int introducirCodigoLibroComparar() {
		int codigo;
		do {
			System.out.println("Introduce el numId del libro a comparar");
			codigo = sc.nextInt();

		} while (codigo < 1 && codigo > 999);
		return codigo;
	}
}
