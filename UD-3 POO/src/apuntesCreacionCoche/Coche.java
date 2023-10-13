package apuntesCreacionCoche;

public class Coche {

	//Escribir private int para usar los get y los sets
	
	private int pasajeros; //número de pasajeros
	 int deposito; //capacidad del depositos en litros
	 int kpl; //kilometros que se pueden recorrer con un litro,
	 String modelo;
	 
	 
	 Id_Coche id; //Referenciamos a la clase id coche desde la clase coche. Creamos la variable id de clase Id_Coche
	 
	 //SETTERS Y GETTERS
	 public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getKpl() {
		return kpl;
	}

	public void setKpl(int kpl) {
		this.kpl = kpl;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Id_Coche getId() {
		return id;
	}

	public void setId(Id_Coche id) {
		this.id = id;
	}

	void arreglar () {
		 
		System.out.println("Estamos arreglando este " + modelo);
	 }
	 
	 @Override
	public String toString() {
		return "Modelo:" + modelo + " Autonomía:" + deposito + " Pasajeros: " + pasajeros;
	}
	 
	 int autonomiaCoche() {
		 int autonomia = kpl*deposito;
		return autonomia;
	 }
	 
	 double gasofaNecesaria(int kilometros){
		 return (double) kilometros/kpl;
		 }

	
}




