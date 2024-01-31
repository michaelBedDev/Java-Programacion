package polimorfismoEjercicio3;

public abstract class Tripulante {

	protected int numCarnet;
	protected GPS posicionGPS;
	protected int edad;
	protected int tiempoInEmpresa;
	protected String nombre;
	protected String telefono;
	protected char sexo;
	protected Barco barco;


	public Tripulante(int numCarnet, GPS posicionGPS, int edad, int tiempoInEmpresa, String nombre, String telefono,
			char sexo, Barco barco) {
		super();
		this.numCarnet = numCarnet;
		this.posicionGPS = posicionGPS;
		this.edad = edad;
		this.tiempoInEmpresa = tiempoInEmpresa;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		this.barco = barco;
	}
	
	protected abstract void calcularSueldoTotal();

	protected String mostrarDatos() {
			return "Tripulante [numCarnet=" + numCarnet + ", posicionGPS=" + posicionGPS + ", edad=" + edad
				+ ", tiempoInEmpresa=" + tiempoInEmpresa + ", nombre=" + nombre + ", telefono=" + telefono + ", sexo="
				+ sexo + ", barco=" + barco + "]";
	}

	public int getNumCarnet() {
		return numCarnet;
	}

	public void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}

	public GPS getPosicionGPS() {
		return posicionGPS;
	}

	public void setPosicionGPS(GPS posicionGPS) {
		this.posicionGPS = posicionGPS;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTiempoInEmpresa() {
		return tiempoInEmpresa;
	}

	public void setTiempoInEmpresa(int tiempoInEmpresa) {
		this.tiempoInEmpresa = tiempoInEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
}
