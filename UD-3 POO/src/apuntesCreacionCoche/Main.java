package apuntesCreacionCoche;

public class Main{
	 public static void main(String[] args) {
	 Coche golf = new Coche();//se crea el objeto
	 golf.pasajeros=5;//se usa el objeto
	 golf.kpl = 37;
	 golf.deposito = 55;
	 System.out.println("pasajeros:" + golf.pasajeros); //se usa el objeto
	 System.out.println("kilometros por litro:" + golf.kpl); //se usa el objeto
	 System.out.println("deposito:" + golf.deposito); //se usa el objeto
	 
	 Coche coche2 = new Coche();
	 coche2.pasajeros = 4;
	 coche2.kpl = 73;
	 coche2.deposito = 33;
	 
	 golf.modelo = "Audi A3";
	 
	 coche2.modelo = "Kia Ceed";
	 
	 golf.arreglar();
	 coche2.arreglar();
	 
	 System.out.println("pasajeros:" + golf.pasajeros); //se usa el objeto
	 System.out.println("kilometros por litro:" + golf.kpl); //se usa el objeto
	 System.out.println("deposito:" + golf.deposito); //se usa el objeto
	 
	 Coche megane = new Coche();
	 megane.deposito = 60;
	 System.out.println(megane.deposito);
	 }
}
