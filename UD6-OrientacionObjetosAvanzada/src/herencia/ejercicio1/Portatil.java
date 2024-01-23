package herencia.ejercicio1;

public class Portatil extends Ordenador{

	private int peso;
	
	
	Portatil(String procesador, int RAM, int peso){
		super(procesador,RAM);
		this.peso = peso;
	}
}
