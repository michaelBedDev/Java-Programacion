package ejercicio6.Coche.POO;

public class Main {

	public static void main(String[] args) {
		
		
		Coche coche1= new Coche();
		coche1.pasajeros=5;
		coche1.deposito=60;
		coche1.kpl=20;

		Coche coche2= new Coche();
		coche2.pasajeros=7;
		coche2.deposito=100;
		coche2.kpl=30;
		Coche cocheMayorAutonomia=coche1.mayorAutonomia(coche2);
		System.out.println("El coche de mayor autonomia tiene de deposito "+ cocheMayorAutonomia.deposito + 
				" y de consumo "+ cocheMayorAutonomia.kpl);
	}
}


