package centroAcademico;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import excepciones.AlumnoDoesntExistException;
import excepciones.AlumnoNoMatriculadoException;
import excepciones.AlumnoYaMatriculadoException;
import excepciones.SubjectDoesntExistException;

public class CentroAcademico implements IMetodosCA {

	HashMap<String, Alumno> mapaAlumnos;
	HashMap<String, Asignatura> mapaAsignaturas;

	protected CentroAcademico() {
		super();
		mapaAlumnos = new HashMap<>();
		mapaAsignaturas = new HashMap<>();
		crearValoresPorDefecto();
	}

	protected CentroAcademico(HashMap<String, Alumno> listaAlumnos, HashMap<String, Asignatura> listaAsignaturas) {
		super();
		this.mapaAlumnos = listaAlumnos;
		this.mapaAsignaturas = listaAsignaturas;
		crearValoresPorDefecto();
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

		try {
			// el metodo get devuelve el objeto
			if (mapaAlumnos.get(expediente) == null) {
				
				throw new AlumnoDoesntExistException("el alumno no existe");

			}

			if (mapaAsignaturas.get(codigo) == null) {
				throw new SubjectDoesntExistException("la asignatura no existe");   //throw new SubjectDoesntExistException("la asignatura no existe");
			}

			LinkedList<Alumno> lista1 = listaAlumnosMatriculados(mapaAsignaturas.get(codigo));
			ListIterator<Alumno> it = lista1.listIterator(); 
			while (it.hasNext()) {
				Alumno alu = it.next();
				if (alu.getNumExp() == (mapaAlumnos.get(expediente).getNumExp())) {
					throw new AlumnoYaMatriculadoException("el alumno ya estaba matriculado en la asignatura");
				}
			}
		} catch (AlumnoDoesntExistException e) {
			System.out.println("Alumno no matriculado: " + e.getMessage());
			return false;
		} catch (SubjectDoesntExistException e) {
			System.out.println("Alumno no matriculado: " + e.getMessage());
			return false;
		} catch (AlumnoYaMatriculadoException e) {
			System.out.println("Alumno no matriculado: " + e.getMessage());
			return false;
		}

		// matricular al alumno
		mapaAlumnos.get(expediente).getListaAsignaturas().add(mapaAsignaturas.get(codigo));
		return true;
	}

	@Override //Done
	public void imprimirAlumno(String expediente) {
		try {
			if (mapaAlumnos.get(expediente) == null) {
				 throw new AlumnoDoesntExistException("el alumno no existe"); 
			}
		} catch (AlumnoDoesntExistException e) {
			System.out.println("No se ha podido imprimir: " + e.getMessage());
			return;
		}

		System.out.printf("Alumno: %s \t NumExpediente: %s\n", mapaAlumnos.get(expediente).getNombre(),
				mapaAlumnos.get(expediente).getNumExp());
		mapaAlumnos.get(expediente).getMapaCalificaciones().forEach((asignatura, calificacion) -> System.out
				.println("Asignatura: " + asignatura + "\t\t\t Calificacion: " + calificacion + "\n"));

	}

	@Override // Done
	public void imprimirAlumnos() {

		mapaAlumnos.forEach((exp, alumno) -> imprimirAlumno(exp));
	}

