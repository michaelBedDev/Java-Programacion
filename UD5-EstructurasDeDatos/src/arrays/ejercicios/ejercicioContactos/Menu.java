package arrays.ejercicios.ejercicioContactos;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	
	public void seleccionarAccion(Contacto [] listaContactos) {
		sc = new Scanner(System.in);
		
		System.out.println("*[1] para mostrar todos los contactos por teclado*");
		System.out.println("*[2] para buscar un email                        *");

		int seleccion = sc.nextInt();
		sc.nextLine();
		
		switch (seleccion) {
			case 1:
				for (Contacto c : listaContactos) {
					if (c!=null){					
						System.out.println(c);
					}
				}
				break;
			case 2:
				System.out.println("Introduce el email a buscar");
	
				String emailABuscar = sc.nextLine();
				
				buscarEmail(emailABuscar, listaContactos);
				break;
		}
		
	}

	
	//Metodo buscarEmail
	private void buscarEmail(String emailABuscar, Contacto [] listaContactos) {
		for(Contacto c : listaContactos) {
			
			if (c.getEmail().equals(emailABuscar)){
				System.out.println("El email ha sido encontrado");
				
				c.actualizarEmail();
				
				break;
			}else {
				System.out.println("El email no ha sido encontrado");
			}
			
		}
		
	}
	
	
	
	
}
