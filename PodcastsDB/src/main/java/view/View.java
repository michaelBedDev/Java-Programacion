package view;

import java.util.List;
import java.util.Scanner;

import data.Autor;
import data.Genero;
import data.Podcast;

public class View {

	protected static Scanner sc;
	private Menu menu;

	/* Constructor */
	public View() {
		super();
		View.sc = new Scanner(System.in);
		this.menu = new Menu();
	}

	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public void showPodcast(Podcast podcast) {
		System.out.println(podcast);
	}

	public String askForString(String message) {
		String output;
		do {
			showMessage(message);
			output = sc.nextLine();
		} while (output.isBlank() || output.isEmpty());
		return output;
	}

	public int askForInt(String message) {
		int output = -1;

		do {
			try {
				showMessage(message);
				output = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				showMessage("Número no válido");
			}
		} while (output < 0);

		return output;
	}
	
	/* Show Collection */
	public <T> void showCollection(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}
	}

	/* Ask for Podcast */
	public Podcast askForPodcast() {
		String calidad = null;
		String formatoVideo = null;

		String titulo = askForString("Introduce el titulo del nuevo podcast:");
		byte tipo = audioOrVideo();
		if (tipo == 0) {
			calidad = askForString("Introduce la calidad de audio del podcast");
		} else {
			formatoVideo = askForString("Introduce el formato de video");
		}

		int duracion = askForInt("Introduce la duración del podcast (numero)");
		String periodicidad = askForString("Introduce la perodicidad del podcast");

		
		return new Podcast(1, titulo, tipo, calidad, duracion, periodicidad, formatoVideo);
	}

	/* Ask for Audio or Video */
	private byte audioOrVideo() {
		char output;
		do {
			System.out.println("Es un podcast de [A]udio o [V]ideo? Introduce la letra:");
			output = sc.nextLine().toUpperCase().charAt(0);
		} while (output != 'A' && output != 'V');
		return (byte) (output == 'A' ? 0 : 1);
	}

	/* Ask for Author */
	public Autor askForAuthor() {
		String dni = askForString("Introduce el DNI del autor");
		String apellidos = askForString("Introduce los apellidos del autor");
		String nombre = askForString("Introduce el nombre del autor");

		return new Autor(1, dni, apellidos, nombre);
	}

	/* Ask for Genero */
	public Genero askForGen() {
		String nombre = askForString("Introduce el nombre del Género");
		return new Genero(1, nombre);
	}

	/* Getters & Setters */
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
