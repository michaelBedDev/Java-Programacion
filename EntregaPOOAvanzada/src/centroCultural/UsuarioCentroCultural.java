package centroCultural;

import java.util.Scanner;

import validaciones.ValidarDNI;

public class UsuarioCentroCultural extends Usuario {

	// Metodos
	public Cliente inputAltaCliente() {
		this.sc = new Scanner(System.in);
		Cliente c = new Cliente();

		introducirNombre(c);
		introducirDNI(c);
		c.setListaPeticiones(new Peticion[6]);
		return c;
	}

	public MaterialAGuardar inputAltaMateriales() {
		this.sc = new Scanner(System.in);

		System.out.println("¿Deseas añadir un disco, o un libro?");
		String input = sc.nextLine().toLowerCase();

		do {
			// Revisar lógica con openAI
			if (!(input.equals("libro") || input.equals("disco"))) {
				System.out.println("Por favor, introduce alguna de las opciones");
			}
		} while (input != "libro" && input != "disco");

		switch (input) {
			case "disco" -> inputAltaDisco();
			
			//return. varias operacies con lambda?

			case "libro" -> inputAltaLibro();
		}
	}

	Disco(String infoGeneral, int numId, String titulo, String localizacion, String autor, String nombreDiscografica) {
 Libro(String infoGeneral, int numId, String titulo, String localizacion, String autor, int numPaginas) {			
		}
		
		
		return null;
		
	}

	private void introducirNombre(Cliente c) {
		do {
			System.out.println("Introduzca su nombre: ");
			c.setNombre(sc.nextLine());
		} while (c.getNombre() != ""); // Se repetirá si es una cadena vacía
	}

	private void introducirDNI(Cliente c) {
		// Comprobación DNI 8 números y letra
		String inputDNI;
		do {
			System.out.println("DNI: (8 Números y una letra)");
			inputDNI = sc.nextLine();
		} while (!ValidarDNI.validarDNI(inputDNI));
		c.setDNI(inputDNI);
	}
}
