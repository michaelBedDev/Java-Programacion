package ejercicio2.bicicleta.poo;

public class Bicicleta {

	private double velocidade;
	private int marcha;
	
	//Constructor por defecto
		Bicicleta(){
			
			velocidade = 0;
			marcha = 1;
			
		}
		
	//Constructor por parametros
	Bicicleta(int m, double v){
		
		velocidade = v;
		marcha = m;
		
	}
	
	void cambiarMarcha(int novoValor) {
		marcha = novoValor;
	}
	void acelerar(int incremento) {
		velocidade += incremento;
	}
	void frear(int decremento) {
		velocidade -= decremento;
	}
	void imprimirEstado() {
		System.out.println("La velocidad actual es: " + velocidade +
				" y la marcha actual es: " + marcha);
	}
	
	//SETTER Y GETTER
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}	
	
}
