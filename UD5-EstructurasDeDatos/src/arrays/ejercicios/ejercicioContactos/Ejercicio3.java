package arrays.ejercicios.ejercicioContactos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Contacto persona1 = new Contacto("Álvaro","Álvarez","alvaroaa@gmail.com",Contacto.generarTelefono());
		Contacto persona2 = new Contacto("Benito","Borges","benitobb@gmail.com",Contacto.generarTelefono());
		Contacto persona3 = new Contacto("Carlos","Cerezo", "carloscc@gmail.com",Contacto.generarTelefono());
		
		Contacto [] listaContactos = new Contacto[20];
		listaContactos[0] = persona1; 
		listaContactos[1] = persona2;
		listaContactos[2] = persona3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione 1-2-3");
		int seleccion = sc.nextInt();
		sc.nextLine();
		
		switch (seleccion) {
			case 1:
				for (Contacto n : listaContactos) {
					if (n!=null){					
						System.out.println(n);
					}
				}
				break;
			case 2:
				System.out.println("Introduce el email a buscar");
	
				String emailABuscar = sc.nextLine();
				for(Contacto n : listaContactos) {
					
					if (n.getEmail().equals(emailABuscar)){
						System.out.println("El email ha sido encontrado");
						break;
					}else {
						System.out.println("El email no ha sido encontrado");
					}
				}
					
				break;
			case 3:
				if(persona1.validarEmail(persona1.getEmail()) == true) {
					System.out.println("Es un email válido");
				}else {
					System.out.println("No es un email válido");
				}
				break;
		}
		
		
		
		
		
	}

}

