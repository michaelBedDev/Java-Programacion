package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio2RevisarVolverAHacer {

	//Revisar
	public static void main(String[] args) {
	 int [] elementos;
	 elementos = new int [10];
	 
	 int [] lista = new int [10];
	 
	 int [] numeros = {5,7,2,5,3};
	 Arrays.sort(numeros);
	 
	 for (int n : numeros) {
	 System.out.print(n);
	 }
	 
	 
	 System.out.println();
	 int m = 0;
	 for (int n=0; n<numeros.length-1; n++) {
		 if (numeros[n]!=numeros[n+1]) {
			 numeros[m++]=numeros[n];
		 }
	 }
	 numeros[m++]= numeros.length - 1;
	 int [] nuevoArray = Arrays.copyOf(numeros, m);
	 for(int n : nuevoArray) {
		 System.out.println(n);
	 }


	}

}
