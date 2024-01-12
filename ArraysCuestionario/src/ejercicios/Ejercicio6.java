package ejercicios;

public class Ejercicio6 {

	public static int kthLargest(int k, int [] lista){
		int temp = 0;
	    //ORDENAR
	    for (int i = 0; i < lista.length; i++) {
	        for (int j = 1; j < (lista.length - i); j++) {
	            if (lista[j - 1] > lista[j]) {
	                temp = lista[j - 1];
	                lista[j - 1] = lista[j];
	                lista[j] = temp;
	            }
	        }
	    }
		     return lista[lista.length -1- k];
		}
}
