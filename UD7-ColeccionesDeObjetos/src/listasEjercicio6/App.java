package listasEjercicio6;



public class App {

	public static void main(String[] args) {
		
		Avion avion = new Avion();
		
		Pasajero pasajero1 = new Pasajero();
		pasajero1.setNombre("a");
		Pasajero pasajero2 = new Pasajero();
		pasajero2.setNombre("b");
		Pasajero pasajero3 = new Pasajero();
		pasajero3.setNombre("c");
		
		
		avion.insert(pasajero1);
		avion.insert(pasajero2);
		avion.insert(pasajero3);
		
		//duda
		avion.goFirst();
//		avion.removeCurrent();
//		Pasajero x = (Pasajero) avion.getCurrent();
//		System.out.println(x.getNombre());
//		
//		avion.advance();
//		avion.advance();

		avion.listaPasajeros.forEach(p -> System.out.println(p.getNombre()));
		
		
	}
}
