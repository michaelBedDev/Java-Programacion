package forExplicacion;

public class Potencia {

	public static void elevarPotencia(int a, int b) {
		int potencia = 1;
		for (int i=1;i<=b;i++) {
			potencia*=a;
		}
		System.out.println(potencia);
			
			/*OTRA FORMA
			 int potencia = 1;
		     for (;b>0;b--) {
			 	potencia*=a;
			 }
			 System.out.println(potencia);
			 */
	}
}

