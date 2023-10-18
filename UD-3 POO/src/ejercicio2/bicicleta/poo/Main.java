package ejercicio2.bicicleta.poo;

public class Main {

	public static void main(String[] args) {
		
		// Crea dous obxectos bicicleta
		 Bicicleta bicicleta1 = new Bicicleta();
		 Bicicleta bicicleta2 = new Bicicleta();
		 // Invoca os métodos destes obxectos
		 bicicleta1.acelerar(10);
		 bicicleta1.cambiarMarcha(2);
		 bicicleta1.imprimirEstado();
		 bicicleta2.acelerar(10);
		 bicicleta2.cambiarMarcha(2);
		 bicicleta2.acelerar(10);
		 bicicleta2.cambiarMarcha(3);
		 bicicleta2.imprimirEstado();
		 //un objeto bicicleta inicializado con velocidad 11 y marcha 2
		 Bicicleta bicicleta3 = new Bicicleta(11,2);
		 bicicleta3.imprimirEstado();
		
	}

}
