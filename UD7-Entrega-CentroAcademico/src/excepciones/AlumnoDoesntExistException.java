package excepciones;

public class AlumnoDoesntExistException extends Exception{

	public AlumnoDoesntExistException(String mensaje) {
		super(mensaje);
	}
}
