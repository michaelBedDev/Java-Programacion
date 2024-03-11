package exercicioRepaso;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	String textoMenu = "1 - Rexistrar un vehículo\n" + "2 - Rexistrar hora de entrada\n" + "3 - Retirar un vehículo\n"
			+ "4 - Contar plazas\n" + "5 - Ver datos dos vehículos aparcados\n"
			+ "6 - Crear directorios e actualizar ficheiros\n" + "7 - Ver o contido dos ficheiros\n" + "8 - Boa viaxe!";

	Garaxe g = new Garaxe();
	Vehiculo v;
	int contador;

	public void pedirMenu() throws IOException {

		g.vehiculosDefecto(); // coches por defecto no listado

		int opcionMenu = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(textoMenu);
			System.out.print("Opcion seleccionada: ");
			opcionMenu = sc.nextInt();
			switch (opcionMenu) {
			case 1:
				v = new Vehiculo();
				v = v.rexistrarVehiculo();
				if (g.nonExiste(v)) {
					g.engadirVehiculo(v);
				}
				break;
			case 2:
				try {
					if (g.verVehiculos()) {
						v = g.seleccionarVehiculo();
						contador = g.contarEspazo();
						g.aparcarVehiculo(contador, v);
						g.rexistrarEntrada(v);
						System.out.println(v.toStringHoraEntrada());
					}
				} catch (SenEspazoException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				int contador = g.verVehiculosSaida();
				if (contador != g.getVehiculosAparcados().size()) {
					v = g.seleccionarVehiculoSaida();
					g.rexistrarSaida(v);
					g.ticket(v);
					g.gardarRexistro(v);
					System.out.println(v.toStringDeuda());
					g.engadirVehiculo(v);
					g.retirarVehiculo(v);
				}
				break;
			case 4:
				g.contarPlazas();
				break;
			case 5:
				g.verVehiculosAparcados();
				break;
			case 6:
				try {
					g.crearDirectorios();
					g.crearFicheiros();
				} catch (IOException e) {
					System.out.println("Erro na creación dos ficheiros");
				}
				break;
			case 7:
				try {
					g.lerFicheiros();
				} catch (FileNotFoundException e) {
					System.out.println("Os ficheiros non existen ou non teñen contido");
				}
				break;
			case 8:
				System.out.println("Aburinho!\nFin do programa");
				break;
			default:
				System.out.println("Opción non valida");
				break;
			}

		} while (opcionMenu != 8);
	}

}
