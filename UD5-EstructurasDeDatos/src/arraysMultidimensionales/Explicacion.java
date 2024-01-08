package arraysMultidimensionales;

public class Explicacion {

	public static void main(String[] args) {
		
//		ACCESO, MODIFICACIÓN O ESCRITURA Ctrl+shift+x ctrl+/ ctrl+shift+c
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]); // Outputs 7
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]);
		
//		INICIALIZACIÓN
		double [][] tabla = {
			    {3.6, 8.2, 12,1},
			    {4.0, 23.4, 11}
			};
		
//		PUEDEN HABER ARRAYS IRREGULARES, SU PUEDE INICIALIZAR UNA DIMENSIÓN Y LA OTRA NO (como seleccionar la linea entera)
		
		
		
		
//		RECORRER 
//		(POR CADA DIMENSIÓN UN FOR anidados) (for each y darle nombre a cada array)
		int[][] matriz={{1,2,3},{4,5},{6,7,8,9,10},{11}};
		for(int i=0;i<matriz.length;i++){
		    for(int j=0;j<matriz[i].length;j++){
		        System.out.println(matriz[i][j]);
		    }
		}
//		REVISAR
		for (int [] lista : matriz) {
			for(int i : lista) {
				System.out.println(i);
			}
		}
	}
}
