package mapasEjercicio2;

import java.util.TreeMap;

public class App {
	
	public static void main(String[] args) {
		TreeMap<String,Integer> guiaTelefonica = new TreeMap<>();
		guiaTelefonica.put("Marcos", 600000001);
		guiaTelefonica.put("Lucia", 600000002);
		guiaTelefonica.put("Xan", 600000003);
		
		//Obtener el numero a partir del nombre
		System.out.println(guiaTelefonica.get("Marcos"));
		
		//actualizar Numero
		guiaTelefonica.replace("Marcos", 699999999);
		System.out.println(guiaTelefonica.get("Marcos"));
		
		//Mostrar todas las Entradas de la guía
		guiaTelefonica.forEach((nombre, numero) -> System.out.println(nombre + " => " + numero));
	}
}