	@Override  //Done
	public void imprimirAsignatura(String codigo) {
		
		try {
			if (mapaAsignaturas.get(codigo) == null) {
				 throw new SubjectDoesntExistException("la asignatura no existe");
			}
		} catch (SubjectDoesntExistException e) {
			System.out.println("No se ha podido imprimir: " + e.getMessage());
			return;
		}

		listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).forEach(alumno -> imprimirAlumno(alumno.getNumExp()));
		System.out.println("Número total de alumnos: " + listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).size());
		System.out.println();
	}

	@Override // Done
	public boolean agregarCalificacion(String expediente, String codigo, double calificacion) {
		
		try {
			if (mapaAlumnos.get(expediente) == null) {
				throw new AlumnoDoesntExistException("el alumno no existe");
			}

			if (mapaAsignaturas.get(codigo) == null) {
				throw new SubjectDoesntExistException("la asignatura no existe");
			}
			
			if (!listaAlumnosMatriculados(mapaAsignaturas.get(codigo)).contains(mapaAlumnos.get(expediente))){
				throw new AlumnoNoMatriculadoException("el alumno no está matriculado en la asignatura");
			}
		} catch (AlumnoDoesntExistException e) {
			System.out.println("Alumno no matriculado: " + e.getMessage());
			return false;
		} catch (SubjectDoesntExistException e) {
			System.out.println("Alumno no matriculado: " + e.getMessage());
			return false;
		} catch (AlumnoNoMatriculadoException e) {
			System.out.println("No se ha podido agregar calificacion: " + e.getMessage());
			System.out.println("FECHA: " + new Date());
			return false;

		}

		mapaAlumnos.get(expediente).getMapaCalificaciones().put(codigo, calificacion);
		return true;
	}


	@Override //Done
	public void compararAlumno(String expediente1, String expediente2) {
		double notaMedia1 = 0, notaMedia2 = 0;

		try {
			if (mapaAlumnos.get(expediente1) == null) {
				throw new AlumnoDoesntExistException("el alumno no existe"); 
			}
			if (mapaAlumnos.get(expediente2) == null) {
				throw new AlumnoDoesntExistException("el alumno no existe"); 
			}
		} catch (AlumnoDoesntExistException e) {
			System.out.println("No se ha podido comparar a los alumnos: " + e.getMessage());
			return;
		}

		Collection<Double> calificaciones1 = mapaAlumnos.get(expediente1).getMapaCalificaciones().values();
		for (Double calificacion : calificaciones1) {
			notaMedia1 += calificacion;
		}
		notaMedia1 = notaMedia1 / calificaciones1.size();

		Collection<Double> calificaciones2 = mapaAlumnos.get(expediente2).getMapaCalificaciones().values();
		for (Double calificacion : calificaciones2) {
			notaMedia2 += calificacion;
		}
		notaMedia2 = notaMedia2 / calificaciones2.size();

		switch (Double.compare(notaMedia1, notaMedia2)) {
			case 0 -> System.out.println("Los alumnos tienen la misma nota media, un " + notaMedia1);
			case 1 -> System.out.println("El primer alumno tiene mayor nota media, con un " + notaMedia1);
			case -1 -> System.out.println("El segundo alumno tiene mayor nota media, con un " + notaMedia2);
		}
		System.out.println();
	}

	// Decidí crear un método que me devuelva la lista de alumnos matriculados de
	// una Asignatura para no repetir información
	private LinkedList<Alumno> listaAlumnosMatriculados(Asignatura asignatura) {

		LinkedList<Alumno> devolverLista = new LinkedList<>();

		Collection<Alumno> tempAlumnos = mapaAlumnos.values();
		Iterator<Alumno> itAlumnos = tempAlumnos.iterator();

		while (itAlumnos.hasNext()) {

			Alumno tempAlumno = itAlumnos.next();
			if (tempAlumno.getListaAsignaturas().contains(asignatura)) {
				devolverLista.add(tempAlumno);
			}
		}
		return devolverLista;
	}

	private void crearValoresPorDefecto() {
		Alumno defaultA = new Alumno("101", "AlumnoPorDefecto 1");
		Alumno defaultB = new Alumno("102", "AlumnoPorDefecto 2");
		mapaAlumnos.put("101", defaultA);
		mapaAlumnos.put("102", defaultB);
		
		Asignatura defaultSub = new Asignatura("A-111","AsignaturaPorDefecto","100");
		mapaAsignaturas.put("A-111", defaultSub);
		
		//matricular
		matricular("101","A-111");
		matricular("102","A-111");
		//añadir calificaciones
		agregarCalificacion("101","A-111",5);
		agregarCalificacion("102","A-111",7.55);

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


//		El número de expediente del alumno se corresponderá con su dni,
//		debe validarse con una expresión regular. Lo mismo que el código de asignatura,
//		que siempre consta de una letra mayúscula A con guion y tres números. Ejemplo: A-111
}
