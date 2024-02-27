package excepciones;

public class SubjectDoesntExistException extends Exception {

	public SubjectDoesntExistException(String mensaje) {
		super(mensaje);
	}
	
}
