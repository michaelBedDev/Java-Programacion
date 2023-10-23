package ejercicio3;

public class DemoNum {

	public static void main(String[] args) {
		
		//Creamos objetos
		Complejo com = new Complejo();
		com.setReal(7);
		com.setImag(7);
		Complejo plejo = new Complejo(4,3);
		
		//toString antes de la suma
		System.out.println(plejo);
		plejo.sumar(com);
		
		//toString después de la suma
		System.out.println(plejo);
		

	}

}
