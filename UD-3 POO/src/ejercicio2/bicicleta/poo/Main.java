package ejercicio2.bicicleta.poo;

public class Main {

	public static void main(String[] args) {
		
		//Crear dos objetos bicicleta
		Bicicleta bicicleta1 = new Bicicleta(0, 0);
		Bicicleta bicicleta2 = new Bicicleta(0, 0);
		
		bicicleta1.setVelocidade(0);
		bicicleta1.setMarcha(1);
		
		bicicleta2.setVelocidade(0);
		bicicleta2.setMarcha(1);
		
		
		//Invocar los métodos
		bicicleta1.acelerar(10);
		bicicleta1.cambiarMarcha(2);
		bicicleta1.imprimirEstado();
		
		bicicleta2.acelerar(10);
		bicicleta2.cambiarMarcha(2);
		bicicleta2.frear(2);
		bicicleta2.cambiarMarcha(3);
		bicicleta2.imprimirEstado();
		
	}

}
