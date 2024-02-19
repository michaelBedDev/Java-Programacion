package listasEjercicio1Agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Persona persona1 = new Persona(60000001,"NombreA");
		Persona persona2 = new Persona(60000002,"NombreB");
		Persona persona3 = new Persona(60000003,"NombreC");
		
		List <Persona> agenda = new ArrayList <>();
		agenda.add(persona1);
		agenda.add(persona2);
		agenda.add(persona3);
		
		agenda.size();
		
		//listar agenda
		for (Persona persona : agenda) {
			System.out.println(persona);
		}
		
		agenda.forEach(z -> System.out.println(z));
		
		Iterator <Persona> it = agenda.iterator();
		while (it.hasNext()) {
			Persona persona = (Persona) it.next();
			System.out.println(persona);
		}
		
		
		for (Iterator iterator = agenda.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			System.out.println(persona);
			
		}
		
		
		//eliminar contacto
		agenda.remove(2);
		
		//resetear la agenda
		agenda.clear();
	}
}
