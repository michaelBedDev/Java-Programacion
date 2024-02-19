package ordenacionEjercicio3;

import java.util.Collections;
import java.util.LinkedList;


public class App {

	public static void main(String[] args) {
		LinkedList <Estudiante> listaEstudiantes = new LinkedList<>();
		
		Estudiante e1 = new Estudiante("Pablo",18);
		Estudiante e2 = new Estudiante("Pedro", 25);
		Estudiante e3 = new Estudiante("Marta",23);
		Estudiante e4 = new Estudiante("Pablo",23);
		
		listaEstudiantes.add(e1);
		listaEstudiantes.add(e2);
		listaEstudiantes.add(e3);
		listaEstudiantes.add(e4);
		
		Collections.sort(listaEstudiantes, new SortByNameAge());
		
		listaEstudiantes.forEach(estudiante -> System.out.println(estudiante));
	}
}
