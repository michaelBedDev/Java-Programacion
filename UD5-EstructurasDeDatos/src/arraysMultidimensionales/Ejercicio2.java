package arraysMultidimensionales;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int [][] matriz = {{11,12,13,14},{21,22},{31,32,33}};
		
		for (int [] lista : matriz) {
			for(int i : lista) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
