package ejercicio;

import java.util.Scanner;

public class EjercicioTest {

	public static void main(String[] args) {
		
		//CREACION DE LA EMPRESA
		Empresa empresa1 = new Empresa();
		Empleado empleado1 = new Empleado();
		empresa1.datosEmpresa();
		empleado1.datosEmpleado();
		empresa1.setEmpleado(empleado1);
		
		//CREAMOS MENU
		Menu menu = new Menu();
		menu.showMenu();
		switch (menu.getSeleccion()) {
			case 1:
				Empleado empleado2 = new Empleado();
				empleado2.datosEmpleado();
				empresa1.setEmpleado(empleado2);
				break;
			case 2: 
				empleado1.toString();
				break;
			case 3:
				//Creamos objetos
				Empleado empleadonuevo = new Empleado();
				Empresa empresaNueva = new Empresa();
				
				//Recogemos por teclado y dividimos la cadena en 2
				System.out.println("Introduce la cadena especial para la creación del empleado:");
				Scanner teclado = new Scanner(System.in);
				String cadenaEspecial = teclado.nextLine();
				Scanner cadena = new Scanner(cadenaEspecial);
				cadena.useDelimiter("%");
				String datosEmpleado = cadena.next();
				String datosEmpresa = cadena.next();
				cadena.close();
				
				//Asignamos datos empleado
				Scanner datosPersona = new Scanner(datosEmpleado);
				datosPersona.useDelimiter("&");
				empleadonuevo.setDNI(datosPersona.next());
				empleadonuevo.setNombre(datosPersona.next());
				empleadonuevo.setApellidos(datosPersona.next());
				empleadonuevo.setEdad(datosPersona.nextInt());
				empleadonuevo.setLugarNacimiento(datosPersona.next());
				datosPersona.close();
				
				Scanner datosCompany = new Scanner(datosEmpresa);
				//Continuar
				//validacion de datos
			
		}
		
			
		
	}

}
