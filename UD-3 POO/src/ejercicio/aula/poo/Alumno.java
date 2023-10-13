package ejercicio.aula.poo;

public class Alumno {

	int dni;
	int edad;
	String nombre;
	boolean curso;
	Ciclos ciclo;
	
	Ordenador ordenador;
	
	@Override
	public String toString() {
		
		return "Nombre: " + nombre + " edad: " + edad +
				" Ordenador: " + ordenador;
	}
}
