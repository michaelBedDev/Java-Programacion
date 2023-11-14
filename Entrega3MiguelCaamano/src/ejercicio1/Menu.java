package ejercicio1;

import java.util.Scanner;

public class Menu {

	private int seleccion;
	
	//METODO PRINT MENU
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("*".repeat(43));
			System.out.println("* ¿Qué desea hacer?" + " ".repeat(23)+"*");
			System.out.println("* [1]--- Alta de empleado" + " ".repeat(17)+"*");
			System.out.println("* [2]--- Mostrar información del empleado *");
			System.out.println("* [3]--- Cadena Especial" + " ".repeat(18)+"*");
			System.out.println("* [4]--- Alta de Empresa" + " ".repeat(18)+"*");
			System.out.println("* [5]--- Salir" + " ".repeat(28)+"*");
			System.out.println("*".repeat(43));
			this.seleccion = Integer.parseInt(sc.nextLine());
		} while (this.seleccion >5 || this.seleccion<=0);

		return this.seleccion;
	}
	
	
	//METODO MENU SWITCH
	public void numSeleccionMenu() {
				
		//CREACION DE LA EMPRESA DEFAULT Y EMPLEADO DEFAULT
			Empresa empresaDefault = new Empresa("C70654321","Inversiones ABC S.A.","Avenida Central 123, Madrid",18);
				
			Empleado empleadoDefault = new Empleado("98345271K","Ana","Martínez",38,"Barcelona");
			empresaDefault.setEmpleado(empleadoDefault);

			switch (getSeleccion()) {
				case 1:
					//Alta de empleado, nuevo objeto empleado y llamamos al método
					Empleado empleado1 = new Empleado();
					empleado1.datosEmpleado();
					empresaDefault.setEmpleado(empleado1); //Asignamos el empleado a la empresa default
					System.out.println(empleado1.toString());
					break;
				case 2: 
					//Print de los datos del empleado por Defecto
					System.out.println(empleadoDefault.toString());
					break;
				case 3:
					//Creamos objetos para el nuevo Empleado y su Empresa
					Empleado empleadoNuevo = new Empleado();
					Empresa empresaNueva = new Empresa();
					
					//Recogemos la cadena especial por teclado y dividimos la cadena en 2
					System.out.println("Introduce la cadena especial para la creación del empleado:");
					Scanner teclado = new Scanner(System.in);
					String cadenaEspecial = teclado.nextLine();
					Scanner cadena = new Scanner(cadenaEspecial);
					cadena.useDelimiter("%");
					String datosEmpleado = cadena.next();
					String datosEmpresa = cadena.next();
					cadena.close();
					
					//Asignamos los datos al empleado con un nuevo Scanner para el useDelimiter
					Scanner datosPersona = new Scanner(datosEmpleado);
					datosPersona.useDelimiter("&");
					empleadoNuevo.setDNI(datosPersona.next());
					empleadoNuevo.setNombre(datosPersona.next());
					empleadoNuevo.setApellidos(datosPersona.next());
					empleadoNuevo.setEdad(datosPersona.nextInt());
					empleadoNuevo.setLugarNacimiento(datosPersona.next());
					datosPersona.close();
					
					//Asignamos los datos a la Empresa con otro Scanner para el useDelimiter
					Scanner datosCompany = new Scanner(datosEmpresa);
					datosCompany.useDelimiter("&");
					empresaNueva.setCIF(datosCompany.next());
					empresaNueva.setDirección(datosCompany.next());
					empresaNueva.setNombre(datosCompany.next());
					empresaNueva.setNumEmpleados(datosCompany.nextInt());
					datosCompany.close();
					//Mostramos por pantalla los datos y asignamos el empleado a la empresa
					empresaNueva.setEmpleado(empleadoNuevo);
					System.out.println(empresaNueva.toString());
					break;
				case 4:
					//Alta de empresa, nuevo objeto empresa y llamamos al método
					Empresa empresaNew = new Empresa();
					empresaNew.datosEmpresa();
					System.out.println(empresaNew.toString());
					break;
				case 5:
					break;
			}
	}

	
	//GETTERS & SETTERS
	public int getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(int seleccion) {
		this.seleccion = seleccion;
	}
}
