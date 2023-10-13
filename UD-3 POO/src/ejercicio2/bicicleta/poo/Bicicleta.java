package ejercicio2.bicicleta.poo;

public class Bicicleta {

	private int velocidade;
	private int marcha;
	
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
	public int getVelocidade() {
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
