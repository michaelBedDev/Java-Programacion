package plantillas;

import java.util.Scanner;

public class Cadena_Especial {

	
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
	empresaNueva.setNombre(datosCompany.next());
	empresaNueva.setDirección(datosCompany.next());
	empresaNueva.setNumEmpleados(datosCompany.nextInt());
	datosCompany.close();
	//Mostramos por pantalla los datos y asignamos el empleado a la empresa
	empresaNueva.setEmpleado(empleadoNuevo);
	System.out.println(empresaNueva.toString());
	break;
	
	
}
