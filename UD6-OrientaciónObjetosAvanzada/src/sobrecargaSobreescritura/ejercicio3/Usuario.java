package sobrecargaSobreescritura.ejercicio3;

import java.util.Scanner;

public class Usuario {

	private Scanner sc;

	public int inputSeleccionar() {
		this.sc = new Scanner(System.in);
		int seleccion = sc.nextInt();
		return seleccion;
	}

	public Perro adoptarPerro(Perro p) {
		System.out.println("¿Como quieres llamar al perro?");
		this.sc = new Scanner(System.in);
		p.setNombre(sc.nextLine());
		p.setPeso(5.5);
		p.setColor("Blanco");

		return p;
	}
}
