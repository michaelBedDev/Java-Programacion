package polimorfismoEjercicio3;

public class Marinero extends Tripulante {

	private int pesoTotalPescado;
	private final float sueldo = 90000;
	private float sueldoTotal;
	private float bono;

	public Marinero(int numCarnet, GPS posicionGPS, int edad, int tiempoInEmpresa, String nombre, String telefono,
			char sexo, Barco barco, int pesoTotalPescado) {
		super(numCarnet, posicionGPS, edad, tiempoInEmpresa, nombre, telefono, sexo, barco);
		this.pesoTotalPescado = pesoTotalPescado;
	}

	@Override
	protected void calcularSueldoTotal() {
		if (this.pesoTotalPescado >= 1) {
			this.bono = 0.25f;
		}
		this.sueldoTotal = sueldo + sueldo * bono;
	}

	@Override
	protected String mostrarDatos() {
		return super.mostrarDatos() + "Marinero [pesoTotalPescado=" + pesoTotalPescado + ", sueldo=" + sueldo
				+ ", sueldoTotal=" + sueldoTotal + ", bono=" + bono + "]";
	}
	
	
//	Getters & setters
	public int getPesoTotalPescado() {
		return pesoTotalPescado;
	}

	public void setPesoTotalPescado(int pesoTotalPescado) {
		this.pesoTotalPescado = pesoTotalPescado;
	}

	public float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public float getBono() {
		return bono;
	}

	public void setBono(float bono) {
		this.bono = bono;
	}

	public float getSueldo() {
		return sueldo;
	}

}
