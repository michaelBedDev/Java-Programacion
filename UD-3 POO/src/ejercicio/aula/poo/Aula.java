package ejercicio.aula.poo;

public class Aula {

	int id;
	int planta;
	
	Alumno alu1;
	Alumno alu2;
	Alumno alu3;
	
	@Override
	public String toString() {
		return ("Aula número: " + id + " en la planta " + planta +
				" Alumnos en el aula: " +"\n" + alu1 + "\n" + alu2 + "\n" + alu3);
	}
}
