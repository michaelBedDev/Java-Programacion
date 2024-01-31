package polimorfismoEjercicio3;

public class Barco {

	private String nombre;
	private String tipo;
	private int capacidadPasajero;
	private int capacidadCarga;

	// BarcoToString
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", tipo=" + tipo + ", capacidadPasajero=" + capacidadPasajero
				+ ", capacidadCarga=" + capacidadCarga + "]";
	}

	
	
	
public Barco() {
		super();
		//TODO Auto-generated constructor stub
	}

public Barco(String nombre, String tipo, int capacidadPasajero, int capacidadCarga) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.capacidadPasajero = capacidadPasajero;
		this.capacidadCarga = capacidadCarga;
	}




//	Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidadPasajero() {
		return capacidadPasajero;
	}

	public void setCapacidadPasajero(int capacidadPasajero) {
		this.capacidadPasajero = capacidadPasajero;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
}
