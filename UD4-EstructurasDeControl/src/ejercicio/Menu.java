package ejercicio;

import java.util.Scanner;

public class Menu {

	private int seleccion;
	
	
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*".repeat(43));
			System.out.println("* ¿Qué desea hacer?" + " ".repeat(23)+"*");
			System.out.println("* [1]--- Alta de empleado" + " ".repeat(17)+"*");
			System.out.println("* [2]--- Mostrar información del empleado *");
			System.out.println("* [3]--- Cadena Especial" + " ".repeat(18)+"*");
			System.out.println("*".repeat(43));
			seleccion = sc.nextInt();
		} while (seleccion == 0);
		return this.seleccion;
	}

	
	//GETTERS & SETTERS
	public int getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(int seleccion) {
		this.seleccion = seleccion;
	}
}
