package view;



public class Menu {

	public void imprimirOpciones() {
		System.out.println("\n" + "-".repeat(20) + "MENU" + "-".repeat(20));
		System.out.println("[1] Agregar nuevo Podcast");
		System.out.println("[2] Alta nuevo Género");
		System.out.println("[3] Actualizar Géneros de un Podcast");
		System.out.println("[4] Eliminar Podcast");
		System.out.println("[5] Ver todos los Podcast almacenados");
		System.out.println("[6] Navegar entre los Podcast");
		System.out.println("[7] Mostrar los autores almacenados");
		System.out.println("[8] Mostrar los géneros almacenados");
		System.out.println("[99] Salir");
	}
}
