package ejercicio;

import java.util.Scanner;

public class Empleado {

	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private String lugarNacimiento;
	private Scanner sc = new Scanner(System.in);
	
	
	//CONSTRUCTORES
	Empleado(){
	}
	
	public void datosEmpleado() {
		System.out.println("Introduce los datos del empleado: ");
		System.out.println("DNI: ");
		this.setDNI(sc.nextLine());
		System.out.println("Nombre: ");
		this.setNombre(sc.nextLine());
		System.out.println("Apellidos: ");
		this.setApellidos(sc.nextLine());
		
		do {
			System.out.println("Edad: ");	
			this.setEdad(sc.nextInt());
		}while(true);
		
		System.out.println("Lugar de Nacimiento: ");
		this.setLugarNacimiento(sc.nextLine());
		sc.next(); //Limpiamos Búffer
	}

	
	//toString
	public String toString() {
		return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", lugarNacimiento=" + lugarNacimiento + "]";
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
