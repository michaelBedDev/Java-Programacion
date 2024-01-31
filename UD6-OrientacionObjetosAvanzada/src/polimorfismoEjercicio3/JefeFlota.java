package polimorfismoEjercicio3;

public class JefeFlota extends Tripulante {

	private int pesoPescado;
	private int pesoMariscos;
	private final int sueldo = 350000;
	private float sueldoTotal;
	private float bonoPescado;
	private float bonoMariscos;



	public JefeFlota(int numCarnet, GPS posicionGPS, int edad, int tiempoInEmpresa, String nombre, String telefono,
			char sexo, Barco barco, int pesoPescado, int pesoMariscos) {
		super(numCarnet, posicionGPS, edad, tiempoInEmpresa, nombre, telefono, sexo, barco);
		this.pesoPescado = pesoPescado;
		this.pesoMariscos = pesoMariscos;
	}

	@Override
	protected void calcularSueldoTotal() {
		if (pesoPescado != 0) {
			this.bonoPescado = sueldo * 1;
		}

		if (pesoMariscos != 0) {
			this.bonoMariscos = sueldo * 2;
		}
		this.sueldoTotal = sueldo + bonoPescado + bonoMariscos;
	}

	@Override
	protected String mostrarDatos() {

		return super.mostrarDatos() + "JefeFlota [pesoPescado=" + pesoPescado + ", pesoMariscos=" + pesoMariscos
				+ ", sueldo=" + sueldo + ", sueldoTotal=" + sueldoTotal + ", bonoPescado=" + bonoPescado
				+ ", bonoMariscos=" + bonoMariscos + "]";
	}

//	Getters & Setters
	public int getPesoPescado() {
		return pesoPescado;
	}

	public void setPesoPescado(int pesoPescado) {
		this.pesoPescado = pesoPescado;
	}

	public int getPesoMariscos() {
		return pesoMariscos;
	}

	public void setPesoMariscos(int pesoMariscos) {
		this.pesoMariscos = pesoMariscos;
	}

	public float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public float getBonoPescado() {
		return bonoPescado;
	}

	public void setBonoPescado(float bonoPescado) {
		this.bonoPescado = bonoPescado;
	}

	public float getBonoMariscos() {
		return bonoMariscos;
	}

	public void setBonoMariscos(float bonoMariscos) {
		this.bonoMariscos = bonoMariscos;
	}

	public double getSueldo() {
		return sueldo;
	}
}
