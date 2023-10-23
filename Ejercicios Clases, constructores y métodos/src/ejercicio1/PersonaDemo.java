package ejercicio1;

import java.util.Scanner;

public class PersonaDemo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el nombre de la persona:");
	String nombreUser = sc.nextLine();
	System.out.println("Introduce la edad de la persona:");
	int edadUser = sc.nextInt();
	System.out.println("Introduce la altura de la persona:");
	double alturaUser = sc.nextDouble();
	
	//Creamos objetos
	Persona per = new Persona();
	Persona sona = new Persona(nombreUser,edadUser,alturaUser);
	
	System.out.println(per.toString());
	System.out.println(sona.toString());

	}
}
