package centroCultural;

import java.util.Arrays;

public class Cliente {

	private String nombre;
	private String DNI;
	private Peticion [] listaPeticiones = new Peticion [6];
	
	
//Constructor
	public Cliente() {
		//TODO Auto-generated constructor stub
	}
	
	public Cliente(String nombre, String DNI, Peticion[] listaPeticiones) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.listaPeticiones = listaPeticiones;
	}

	
	@Override
	public String toString() {
		
		return "Nombre del cliente: "  + nombre + "\nDNI: " + DNI + "\nPeticiones restantes: " + mostrarPeticionesRestantes();
	}


	private int mostrarPeticionesRestantes() {
		int contador = 6;
		for (int i = 0; i < listaPeticiones.length; i++) {
			if (listaPeticiones[i]!= null) {
				contador--;
			}
		}
		return contador;
	}
	
	
	
	
	//Getters & Setters
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

	public Peticion[] getListaPeticiones() {
		return listaPeticiones;
	}

	public void setListaPeticiones(Peticion[] listaPeticiones) {
		this.listaPeticiones = listaPeticiones;
	}
	
}
