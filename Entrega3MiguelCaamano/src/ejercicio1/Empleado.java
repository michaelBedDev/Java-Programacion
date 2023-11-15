package ejercicio1;

import java.util.Scanner;

public class Empleado {

	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private String lugarNacimiento;
	private Scanner sc = new Scanner(System.in);
	
	
	//CONSTRUCTORES
	Empleado() {}
	
	Empleado(String DNI, String nombre, String apellido, int edad, String lugarNac){
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
		this.lugarNacimiento = lugarNac;
	}
	
	//METODO DATOS EMPLEADO
	public void datosEmpleado() {
		System.out.println("Introduce los datos del empleado: ");
		String stringTest = ""; //Utilizamos la cadena vacía para validar
		
		//Comprobación DNI 8 números y letra
		String inputDNI;
		do {
			System.out.println("DNI: (8 Números y una letra)");
			inputDNI = sc.nextLine();
		} while (!validarDNI(inputDNI));
		this.setDNI(inputDNI);
		
		do {
			System.out.println("Nombre: ");
			this.setNombre(sc.nextLine());
		} while (nombre==stringTest); //Se repetirá si es una cadena vacía
	
		do{
			System.out.println("Apellidos: ");
			this.setApellidos(sc.nextLine());
		} while (apellidos==stringTest); //Se repetirá si es una cadena vacía
		
		//Comprobación edad entre 17 y 70 años
		do {
			System.out.println("Edad: (Entre 17 y 70 años)");	
			this.setEdad(Integer.parseInt(sc.nextLine()));
		} while (edad<=16 || edad>70);
		
		sc.nextLine(); //Limpiamos el Búffer
		
		do {
			System.out.println("Lugar de Nacimiento: ");
			this.setLugarNacimiento(sc.nextLine());
		} while(lugarNacimiento==stringTest); //Se repetirá si es una cadena vacía
		
		System.out.println();
	}

	//METODO VALIDAR DNI
	private static boolean validarDNI(String dni) {
		
		//Comprobamos longitud del DNI
		if (dni.length() !=9) {
			System.out.println("Longitud equivocada, inténtelo de nuevo");
			return false;
		}
		//Comprobamos que los 8 primeros dígitos sean números
		for(int i=0; i<8;i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				System.out.println("Los 8 primeros caracteres no son números, inténtelo de nuevo");
				return false;
			}
		}
		//Comprobamos que el último número sea una letra
		if(!Character.isLetter(dni.charAt(8))) {
			System.out.println("El último caracter no es una letra, inténtelo de nuevo");
			return false;
		}

		//Comprobamos que la letra introducida sea correcta
		return comprobarLetraDNI(dni);
	}
	
	//METODO VALIDAR LETRA DNI
	private static boolean comprobarLetraDNI(String dni) {
		int numDNI = Integer.parseInt(dni.substring(0,8)); //Extraemos el numero de DNI
		numDNI %= 23; //Dividimos entre 23 para saber la letra
		String letraDNI = switch (numDNI) {
			case 0 -> "T";
			case 1 -> "R";
			case 2 -> "W";
			case 3 -> "A";
			case 4 -> "G";
			case 5 -> "M";
			case 6 -> "Y";
			case 7 -> "F";
			case 8 -> "P";
			case 9 -> "D";
			case 10 -> "X";
			case 11 -> "B";
			case 12 -> "N";
			case 13 -> "J";
			case 14 -> "Z";
			case 15 -> "S";
			case 16 -> "Q";
			case 17 -> "V";
			case 18 -> "H";
			case 19 -> "L";
			case 20 -> "C";
			case 21 -> "K";
			case 22 -> "E";
			default -> ("Unexpected value: " + numDNI);
		};
		
		//Comprobamos si la letra resultante equivale a la letra introducida
			if (letraDNI.equals(Character.toString(dni.charAt(8)))) 
				return true;
			else 
				System.out.println("Letra equivocada, inténtelo de nuevo");
				return false;
		}
	
	
	
	//toString
	public String toString() {
		return "Empleado [DNI: " + DNI + ", nombre: " + nombre + ", apellidos: " + apellidos + ", edad: " + edad
				+ ", lugar de nacimiento: " + lugarNacimiento + "]";
	}
	
	
	//GETTERS & SETTERS
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String string) {
		this.lugarNacimiento = string;
	}
}
