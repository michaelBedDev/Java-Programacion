package centroCultural;

import java.util.Date;

public class Peticion {

	private int numIdMaterial;

	private Date fechaIniPrestamo;
	private Date fechaFinalPrestamo;

//Constructor
	public Peticion() {
		super();
	}

	// mostrar Datos
	public void mostrarDatos() {
		String datos = "La petición se ha realizado el " + fechaIniPrestamo + " para el material con numId "
				+ numIdMaterial;
		System.out.println(datos);
	}

	// Getters & Setters

	public Date getFechaIniPrestamo() {
		return fechaIniPrestamo;
	}

	public void setFechaIniPrestamo(Date fechaIniPrestamo) {
		this.fechaIniPrestamo = fechaIniPrestamo;
	}

	public Date getFechaFinalPrestamo() {
		return fechaFinalPrestamo;
	}

	public void setFechaFinalPrestamo(Date fechaFinalPrestamo) {
		this.fechaFinalPrestamo = fechaFinalPrestamo;
	}

	public int getNumIdMaterial() {
		return numIdMaterial;
	}

	public void setNumIdMaterial(int numIdMaterial) {
		this.numIdMaterial = numIdMaterial;
	}
}
