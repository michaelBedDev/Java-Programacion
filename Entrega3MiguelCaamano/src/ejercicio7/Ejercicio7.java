package ejercicio7;

public class Ejercicio7 {

	public static void diamante(int n, char c) {
		
		if (n%2!=0 && (n>=1 && n<34)) {
			
			for(int j=1;j<=n;j+=2){ //i iteración vertical
				for(int i=n;i>j;i-=2) { // iteración espacio
					System.out.print(" ");
				}
				for(int i=1; i<=j; i++) {
					System.out.print(c);
				}
				for(int i=n;i>j;i-=2) {
					System.out.print(" ");
				}
				
				System.out.println();
			}
			
			//Parte de abajo
			n-=2;
			for(int j=n;j>0;j-=2) {
				for(int i=n;i>=j;i-=2) { 
					System.out.print(" ");
				}
				for(int i=1;i<=j;i++) {
					System.out.print(c);
				}
				for(int i=n;i>=j;i-=2) {
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}else
			System.out.println("Introduzca otro número para la altura del diamante.");
	}
	
	
	public static void main(String[] args) {
		diamante(9,'#');
	}
}

