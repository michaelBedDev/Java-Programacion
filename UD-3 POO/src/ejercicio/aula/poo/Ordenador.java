package ejercicio.aula.poo;

public class Ordenador {

	int numeroOrdenador;
	String IP;
	String marca;
	boolean reparado;
	
	
	@Override
	public String toString() {
		
		return " Numero del ordenador :" + numeroOrdenador + " IP: " + IP;
	}
}
