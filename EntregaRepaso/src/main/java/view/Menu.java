package view;

public class Menu {

	public void showMenu() {
		System.out.println("***Menú***");
		System.out.println("1. Alta equipo");
		System.out.println("2. Alta participante");
		System.out.println("3. Eliminar equipo de carrera");
		System.out.println("4. Dar premio");
		System.out.println("5. Mostrar equipo formateado");
		System.out.println("6. Unir 2 equipos");
		System.out.println("7. Participante más joven");
		System.out.println("8. Tareas Base de Datos");
		System.out.println("9. Salir");
		
	}
	
	public void showBBDDMenu() {
		System.out.println("***Menú Base de Datos***");
		System.out.println("IMPORTANTE: Asegúrese de haber incluído los datos en la conexión en el .env");
		System.out.println("1. Crear Tabla");
		System.out.println("2. Añadir Registros");
		System.out.println("3. Mostrar Datos");
		System.out.println("4. Salir");
	}
}
