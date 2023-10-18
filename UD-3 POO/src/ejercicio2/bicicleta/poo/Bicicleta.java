package ejercicio2.bicicleta.poo;

public class Bicicleta {

	private int velocidade = 0;
	private int marcha = 1;
	
	
	void cambiarMarcha(int novoValor) {
	marcha = novoValor;
	}
	void acelerar(int incremento) {
	velocidade = velocidade + incremento;
	}
	void frear(int decremento) {
	velocidade = velocidade - decremento;	
	}

	void imprimirEstado() {
		System.out.println("La bicicleta tiene una velocidad = " + velocidade + " y una marcha = " + marcha);
	}
	
	//CONSTRUCTORES
	Bicicleta() {
		
	}
	
	Bicicleta (int velocidade, int marcha) {
		setVelocidade(velocidade);
		setMarcha(marcha);
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
