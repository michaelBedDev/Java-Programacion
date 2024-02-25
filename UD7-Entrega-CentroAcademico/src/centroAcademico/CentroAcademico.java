package centroAcademico;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CentroAcademico implements IMetodosCA {

	HashMap<String, Alumno> mapaAlumnos;
	HashMap<String, Asignatura> mapaAsignaturas;

	protected CentroAcademico() {
		super();
		mapaAlumnos = new HashMap<>();
		mapaAsignaturas = new HashMap<>();
	}

	protected CentroAcademico(HashMap<String, Alumno> listaAlumnos, HashMap<String, Asignatura> listaAsignaturas) {
		super();
		mapaAlumnos = new HashMap<>();
		mapaAsignaturas = new HashMap<>();
		this.mapaAlumnos = listaAlumnos;
		this.mapaAsignaturas = listaAsignaturas;
	}

	@Override // Done
	public boolean crearAlumno(String expediente, String nombre) {

		Alumno alumnoNew = new Alumno();
		alumnoNew.setNumExp(expediente);
		alumnoNew.setNombre(nombre);

		Collection<Alumno> tempAlumnos = mapaAlumnos.values();

		for (Alumno alumno : tempAlumnos) {
			if (alumno.equals(alumnoNew)) {
				return false;
			}
		}
		mapaAlumnos.put(expediente, alumnoNew);
		return true;
	}

	@Override // Done
	public boolean crearAsignatura(String codigo, String nombre, String creditos) {

		Asignatura asignaturaNew = new Asignatura();
		asignaturaNew.setCodigo(codigo);
		asignaturaNew.setNombre(nombre);
		asignaturaNew.setCreditos(creditos);

		Collection<Asignatura> tempAsignaturas = mapaAsignaturas.values();

		for (Asignatura subject : tempAsignaturas) {
			if (subject.equals(asignaturaNew)) {
				return false;
			}
		}
		mapaAsignaturas.put(codigo, asignaturaNew);
		return true;
	}

	@Override // Done
	public boolean matricular(String expediente, String codigo) {

		// el metodo get devuelve el objeto
		if (mapaAlumnos.get(expediente) == null) {
			return false; // el alumno no existe
		}

		if (mapaAsignaturas.get(codigo) == null) {
			return false; // la asignatura no existe
		}

		ListIterator<Alumno> it = listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).listIterator();
		while (it.hasNext()) {
			Alumno alu = it.next();
			if (alu.getNumExp() == (mapaAlumnos.get(expediente).getNumExp())) {
				return false; // el alumno ya estaba matriculado;
			}
		}

		// matricular al alumno
		listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).add(mapaAlumnos.get(expediente));
		return true;
	}

	@Override // hacerlo con try catch
	public void imprimirAlumno(String expediente) {
		
		// hacerlo con try catch
		if (mapaAlumnos.get(expediente) == null) {
			 // el alumno no existe
		}
		
		System.out.println(mapaAlumnos.get(expediente));
		mapaAlumnos.get(expediente).getMapaCalificaciones().forEach((asignatura, calificacion) -> System.out
				.println("Asignatura: " + asignatura + "\t Calificacion: " + calificacion));

	}

	@Override // Done (?)
	public void imprimirAlumnos() {

		mapaAlumnos.forEach((exp, alumno) -> imprimirAlumno(exp));
	}

	@Override // hacerlo con try catch
	public void imprimirAsignatura(String codigo) {
		
		if (mapaAsignaturas.get(codigo) == null) {
			 // la asignatura no existe
		}
		
		
		listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).forEach(alumno -> alumno.toString());
		System.out.println("Número total de alumnos: " + listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).size());
	}

	@Override //Done
	public boolean agregarCalificacion(String expediente, String codigo, double calificacion) {

		// el metodo get devuelve el objeto
		if (mapaAlumnos.get(expediente) == null) {
			return false; // el alumno no existe
		}

		if (mapaAsignaturas.get(codigo) == null) {
			return false; // la asignatura no existe
		}
		
		if (!listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).contains(mapaAlumnos.get(expediente))){
			return false; //el alumno no está matriculado en la asignatura
		}

		mapaAlumnos.get(expediente).getMapaCalificaciones().put(codigo, calificacion);
		return true;
	}

	@Override //hacerlo con try catch
	public void compararAlumno(String expediente1, String expediente2) {
		double notaMedia1 = 0, notaMedia2 = 0;
		
		// el metodo get devuelve el objeto
		if (mapaAlumnos.get(expediente1) == null) {
			; // el alumno no existe
		}
		if (mapaAlumnos.get(expediente2) == null) {
			; // el alumno no existe
		}
		
		
		Collection<Double> calificaciones1 = mapaAlumnos.get(expediente1).getMapaCalificaciones().values();
		for (Double calificacion : calificaciones1 ) {
			notaMedia1 += calificacion;
		}
		notaMedia1 = notaMedia1 / calificaciones1.size();
		
		Collection<Double> calificaciones2 = mapaAlumnos.get(expediente2).getMapaCalificaciones().values();
		for (Double calificacion : calificaciones2 ) {
			notaMedia2 += calificacion;
		}
		notaMedia2 = notaMedia1 / calificaciones2.size();
		
		
		switch (Double.compare(notaMedia1, notaMedia2)) {
			case 0 -> System.out.println("Los alumnos tienen la misma nota media, un " + notaMedia1);
			case 1 -> System.out.println("El primer alumno tiene mayor nota media, con un " + notaMedia1);
			case -1 -> System.out.println("El segundo alumno tiene mayor nota media, con un " + notaMedia2);
		}
	}
	
	//Decidí crear un método que me devuelva la lista de alumnos matriculados de una Asignatura para no repetir información
	private LinkedList <Alumno> listaAlumnosMatriculados(Asignatura asignatura) {
		
		LinkedList <Alumno> devolverLista = new LinkedList<>();
		
		Collection<Alumno> tempAlumnos = mapaAlumnos.values();
		Iterator<Alumno> itAlumnos = tempAlumnos.iterator();
		
		while(itAlumnos.hasNext()) {
			
			Alumno tempAlumno = itAlumnos.next();
			if(tempAlumno.getListaAsignaturas().contains(asignatura)) {
				devolverLista.add(tempAlumno);
			}
		}
		return devolverLista;
	}
	
	
	//mostrar codigos de los alumnos?
	//crear alumno asignatura por defecto
	

	// Getters & Setters
	public HashMap<String, Alumno> getListaAlumnos() {
		return mapaAlumnos;
	}

	public void setListaAlumnos(HashMap<String, Alumno> listaAlumnos) {
		this.mapaAlumnos = listaAlumnos;
	}

	public HashMap<String, Asignatura> getListaAsignaturas() {
		return mapaAsignaturas;
	}

	public void setListaAsignaturas(HashMap<String, Asignatura> listaAsignaturas) {
		this.mapaAsignaturas = listaAsignaturas;
	}
}

