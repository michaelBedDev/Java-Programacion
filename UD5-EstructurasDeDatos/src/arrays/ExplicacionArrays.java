package arrays;

public class ExplicacionArrays {

	public static void main(String[] args) {
		
		//Declaración
		int []  id_productos;
		String [] nombre;
		Cliente [] listadosCliente;
		
		//Inicialización sin datos, solo longitud
		id_productos = new int [10]; // acabamos de crear un array de 10 números enteros
		nombre = new String [5];
		
		//Iniciación y declaración
		Cliente [] listadoClientes = new Cliente [20]; // hemos creado un array unidimensional para 20 objetos cliente
		float [] temp_maxs = new float [10];
		
		
		//Creación del array
		String [] dias_semana = {"Lunes", "Martes", "Miércoles", "Viernes"};
		
		
		
		//LECTURA Y ESCRITURA DEL ARRAY
		dias_semana[2] = "Sabado"; // escritura
		System.out.println(dias_semana[3]); //lectura
		
		
		//Propiedad length
		int [] lista = new int[10];
		System.out.println (lista.length);
		
		
		//Recorrer Arrays (ejemplo al revés)
		int [] numbers = {5, 3, 9, 2, 8};
		for (int i=0; i<numbers.length; i++){ //Tiene que empezar en 0 ya que los arrays empiezan en 0
		    System.out.print(numbers[i]+" "); //La longitud es 5 pero la posición es 4 por eso <
		}
		System.out.println(numbers.length);
		
		
		int [] numeros = {5, 3, 9, 2, 8};
		
		//Recorrer arrays for
		for (int i=0; i<numeros.length; i++){
		    System.out.print(numeros[i]);   
		}
		System.out.println();
		//For each
		for (int n : numbers){
		    System.out.print(n);
		}
		System.out.println();
		//While    
		int i=0;
		while (i<numbers.length){
		    System.out.print(numbers[i]);
		    i++;
		}
		
		
		//Pedir arrays por teclado
		//Añadir elementos a un array
		//eliminar elementos de un array
		
		
	}

}
