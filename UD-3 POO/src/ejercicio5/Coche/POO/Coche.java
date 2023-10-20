package ejercicio5.Coche.POO;

public class Coche {

	private int pasajeros;
	private int deposito;
	private int kpl;
	
	//CONSTRUCTORES
	public Coche(int p, int d, int k){
		pasajeros = p;
		deposito = d;
		kpl = k;
	}                                       //Con constructores no hay return
	
	public Coche () {}
	
	//MÉTODOS
	int calcularAutonomia() {
		return this.kpl*this.deposito;
	}
	double gasofaNecesaria(int kilometros) {
		return kilometros/this.kpl;
	}
	
	
	boolean mayorAutonomia (Coche c) {   //OJITO AL THIS MUY INTERESANTE
		return this.calcularAutonomia()>c.calcularAutonomia();
	}
	
	
	/*boolean mayorAutonomia (Coche d) {
		
		return this.calcularAutonomia > d.calcularAutonomia()) ? true : false;
	}
	*/
	
	/*
	Coche mayorAutonomia(Coche c){
	
		return(this.calcularAutonomia()>c.calcularAutonomia()) ? this : c; //Necesita identificar al coche 
																		   // y no ejercicio5.POO.Coche@5e265ba4
	}
	*/
	
	
	//METODO ESTATICO
	static void precioGasolina () {
		System.out.println("El precio es: 1.6€" );
	}
	
	
	//SETTERS AND GETTERS
	public int getPasajeros() {
		return pasajeros;
		
	}
	public void setPasajeros(int p) {
		this.pasajeros = p;
		
	}
	public int getDeposito() {
		return deposito;
		
	}
	public void setDeposito(int d) {
		this.deposito = d;
		
	}
	public int getKpl() {
		return kpl;
		
	}
	public void setKpl(int k) {
		this.kpl = k;
		
	}
	
	
	//Copiar Coche forma 1 con parámetros
	void copiarCoche(int p, int d, int k) {
		pasajeros = p;						//Atributos azul clarito						
		deposito = d;						//Variables locales azul oscuro
		kpl = p;
	}
	//Copiar coche forma 2 con GET
	void copiarCoche(Coche c) {
		pasajeros = c.getPasajeros();
		deposito = c.getDeposito();
		kpl = c.getKpl();
		
	
		
	}
}
