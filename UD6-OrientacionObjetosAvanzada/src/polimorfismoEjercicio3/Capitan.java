package polimorfismoEjercicio3;

public class Capitan extends Tripulante {

	private int horasExperiencia;
	private final int sueldo = 4500000;
	private float bono;
	private float sueldoTotal;


	public Capitan(int numCarnet, GPS posicionGPS, int edad, int tiempoInEmpresa, String nombre, String telefono,
			char sexo, Barco barco, int horasExperiencia) {
		super(numCarnet, posicionGPS, edad, tiempoInEmpresa, nombre, telefono, sexo, barco);
		this.horasExperiencia = horasExperiencia;

	}

	// metodo calcular bono

	@Override
	protected void calcularSueldoTotal() {

		if ((this.horasExperiencia > 5000) && (this.horasExperiencia < 15000)) {
			this.bono = 0.2f;
		} else if ((this.horasExperiencia >= 15000) && (this.horasExperiencia < 30000)) {
			this.bono = 0.4f;
		} else {
			this.bono = 0.75f;
		}
		this.sueldoTotal = sueldo + sueldo * bono;
	}

	@Override
	protected String mostrarDatos() {
		return super.mostrarDatos() + "Capitan [horasExperiencia=" + horasExperiencia + ", sueldo=" + sueldo + ", bono=" + bono
				+ ", sueldoTotal=" + sueldoTotal + "]";
	}

	// Getters & Setters
	public int getHorasExperiencia() {
		return horasExperiencia;
	}

	public void setHorasExperiencia(int horasExperiencia) {
		this.horasExperiencia = horasExperiencia;
	}

	public float getBono() {
		return bono;
	}

	public void setBono(float bono) {
		this.bono = bono;
	}

	public float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public int getSueldo() {
		return sueldo;
	}

}
