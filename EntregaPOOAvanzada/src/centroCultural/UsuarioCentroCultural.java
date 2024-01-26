package centroCultural;

import java.util.Scanner;
import plantillas.Usuario;
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
			// Revisar lógica
			if (!(input.equals("libro") || input.equals("disco"))) {
				System.out.println("Por favor, introduce alguna de las opciones");
			}
		} while (input != "libro" && input != "disco");

		MaterialAGuardar nuevo = new MaterialAGuardar();
		switch (input) {
			case "disco" -> nuevo = inputAltaDisco((Disco) inputAltaMaterial(nuevo = new Disco()));
			case "libro" -> nuevo = inputAltaLibro((Libro) inputAltaMaterial(nuevo = new Libro()));
		}
		return nuevo;
	}

	
	
	
	
	
	
	
	private MaterialAGuardar inputAltaMaterial(MaterialAGuardar nuevo) {

		this.sc = new Scanner(System.in);
		System.out.println("Introduce la información general");
		nuevo.setInfoGeneral(sc.nextLine());
		System.out.println("Introduce el título");
		nuevo.setTitulo(sc.nextLine());
		System.out.println("Introduce el autor");
		nuevo.setAutor(sc.nextLine());

		return nuevo;
	}

	private Disco inputAltaDisco(Disco nuevo) {
		System.out.println("Introduce la discráfica");
		nuevo.setNombreDiscografica(sc.nextLine());
		return nuevo;

	}

	private Libro inputAltaLibro(Libro nuevo) {

		System.out.println("Introduce el número de páginas del libro");
		nuevo.setNumPaginas(Integer.parseInt(sc.nextLine()));
		return nuevo;

	}

	private void introducirNombre(Cliente c) {
		do {
			System.out.println("Introduzca su nombre: ");
			c.setNombre(sc.nextLine());
		} while (c.getNombre() == ""); // Se repetirá si es una cadena vacía
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
