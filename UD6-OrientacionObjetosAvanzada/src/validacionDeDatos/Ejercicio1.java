package validacionDeDatos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un DNI");
		String dni = sc.nextLine();
		
		
		

	}
	
	//mal hecho
	
}

class Dni extends Exception {
	public void validarDNI(String dni) throws DNInoValidoException  {
		try {
			dni.matches("[[0-9]{8}[A-Z]");
		} catch (Exception e) {
			System.out.println("Excepción recibida" + e);
		}
	}
}
