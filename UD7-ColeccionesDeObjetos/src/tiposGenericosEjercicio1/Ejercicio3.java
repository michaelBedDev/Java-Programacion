package tiposGenericosEjercicio1;

public class Ejercicio3 {

	static <T> void imprimirArray(T[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.println(t[i].toString());
	}
	
	public static void main(String[] args) {
		Integer[] listaInteger = {1,2,3,4,5}; 
		Double[] listaDouble = {1.1,2.2,3.3,4.4,5.5};
		
		Persona[] listaPersonas = {new Persona("Jaime"), new Persona("Juan")};
		
		imprimirArray(listaInteger);
		imprimirArray(listaDouble);
		imprimirArray(listaPersonas);
	}
}
