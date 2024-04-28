package userAndMenu;

import java.util.Scanner;

import db_tarea_ud9.Autor;
import db_tarea_ud9.Genero;
import db_tarea_ud9.Podcast;

public class Usuario {

	protected static Scanner sc;

	public Usuario() {
		super();
		Usuario.sc = new Scanner(System.in);
	}

	// Seleccionar en menu
	public int inputSeleccionar() {
		boolean isInteger = true;
		int output = 0;

		do {
			try {
				output = Integer.parseInt(sc.nextLine());
				isInteger = true;
			} catch (Exception e) {
				System.out.println("Por favor, introduce una opción válida");
				isInteger = false;
			}
		} while (!isInteger);
		return output;
	}

	public int pedirNumero(String textoPeticion) {
		int codigo = 0;
		boolean isInteger = true;
		do {
			System.out.println(textoPeticion);
			try {
				codigo = Integer.parseInt(sc.nextLine());
				isInteger = true;
			} catch (Exception e) {
				System.out.println("Por favor, introduce una opción válida");
				isInteger = false;
			}

		} while (!isInteger || (codigo < 1 || codigo > 999));
		return codigo;
	}

	public static String pedirString(String textoPeticion) {
		String output;
		do {
			System.out.println(textoPeticion);
			output = sc.nextLine();

		} while (output.equals(""));
		return output;
	}

	public Podcast askForPodcast() {
		String calidad = null;
		String formatoVideo = null;

		String titulo = pedirString("Introduce el titulo del nuevo podcast:");
		byte tipo = audioOrVideo();
		if (tipo == 0) {
			calidad = pedirString("Introduce la calidad de audio del podcast");
		} else {
			formatoVideo = pedirString("Introduce el formato de video");
		}

		int duracion = pedirNumero("Introduce la duración del podcast (numero)");
		String periodicidad = pedirString("Introduce la perodicidad del podcast");

		return new Podcast(1, titulo, tipo, calidad, duracion, periodicidad, formatoVideo,
				new Autor(pedirNumero("Introduce aquí el ID del autor del podcast"), "", "", ""));
	}

	private byte audioOrVideo() {
		char output;

		do {
			System.out.println("Es un podcast de [A]udio o [V]ideo? Introduce la letra:");
			output = sc.nextLine().toUpperCase().charAt(0);
		} while (output != 'A' && output != 'V');

		return (byte) (output == 'A' ? 0 : 1);
	}

	public static Autor askForAuthor() {

		String dni = pedirString("Introduce el DNI del autor");
		String apellidos = pedirString("Introduce los apellidos del autor");
		String nombre = pedirString("Introduce el nombre del autor");

		return new Autor(1, dni, apellidos, nombre);
	}
	
	
	public Genero askForGen() {
		String nombre = pedirString("Introduce el nombre del Género");
		return new Genero(1,nombre);
	}

}
