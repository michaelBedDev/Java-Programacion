package optionalEjercicio;

import java.util.HashMap;

public class Data {

	private HashMap<String,Usuario> usuarios;

	public Data() {
		super();
		usuarios = new HashMap<>();
	}

	
	
	public HashMap<String, Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashMap<String,Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
