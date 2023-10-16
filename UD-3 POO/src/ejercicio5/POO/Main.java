package ejercicio5.POO;

public class Main {

	public static void main(String[] args) {
		
		//ECHARLE UN OJO MUY INTERESANTE EL USO DEL CONSTRUCTOR
		Coche coche1 = new Coche(5, 55, 18);
		 System.out.println("coche1:");
		 System.out.println("\tpasajeros: " + coche1.getPasajeros());
		 System.out.println("\tdeposito: " + coche1.getDeposito());
		 System.out.println("\tkpl: " + coche1.getKpl());
		 
		 
		 //Forma de copiar coche con GET forma 1
		 Coche coche2 = new Coche();
		 coche2.copiarCoche(coche1.getPasajeros(), coche1.getDeposito(), coche1.getKpl());
		 
		 //Forma de copiar coche con GET forma 2 (mejor)
		 coche2.copiarCoche(coche1); //
		 
		 
		 System.out.println("Tiene coche1 más autonomía que coche2?");
		 System.out.println(coche1.mayorAutonomia(coche2));
		 
		 Coche.precioGasolina();
	}

}

/*Si un metodo es static no necesitamos ningun objeto para ejecutarlo
  forman parte de la clase*/
