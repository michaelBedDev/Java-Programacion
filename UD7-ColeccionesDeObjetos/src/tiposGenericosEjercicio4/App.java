package tiposGenericosEjercicio4;

import tiposGenericosEjercicio1.Persona;

public class App {

	public static void main(String[] args) {
		
		Integer[] listaInteger = {1,2,3,4,5};
		Persona[] listaPersonas = {new Persona("Javi"), new Persona("Joaquín")};
		
		MiListaEnlazada<Integer[]> listaEnlazada1 = new MiListaEnlazada<Integer[]>();
		listaEnlazada1.Tinsertar(listaInteger);
	}
}
