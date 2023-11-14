package breakAndContinue;

public class BreakYContinue {

	public static void main(String[] args) {
		
		/*EJERCICIO 1
		for(int i=1; i<=3;i++){
			 System.out.println("Bucle externo, COMIENZA iteración:"+i);
			 for(int j=1;j<=5;j++){
			 if(j==3)
			 continue;
			 System.out.println("\tBucle interno en iteración:"+j);
			 }
			 System.out.println("Bucle externo, FINALIZA iteración:"+i +"\n");
		}
		*/
		/*EJERCICIO 2
		int num = 1002;
		int cifras = 0;
		while(cifras < 5 && num > 0) {
			num/=10;
			cifras++;
		}


		if (cifras==5)
		System.out.println("El número tiene 5 o más dígitos");
		else
		System.out.println("El número tiene menos de 5 dígitos");
		*/
		
		//LABELS
		/* label for outer loop
		outer:
		for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
		if (j == 1)
		break outer;
		System.out.println(" value of j = " + j);
		}
		} // end of outer loop
		} // end of main()
		} // end of class Main
        */
    }
}

