package ejercicio1;

public class Persona {

	private String nombre;
	private int edad;
	private double altura;
	
	
	
	//CONSTRUCTORES
	Persona () {
		this.nombre = "X";
		this.edad = -1;
		this.altura = -1;
	}
	Persona (String nombre, int edad, double altura){
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	
	
	
	
	public void name(String nom) {
		this.nombre = nom;
	}

	public String toString() {
		return "El nombre es " + this.nombre + ", la edad es " 
				+ this.edad + " y la altura es " + this.altura;
	}
	
	//GETTERS AND SETTERS
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getNombre(){ 
		return nombre; 
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
