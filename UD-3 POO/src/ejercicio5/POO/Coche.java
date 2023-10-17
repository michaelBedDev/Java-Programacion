package ejercicio5.POO;

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
	
	public Coche () {
		
		pasajeros = 0;
		deposito = 0;
		kpl = 0;
	}
	
	//MÉTODOS
	int calcularAutonomia() {
		return kpl*deposito;
	}
	
	double gasofaNecesaria(int kilometros) {
		return kilometros/kpl;
	}
	
	boolean mayorAutonomia (Coche d) {   //OJITO AL THIS MUY INTERESANTE
		int autonomia1 = this.getKpl()*this.getDeposito();
		int autonomia2 = d.getKpl()*d.getDeposito();
		return autonomia1 > autonomia2 ? true : false;
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
