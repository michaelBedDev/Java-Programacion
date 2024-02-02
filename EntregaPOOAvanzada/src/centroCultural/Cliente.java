package centroCultural;

public class Cliente {

	private String nombre;
	private String DNI;
	private Peticion[] listaPeticiones = new Peticion[6];

//Constructor
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String DNI, Peticion[] listaPeticiones) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.listaPeticiones = listaPeticiones;
	}

	// metodo alta cliente
	public void inputAltaCliente() {
		String nombreCliente = "Introduce el nombre del cliente";
		this.setNombre(UsuarioCentroCultural.getInstance().pedirString(nombreCliente));

		this.setDNI(UsuarioCentroCultural.getInstance().introducirDNI());
	}

	public void mostrarDatos() {

		String datos = "Nombre del cliente: " + nombre + "\nDNI: " + DNI + "\nPeticiones restantes: "
				+ mostrarPeticionesRestantes() + "\n";

		System.out.println(datos);
	}

	// metodos mostrar peticiones restantes
	private int mostrarPeticionesRestantes() {
		int contador = 6;
		for (int i = 0; i < listaPeticiones.length; i++) {
			if (listaPeticiones[i] != null) {
				contador--;
			}
		}
		return contador;
	}

	// Getters & Setters
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
