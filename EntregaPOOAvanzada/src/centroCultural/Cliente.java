package centroCultural;

public class Cliente {

	private String nombre;
	private String DNI;
	private Peticion [] listaPeticiones = new Peticion [6];
	
	
//Constructor
	public Cliente() {
		//TODO Auto-generated constructor stub
	}
	
	public Cliente(String nombre, String DNI, Peticion[] listaPeticiones) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.listaPeticiones = listaPeticiones;
	}

	


	//Getters & Setters
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Peticion[] getListaPeticiones() {
		return listaPeticiones;
	}

	public void setListaPeticiones(Peticion[] listaPeticiones) {
		this.listaPeticiones = listaPeticiones;
	}
	
}
