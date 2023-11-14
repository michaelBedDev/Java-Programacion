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
	public boolean validarDNI(String dni) {
		
		//Comprobamos longitud del DNI
		if (dni.length() !=9) {
			return false;
		}
		//Comprobamos que los 8 primeros dígitos sean números
		for(int i=0; i<8;i++) {
			if (!Character.isDigit(dni.charAt(i))) {
			return false;
			}
		}
		//Comprobamos que el último número sea una letra
		if(!Character.isLetter(dni.charAt(8))){
			return false;
		}
		return true;
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
