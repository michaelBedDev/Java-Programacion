package apuntesCreacionCoche;

public class Coche {

	 int pasajeros; //número de pasajeros
	 int deposito; //capacidad del depositos en litros
	 int kpl; //kilometros que se pueden recorrer con un litro,
	 String modelo;
	 
	 
	 Id_Coche id; //Referenciamos a la clase id coche desde la clase coche. Creamos la variable id de clase Id_Coche
	 
	 
	 void arreglar () {
		 
		System.out.println("Estamos arreglando este " + modelo);
	 }
	 
	 @Override
	public String toString() {
		return "Modelo:" + modelo + " Autonomía:" + deposito + " Pasajeros: " + pasajeros;
	}
	 
	 public int autonomiaCoche() {
		 int autonomia = kpl*deposito;
		return autonomia;
	 }

	
}




