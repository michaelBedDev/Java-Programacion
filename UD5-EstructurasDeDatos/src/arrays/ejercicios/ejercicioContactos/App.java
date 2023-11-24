package arrays.ejercicios.ejercicioContactos;

public class App {

	public static void main(String[] args) {
	
		Contacto persona1 = new Contacto("Álvaro","Álvarez","alvaroaa@gmail.com",Contacto.generarTelefono());
		Contacto persona2 = new Contacto("Benito","Borges","benitobb@gmail.com",Contacto.generarTelefono());
		Contacto persona3 = new Contacto("Carlos","Cerezo", "carloscc@gmail.com",Contacto.generarTelefono());
		
		Contacto [] listaContactos = new Contacto[20];
		listaContactos[0] = persona1; 
		listaContactos[1] = persona2;
		listaContactos[2] = persona3;
		
		Menu menu = new Menu();
		
		menu.seleccionarAccion(listaContactos);
	}
}