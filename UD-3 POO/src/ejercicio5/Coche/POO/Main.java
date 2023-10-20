package ejercicio5.Coche.POO;

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
		 
		 
		 System.out.println("Tiene coche1 más autonomía que coche2? " + coche1.mayorAutonomia(coche2));
		 
		 Coche.precioGasolina();
		 
		 //NUEVO EJERCICIO
		 Coche citroenC1= new Coche();
		 citroenC1.setPasajeros(4);
		 citroenC1.setDeposito(50);
		 citroenC1.setKpl(25);
		 System.out.println("un citroen C1 permite sólo " + citroenC1.getPasajeros() + " pasajeros");
		 System.out.println("un citroen C1 tiene una autonomía de " + citroenC1.calcularAutonomia() + " kilómetros");
		 
		 System.out.println("Tiene citroen C1 más autonomía que coche1? " + citroenC1.mayorAutonomia(coche1));
	}

}

/*Si un metodo es static no necesitamos ningun objeto para ejecutarlo
  forman parte de la clase*/
