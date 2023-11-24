package arrays.ejercicios.ejercicioContactos;

import java.util.Random;
import java.util.Scanner;

public class Contacto {

	private String nombre;
	private String apellido;
	private String email;
	private long telefono;
	private Scanner sc;
	
	
	
	//Metodo generarTelefono
	public static long generarTelefono() {
		Random rand = new Random();
		long telefono = rand.nextLong(600000000,699999999);
		return telefono;
	}
	
	//Metodo buscarEmail
		public static void buscarEmail(String emailABuscar, Contacto [] listaContactos) {
			
			
				for(Contacto c : listaContactos) {
					if (c!=null) {
						if (c.getEmail().equals(emailABuscar)){
							System.out.println("El email ha sido encontrado");
							c.actualizarEmail();
							break;
						}else {
							System.out.println("El email no ha sido encontrado");
						}
					}
				}
				
		}
	
	
	//Metodo actualizarEmail
	private void actualizarEmail() {
		sc = new Scanner(System.in);
		
		System.out.println("Deseas actualizar el email? S/N");
		char decision = sc.next().charAt(0);
		do{
			if (decision == 'S') {
				System.out.println("Escribe el email a actualizar");
				
				String emailToUpdate = "";
				do{
					emailToUpdate = sc.next();
					
					if(emailToUpdate==null) {
						System.out.println("Por favor, introduce un email");
					}
				} while (emailToUpdate==null);
				
				if(validarEmail(emailToUpdate));{
					this.setEmail(emailToUpdate);
					System.out.println("Email actualizado correctamente");
				}				
				
			}else if(decision == 'N') {
				break;
			}
		} while (decision!='S' && decision != 'N');	
	}
	
	//Metodo validarEmail
		private boolean validarEmail(String email) {
			
			int contador = 0;
			for(int i = 0; i<email.length();i++) {
				if (email.charAt(i) == '@') {
					contador++;
				}
			}
			boolean emailValido = (contador == 1);
			
			System.out.println(emailValido ? "Es un email válido": "No es un email válido");
			return emailValido;
		}
	
	//Constructores
		Contacto(){}
		
		Contacto(String email){
			this.email = email; 
		}

		Contacto(String nombre, String apellido, String email, long telefono){
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
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
