package excepciones;

public class DatoNoValidoException extends Exception {
	int errCode;
	String valor;

	public DatoNoValidoException(String valor, int errCode, String msg) {
		super(msg);
		this.valor = valor;
		this.errCode = errCode;
	}

	public int getErrorCode() {
		return this.errCode;
	}

	public String toString() {
		return "[ERR: " + this.errCode + "] " + this.getMessage() + " (value: " + this.valor + ")";
	}
}

class DemoEx6 {
	public static void validaEdad(int edad) throws DatoNoValidoException {
		if (edad < 18)
			throw new DatoNoValidoException(Integer.toString(edad), 101, "Menor de edad");
	}

	public static void main(String[] args) {
		try {
			validaEdad(15);
		} catch (Exception e) {
			System.out.println("Excepción recibida --> " + e);
		}
	}
}
