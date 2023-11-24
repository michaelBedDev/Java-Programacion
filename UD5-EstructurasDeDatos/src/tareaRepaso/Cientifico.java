package tareaRepaso;

import java.util.Scanner;

public class Cientifico {

	private String nombre;
	private String apellidos;
	public enum Experiencia {Alta, Media, Baja};
	private int yearsTrabajados = 0;
	private Scanner sc;
	
	//Constructores
	Cientifico(){}
	
	Cientifico(String nombre, String apellidos, int yearsTrabajados) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.yearsTrabajados = yearsTrabajados;
	}
	

	//Metodo altaCientifico
		public void altaCientifico() {
			sc = new Scanner(System.in);
			System.out.println("Introduce los datos del científico:");
			System.out.println("Nombre:");
			String nombre = sc.nextLine();
			System.out.println("Apellidos:");
			String apellidos = sc.nextLine();
			
			//Como introducir un constructor en un metodo
			Cientifico.(nombre,apellidos, 0){}
			
			
			
		}
	
	
	@Override
	public String toString() {
		return "Cientifico [nombre=" + nombre + ", apellidos=" + apellidos + ", yearsTrabajados=" + yearsTrabajados
				+ "]";
	}

	
	//Getters & Setters
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
	public int getYearsTrabajados() {
		return yearsTrabajados;
	}
	public void setYearsTrabajados(int yearsTrabajados) {
		this.yearsTrabajados = yearsTrabajados;
	}
}


