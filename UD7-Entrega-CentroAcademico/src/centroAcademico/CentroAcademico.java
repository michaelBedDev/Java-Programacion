package centroAcademico;

import java.util.Collection;
import java.util.HashMap;
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

	@Override //Done
	public boolean matricular(String expediente, String codigo) {

		// el metodo get devuelve el objeto
		if (mapaAlumnos.get(expediente) == null) {
			return false; // el alumno no existe
		}

		if (mapaAsignaturas.get(codigo) == null) {
			return false; // la asignatura no existe
		}

		ListIterator<Alumno> it = (ListIterator<Alumno>) mapaAsignaturas.get(codigo).listaAlumnosMatriculados;
		while (it.hasNext()) {
			Alumno alu = it.next();
			if (alu.getNumExp() == (mapaAlumnos.get(expediente).getNumExp())) {
				return false; // el alumno ya estaba matriculado;
			}
		}

		// matricular al alumno
		mapaAsignaturas.get(codigo).listaAlumnosMatriculados.add(mapaAlumnos.get(expediente));
		return true;
	}

	@Override
	public void imprimirAlumno(String expediente) {
		System.out.println(mapaAlumnos.get(expediente));
		mapaAlumnos.get(expediente).getMapaCalificaciones().forEach((asignatura,calificacion) -> System.out.println("Asignatura: " + asignatura + "\t Calificacion: " + calificacion));

	}

	@Override
	public void imprimirAlumnos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirAsignatura(String código) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean agregarCalificacion(String expediente, String codigo, double calificacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void compararAlumno(String expediente1, String expediente2) {
		// TODO Auto-generated method stub

	}

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
