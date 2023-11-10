package ejercicio;

import java.util.Scanner;

public class EjercicioTest {

	public static void main(String[] args) {
		
		//CREACION DE LA EMPRESA
		Empresa empresa1 = new Empresa();
		empresa1.datosEmpresa();
		
		Empleado empleado1 = new Empleado();
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
				System.out.println(empleado1.toString());
				break;
			case 3:
				//Creamos objetos
				Empleado empleadoNuevo = new Empleado();
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
				empleadoNuevo.setDNI(datosPersona.next());
				empleadoNuevo.setNombre(datosPersona.next());
				empleadoNuevo.setApellidos(datosPersona.next());
				empleadoNuevo.setEdad(datosPersona.nextInt());
				empleadoNuevo.setLugarNacimiento(datosPersona.next());
				datosPersona.close();
				
				Scanner datosCompany = new Scanner(datosEmpresa);
				datosCompany.useDelimiter("&");
				empresaNueva.setCIF(datosCompany.next());
				empresaNueva.setDirección(datosCompany.next());
				empresaNueva.setNombre(datosCompany.next());
				empresaNueva.setNumEmpleados(datosCompany.nextInt());

			
				
				System.out.println(empleadoNuevo.toString());
				System.out.println(empresaNueva.toString());
				
				break;

				//validacion de datos
				//Debug
				//Buffer Caso 3
			
		}
		
			
		
	}

}
