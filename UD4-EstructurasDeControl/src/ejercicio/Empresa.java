package ejercicio;

import java.util.Scanner;

public class Empresa {

	private long CIF;
	private String nombre;
	private String dirección;
	private int numEmpleados;
	private Scanner sc = new Scanner(System.in);
	private Empleado empleado;
	


	//CONSTRUCTORES
	Empresa(){
	}
	
	public void datosEmpresa() {
		System.out.println("Datos de la empresa: ");
		System.out.println("CIF: ");
		this.CIF = sc.nextLong();
		System.out.println("Nombre: ");
		sc.next();//Limpiamos Búffer
		this.nombre = sc.nextLine();
		System.out.println("Dirección: ");
		this.dirección = sc.nextLine();
		System.out.println("Número de Empleados: ");
		this.numEmpleados = sc.nextInt();
	}
	
	
	//toString
	public String toString() {
		return "Empresa [CIF=" + CIF + ", nombre=" + nombre + ", dirección=" + dirección + ", numEmpleados="
				+ numEmpleados + "]" + empleado;
	}

	//GETTERS & SETTERS
	public long getCIF() {
		return CIF;
	}
	public void setCIF(long cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	public int getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
}
