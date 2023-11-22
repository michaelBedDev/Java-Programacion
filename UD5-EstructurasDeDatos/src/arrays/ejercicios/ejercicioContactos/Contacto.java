package arrays.ejercicios.ejercicioContactos;

import java.util.Random;

public class Contacto {

	private String nombre;
	private String apellido;
	private String email;
	private long telefono;
	
	
	

	
	//Metodo telefono
	public static long generarTelefono() {
		Random rand = new Random();
		long telefono = rand.nextLong(600000000,699999999);
		return telefono;
	}
	//Metodo validarEmail
	public boolean validarEmail(String email) {
		
		int contador = 0;
		for(int i = 0; i<email.length();i++) {
			if (Character.valueOf(email.charAt(i)) == '@') {
				contador++;
			}
		}
		return(contador == 1);
	}
	
	
	
	
	
	
	//Constructores
		Contacto(){}

		Contacto(String nombre, String apellido, String email, long telefono){
			this.nombre= nombre;
			this.apellido= apellido;
			this.email= email;
			this.telefono = telefono;
		}	
	
		//toString
		@Override
		public String toString() {
			return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono="
					+ telefono + "]";
		}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
}
