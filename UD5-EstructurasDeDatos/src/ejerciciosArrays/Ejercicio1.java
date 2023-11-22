package ejerciciosArrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Calcular numeros pares e impares dentro del array
		int [] numeros1_10 = {1,2,3,4,5,6,7,8,9,10};
		
		Ejercicio1.calcularParImpar(numeros1_10);
	}
	
	 public static void calcularParImpar(int numeros[]) {
		 int numerosPares = 0;
		 int numerosImpares = 0;
		 
		for(int n : numeros) {
			if(n%2==0) {
				numerosPares++;
			}else {
				numerosImpares++;
			}
		}
		System.out.println("Cantidad de números pares: " + numerosPares);
		System.out.println("Cantidad de números impares: " + numerosImpares);
	}

}
