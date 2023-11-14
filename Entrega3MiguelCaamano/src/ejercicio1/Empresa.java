package ejercicio1;

import java.util.Scanner;

public class Empresa {

	private String CIF;
	private String nombre;
	private String direccion;
	private int numEmpleados;
	private Scanner sc = new Scanner(System.in);
	private Empleado empleado;
	


	//CONSTRUCTORES
	Empresa(){
	}
	
	Empresa(String CIF, String nomEmpresa, String direccion, int numEmpleados) {}
	
	
	//METODOS
	public void datosEmpresa() {
		String stringTest = ""; //PARA VALIDACION
		int intTest = 0;            //PARA VALIDACION
		
		System.out.println("Datos de la empresa: ");
		do{
			System.out.println("CIF: ");
			this.CIF = sc.nextLine();
		} while(CIF==stringTest);
		
		do {
			System.out.println("Nombre: ");
			this.nombre = sc.nextLine();
		} while (nombre==stringTest);
		
		do {
			System.out.println("Dirección: ");
			this.direccion = sc.nextLine();
		} while (direccion==stringTest);
		
		do {
			System.out.println("Número de Empleados: ");
			this.numEmpleados = Integer.parseInt(sc.nextLine());
		} while (numEmpleados==intTest);
		
		sc.nextLine(); //Limpiamos el Búffer
		
		System.out.println();
	}
	
	
	//toString
	public String toString() {
		return "Empresa [CIF: " + CIF + ", nombre: " + nombre + ", dirección: " + direccion + ", número de empleados: "
				+ numEmpleados + "]\n" + empleado;
	}

	//GETTERS & SETTERS
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return direccion;
	}
	public void setDirección(String dirección) {
		this.direccion = dirección;
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
