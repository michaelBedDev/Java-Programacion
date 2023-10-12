package ejerciciosEntradaSalida;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		float baseImponible = 22.75f;
		
		System.out.printf("Base imponible %10.2f %n", baseImponible);
		System.out.printf("IVA %21.2f %n", baseImponible*0.21);
		System.out.println("-------------------------");
		System.out.printf("Total %19.2f", baseImponible*1.21);
		

	}

}
